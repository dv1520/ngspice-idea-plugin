package org.ngs.add.util;

import com.google.common.collect.Lists;
import com.intellij.formatting.Block;
import com.intellij.formatting.Indent;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.ngs.add.idea.fmt.NgsBlock;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/**
 * Created by z on 02.01.18.
 */
public class MyDebugUtils {
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

    public static void printBlocks(NgsBlock rootBlock) {
        System.out.println("Print block layout");
        printBlock2(rootBlock);
    }

    private static void printBlock2(Block block) {
        Indent indent = null;

        try {
            Field f = block.getClass().getDeclaredField("indent");
            f.setAccessible(true);
            indent = (Indent) f.get(block);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        PsiElement e = ((NgsBlock)block).getNode().getPsi();


        System.out.printf("Indent=%16s, e=%s, Block=%s\n", indent, e, block.toString().replace("\n", "|"));

        for (Block c: block.getSubBlocks()) {
            printBlock2(c);
        }
    }
}
