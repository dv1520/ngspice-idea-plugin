package org.ngs.add.run;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.ConfigurationTypeUtil;
import com.intellij.icons.AllIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by z on 19.08.17.
 */
public class NgsRunConfigurationType implements ConfigurationType {
    public NgsRunConfigurationType() {
        int w =5;
    }

    @Override
    public String getDisplayName() {
        return "Ngspice";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "Ngspice Run Configuration Type";
    }

    @Override
    public Icon getIcon() {
        return AllIcons.General.Information;
    }

    @NotNull
    @Override
    public String getId() {
        return "NGSPICE_RUN_CONFIGURATION";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{new NgsConfigurationFactory(this)};
    }


    @NotNull
    public static NgsRunConfigurationType getInstance() {
        return ConfigurationTypeUtil.findConfigurationType(NgsRunConfigurationType.class);
    }
}
