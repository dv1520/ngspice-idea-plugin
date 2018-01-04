package org.ngs.add.run;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.impl.ExecutionManagerImpl;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessListener;
import com.intellij.execution.process.ProcessOutputTypes;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ui.RunContentDescriptor;
import com.intellij.execution.ui.RunnerLayoutUi;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.diagnostic.FrequentEventDetector;
import com.intellij.openapi.externalSystem.service.execution.ExternalSystemTaskRunner;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.util.Key;
import com.intellij.ui.content.ContentManager;
import com.intellij.ui.content.ContentManagerAdapter;
import com.intellij.ui.content.ContentManagerEvent;
import com.intellij.ui.content.impl.TabbedContentImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.ngs.add.util.NgsSettings;

import javax.swing.*;
import java.util.List;

/**
 * Created by z on 19.08.17.
 */
public class NgsProgramRunner extends ExternalSystemTaskRunner {

    private static final String TAB_ID_TABLE = "table";
    private static final String TAB_ID_CONSOLE = "console";


    private NgsRunConfiguration ngsRunConfiguration;
    private ExecutionEnvironment executionEnvironment;
    private TableGraphForm tableGraphForm;


    private TabbedContentImpl tableTab;
    // volatile is to call stopProcess
    private volatile RunContentDescriptor runContentDescriptor;


    @NotNull
    @Override
    public String getRunnerId() {
        return "NgspiceTaskRunner";
    }

    @Override
    public boolean canRun(@NotNull String executorId, @NotNull RunProfile profile) {
        if (profile instanceof NgsRunConfiguration) {
            // executorId = [run, debug]
            return true;
        }

        return false;
    }

    @Nullable
    @Override
    protected RunContentDescriptor doExecute(@NotNull RunProfileState state, @NotNull ExecutionEnvironment env) throws ExecutionException {
        NgsRunConfiguration cfg = (NgsRunConfiguration) env.getRunProfile();
        cfg.failOnEmptyFilename();

        this.ngsRunConfiguration = cfg;
        this.executionEnvironment = env;


        String fileFullName = cfg.getFilename();
        RunContentDescriptor descriptor = super.doExecute(state, env);

        addTable(descriptor, fileFullName, env);

        return descriptor;
    }

    private void addTable(RunContentDescriptor descriptor, String fileFullName, ExecutionEnvironment env) {
        if (ngsRunConfiguration.isBatchModeNotServer()) {
            // Output is parsed for the 'server-mode' only.
            // Batch mode has only console log.
            return;
        }

        try {
            addTableToOutput(descriptor, fileFullName, env);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addTableToOutput(RunContentDescriptor descriptor, String fileNameFull, ExecutionEnvironment environment) {
        runContentDescriptor = descriptor;

        tableGraphForm = new TableGraphForm();
        tableGraphForm.init(fileNameFull, environment);

        tableGraphForm.setColumnsVisibility(ngsRunConfiguration.getColumnVisibility());
        tableGraphForm.setOnSelectedCols(cols -> {
            ngsRunConfiguration.setColumnVisibility(cols);
        });



        tableGraphForm.setDividerPercentage(ngsRunConfiguration.getDividerPercentage());

        tableGraphForm.setSplitterPosConsumer(value -> {
            ngsRunConfiguration.setDividerPercentage(value);
        });



        addTableTab();

        addServerListener();
    }

    private void addTableTab() {
        TabbedContentImpl content = new TabbedContentImpl(tableGraphForm.getMainPanel(), "table", false, "Out");

        RunnerLayoutUi ui = runContentDescriptor.getRunnerLayoutUi();
        ContentManager contentManager = ui.getContentManager();

        contentManager.addContent(content);



        contentManager.addContentManagerListener(new ContentManagerAdapter() {
            @Override
            public void selectionChanged(ContentManagerEvent event) {
                if (event.getOperation() == ContentManagerEvent.ContentOperation.add) {
                    String selectedTab = event.getIndex() == 1 ? TAB_ID_TABLE : TAB_ID_CONSOLE;
                    ngsRunConfiguration.setSelectedTab(selectedTab);
                }
            }
        });


        tableTab = content;
    }

    private void addServerListener() {
        // Save tab selection between runs
        NgsProcessListener listener = new NgsProcessListener();

        ProcessHandler handler = runContentDescriptor.getProcessHandler();

        handler.addProcessListener(listener);
    }

    class NgsProcessListener implements ProcessListener {


        // Do not replace with lambda, it will be the one object for all NgsProcessListeners
        private volatile Disposable disposable = new Disposable() {
            @Override
            public void dispose() {

            }
        };

        private volatile ReaderForServerMode readerForServerMode;

        private boolean isHeaderAdded = false;
        private int totalLines = 0;
        private int maxAllowedLines = NgsSettings.getMaxAllowedLines();

        public NgsProcessListener() {
            readerForServerMode = new ReaderForServerMode();
            readerForServerMode.setHeadFunc(this::onHeader);
            readerForServerMode.setRowFunc(this::onRow);
        }

        @Override
        public void startNotified(ProcessEvent event) {
            isHeaderAdded = false;
            totalLines = 0;

            SwingUtilities.invokeLater(() -> FrequentEventDetector.disableUntil(disposable));
        }

        @Override
        public void processTerminated(ProcessEvent event) {
            SwingUtilities.invokeLater(() -> Disposer.dispose(disposable));
        }

        @Override
        public void processWillTerminate(ProcessEvent event, boolean willBeDestroyed) {
        }

        @Override
        public void onTextAvailable(ProcessEvent event, Key outputType) {
            try {
                // In the Batch mode table is not added, and we don't get here
//                if (isListenerForBatchModeNotServer) {return;}
                if (totalLines++ == maxAllowedLines) {
                    ExecutionManagerImpl.stopProcess(runContentDescriptor);

                    SwingUtilities.invokeLater(() -> {
                        String message = "Too many output lines, process is terminated";
                        TableGraphForm.showTooltip(executionEnvironment, message);
                    });
                }

                if (totalLines >= maxAllowedLines) {
                    return;
                }

                if (!outputType.equals(ProcessOutputTypes.STDOUT)) {
                    // Servic messages from STDERR can break the parser.
                    return;
                }

                String text = event.getText();

                readerForServerMode.processLine(text);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public void onHeader(List<String> head) {
            tableGraphForm.onHeader(head);
        }

        public void onRow(List<String> row) {
            selectTableTabOnFirstRow();
            tableGraphForm.addRow(row);
        }

        private void selectTableTabOnFirstRow() {
            if (isHeaderAdded) {return;}

            isHeaderAdded = true;

            SwingUtilities.invokeLater(() -> {
                String selectedTab = ngsRunConfiguration.getSelectedTab();

                if (TAB_ID_TABLE.equals(selectedTab)) {
                    RunnerLayoutUi ui = runContentDescriptor.getRunnerLayoutUi();
                    ContentManager contentManager =  ui.getContentManager();
                    contentManager.setSelectedContent(tableTab);
                }
            });
        }
    }
}
