package org.ngs.add.jb;

import com.google.common.collect.Lists;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.util.IncorrectOperationException;
import org.antlr.jetbrains.adaptor.xpath.XPath;
import org.ngs.adapter.NgsLanguage;
import org.jetbrains.annotations.NotNull;
import org.ngs.add.util.MyIdeaUtils;
import org.ngs.parser.NgsParser;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by z on 12.07.17.
 */
public class NgsNodePsiReference extends PsiPolyVariantReferenceBase<NgsNodePsiNode> {

    public NgsNodePsiReference(@NotNull NgsNodePsiNode element) {
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

    // 2017-07-12 16:56:46,438 [ 429407]  ERROR - .intellij.psi.PsiReferenceBase - Cannot find manipulator for PsiElement(NODE) in PsiElement(NODE):(0,3) class class NgsNodePsiReference
    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        return myElement.setName(newElementName);
    }


    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return getResolveResults();
    }

    private List<ResolveResult> getCircuitNodes(PsiElement circuitRuleNode) {
        LinkedHashSet<PsiElement> elements = (LinkedHashSet) XPath.findAll(NgsLanguage.INSTANCE, circuitRuleNode, "circuit/line//NODE");
        elements.remove(myElement);

        List<ResolveResult> result = Lists.newArrayList();
        for (PsiElement e: elements) {
            if (e.getText().equals(myElement.getText())) {
                result.add(new PsiElementResolveResult(e));
            }
        }

        return result;
    }

    private List<ResolveResult> getSubcircuitHeadNodes(PsiElement subcircuitHeadNode) {
        LinkedHashSet<PsiElement> elements = (LinkedHashSet) XPath.findAll(NgsLanguage.INSTANCE, subcircuitHeadNode, "/subckt_head_entry//NODE");
        elements.remove(myElement);

        List<ResolveResult> result = Lists.newArrayList();
        for (PsiElement e: elements) {
            if (e.getText().equals(myElement.getText())) {
                result.add(new PsiElementResolveResult(e));
            }
        }

        return result;
    }

    private <T> T first(Collection<T> collection) {
        if (collection.size() == 0) {
            return null;
        }

        return collection.iterator().next();
    }

    private ResolveResult[] getResolveResults() {
        PsiElement parent = myElement;

        if (MyIdeaUtils.getRuleType(myElement.getParent()) == NgsParser.RULE_subckt_head_entry) {
            PsiElement subckt = myElement.getParent().getParent();
            Collection<PsiElement> set = (Collection) XPath.findAll(NgsLanguage.INSTANCE, subckt, "subckt/circuit");
            PsiElement circuit = first(set);
            if (circuit != null) {
                parent = circuit;
            }
        }

        while (parent != null) {
            if (MyIdeaUtils.getRuleType(parent) == NgsParser.RULE_circuit) {
                List<ResolveResult> refs = getCircuitNodes(parent);
                PsiElement subcircuit = parent.getParent();
                if (MyIdeaUtils.getRuleType(subcircuit) == NgsParser.RULE_subckt) {
                    PsiElement subcktHeadEntry = subcircuit.getFirstChild();
                    refs.addAll(getSubcircuitHeadNodes(subcktHeadEntry));
                }
                return refs.toArray(new ResolveResult[refs.size()]);
            }

            parent = parent.getParent();
        }

        return new ResolveResult[0];
    }
    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }
}
