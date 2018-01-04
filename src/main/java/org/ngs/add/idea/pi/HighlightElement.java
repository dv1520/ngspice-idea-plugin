package org.ngs.add.idea.pi;

import com.intellij.psi.PsiElement;

/**
 * Object to pass between NgsParameterInfoHandler methods.
 * Fields are not the part of the Handler because of PsiElements.
 * They are recommended to be released ASAP.
 *
 * Created by z on 28.12.17.
 */
public class HighlightElement {
    public PsiElement element;
    public PsiElement root;
    public int numInGroup;
    public int highlightStart;
    public int highlightStop;
}

