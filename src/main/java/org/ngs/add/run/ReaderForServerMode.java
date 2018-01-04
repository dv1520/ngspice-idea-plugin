package org.ngs.add.run;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * server mode = "ngspice -s", parser for that output.
 *
 * Created by z on 31.08.17.
 */
public class ReaderForServerMode {
    private Pattern referencePattern = Pattern.compile("\\s*Reference value\\s*:\\s*[\\w.\\-+]+\\r?");
    private Matcher referenceMatcher = referencePattern.matcher("");

    private StringBuilder partialInput = new StringBuilder();




    private boolean isFinished = false;

    private boolean isFirstStep = true;

    private volatile Consumer<List<String>> headFunc;
    private volatile Consumer<List<String>> rowFunc;


    private List<List<String>> rows = Lists.newArrayList();

    private List<String> nodeNames = Lists.newArrayList();
    private List<String> row = Lists.newArrayList();

    private Pattern patternVal = Pattern.compile("([^\\s\\r\\n]+)");
    private Matcher matcherVal = patternVal.matcher("");

    private Pattern patternNewline = Pattern.compile("\\r?\\n");
    private Matcher matcherNewline = patternNewline.matcher("");


    public void setHeadFunc(Consumer<List<String>> headFunc) {
        this.headFunc = headFunc;
    }

    public void setRowFunc(Consumer<List<String>> rowFunc) {
        this.rowFunc = rowFunc;
    }

    private static final int M_START = 0;
    private static final int M_INIT_TRAN = 1;
    private static final int M_INIT_TRAN_VAL = 2;
    private static final int M_NODE_NAMES = 3;
    private static final int M_VALUES = 4;


    private int mode = M_START;


    public void processLine(String text) {
        if (text.endsWith("\n")) {
            if (partialInput.length() > 0) {
                text = partialInput.toString() + text;
            }

            partialInput.setLength(0);
        } else {
            partialInput.append(text);
            return;
        }

        /*
        For something like that ('Reference value:...' is from stderr, we need to remove it):
20292           2.028196000000191e-03
        5.000000000000000e+00
        2.499999999999999e+00
 Reference value :  2.09500e-03^M       -1.250000000000000e-03
20293           2.028296000000191e-03


         */
        // In the app stderr is filtered out, but for debug it's good to copy
        // all output and parse it at once.
        referenceMatcher.reset(text);

        if (referenceMatcher.find()) {
            StringBuilder sb = new StringBuilder();
            sb.append(text.substring(0, referenceMatcher.start()));
            sb.append(text.substring(referenceMatcher.end()));
            text = sb.toString();
        }

        if (text.startsWith("@@@")) {
            return;
        }



        switch (mode) {
            case M_START:
                if (text.startsWith("Initial Transient Solution")) {
                    mode = M_INIT_TRAN;
                }
                break;
            case M_INIT_TRAN:
                if (text.trim().isEmpty()) {
                    mode = M_INIT_TRAN_VAL;
                }
                break;
            case M_INIT_TRAN_VAL:
                // Skip  initial transient solution
                if (text.trim().isEmpty()) {
                    mode = M_NODE_NAMES;
                    nodeNames.add("N");
                }
                break;
            case M_NODE_NAMES:
                if (text.startsWith("Values:")) {
                    mode = M_VALUES;
                    addHeader();
                    break;
                }

                matcherVal.reset(text);
                if (matcherVal.find()) {
                    // sequence number, skip
                    if (matcherVal.find()) {
                        // node name
                        nodeNames.add(matcherVal.group(1));
                    }
                }
                break;
            case M_VALUES:
                matcherNewline.reset(text);
                if (matcherNewline.matches()) {
                    finishFile();
                    break;
                }

                matcherVal.reset(text);
                if (matcherVal.find()) {
                    String v1 = matcherVal.group(1);
                    String v2 = null;
                    if (matcherVal.find()) {
                        v2 = matcherVal.group(1);
                    }

                    if (v2 != null) {
                        // new time step
                        if (isFirstStep) {
                            isFirstStep = false;
                        } else {
                            finishRow();
                        }
                    }

                    addToRowNumberAsString(v1);

                    if (v2 != null) {
                        addToRowNumberAsString(v2);
                    }
                }
        }
    }

    private void addToRowNumberAsString(String s) {
        try {
            double d = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            s = "-99.999";
        }
        row.add(s);
    }

    private void addRow() {
        rows.add(row);

        if (rowFunc != null) {
            rowFunc.accept(row);
        }
    }

    private void addHeader() {
        if (headFunc != null) {
            headFunc.accept(nodeNames);
        }
    }

    // never called?
    private void finishFile() {
        if (isFinished) {return;}

        isFinished = true;

        finishRow();
        System.out.println(rows);

        mode = 999;
    }


    private void finishRow() {
        addRow();
        row = Lists.newArrayList();
    }
}
