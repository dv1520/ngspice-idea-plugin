package org.ngs.add.idea.fmt;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by z on 23.07.17.
 */
public class NgsFormattingModelBuilder implements FormattingModelBuilder {

    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        NgsBlock block = new NgsBlock(element.getNode(), Wrap.createWrap(WrapType.NONE, false), Alignment.createAlignment());

        return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(),
                block,
                settings);
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return null;
    }

    private int steps = 0;

    private void printBlockTree(NgsBlock block) {
        steps++;

        printSteps();
        System.out.println(block.getNode() + ", " + block.getIndent());

        for (Block b: block.buildChildren()) {
            NgsBlock ngsb = (NgsBlock) b;
            printBlockTree(ngsb);

        }


        steps--;
    }
    private void printSteps() {
        for (int i = 0; i < steps; i++) {
            System.out.print("  ");
        }
    }
}
