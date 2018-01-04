package org.ngs.add.idea.pi;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.lang.parameterInfo.*;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Created by z on 09.12.17.
 */
public class NgsParameterInfoHandler implements ParameterInfoHandler<PsiElement, HighlightElement> {

    private HighlightInfo highlightInfo = new HighlightInfo();

    // temp variable to avoid new object allocation
    private List<Integer> validChains = new ArrayList<>();

    @Override
    public boolean couldShowInLookup() {
        return false;
    }

    @Nullable
    @Override
    public Object[] getParametersForLookup(LookupElement item, ParameterInfoContext context) {
        return new Object[0];
    }

    @Nullable
    @Override
    public PsiElement findElementForParameterInfo(@NotNull CreateParameterInfoContext context) {
        int offset = context.getOffset();
        PsiElement element = context.getFile().findElementAt(offset);
        PsiElement root = HighlightInfo.getRootLineElement(element);

        boolean isInitialized = highlightInfo.init(root);
        if (!isInitialized) {
            return null;
        }

        setItemsToShow(element, root, context);

        return element;
    }

    @Override
    public void showParameterInfo(@NotNull PsiElement element, @NotNull CreateParameterInfoContext context) {
        PsiElement root = HighlightInfo.getRootLineElement(element);
        context.showHint(root, element.getTextRange().getStartOffset(), this);
    }

    @Nullable
    @Override
    public PsiElement findElementForUpdatingParameterInfo(@NotNull UpdateParameterInfoContext context) {
        int offset = context.getEditor().getCaretModel().getOffset();
        PsiElement element = context.getFile().findElementAt(offset);
        PsiElement root = HighlightInfo.getRootLineElement(element);

        PsiElement owner = context.getParameterOwner();

        if (highlightInfo.isXEntryHighlight()) {
            // We need to update the token list, if a node is added.
            highlightInfo.init(root);
        }

        if (owner != root) {
            return null;
        }

        return element;
    }

    @Override
    public void updateParameterInfo(@NotNull PsiElement element, @NotNull UpdateParameterInfoContext context) {
        PsiElement root = getRootElementFromContext(context);

        int tokenNum = highlightInfo.getTokenNum(root, element, validChains);

        initContextHighlightInfo(element, tokenNum, context);
    }

    @Override
    public void updateUI(HighlightElement he, @NotNull ParameterInfoUIContext context) {
        String s = highlightInfo.toLabel(he.numInGroup);
        context.setupUIComponentPresentation(
                s,
                he.highlightStart,
                he.highlightStop,
                false,
                false,
                false,
                context.getDefaultParameterColor()
        );
    }

    @Nullable
    @Override
    public Object[] getParametersForDocumentation(HighlightElement element, ParameterInfoContext context) {
        return new Object[0];
    }

    @Nullable
    @Override
    public String getParameterCloseChars() {
        return null;
    }

    @Override
    public boolean tracksParameterIndex() {
        return false;
    }

    private void setItemsToShow(PsiElement element, PsiElement root, CreateParameterInfoContext context) {
        HighlightElement[] highlights = new HighlightElement[highlightInfo.getItemCount()];
        for (int i = 0; i < highlights.length; i++) {
            HighlightElement he = new HighlightElement();
            he.element = element;
            he.root = root;
            he.numInGroup = i;
            highlights[i] = he;
        }

        context.setItemsToShow(highlights);
    }

    private PsiElement getRootElementFromContext(UpdateParameterInfoContext context) {
        PsiElement root = null;

        for (Object o: context.getObjectsToView()) {
            if (o instanceof HighlightElement) {
                HighlightElement he = (HighlightElement) o;
                root = he.root;
            }
        }

        return root;
    }

    private void initContextHighlightInfo(PsiElement element, int tokenNum, UpdateParameterInfoContext context) {
        int i = -1;
        for (Object o: context.getObjectsToView()) {
            i++;

            HighlightElement he = (HighlightElement) o;
            initHiglightInfo(i, tokenNum, element, he, validChains);
        }
    }

    private void initHiglightInfo(int choiceNum, int tokenNum, PsiElement element, HighlightElement he, List<Integer> validChains) {
        int start = -1;
        int stop = -1;
        if (validChains.contains(choiceNum)) {
            start = highlightInfo.getStartOffset(choiceNum, tokenNum);
            stop  = highlightInfo.getEndOffset(choiceNum, tokenNum);
        }

        he.element = element;

        he.highlightStart = start;
        he.highlightStop = stop;
    }
}
