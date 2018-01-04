package org.ngs.add.run;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;

/**
 * Created by z on 19.08.17.
 */
public class NgsConfigurationFactory extends ConfigurationFactory {
    private static final String FACTORY_NAME = "Ngspice configuration factory";

    protected NgsConfigurationFactory(ConfigurationType type) {
        super(type);
    }

    @Override
    public RunConfiguration createTemplateConfiguration(Project project) {
        return new NgsRunConfiguration(project, this, "Ngspice");
    }

    @Override
    public String getName() {
        return FACTORY_NAME;
    }
}
