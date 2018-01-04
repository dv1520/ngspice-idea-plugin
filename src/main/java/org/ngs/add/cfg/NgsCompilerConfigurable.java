package org.ngs.add.cfg;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.ngs.add.util.NgsSettings;

import javax.swing.*;

/**
 * Created by z on 21.08.17.
 */
public class NgsCompilerConfigurable  implements SearchableConfigurable, Configurable.NoScroll  {

    public static final String DEFAULT_BINARY = "ngspice";

    public static final String DEFAULT_DOWNLOAD_URL = "https://github.com/dv1520/ngspice-bin/blob/master/bin/ngspice.zip?raw=true";

    private NgsSettingsForm form = new NgsSettingsForm();

    private String originalBinary = "";
    private boolean originalIsExpert;
    private String originalDownloadUrl = "";
    private String originalUnpackDir = "";


    @NotNull
    @Override
    public String getId() {
        return "Ngspice Compiler";
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "Ngspice Compiler";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        NgsConfig config = NgsConfig.getInstance();
        if (config != null) {
            originalIsExpert = config.isExpertOptionsEnabled();
            originalBinary = config.getNgsBinaryPath();
            if (originalBinary == null) {originalBinary = DEFAULT_BINARY;}
            originalDownloadUrl = config.getDownloadUrl();
            if (originalDownloadUrl == null) {
                originalDownloadUrl = DEFAULT_DOWNLOAD_URL;}
            originalUnpackDir = config.getUnpackDir();
            if (originalUnpackDir == null) {originalUnpackDir = NgsSettings.getPluginPath();}
        }

        form.setIsExpert(originalIsExpert);
        form.setSelectedFile(originalBinary);
        form.setDownloadUrl(originalDownloadUrl);
        form.setTargetDir(originalUnpackDir);

        return form.getMainPanel();
    }

    @Override
    public boolean isModified() {
        boolean isTheSame =
                originalIsExpert == form.getIsExpert() &&
                originalBinary.equals(form.getSelectedFile()) &&
                originalDownloadUrl.equals(form.getDownloadUrl()) &&
                originalUnpackDir.equals(form.getTargetDir());

        return !isTheSame;
    }

    @Override
    public void apply() throws ConfigurationException {
        System.out.println("Apply");

        originalIsExpert = form.getIsExpert();
        originalBinary = form.getSelectedFile();
        originalDownloadUrl = form.getDownloadUrl();
        originalUnpackDir = form.getTargetDir();

        NgsConfig config = NgsConfig.getInstance();
        if (config == null) {
            config = new NgsConfig();
        }

        config.setExpertOptionsEnabled(originalIsExpert);
        config.setNgsBinaryPath(originalBinary);
        config.setDownloadUrl(originalDownloadUrl);
        config.setUnpackDir(originalUnpackDir);
    }

    @Override
    public void reset() {
        form.setIsExpert(originalIsExpert);
        form.setSelectedFile(originalBinary);
        form.setDownloadUrl(originalDownloadUrl);
        form.setTargetDir(originalUnpackDir);
    }
}
