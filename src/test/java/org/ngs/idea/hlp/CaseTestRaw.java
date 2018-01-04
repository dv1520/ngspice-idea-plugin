package org.ngs.idea.hlp;

import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by z on 17.11.17.
 */
public abstract class CaseTestRaw extends LightCodeInsightFixtureTestCase {

    @Override
    protected String getTestDataPath() {
        return "src/test/testdata/idea";
    }

    protected void doTest(String filename, List<String> expectedOutput) {
        myFixture.configureByFiles(filename);
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> strings = myFixture.getLookupElementStrings();
        if (strings != null) {Collections.sort(strings);}
        Collections.sort(expectedOutput);
        assertEquals(expectedOutput, strings);
    }
}
