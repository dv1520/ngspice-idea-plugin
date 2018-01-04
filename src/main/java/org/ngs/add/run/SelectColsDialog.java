package org.ngs.add.run;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SelectColsDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable colsTable;



    public SelectColsDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        init();
    }

    private void init() {
        colsTable.setModel(new DefaultTableModel(
                new Object[][]{new Object[]{true, "v1", false, "i1"}},
                new Object[]{"", "voltage", "", "current"}){
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0 || columnIndex == 2) {
                    return Boolean.class;
                }
                return super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                if (column % 2 != 0) return false; // text is not editable

                return getValueAt(row, column) != null;
//                return getValueAt(row, column % 2) != null;
//                return false;
//                return super.isCellEditable(row, column);
            }
        });
    }



    public void setVisibility(Map<String, Boolean> vVisible, Map<String, Boolean> iVisible) {
        Iterator<Map.Entry<String, Boolean>> vIt = vVisible.entrySet().iterator();
        Iterator<Map.Entry<String, Boolean>> iIt = iVisible.entrySet().iterator();

        ((DefaultTableModel)colsTable.getModel()).setRowCount(0);

        while (vIt.hasNext() || iIt.hasNext()) {
            Map.Entry<String, Boolean> vNext = vIt.hasNext() ? vIt.next() : null;
            Map.Entry<String, Boolean> iNext = iIt.hasNext() ? iIt.next() : null;

            Object[] row = new Object[4];
            if (vNext != null) {
                row[0] = vNext.getValue();
                row[1] = vNext.getKey();
            }

            if (iNext != null) {
                row[2] = iNext.getValue();
                row[3] = iNext.getKey();
            }

            ((DefaultTableModel)colsTable.getModel()).addRow(row);
        }
    }

    public Map<String, Boolean> getVisibility() {
        Map<String, Boolean> result = new LinkedHashMap<>();

        DefaultTableModel model = ((DefaultTableModel)colsTable.getModel());
        for (int i = 0; i < model.getRowCount(); i++) {
            Boolean isVisible = (Boolean) model.getValueAt(i, 0);
            String name = (String) model.getValueAt(i, 1);

            if (name != null) {
                result.put(name, isVisible);
            }

            isVisible = (Boolean) model.getValueAt(i, 2);
            name = (String) model.getValueAt(i, 3);

            if (name != null) {
                result.put(name, isVisible);
            }
        }

        return result;
    }


    private void onOK() {
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {
        SelectColsDialog dialog = new SelectColsDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
