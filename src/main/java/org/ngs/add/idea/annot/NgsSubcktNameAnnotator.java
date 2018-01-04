package org.ngs.add.idea.annot;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.ngs.parser.NgsLexer;
import org.ngs.parser.NgsParser;
import org.ngs.add.idea.compl.NgsCompletionContributor;

import static org.ngs.add.util.MyIdeaUtils.getRuleType;
import static org.ngs.add.util.MyIdeaUtils.getTokenType;

/**
 * Highlight, if the .ends [name] does not same as .subckt [other_name]
 *
 * Created by z on 16.08.17.
 */
public class NgsSubcktNameAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (getTokenType(element) == NgsLexer.SUBCKT_NAME) {
            PsiElement parent = element.getParent();
            if (getRuleType(parent) != NgsParser.RULE_subckt_tail_entry) {
                return;
            }

            PsiElement e = null;
            e = NgsCompletionContributor.firstOrNull(NgsCompletionContributor.getSubcktTailNames(parent));

            if (e == null) {
                return;
            }

            String expectedText = e.getText();
            String actualText = element.getText();

            if (element.getText().equals(expectedText)) {
                return;
            }

            Annotation annotation = holder.createErrorAnnotation(element.getNode(), "Subcircuit name must be the same for the beginning and ending blocks");

            annotation.registerFix(new IntentionAction() {
                @Nls
                @NotNull
                @Override
                public String getText() {
                    return expectedText;
                }

                @Nls
                @NotNull
                @Override
                public String getFamilyName() {
                    return "fam";
                }

                @Override
                public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
                    return true;
                }

                @Override
                public void invoke(@NotNull Project project, Editor editor, PsiFile file) throws IncorrectOperationException {
                    int offset = annotation.getStartOffset();

                    CharSequence textFromView = element.getContainingFile().getViewProvider().
                            getContents().subSequence(offset, offset + actualText.length());
                    // In the case text is already changed
                    if (StringUtils.equals(textFromView, actualText)) {
                        editor.getDocument().replaceString(offset, offset + actualText.length(), expectedText);
                    }
                }

                @Override
                public boolean startInWriteAction() {
                    return false;
                }
            });
        }
    }
}
