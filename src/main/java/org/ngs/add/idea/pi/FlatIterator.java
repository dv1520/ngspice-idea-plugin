package org.ngs.add.idea.pi;

import com.intellij.psi.PsiElement;

import javax.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Iterate all child leafs, ignoring NgsParser.rule nodes.
 *
 * Created by z on 30.12.17.
 */
public class FlatIterator implements Iterator<PsiElement> {
    private Deque<PsiElement> flatten = new ArrayDeque<>();

    private PsiElement nextElement;

    public void init(PsiElement parent) {
        this.flatten.clear();
        this.nextElement = digToLeaf(parent.getFirstChild());
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }

    @Nullable
    private PsiElement digToLeaf(PsiElement parent) {
        PsiElement e = parent;
        while (e.getFirstChild() != null) {
            flatten.add(e);
            e = e.getFirstChild();
        }
        return e;
    }

    private PsiElement goNextSibling(PsiElement element) {
        PsiElement next = element.getNextSibling();
        while (next == null) {
            if (flatten.isEmpty()) {
                return null;
            }

            next = flatten.removeLast().getNextSibling();
        }

        return next;
    }

    @Override
    public PsiElement next() {
        PsiElement toReturn = nextElement;
        PsiElement e = nextElement;
        do {
            e = goNextSibling(e);
            if (e == null) {break;}
            e = digToLeaf(e);
        } while (e == null);

        nextElement = e;

        return toReturn;
    }
}