package org.ngs.add.idea.pi;

import com.intellij.codeInsight.template.EverywhereContextType;
import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.util.PsiUtilCore;
import org.ngs.adapter.NgsLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.ngs.parser.NgsParser;

import static org.ngs.add.util.MyIdeaUtils.getRuleType;

/**
 * org.jetbrains.plugins.groovy.template.GroovyTemplateContextType
 * Created by z on 29.11.17.
 */
public abstract class NgsTemplateContextType  extends TemplateContextType {

    public NgsTemplateContextType(@NotNull String id, @NotNull String presentableName, @Nullable Class<? extends TemplateContextType> baseContextType) {
        super(id, presentableName, baseContextType);
    }

    @Override
    public boolean isInContext(@NotNull final PsiFile file, final int offset) {
        if (PsiUtilCore.getLanguageAtOffset(file, offset).isKindOf(NgsLanguage.INSTANCE)) {
            PsiElement element = file.findElementAt(offset);
            if (element instanceof PsiWhiteSpace) {
                return false;
            }
            return element != null && isInContext(element);
        }

        return false;
    }

    protected abstract boolean isInContext(@NotNull PsiElement element);

    public static class Generic extends NgsTemplateContextType {
        public Generic() {
            super("NGSPICE", "Ngspice", EverywhereContextType.class);
        }

        @Override
        protected boolean isInContext(@NotNull PsiElement element) {
            return true;
        }
    }

    // EverywhereContextType.class
    public static class Statement extends NgsTemplateContextType {

        public Statement() {
            super("NGSPICE_STATEMENT", "Statement", Generic.class);
        }

        @Override
        protected boolean isInContext(@NotNull PsiElement element) {
            PsiElement parent = element.getParent();
            // 'ngs ngs' <- autocomplete first str only
            PsiElement prevSibling = element.getPrevSibling();

            int ruleType = getRuleType(parent);

            return ruleType == NgsParser.RULE_err_entry && prevSibling == null;
        }
    }
}
