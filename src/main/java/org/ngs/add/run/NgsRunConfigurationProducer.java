package org.ngs.add.run;

import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.execution.actions.ConfigurationFromContext;
import com.intellij.execution.actions.RunConfigurationProducer;
import com.intellij.openapi.util.Ref;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.ngs.adapter.NgsLanguage;
import org.jetbrains.annotations.Nullable;

import java.io.File;

/**
 * Created by z on 20.08.17.
 */
public class NgsRunConfigurationProducer extends RunConfigurationProducer<NgsRunConfiguration> {

    public NgsRunConfigurationProducer() {
        super(NgsRunConfigurationType.getInstance());
    }

    @Override
    protected boolean setupConfigurationFromContext(NgsRunConfiguration configuration, ConfigurationContext context, Ref<PsiElement> sourceElement) {
        if (!isNgspiceFile(context)) {
            return false;
        }

        String filename = getFile(context).getVirtualFile().getCanonicalPath();
        if (filename == null) {throw new RuntimeException("Missing file");}

        configuration.setFilename(filename);
        configuration.setName(new File(filename).getName());

        return true;
    }

    private boolean isNgspiceFile(ConfigurationContext context) {
        PsiFile file = getFile(context);
        return file != null && file.getLanguage() instanceof NgsLanguage;
    }

    private PsiFile getFile(ConfigurationContext context) {
        PsiElement location = context.getPsiLocation();
        if (location == null) {return null;}
        return location.getContainingFile();
    }

    @Override
    public boolean isConfigurationFromContext(NgsRunConfiguration configuration, ConfigurationContext context) {
        if (!isNgspiceFile(context)) {
            return false;
        }

        String fileName = getFile(context).getVirtualFile().getCanonicalPath();

        return fileName != null && fileName.equals(configuration.getFilename());
    }

    @Nullable
    @Override
    public ConfigurationFromContext findOrCreateConfigurationFromContext(ConfigurationContext context) {
        return super.findOrCreateConfigurationFromContext(context);
    }
}
