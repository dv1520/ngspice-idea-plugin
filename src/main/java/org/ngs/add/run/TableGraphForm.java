package org.ngs.add.run;

import com.google.common.collect.Maps;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.project.ProjectCoreUtil;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.table.JBTable;
import org.apache.commons.lang3.StringEscapeUtils;
import org.ngs.add.util.NgsSettings;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/**
 * Created by z on 05.09.17.
 */
public class TableGraphForm {
    private JButton colsButton;
    private JButton saveButton;
    private JButton copyButton;
    private JSplitPane splitPane;
    private JPanel mainPanel;

    private int maxSamples;


    private JBTable jbTable;
    private GraphVI graphVi;

    private Map<String, Boolean> columnsVisibility = Maps.newHashMap();

    private String fileFullName = "";


    private ExecutionEnvironment environment;


    private DoubleConsumer splitterPosConsumer = value -> {};
    // splitter position depends on it width, which is unknown before
    // first paint. So we initialize it on the first draw.
    private double initialDividerPercentage = 0.5;
    private boolean isFirstPaint = true;
    private boolean isSecondPaint = false;


    public TableGraphForm() {
        maxSamples = NgsSettings.getMaxAllowedChartSamples();
    }

    public JSplitPane getSplitPane() {
        return splitPane;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JButton getColsButton() {
        return colsButton;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getCopyButton() {
        return copyButton;
    }

    public Map<String, Boolean> getColumnsVisibility() {
        return columnsVisibility;
    }

    public void setSplitterPosConsumer(DoubleConsumer splitterPosConsumer) {
        this.splitterPosConsumer = splitterPosConsumer;
    }

    public void setColumnsVisibility(Map<String, Boolean> columnsVisibility) {
        this.columnsVisibility = columnsVisibility;
    }

    public void init(String fileFullName, ExecutionEnvironment environment) {
        this.fileFullName = fileFullName;

        this.environment = environment;

        addJFreeChart(splitPane);
        jbTable = new JBTable();

        disableTableEdit();

        JBScrollPane scrollPane = new JBScrollPane(jbTable);
        splitPane.setLeftComponent(scrollPane);


        initButtons();
        initSplitter();
    }

    public static void showTooltip(ExecutionEnvironment environment, String message) {
        ToolWindowManager manager = ToolWindowManager.getInstance(environment.getProject());

        String toolWindowId = environment.getExecutor().getActionName();

        if (manager.canShowNotification(toolWindowId)) {
            //noinspection SSBasedInspection
            manager.notifyByBalloon(toolWindowId, MessageType.WARNING, message, null, null);
        }
    }

    private void disableTableEdit() {
        jbTable.setModel(new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }

    private void initButtons() {

        colsButton.addActionListener(e -> onSelectCols());

        copyButton.addActionListener(e -> onCopyTable());

        saveButton.addActionListener(e -> onSaveTable());
    }

    private void initSplitter() {
        splitPane.addPropertyChangeListener("dividerLocation", evt -> {
            int width = splitPane.getWidth() - splitPane.getDividerSize();
            width = Math.max(1, width);
            double replativePos = (double)splitPane.getDividerLocation() / (width);

            splitterPosConsumer.accept(replativePos);
        });
    }

    public void setDividerPercentage(double percentage) {
        initialDividerPercentage = percentage;
        if (!isFirstPaint) {
            splitPane.setDividerLocation(percentage);
        }
    }


    private void addJFreeChart(JSplitPane splitPane) {
        graphVi = new GraphVI();

        splitPane.setRightComponent(graphVi.getChartPanel());
    }

    private static void setTableVisibility(JBTable jbTable, Map<String, Boolean> visibility) {
        for (int i = 0; i < jbTable.getColumnModel().getColumnCount(); i++) {
            TableColumn col = jbTable.getColumnModel().getColumn(i);

            Boolean isVisible = visibility.get(col.getHeaderValue());

            setColVisible(col, isVisible);


        }

        resizeColumnWidth(jbTable);
    }

    private static void setColVisible(TableColumn col, Boolean isVisible) {
        if (isVisible == null) {return;}

        if (isVisible) {
            col.setMinWidth(10);
            col.setMaxWidth(1000);
            col.setWidth(100);
        } else {
            col.setMinWidth(0);
            col.setMaxWidth(0);
            col.setWidth(0);
        }
    }

    // https://stackoverflow.com/questions/17627431/auto-resizing-the-jtable-column-widths
    public static void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();

        int visibleColumns = 0;
        for (int column = 0; column < table.getColumnCount(); column++) {
            if (columnModel.getColumn(column).getWidth() == 0) {continue;}
            visibleColumns += 1;
        }

        visibleColumns = Math.max(visibleColumns, 1);
        int colWidth = table.getPreferredSize().width / visibleColumns;

        for (int column = 0; column < table.getColumnCount(); column++) {
            if (columnModel.getColumn(column).getWidth() == 0) {continue;}

            columnModel.getColumn(column).setPreferredWidth(colWidth);
        }
    }

    // buttons

    private void onSelectCols() {
        SelectColsDialog dialog = new SelectColsDialog();

        dialog.setVisibility(graphVi.getVVisibility(), graphVi.getIVisibility());


        dialog.pack();
        dialog.setVisible(true);


        Map<String, Boolean> visibility = dialog.getVisibility();

        graphVi.setIVVisibility(visibility);

        setTableVisibility(jbTable, visibility);


        this.columnsVisibility = visibility;

        onSelectedCols.accept(columnsVisibility);
    }


    private Consumer<Map<String, Boolean>> onSelectedCols = arg -> {};

    public void setOnSelectedCols(Consumer<Map<String, Boolean>> onSelectedCols) {
        this.onSelectedCols = onSelectedCols;
    }

    private void onCopyTable() {
        String str = tableToString();
        StringSelection selection = new StringSelection(str);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

    private void onSaveTable() {


        String baseDir = ProjectCoreUtil.theOnlyOpenProject().getBaseDir().getCanonicalPath();
        new File(baseDir + "/out").mkdirs();
        Charset charset = Charset.forName("utf-8");

        String name = new File(fileFullName).getName();
        // remove extension
        name = name.replaceAll("\\.[^.]+$", "");



        Path path = Paths.get(baseDir + "/out/" + name + ".csv");
        try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {

            TableColumnModel headerModel = jbTable.getTableHeader().getColumnModel();
            for (int i = 0; i < headerModel.getColumnCount(); i++) {
                Object o = headerModel.getColumn(i).getHeaderValue();

                String s = StringEscapeUtils.escapeCsv(o.toString());
                writer.write(s);
                if (i < headerModel.getColumnCount() - 1) {
                    writer.write(";");
                }
            }
            writer.write("\n");


            TableModel model = jbTable.getModel();

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object o = model.getValueAt(i, j);
                    if (o == null) {o = "";}
                    String s = StringEscapeUtils.escapeCsv(o.toString());

                    writer.write(s);
                    if (j < model.getColumnCount() - 1) {
                        writer.write(";");
                    }
                }

                if (i < model.getRowCount() - 1) {
                    writer.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
//            System.err.format("IOException: %s%n", x);
        }
    }

    //Impl

    private String tableToString() {
        StringBuilder sb = new StringBuilder();

        TableColumnModel headerModel = jbTable.getTableHeader().getColumnModel();
        for (int i = 0; i < headerModel.getColumnCount(); i++) {
            Object o = headerModel.getColumn(i).getHeaderValue();

            String s = StringEscapeUtils.escapeCsv(o.toString());
            sb.append(s);
            sb.append(";");
        }

        sb.setLength(sb.length() - 1);

        sb.append("\n");


        TableModel model = jbTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object o = model.getValueAt(i, j);
                String s = StringEscapeUtils.escapeCsv(o.toString());
                sb.append(s);
                sb.append(";");
            }
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        }

        return sb.toString();
    }


    //======================================================
    public void reset() {
        jbTable.setModel(new DefaultTableModel());
    }

    public DefaultTableModel getTableModel() {
        return (DefaultTableModel) jbTable.getModel();
    }


    public void onHeader(List<String> head) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                for (String s: head) {
                    getTableModel().addColumn(s);
                }

                java.util.List<String> headWithoutSeqNum = new ArrayList<>(head);
                headWithoutSeqNum.remove(0); // seq num
                headWithoutSeqNum.remove(0); // time


                graphVi.initHead(headWithoutSeqNum);

                if (graphVi.isValidVisibilitySettings(columnsVisibility)) {
                    graphVi.setIVVisibility(columnsVisibility);
                    setTableVisibility(jbTable, columnsVisibility);
                }
            }
        });
    }

    private void addSampleToGraph(List<String> row) {
        int samples = getTableModel().getRowCount();

        if (samples == maxSamples) {
            String message = "Chart output is disabled, too many rows";
            showTooltip(environment, message);
            return;
        }

        if (samples >= maxSamples) {
            return;
        }

        List<String> rowWIthoutSeqNum = new ArrayList<>();
        for (int i = 1; i < row.size(); i++) {
            rowWIthoutSeqNum.add(row.get(i));
        };


        try {
            graphVi.addRow(rowWIthoutSeqNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void applyRow(List<String> row) {
        addSampleToTable(row);

        addSampleToGraph(row);
    }

    private void addSampleToTable(List<String> row) {

        Vector<Object> tableRow = new Vector<Object>(row.size());
        DefaultTableModel model = getTableModel();
        for (int i = 0; i < row.size(); i++) {
            String s = row.get(i);
            Object o = s;
            try {
                if (i == 0) {
                    // Sequence number is the first
                    o = Integer.parseInt(s);
                } else {
                    // All other are v/i points
                    o = Double.parseDouble(s);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            tableRow.add(o);
        }

        getTableModel().addRow(tableRow);
    }


    private void createUIComponents() {
        mainPanel = new JPanel() {

            @Override
            public void doLayout() {
                super.doLayout();

                if (isFirstPaint) {
                    isFirstPaint = false;
                    isSecondPaint = true;
                    // Now width is set, can restore the splitter
                    splitPane.setDividerLocation(initialDividerPercentage);

                } else if (isSecondPaint) {
                    isSecondPaint = false;

                    // Launch 'Run', then 'Debug', the splitter will come to the left.
                    // It's because AddDockedComponentCmd
                    if (isCalledFromToolWindowPane()) {
                        splitPane.setDividerLocation(initialDividerPercentage);
                    }

                }
            }
        };
    }

    public void addRow(List<String> row) {
        SwingUtilities.invokeLater(() -> applyRow(row));
    }

    private boolean isCalledFromToolWindowPane() {
        // The first call comes from
        // 	at com.intellij.openapi.wm.impl.ToolWindowsPane$AddDockedComponentCmd.run(ToolWindowsPane.java:760)
        // The second is from
        // 	at com.intellij.openapi.wm.impl.ToolWindowsPane$AddDockedComponentCmd.run(ToolWindowsPane.java:762)


        for (StackTraceElement e: new RuntimeException().getStackTrace()) {
            if (e.getClassName().contains("ToolWindowsPane$AddDockedComponentCmd")) {
                return true;
            }
        }

        return false;
    }
}
