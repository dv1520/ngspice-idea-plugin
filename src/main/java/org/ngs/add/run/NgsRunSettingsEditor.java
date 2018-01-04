package org.ngs.add.run;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by z on 19.08.17.
 */
public class NgsRunSettingsEditor extends SettingsEditor<NgsRunConfiguration> {
    private JPanel myPanel;
    private JTextField filenameTextField;
    private JComboBox ngspiceModeCombobox;
    private LabeledComponent<ComponentWithBrowseButton> myMainClass;

    @Override
    protected void resetEditorFrom(NgsRunConfiguration demoRunConfiguration) {
        demoRunConfiguration.setBatchModeNotServer(false);
    }

    @Override
    protected void applyEditorTo(NgsRunConfiguration demoRunConfiguration) throws ConfigurationException {
        demoRunConfiguration.setBatchModeNotServer(isBatchModeNotServer());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return myPanel;
    }

    private void createUIComponents() {
        myMainClass = new LabeledComponent<ComponentWithBrowseButton>();
        myMainClass.setComponent(new TextFieldWithBrowseButton());
    }

    public String getFilename() {
        return filenameTextField.getText();
    }

    public void setFilename(String filename) {
        filenameTextField.setText(filename);
    }

    public void setBatchModeNotServer(boolean isBatchMode) {
        ngspiceModeCombobox.setSelectedIndex(isBatchMode ? 1 : 0);
    }

    public boolean isBatchModeNotServer() {
        return ngspiceModeCombobox.getSelectedIndex() != 0;
    }
}
