package org.ngs.idea.hlp;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import java.util.concurrent.*;

public class JettyTestServer extends LightCodeInsightFixtureTestCase {

    boolean isDisabled = true;
    int port = 8068;
    int rmiPort = 1099;

    volatile BlockingQueue<FutureTask<List<String>>> completionTasks = new ArrayBlockingQueue<>(1);

    @Override
    protected void setUp() throws Exception {
        if (isDisabled) {
            return;
        }
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        if (isDisabled) {
            return;
        }
        super.tearDown();
    }

    @Override
    protected String getTestDataPath() {
        return "src/test/testdata/idea";
    }

    public void testRunServers() throws Exception {
        System.out.println("Starting services");

        if (isDisabled) {
            return;
        }

        startRmiServer();

        startJettyServer();

        runCompletionQueueLoop();
    }

    private void startRmiServer() {
        try {
            MyService ms = new MyService();
            IdeaTestService stub = (IdeaTestService) UnicastRemoteObject.exportObject(ms, 0);

            Registry registry = LocateRegistry.createRegistry(rmiPort);

            registry.bind("IdeaTestService", stub);
            System.out.println("RMI service is started");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }

    private void startJettyServer() throws Exception {
        Server server = createJetty();


        server.start();

        System.out.println("Jetty server is started at the port " + port + ". Use POST requests like");
        String curlExmple = String.format("curl -H \"Content-Type: application/json\" -X POST -d '{\"files\":[\"model-from-element.cir\"]}' http://localhost:%d", port);
        System.out.println(curlExmple);
    }

    private void runCompletionQueueLoop() throws InterruptedException {
        while (true) {
            // Run all completion in my thread
            FutureTask<List<String>> task = completionTasks.poll(1, TimeUnit.DAYS);
            task.run();
        }
    }

    private Server createJetty() {
        Server server = new Server(port);
        server.setHandler(new AbstractHandler() {
            @Override
            public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();

                List<String> lines = IOUtils.readLines(request.getInputStream());
                System.out.println(lines);

                httpServletResponse.setContentType("application/json;charset=utf-8");
                httpServletResponse.setStatus(HttpServletResponse.SC_OK);
                request.setHandled(true);

                String asStr = Joiner.on("\n").join(lines);
                Map<String, Object> req = gson.fromJson(asStr, Map.class);

                final List<String> files = (List<String>) req.get("files");

                FutureTask<List<String>> future = new FutureTask<List<String>>(() -> {
                    long t1 = System.currentTimeMillis();
                    List<String> result = runCompletion(files);
                    long t2 = System.currentTimeMillis();

                    logResult(files, t1, t2, result);

                    return result;
                });

                List<String> output = Collections.emptyList();
                Exception error = null;

                try {
                    completionTasks.put(future);
                    output = future.get();
                } catch (InterruptedException e) {
                    error = e;
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    error = e;
                    e.printStackTrace();
                }

                String res = new GsonBuilder().create().toJson(output);

                httpServletResponse.getWriter().println(res);
            }
        });

        return server;
    }

    private List<String> runCompletion(List<String> filenames) {
        myFixture.configureByFiles(filenames.toArray(new String[filenames.size()]));
        myFixture.complete(CompletionType.BASIC, 1);
        return myFixture.getLookupElementStrings();
    }

    private class MyService implements IdeaTestService {
        @Override
        public Map<String, Object> autocomplete(String... filenames) {
            FutureTask<List<String>> future = new FutureTask<List<String>>(() -> {
                long t1 = System.currentTimeMillis();
                List<String> files = Lists.newArrayList(filenames);
                List<String> result = runCompletion(files);
                long t2 = System.currentTimeMillis();

                logResult(files, t1, t2, result);

                return result;
            });


            Exception e = null;

            Map<String, Object> mp = new HashMap<>();
            try {
                completionTasks.put(future);
                List<String> res = future.get();
                mp.put("result", res);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
                e = e1;
            } catch (ExecutionException e1) {
                e1.printStackTrace();
                e = e1;
            }

            if (e != null) {
                mp.put("error", e);
            }

            return mp;
        }
    }

    private void logResult(List<String> files, long t1, long t2, List<String> result) {
        System.out.printf("Completed %-25s in %5s ms, result=%s\n", files, (t2 - t1), result);
    }
}