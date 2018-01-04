package org.ngs.prs;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.ngs.parser.NgsLexer;
import org.ngs.parser.NgsParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by z on 13.07.17.
 */
public class TestParserTestByElements {
    private String baseDir = "src/test/testdata/parser/by-elements/";


    @Test
    public void testRWithModel() {
        assertFile("r-with-model.cir");
    }
    @Test
    public void testTmp() {
        assertFile("r.cir");
    }


    @Test
    public void testLInductor() {
        assertFile("l.cir");
    }

    @Test
    public void testVSource() {
        assertFile("v-pulse.cir");
    }

    @Test
    public void testESource() {
        assertFile("e-source.cir");
    }

    @Test
    public void testFSource() {
        assertFile("f-source.cir");
    }

    @Test
    public void testAXSpice() {
        assertFile("a-simple.cir");
    }

    @Test
    public void testModel() {
        assertFile("ctrl/model.cir");
    }

    @Test
    public void testKCoupledInductors() {
        assertFile("k.cir");
    }

    @Test
    public void testSwitches() {
        assertFile("s-w.cir");
    }

    @Test
    public void testTransmissionLines() {
        assertFile("t-o-u-y.cir");
    }

    @Test
    public void testDiode() {
        assertFile("d.cir");
    }

    @Test
    public void testTransistorQ() {
        assertFile("q.cir");
    }
    @Test
    public void testTransistorJ() {
        assertFile("j.cir");
    }
    @Test
    public void testTransistorZ() {
        assertFile("z.cir");
    }

    @Test
    public void testTransistorM() {
        assertFile("m.cir");
    }

    @Test
    public void testTran() {
        assertFile("ctrl/tran.cir");
    }

    @Test
    public void testPrint() {
        assertFile("ctrl/print.cir");
    }



    private static String readFile(String baseDir, String testFile) {
        try {
            byte[] arr = Files.readAllBytes(Paths.get(baseDir + testFile));
            return new String(arr, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private void assertFile(String filename) {
        assertFile(baseDir, filename);
    }

    public static void assertFile(String baseDir, String filename) {
        String file = readFile(baseDir, filename);
        String[] components = file.split("\n+\\s*;\\s*\\n+");
        String circuit = components[0];
        String lexer = components.length > 1 ? components[1] : "";
        String parser = components.length > 2 ? components[2] : "";

        assertLexerAndParser(circuit, lexer, parser);
    }

    private static void assertLexerAndParser(String text, String lexerOutput, String parserOutput) {
        NgsLexer lexer = new NgsLexer(CharStreams.fromString(text));

        CommonTokenStream cts = new CommonTokenStream(lexer);

        NgsParser parser = new NgsParser(cts);


        String lexerText = lexerToString(lexer);
        String parserText = parserToString(parser);

        printResult(text, lexerText, parserText);

        assertEquals("Lexer  is different", lexerOutput, lexerText);
        assertEquals("Parser is different", parserOutput, parserText);
    }

    private static void printResult(String circuit, String lexer, String parser) {
        boolean isPrint = false;
        if (isPrint) {
            System.out.println(circuit);
            System.out.println(";");
            System.out.println(lexer);
            System.out.println(";");
            System.out.println(parser);
        }

    }

    private static String lexerToString(NgsLexer lexer) {
        Token t = lexer.nextToken();
        List<String> result = Lists.newArrayList();
        while (t.getType() != Token.EOF) {
            String type = NgsLexer.getRuleName(t.getType());

            String text = String.format("%s(%s)", type, t.getText());
            result.add(text);
            t = lexer.nextToken();
        }
        lexer.reset();

        return Joiner.on(", ").join(result);
    }

    private static String parserToString(NgsParser parser) {
        ParseTree pt = parser.circuit();
        String text = pt.toStringTree(parser);
        return text;
    }
}
