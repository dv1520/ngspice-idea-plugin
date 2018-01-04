package org.ngs.add.util;

import com.google.common.collect.Lists;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;

import java.util.Collections;
import java.util.List;

/**
 * Created by z on 02.01.18.
 */
public class DebugUtils {
    public static void printFromParent(PsiElement e) {
        StringBuilder padding = new StringBuilder();
        PsiElement parent = e;
        List<PsiElement> elements = Lists.newArrayList();
        while (parent != null) {
            elements.add(parent);
            parent = parent.getParent();
        }

        Collections.reverse(elements);


        System.out.println("PrintTree123");
        for (PsiElement element: elements) {
            System.out.print(padding);padding.append("  ");
            System.out.println(element);
        }
    }

    public static void printPsiTree(PsiElement e) {
        PsiElement root = e;
        while (root.getParent() != null && !(root instanceof PsiFile)) {
            root = root.getParent();
        }

        if (!(root instanceof PsiFile)) {
            System.out.println("Can't print " + e);
            return;
        }

        printHierarchy(root, 0, e);
    }

    private static void printHierarchy(PsiElement e, int indent, PsiElement toHighlight) {
        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }

        System.out.print(e);
        if (e == toHighlight) {
            System.out.println(" *");
        } else {
            System.out.println();
        }

        PsiElement child = e.getFirstChild();
        while (child != null) {
            printHierarchy(child, indent + 1, toHighlight);
            child = child.getNextSibling();
        }
    }
}
