package org.ngs.prs;

import org.junit.Test;

/**
 * Created by z on 05.07.17.
 */
public class TestParser {

    private String baseDir = "src/test/testdata/parser/";

    @Test
    public void testKeyValueWhitespace() throws Exception {
        assertFile("special/key-value.cir");
    }

    @Test
    public void testKeyValueExpr() {
        assertFile("special/key-value-expr.cir");
    }

    @Test
    public void testKeyValueNegative() {
        assertFile("special/key-value-negative.cir");
    }

    @Test
    public void testSubcircuit() {
        assertFile("ctrl/subckt.cir");
    }



    @Test
    public void testSubcircuitErrorExtraEnds() {
        assertFile("ctrl/subckt-error-extra-ends.cir");
    }

    @Test
    public void testSubcktWithParams() {
        assertFile("ctrl/subckt-with-params.cir");
    }

    @Test
    public void testSubcktUsage() {
        assertFile("ctrl/subckt-usage.cir");
    }

    @Test
    public void testErrorBeforeSubcircuit() {
        assertFile("special/r-error-before-subcircuit.cir");
    }

    @Test
    public void testErrorBeforeR() {
        assertFile("special/r-error-before-r.cir");
    }

    @Test
    public void testCommentStartOfLine() {
        assertFile("comment/comment-start-of-line.cir");
    }

    @Test
    public void testCommentEndOfLine() {
        assertFile("comment/comment-end-of-line.cir");
    }

    @Test
    public void testIncludeLine() {
        assertFile("ctrl/include.cir");
    }

    private void assertFile(String filename) {
        TestParserTestByElements.assertFile(baseDir, filename);
    }
}
