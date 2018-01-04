package org.ngs.add.idea;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.ngs.add.util.MyIdeaUtils;
import org.ngs.parser.NgsLexer;

/**
 * Created by z on 22.07.17.
 */
public class NgsRefactoringSupportProvider extends RefactoringSupportProvider {
    // Inplace rename PsiFile will require reference for NgsPsiFileReference
    @Override
    public boolean isMemberInplaceRenameAvailable(PsiElement element, PsiElement context) {
        if (element instanceof PsiFile) {
            return false;
        }

        return MyIdeaUtils.getTokenType(element) == NgsLexer.NODE;
    }

    @Override
    public boolean isInplaceRenameAvailable(@NotNull PsiElement element, PsiElement context) {
        if (element instanceof PsiFile) {
            return false;
        }

        return true;
    }

    @Override
    public boolean isInplaceIntroduceAvailable(@NotNull PsiElement element, PsiElement context) {
        return true;
    }
}
