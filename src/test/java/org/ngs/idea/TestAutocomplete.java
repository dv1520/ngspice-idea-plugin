package org.ngs.idea;

import com.google.common.collect.Lists;
import org.ngs.idea.hlp.CaseTestHttp;
import org.ngs.idea.hlp.CaseTestRaw;
import org.ngs.idea.hlp.CaseTestRmi;

/**
 * Created by z on 16.11.17.
 */
//public class TestAutocomplete extends CaseTestHttp {
//public class TestAutocomplete extends CaseTestRmi {
public class TestAutocomplete extends CaseTestRaw {



    public void testCompletion() {
        doTest("model-from-model.cir", Lists.newArrayList("a14", "a15"));
    }


    public void testCompletionModelFromElement() {
        doTest("model-from-element.cir", Lists.newArrayList("a12", "a11", "a13"));
    }

    public void testCompletionNodeSimple() {
        doTest("node-simple.cir", Lists.newArrayList("10", "11", "12", "13", "14"));
    }


    public void testCompletionNodeSubcircuit() {
        doTest("node-subcircuit.cir", Lists.newArrayList("15", "18", "19"));
    }

    public void testCompletionSubcircuit() {
        doTest("subcircuit-ends.cir", Lists.newArrayList("aba"));
    }

    public void testCompletionSubcircuitXName() {
        doTest("subcircuit-x-name.cir", Lists.newArrayList("aba", "abc"));
    }
}
