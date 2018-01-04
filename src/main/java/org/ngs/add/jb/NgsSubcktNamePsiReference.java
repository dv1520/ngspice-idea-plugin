package org.ngs.add.jb;

import com.google.common.collect.Lists;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiPolyVariantReferenceBase;
import com.intellij.psi.ResolveResult;
import com.intellij.util.IncorrectOperationException;
import org.antlr.jetbrains.adaptor.xpath.XPath;
import org.ngs.adapter.NgsLanguage;
import org.jetbrains.annotations.NotNull;
import org.ngs.add.idea.compl.NgsCompletionContributor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by z on 19.08.17.
 */
public class NgsSubcktNamePsiReference extends PsiPolyVariantReferenceBase<NgsSubcktNamePsiNode> {

    public NgsSubcktNamePsiReference(@NotNull NgsSubcktNamePsiNode element) {
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
        PsiElement circuit = NgsCompletionContributor.getParentCircuit(myElement);
        if (circuit == null) {
            return emptyResult();
        }
        // References: head, .ends, x-entries
        List<PsiElement> elements = new ArrayList<>();

        Collection<? extends PsiElement> heads = XPath.findAll(NgsLanguage.INSTANCE, circuit, "/circuit/subckt/subckt_head_entry/SUBCKT_NAME");
        elements.addAll(heads);


        Collection<? extends PsiElement> tails = XPath.findAll(NgsLanguage.INSTANCE, circuit, "/circuit/subckt/subckt_tail_entry/SUBCKT_NAME");
        elements.addAll(tails);

        Collection<? extends PsiElement> xEntries = XPath.findAll(NgsLanguage.INSTANCE, circuit, "/circuit/line/x_entry/SUBCKT_NAME");
        elements.addAll(xEntries);


        return toResult(elements, myElement.getText());
    }

    public static ResolveResult[] toResult(List<PsiElement> elements, String expectedText) {
        List<ResolveResult> result = Lists.newArrayList();
        for (PsiElement e: elements) {
            if (e.getText().equals(expectedText)) {
                result.add(new PsiElementResolveResult(e));
            }
        }

        return result.toArray(new ResolveResult[result.size()]);
    }

    public static ResolveResult[] emptyResult() {
        return new ResolveResult[0];
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }


    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        return myElement.setName(newElementName);
    }
}
