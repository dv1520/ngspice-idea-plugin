package org.ngs.add.idea.annot;

import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.ngs.parser.NgsParser;

import static org.ngs.add.util.MyIdeaUtils.getRuleType;

/**
 * Created by z on 06.01.18.
 */
public class NgsErrLineAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (getRuleType(element) != NgsParser.RULE_err_entry) {
            return;
        }

        String message = "Unknown entry";
        Annotation annotation = holder.createErrorAnnotation(element.getNode(), message);
    }
}
