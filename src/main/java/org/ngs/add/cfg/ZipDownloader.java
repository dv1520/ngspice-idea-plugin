package org.ngs.add.cfg;

import com.google.common.collect.Sets;
import com.intellij.ide.plugins.PluginManagerUISettings;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.PerformInBackgroundOption;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Enumeration;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.nio.file.attribute.PosixFilePermission.*;

public class ZipDownloader {
    public static final Logger LOG = Logger.getInstance("org.ngs.add.cfg.ZipDownloader");
    private static final ExecutorService downloaderService = Executors.newFixedThreadPool(1);

    private volatile long bytesDownloaded = 0;
    private volatile long contentLength = 1; // avoid divide-on-zero

    private volatile String destinationFile;

    private volatile Future<?> future;

    private Runnable afterDownload;

    private Component rootComponent;

    // volatile for logging
    private volatile String url;
    private String baseDir;

    public ZipDownloader(Component rootComponent, String url, String destinationFile) {
        this.rootComponent = rootComponent;
        this.url = url;
        this.destinationFile = destinationFile;
    }


    public void startDownload(Runnable runnableAfterDownload) {
        this.afterDownload = runnableAfterDownload;

        startDownload();

        Task.Backgroundable task = new DownloadDisplayTask(null,
                "Downloading " + url,
                true,
                PluginManagerUISettings.getInstance()) ;

        ProgressManager.getInstance().run(task);
    }

    private class DownloadDisplayTask extends Task.Backgroundable{
        public DownloadDisplayTask(@Nullable Project project, @Nls @NotNull String title, boolean canBeCancelled, @Nullable PerformInBackgroundOption backgroundOption) {
            super(project, title, canBeCancelled, backgroundOption);
        }

        @Override
        public void run(@NotNull ProgressIndicator indicator) {
            indicator.setText("Downloading ngspice");

            while (!(future.isDone() || future.isCancelled())) {
                if (indicator.isCanceled()) {
                    future.cancel(true);
                    break;
                }

                indicator.setFraction((double) bytesDownloaded / contentLength);

                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void startDownload() {
        LOG.debug("Download is submitted");
        future = downloaderService.submit(() -> {
            try {
                doDownloadT();

                doUnzipT();

                SwingUtilities.invokeLater(() -> afterDownload.run());
            } catch (final Exception e) {
                SwingUtilities.invokeLater(() ->
                        NgsSettingsForm.showError(rootComponent, "Error downloading *.zip file", e)
                );
            }
        });
    }

    private void doUnzipT() throws Exception {
        LOG.debug("Unzip of {0}", destinationFile);
        try (ZipFile file = new ZipFile(new File(destinationFile))) {
            unzipFileT(file);
        }
    }

    private void unzipFileT(ZipFile file) throws Exception {
        File dir = new File(new File(destinationFile).getParent());
        dir.mkdirs();


        Enumeration<ZipArchiveEntry> enumeration = file.getEntriesInPhysicalOrder();
        while (enumeration.hasMoreElements()) {
            ZipArchiveEntry e = enumeration.nextElement();
            String name = dir + "/" + e.getName();

            Set<PosixFilePermission> execPermissions = Sets.newHashSet(
                    OWNER_READ, OWNER_WRITE, OWNER_EXECUTE,
                    GROUP_READ, GROUP_WRITE, GROUP_EXECUTE,
                    OTHERS_READ);

            if (e.isDirectory()) {
                new File(name).mkdir();
            } else {
                try (InputStream content = file.getInputStream(e);
                     FileOutputStream fos = new FileOutputStream(name);
                     BufferedOutputStream bos = new BufferedOutputStream(fos);
                ) {
                    IOUtils.copy(content, bos);
                }


                if (new File(name).getParent().endsWith("linux/usr/local/bin")) {
                    Paths.get(name);


                    Files.setPosixFilePermissions(Paths.get(name), execPermissions);
                }

            }
        }
    }

    private void doDownloadT() throws Exception {
        LOG.debug("Started download of {0} to dir {1}", url, destinationFile);

        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
            try (CloseableHttpResponse response = httpclient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                contentLength = entity.getContentLength();

                try (BufferedInputStream in = new BufferedInputStream(entity.getContent());
                     FileOutputStream fos = new FileOutputStream(destinationFile);
                     BufferedOutputStream out = new BufferedOutputStream(fos)) {

                    copyBytesT(in, out);
                }
            }
        }
    }

    private boolean isFutureDone() {
        return future.isCancelled() || future.isDone();
    }

    private void copyBytesT(InputStream in, OutputStream out) throws IOException {
        int inByte;
        int bytesGot = 0;
        while ((inByte = in.read()) != -1 && !isFutureDone()) {
            bytesGot++;

            if (bytesGot % 10000 == 0) {
                bytesDownloaded = bytesGot;
            }

            out.write(inByte);
        }
    }
}