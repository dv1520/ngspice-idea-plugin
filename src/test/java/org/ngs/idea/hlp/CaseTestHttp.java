package org.ngs.idea.hlp;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import junit.framework.TestCase;
import junit.framework.TestResult;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * org.ngs.idea.hlp.JettyTestServer autocompletes,
 * we need to request it. First set isDisabled to false,
 * then run single test from there. It will run forever,
 * listening HTTP.
 *
 * And this class will make the requests.
 *
 * Created by z on 17.11.17.
 */
public abstract class CaseTestHttp extends TestCase {

    private static List<String> deserializeJsonSimple(String s) {
        List<String> result = new ArrayList<>();
        // ["a11","a12","a13"]
        Pattern p = Pattern.compile(",?\"([^\"]+)\"");
        Matcher m = p.matcher(s);

        while (m.find()) {
            String text = m.group(1);
            result.add(text);
        }

        return result;
    }

    protected void doTest(String filename, List<String> expectedOutput) {
        try {
            String res = doRequest(filename);
            List<String> strings = deserializeJsonSimple(res);

            Collections.sort(strings);
            Collections.sort(expectedOutput);
            assertEquals(expectedOutput, strings);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> toStringList(String jsonArray) {
        List<String> result = Lists.newArrayList();
        StringBuilder sb = new StringBuilder();

        int mode = 1;
        for (int i = 1; i < jsonArray.length() - 1; i++) {
            char c = jsonArray.charAt(i);
            char next = jsonArray.charAt(i+1);
            if (mode == 1) {
                if (c == '"') {
                    mode = 2;
                }
            } else if (mode == 2) {
                if (c == '\\' && next == '"') {
                    sb.append(c);
                    sb.append(next);
                    i++;
                    continue;
                }

                if (c == '"') {
                    mode = 1;
                    result.add(sb.toString());
                    sb.setLength(0);
                    continue;
                }
                sb.append(c);
            }
        }

        return result;
    }

    private String doRequest(String... files) throws Exception{
        List<String> fileList = new ArrayList<>();
        for (String f: files) {
            fileList.add('"' + f + '"');
        }
        String fileStr = Joiner.on(",").join(fileList);


        String data = String.format("{\"files\":[%s]}", fileStr);

        Socket socket = new Socket("127.0.0.1", 8068);

        String path = "/";
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
        wr.write("POST " + path + " HTTP/1.0\n");
        wr.write("Content-Length: " + data.length() + "\n");
        wr.write("Content-Type: application/json\n");
        wr.write("\n");

        wr.write(data);
        wr.flush();

        BufferedReader rd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        StringBuilder json = new StringBuilder();
        boolean isJson = false;
        while ((line = rd.readLine()) != null) {
            if (sb.length() > 0) {sb.append("\n");}
            if (json.length() > 0) {json.append("\n");}
            if (line.startsWith("[")) {isJson = true;};
            if (isJson) {json.append(line);}
            sb.append(line);


            if (line.isEmpty()) {isJson = true;}
        }
        wr.close();
        rd.close();

        return json.toString().trim();
    }
}
