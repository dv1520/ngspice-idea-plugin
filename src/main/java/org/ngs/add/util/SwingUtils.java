package org.ngs.add.util;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by z on 01.10.17.
 */
public class SwingUtils {

    private int indent = 0;
    private List<JComponent> componentList = new ArrayList<JComponent>();

    public void printChildren(JComponent c) {
        indent = 0;
        componentList.clear();
    }

    private void  printSwingRecursive(JComponent c) {
        componentList.add(c);

        indent++;
        for (int i = 0; i < indent * 2; i++) {
            System.out.print(" ");
        }
        System.out.println(c.getClass());


        for (int i = 0; i < c.getAccessibleContext().getAccessibleChildrenCount(); i++) {
            JComponent cmp = (JComponent) c.getAccessibleContext().getAccessibleChild(i);

            printSwingRecursive(cmp);
        }

        indent --;
    }
}
