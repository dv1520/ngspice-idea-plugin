package org.ngs.add.idea.ftpl;

import com.intellij.ide.fileTemplates.FileTemplate;
import com.intellij.ide.fileTemplates.FileTemplateManager;
import com.intellij.ide.fileTemplates.actions.CreateFromTemplateAction;
import com.intellij.openapi.actionSystem.DefaultActionGroup;

/**
 * Created by z on 04.01.18.
 */
public class ActionGroupNewNgspiceFile extends DefaultActionGroup {
    public ActionGroupNewNgspiceFile() {
        addTemplate("Ngspice");
        addTemplate("Ngspice All Items");
    }

    private void addTemplate(String name) {
        FileTemplateManager manager = FileTemplateManager.getDefaultInstance();
        final FileTemplate template  = manager.getInternalTemplate(name);
        add(new CreateFromTemplateAction(template));
    }
}
