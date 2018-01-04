package org.ngs.add.util;

import com.google.common.collect.Lists;
import com.intellij.lang.Language;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.impl.PsiFileFactoryImpl;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import org.antlr.jetbrains.adaptor.lexer.RuleIElementType;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;

import java.util.Collections;
import java.util.List;

/**
 * Created by z on 31.12.17.
 */
public class MyIdeaUtils {

    public static int getRuleType(PsiElement e) {
        if (e == null || e.getNode() == null) {return -1;}

        IElementType type = e.getNode().getElementType();
        if (type instanceof RuleIElementType) {
            return ((RuleIElementType) type).getRuleIndex();
        }

        return -2;
    }

    public static int getTokenType(PsiElement e) {
        if (e == null || e.getNode() == null) {return -1;}

        IElementType type = e.getNode().getElementType();
        if (type instanceof TokenIElementType) {
            return ((TokenIElementType) type).getANTLRTokenType();
        }

        return -2;
    }

    public static PsiElement createLeafFromText(Project project, Language language, PsiElement context,
                                                String text, IElementType type) {
        // first line is the comment.
        text = "\n" + text;
        PsiFileFactoryImpl factory = (PsiFileFactoryImpl) PsiFileFactory.getInstance(project);
        PsiElement el = factory.createElementFromText(text, language, type, context);
        if ( el==null ) return null;
        PsiElement newLine = PsiTreeUtil.getDeepestFirst(el);
        if (newLine == null) return null;
        PsiElement line = newLine.getNextSibling();
        if (line == null) return null;
        return line.getFirstChild();
    }
}
