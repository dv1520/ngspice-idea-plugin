package org.ngs.add.jb;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import org.ngs.add.idea.compl.NgsCompletionContributor;

import java.util.ArrayList;
import java.util.List;

import static org.ngs.add.jb.NgsSubcktNamePsiReference.toResult;

/**
 * Created by z on 12.11.17.
 */
public class NgsModelPsiReference extends PsiPolyVariantReferenceBase<NgsModelPsiNode> {
    public NgsModelPsiReference(@NotNull NgsModelPsiNode element) {
        /** WARNING: You must send up the text range or you get this error:
         * "Cannot find manipulator for PsiElement(ID) in org.antlr.jetbrains.sample.SampleElementRef"...
         *  when you click on an identifier.  During rename you get this
         *  error too if you don't impl handleElementRename().
         *
         *  The range is relative to start of the token; I guess for
         *  qualified references we might want to use just a part of the name.
         *  Or we might look inside string literals for stuff.
         */
        super(element, new TextRange(0, element.getText().length()));
    }


    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        List<PsiElement> result = new ArrayList<>();
        result.addAll(NgsCompletionContributor.getModelNames(myElement));
        result.remove(myElement);

        return toResult(result, myElement.getText());
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }
}
