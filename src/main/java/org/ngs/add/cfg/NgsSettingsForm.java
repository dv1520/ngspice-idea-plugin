package org.ngs.add.cfg;

import com.intellij.ui.components.JBScrollPane;
import org.ngs.adapter.NgsPluginController;
import org.apache.commons.lang.SystemUtils;
import org.ngs.add.util.NgsSettings;
import org.zeroturnaround.exec.ProcessExecutor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.concurrent.*;

/**
 * Created by z on 21.08.17.
 */
public class NgsSettingsForm {
    private JPanel panel1;
    private JTextField pathField;
    private JButton testButton;
    private JButton selectTargetPathButton;
    private JButton downloadButton;
    private JCheckBox expertOptionsCheckBox;
    private JTextField downloadUrlField;
    private JTextField unpackDirField;
    private JButton selectUnpackDirButton;
    private JButton settingsToDefaultButton;

    public NgsSettingsForm() {
        selectTargetPathButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onSelect();
            }
        });

        testButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onTest(getMainPanel(), pathField.getText());
            }
        });

        downloadButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDownload();
            }
        });

        initTextFields();


        setDefaultSettings();

        updateEnabled();
    }

    public static String runBinaryAndGetError(String ngSpiceBinary) {
        String r = "";
        try {
            r = new ProcessExecutor().
                    command(ngSpiceBinary, "--help")
                    .readOutput(true)
                    .timeout(2000, TimeUnit.MILLISECONDS)
                    .execute()
                    .outputUTF8();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (r.contains("Simulate the electical circuits")) {
            return "";
        }

        return "Can't run supported version of ngspice with command '" + ngSpiceBinary + "'";
    }

    public JPanel getMainPanel() {
        return panel1;
    }

    public String getSelectedFile() {
        return pathField.getText();
    }

    public void setSelectedFile(String s) {
        pathField.setText(s);
    }


    public boolean getIsExpert() {
        return expertOptionsCheckBox.isSelected();
    }

    public String getDownloadUrl() {
        return downloadUrlField.getText();
    }

    public String getTargetDir() {
        return unpackDirField.getText();
    }

    public void setIsExpert(boolean isExpert) {
        expertOptionsCheckBox.setSelected(isExpert);
        updateEnabled();
    }

    public void setDownloadUrl(String url) {
        downloadUrlField.setText(url);
    }

    public void setTargetDir(String dir) {
        unpackDirField.setText(dir);
    }

    public static void showError(Component rootComponent, String message) {
        showError(rootComponent, message, new RuntimeException());
    }

    public static void showError(Component rootComponent, String message, Throwable error) {
        NgsPluginController.LOG.error(error);

        // To be able to copy-paste error
        int textWidth = message.length();

        if (textWidth > 50) {
            textWidth = 50;
        }
        JTextArea ta = new JTextArea(5, textWidth);
        ta.setText(message);
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        ta.setCaretPosition(0);
        ta.setEditable(false);

        JOptionPane.showMessageDialog(rootComponent, new JBScrollPane(ta));
    }


    private void initTextFields() {
        expertOptionsCheckBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEnabled();
            }
        });

        settingsToDefaultButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setDefaultSettings();
            }
        });

        selectUnpackDirButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onSelectTargetPath();
            }
        });
    }



    private void setDefaultSettings() {
        String pluginPath = NgsSettings.getPluginPath();

        unpackDirField.setText(pluginPath);

        String url = NgsCompilerConfigurable.DEFAULT_DOWNLOAD_URL;
        downloadUrlField.setText(url);
    }

    private void updateEnabled() {
        boolean isEnabled = expertOptionsCheckBox.isSelected();
        unpackDirField.setEnabled(isEnabled);
        downloadUrlField.setEnabled(isEnabled);
        selectUnpackDirButton.setEnabled(isEnabled);
        settingsToDefaultButton.setEnabled(isEnabled);
    }

    private void onSelectTargetPath() {
        JFileChooser chooser = new JFileChooser(unpackDirField.getText());
        chooser.setDialogType(JFileChooser.OPEN_DIALOG);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogTitle("Select unpack dir");

        int result = chooser.showDialog(getMainPanel(), "Select");
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            unpackDirField.setText(file.getAbsolutePath());
        }
    }

    private void onSelect() {
        JFileChooser chooser = new JFileChooser(pathField.getText());
        chooser.setDialogType(JFileChooser.OPEN_DIALOG);
        chooser.setDialogTitle("Select NGSpice binary");


        int result = chooser.showDialog(getMainPanel(), "Select");
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            pathField.setText(file.getAbsolutePath());

        }
    }

    private static void onTest(Component rootComponent, String commandName) {
        String error = runBinaryAndGetError(commandName);

        if (error.isEmpty()) {
            JOptionPane.showMessageDialog(rootComponent, "Ngspice is configured correctly", "Ngspice", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootComponent, "Unexpected output", "Ngspice", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setConfigToUseDownloadedNgspice() {
        SwingUtilities.invokeLater(() -> {
            String root = unpackDirField.getText();
            String file;
            if (SystemUtils.IS_OS_WINDOWS) {
                file = root + "/ngspice/win/Spice/bin/ngspice_con.exe";
            } else {
                file = root + "/ngspice/linux/usr/local/bin/ngspice";
            }

            pathField.setText(file);
        });
    }


    private void onDownload() {
        String pluginPath = getPluginDir();
        if (pluginPath.isEmpty()) {
            return;
        }

        String zipName = pluginPath + "/ngspice.zip";

        String url = downloadUrlField.getText();
        new ZipDownloader(panel1, url, zipName).
                startDownload(this::setConfigToUseDownloadedNgspice);
    }

    private String getPluginDir() {
        String pluginPath = NgsSettings.getPluginPath();


        File pluginDir = new File(pluginPath);


        pluginDir.mkdirs();
        if (pluginPath.isEmpty()|| !(pluginDir.exists() && pluginDir.isDirectory())) {
            String message = "Can't download to the directory " + pluginDir + ". Please use vm option like idea.plugins.path=/home/user/.IdeaIC2017.1/system/plugins-sandbox/plugins";
            showError(panel1, message);
            return "";
        }

        return pluginPath;
    }

}
