package org.ngs.add.run;

import com.google.common.collect.Maps;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationListener;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.options.ShowSettingsUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.WriteExternalException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.SystemUtils;
import org.jdom.CDATA;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.ngs.add.cfg.NgsConfig;
import org.ngs.add.cfg.NgsSettingsForm;
import org.ngs.add.util.NgsConfigHelper;
import org.ngs.add.run.tool.NgsConsoleFilter;

import javax.swing.event.HyperlinkEvent;
import java.io.*;
import java.util.*;

/**
 * Created by z on 19.08.17.
 */
public class NgsRunConfiguration extends LocatableConfigurationBase {

    private boolean isBatchModeNotServer;
    private String filename;
    private Map<String, Boolean> columnVisibility = Maps.newHashMap();
    private String selectedTab;
    private double dividerPercentage;

    protected NgsRunConfiguration(Project project, ConfigurationFactory factory, String name) {
        super(project, factory, name);
        filename = "";
        selectedTab = "";
        dividerPercentage = 0.5;
    }

    @NotNull
    @Override
    public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        NgsRunSettingsEditor editor = new NgsRunSettingsEditor();
        editor.setFilename(filename);
        editor.setBatchModeNotServer(isBatchModeNotServer);
        return editor;
    }

    @Override
    public void checkConfiguration() throws RuntimeConfigurationException {
    }

    @Nullable
    @Override
    public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment executionEnvironment) throws ExecutionException {
        CommandLineState state = new CommandLineState(executionEnvironment) {
            @NotNull
            @Override
            protected ProcessHandler startProcess() throws ExecutionException {
                return startConsoleProcess();
            }
        };

        state.addConsoleFilters(new NgsConsoleFilter(getProject(), filename));

        return state;
    }

    public void failOnEmptyFilename() throws ExecutionException {
        if (filename == null || filename.isEmpty()) {
            throw new ExecutionException("Missing netlist file");
        }
    }

    private ProcessHandler startConsoleProcess() throws ExecutionException {
        return runServerMode();
    }

    private boolean tryDefaultNgspiceName() {
        String ngspice = "ngspice";
        if (SystemUtils.IS_OS_WINDOWS) {
            ngspice = "ngspice_con";
        }

        String error = NgsSettingsForm.runBinaryAndGetError(ngspice);
        if (error.isEmpty()) {
            NgsConfig.getInstance().setNgsBinaryPath(ngspice);
            return true;
        }

        Notification myNotification = new Notification("ngspice",
                "Ngspice need to be configured",
                "<a href='settings'>" + "Go to settings" + "</a>" +
                        " &nbsp;&nbsp;",
                NotificationType.INFORMATION, new NotificationListener.Adapter() {
            @Override
            protected void hyperlinkActivated(@NotNull Notification notification, @NotNull HyperlinkEvent event) {
                if (event.getDescription().equals("settings")) {
                    ShowSettingsUtil.getInstance().showSettingsDialog(getProject(), "Ngspice Compiler");
                }

                notification.expire();
            }
        });

        Notifications.Bus.notify(myNotification, getProject());

        return false;
    }
    private ProcessHandler runServerMode() throws ExecutionException {
        String ngspice = NgsConfig.getInstance().getNgsBinaryPath();

        if (ngspice == null || ngspice.isEmpty()) {
            if (!tryDefaultNgspiceName()) {
                throw new RuntimeException("Can't run ngspice");
            }

            ngspice = NgsConfig.getInstance().getNgsBinaryPath();
        }

        failOnEmptyFilename();

        NgsConfigHelper.fixConfigFiles(ngspice);

        FileDocumentManager.getInstance().saveAllDocuments();

        GeneralCommandLine gcmd = createCommandLine(ngspice);
        OSProcessHandler handler = createHandler(gcmd);

        return handler;
    }

    private GeneralCommandLine createCommandLine(String ngspice) {
        GeneralCommandLine gcmd;
        if (isBatchModeNotServer) {
            gcmd = new GeneralCommandLine(ngspice, "-b", filename);
        } else {
            gcmd = new GeneralCommandLine(ngspice, "-s");
        }


        String ngspiceLocalDir = NgsConfigHelper.getLocalDirFromNgspiceBinary(ngspice);
        if (!ngspiceLocalDir.isEmpty()) {
            String scripts = ngspiceLocalDir + "share/ngspice/scripts";
            gcmd.getEnvironment().put("SPICE_SCRIPTS", scripts);
        }

        String parent = new File(filename).getParent();
        if (parent != null && !parent.isEmpty()) {
            gcmd.setWorkDirectory(parent);
        }

        return gcmd;
    }

    private OSProcessHandler createHandler(GeneralCommandLine gcmd) throws ExecutionException {
        OSProcessHandler handler = new CancellableOSProcessHandler(gcmd) {
            @NotNull
            @Override
            public Process getProcess() {
                return super.getProcess();
            }
        };

        //    1. cat filename.cir | ngspice -s
        // or 2. ngspice -b filename.cir
        // For the first one we must supply the stream.
        if (!isBatchModeNotServer) {
            try (InputStream is = new BufferedInputStream(new FileInputStream(filename));
                 OutputStream os = handler.getProcessInput();){

                IOUtils.copy(is, os);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return handler;
    }


    /*
     * This one cancels process instantly, but leaves the stacktrace in the log.
     *
     * ExecutionManagerImpl.stopProcess(runContentDescriptor);
     * ends the process silently, but it will wait until all received-for-now lines
     * are processed (that can take some time).
     */
    public static class CancellableOSProcessHandler extends OSProcessHandler {
        public CancellableOSProcessHandler(@NotNull GeneralCommandLine commandLine) throws ExecutionException {
            super(commandLine);
        }

        public void notifyTextAvailable(String text, Key outputType) {
            if (isCancelled) {
                throw new RuntimeException("Process is cancelled");
            }
            super.notifyTextAvailable(text, outputType);
        }

        private volatile boolean isCancelled = false;

        public void cancel() {
            isCancelled = true;
        }
    }

    public Map<String, Boolean> getColumnVisibility() {
        return columnVisibility;
    }

    public void setColumnVisibility(Map<String, Boolean> columnVisibility) {
        this.columnVisibility = columnVisibility;
    }

    public String getSelectedTab() {
        return selectedTab;
    }

    public void setSelectedTab(String selectedTab) {
        this.selectedTab = selectedTab;
    }

    public double getDividerPercentage() {
        return dividerPercentage;
    }

    public void setDividerPercentage(double dividerPercentage) {
        this.dividerPercentage = dividerPercentage;
    }

    // save state between IDE restarts
    @Override
    public void writeExternal(Element element) throws WriteExternalException {
        super.writeExternal(element);
        element.setAttribute("ngsFile", filename);
        element.setAttribute("isBatchModeNotServer", "" + isBatchModeNotServer);
        element.setAttribute("selectedTab", selectedTab == null ? "-1" : ("" + selectedTab));
        element.setAttribute("dividerPercentage", "" + dividerPercentage);
        element.setContent(new CDATA(new GsonBuilder().create().toJson(columnVisibility)));
    }

    @SuppressWarnings("unchecked")
    @Override
    public void readExternal(Element element) throws InvalidDataException {
        super.readExternal(element);
        filename = element.getAttributeValue("ngsFile");
        isBatchModeNotServer = Boolean.valueOf(element.getAttributeValue("isBatchModeNotServer"));
        String selectedTab = element.getAttributeValue("selectedTab");
        if (selectedTab == null) {selectedTab = "";}

        double dividerPercentage = 0.5;
        String dividerPercentageString = element.getAttributeValue("dividerPercentage");

        try {
            if (dividerPercentageString != null) {
                dividerPercentage = Double.parseDouble(dividerPercentageString);
            }
        } catch (NumberFormatException e) {
            // No need to spam the log, we have the default value.
//            e.printStackTrace();
        }


        Map<String, Boolean> visibility = null;
        try {
            visibility = new GsonBuilder().create().fromJson(element.getContent(0).getValue(), Map.class);
        } catch (JsonSyntaxException e) {
            // We have the default value
//            e.printStackTrace();
        }

        if (visibility == null) {visibility = Maps.newHashMap();}

        this.columnVisibility = visibility;
        this.selectedTab = selectedTab;
        this.dividerPercentage = dividerPercentage;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public boolean isBatchModeNotServer() {
        return isBatchModeNotServer;
    }

    public void setBatchModeNotServer(boolean batchModeNotServer) {
        isBatchModeNotServer = batchModeNotServer;
    }
}
