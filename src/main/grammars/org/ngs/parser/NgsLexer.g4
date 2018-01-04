lexer grammar NgsLexer;
@lexer::header {
import org.apache.commons.lang.ArrayUtils;
import org.ngs.add.LexerHelper;
import org.antlr.jetbrains.adaptor.lexer.CharSequenceCharStream;
import java.util.*;
}

@lexer::members {
private boolean isFirstLineComment;
public NgsLexer(CharStream input, boolean isFirstLineComment) {
    this(input);
    this.isFirstLineComment = isFirstLineComment;
    defaultMode();
}

private void defaultMode() {
// todo: use the param?
    if (isFirstLineComment) {
        mode(M_FIRSTLINE);
    } else {
        mode(M_DEFAULT);
    }
}

public static String getRuleName(int i) {
    if (i >= _SYMBOLIC_NAMES.length) {return "UNKNOWN";}

    return _SYMBOLIC_NAMES[i];
}

// this is the members
//{ mode(M_DEFAULT);}
{ defaultMode(); }
@Override
public void reset() {
    super.reset();
//    mode(M_DEFAULT);
    defaultMode();
    inputAsString = null;
}

private String inputAsString = null;

private String getInputAsString() {
    if (inputAsString == null) {
        if (_input instanceof CharSequenceCharStream) {
            inputAsString = ((CharSequenceCharStream) _input).getBuffer().toString();
        } else {
            inputAsString = _input.toString();
        }
    }


    return inputAsString;
}

private LexerHelper lexerHelper = new LexerHelper();


private int nodeMax = 0;
private int nodeCurrent = 0;
private int nodeModeAfter = -1; // node after all modes are read
private int nodeType = -1;

private void startMNode(int nodes, int nextMode) {
    mode(M_NODE);
    nodeCurrent = 0;
    nodeMax = nodes;
    nodeModeAfter = nextMode;
    nodeType = NODE;
}

// todo: rename
private void startMNodeTyped(int nodes, int nextMode, int type) {
    startMNode(nodes, nextMode);
    nodeType = type;
}


private void node() {
    nodeCurrent++;

    if (nodeCurrent == nodeMax) {
        mode(nodeModeAfter);
        initMode(nodeModeAfter);
    }

    setType(nodeType);
}

private void initMode(int mode) {
    if (mode == M_KV) {
        kvIsKeyProcessed = false;
    } else if (mode == M_SUBCKT_HEAD) {
        // todo: remove it
        subcktIsName = true;
    }

}

private void newline() {
    setType(NEWLINE);
    mode(M_DEFAULT);
}

private void whitespace() {
    setChannel(HIDDEN);
    setType(WS);
}


private boolean kvIsKeyProcessed;

private void kvVal(int valType) {
    if (kvIsKeyProcessed) {
        setType(valType);
        kvIsKeyProcessed = false;
        return;
    }

    if (valType == EXPR) {
        // EXPR can only be the value, not the key
        setType(EXPR);
        return;
    }

    if (lexerHelper.isEqualSignFollowToken(getInputAsString(), _tokenStartCharIndex)) {
        setType(KV_KEY);
        kvIsKeyProcessed = true;
    } else {
        setType(VAL);
    }
}

// R and C: the first val may be value (1k) or the model name (RMOD)
private void kvRVal() {
    kvVal(VAL);

    if (getType() != VAL) {return;}

    if (!isValueNotModel(getText())) {
    // todo: rename type
        setType(MODEL_NAME);
    }
}

private void kvModelVal() {
    setType(MODEL_NAME);
}

private boolean isValueNotModel(String str) {
    if (str.isEmpty()) {return true;}
    char c = str.charAt(0);
    // todo: regex for a value
    boolean isNumber = (c >= '0' && c <= '9') || c == '.' || c == '+' || c == '-';
    return isNumber;
}

private void srcKvVal(int valType) {
    if (!kvIsKeyProcessed && valType == VAL) {
        if (processSourceType()) {
            return;
        }
    }
    kvVal(valType);
}

private boolean processSourceType() {
    if (getToken() == null) {return false;}

    String text = getToken().getText();

    if (text.equalsIgnoreCase("PULSE")) {
        setType(PULSE);
        return true;
    } else if (text.equalsIgnoreCase("SIN")) {
        setType(SIN);
        return true;
    } else if (text.equalsIgnoreCase("EXP")) {
        setType(EXP);
        return true;
    } else if (text.equalsIgnoreCase("PWL")) {
        setType(PWL);
        return true;
    } else if (text.equalsIgnoreCase("SFFM")) {
        setType(SFFM);
        return true;
    } else if (text.equalsIgnoreCase("AM")) {
        setType(AM);
        return true;
    } else if (text.equalsIgnoreCase("TRNOISE")) {
        setType(TRNOISE);
        return true;
    } else if (text.equalsIgnoreCase("TRRANDOM")) {
        setType(TRRANDOM);
        return true;
    } else if (text.equalsIgnoreCase("EXTERNAL")) {
        setType(EXTERNAL);
        return true;
    }

    return false;
}


private boolean subcktIsName = true;

private void startMSubckt() {
    subcktIsName = true;
    mode(M_SUBCKT_HEAD);
}

private void subcktVal() {
    if (subcktIsName) {
        setType(SUBCKT_NAME);
        subcktIsName = false;
        return;
    }

    if (lexerHelper.isEqualSignFollowsNeighbour(getInputAsString(), _tokenStartCharIndex)) {
        mode(M_KV);
    }

    setType(NODE);
}

private boolean isXNoParam = true;

private boolean isXNameDone = false;

private void xVal() {
    if (lexerHelper.isEqualSignFollowsNeighbour(getInputAsString(), _tokenStartCharIndex)) {
        setType(SUBCKT_NAME);
        // todo: set kv=val? init mode?
        mode(M_KV);
        kvIsKeyProcessed = false;
        return;
    }

    if (lexerHelper.isEndOfLineNext(getInputAsString(), _tokenStartCharIndex)) {
        setType(SUBCKT_NAME);
        return;
    }

    // todo: params

    setType(NODE);
}

private void bc() {
    setType(BC);
}



private boolean srcDepIsPoly;
private boolean srcDepIsPolyNumberExpected;
private int srcDepNodeMax;
private int srcDepNodeCurrent;

private int srcDepInternalMode;

private boolean srcDepIsNodeNotV;

private void startMDepSource(boolean isNodeNotV) {
    startMNode(2, M_SRC_DEP);


    srcDepIsNodeNotV = isNodeNotV;


    srcDepIsPoly = false;
    srcDepIsPolyNumberExpected = false;
    srcDepNodeMax = 1; // Default - 2 nodes, not a poly
    srcDepNodeCurrent = 0;

    srcDepInternalMode = 0;
}



private void srcDepVal() {
    String text = getText();
    int valueType = srcDepIsNodeNotV ? NODE : H_V;

    switch (srcDepInternalMode) {
        case 0:
            // POLY or not a POLY at the first position

            if (text.equalsIgnoreCase("POLY")) {

                srcDepInternalMode = 1;

                srcDepIsPoly = true;
                setType(POLY);

                return;
            } else {
                srcDepInternalMode = 2;
                setType(valueType);
            }
            break;
        case 1:
            // if a POLY, get the number of nodes
            int num = -1;

            try {
                num = Integer.parseInt(text);
            } catch (NumberFormatException e) {num = -1;}

            if (num > 0) {
                // Valid number, POLY can be parsed
                srcDepNodeMax = num;
            } else {
                // Some error, can't parse this source as POLY.
                srcDepIsPoly = false;
            }

            srcDepInternalMode = 2;

            setType(VAL);

            break;
        case 2:
            srcDepNodeCurrent++;

            int maxValueCount = srcDepNodeMax;
            // srcDepIsNodeNotV ? 2*srcDepNodeMax : srcDepNodeMax;
            if (srcDepIsNodeNotV) {maxValueCount *= 2;}

            if (srcDepNodeCurrent >= maxValueCount) {
                setType(VAL);
            } else {
                setType(valueType);
            }
            break;

        default:
            setType(VAL);
            break;
    }
/*
    if (text.equalsIgnoreCase("POLY")) {
        srcDepIsPoly = true;
        srcDepIsPolyNumberExpected = true;
        setType(POLY);

        return;
    }

    if (srcDepIsPolyNumberExpected) {
        int num = -1;

		try {
			num = Integer.parseInt(text);
		} catch (NumberFormatException e) {num = -1;}

		if (num > 0) {
		    // Valid number, POLY can be parsed
		    srcDepNodeMax = num;
		} else {
		    // Some error, can't parse this source as POLY.
		    srcDepIsPoly = false;
		}
		// Do not enter this if at this line second time.
		srcDepIsPolyNumberExpected = false;


		setType(VAL);

        return;

    }


    srcDepNodeCurrent++;

    if (srcDepNodeCurrent >= 2*srcDepNodeMax) {
        setType(VAL);
    } else {
        setType(NODE);
    }
*/
}

private Deque<Integer> xSpiceANodeType = new ArrayDeque<Integer>();
private Integer xaCurrentType = null;
private int xaCurrentTypeCount = 0;
private boolean xaTypeIsDiff = false;


private void startMXspiceA() {
    xSpiceANodeType.clear();
    xaCurrentType = null;
    xaTypeIsDiff = true;
    mode(M_XSPICE_A);
}

private int getXANodeType() {
    if (xSpiceANodeType.isEmpty()) {return NODE;}

    return xSpiceANodeType.getLast();
}

private void stopXANodeArray() {
    if (xSpiceANodeType.isEmpty()) {return;}

    xSpiceANodeType.removeLast();
}

private void xSpiceAVal() {
    if (lexerHelper.isEndOfLineNext(getInputAsString(), _tokenStartCharIndex)) {
        setType(MODEL_NAME); // model
        // todo: clear a-state?
        return;
    }

    if (xSpiceAProcessNodeType()) {return;}

    if (xaCurrentType != null) {
        setType(xaCurrentType);

        xaCurrentTypeCount++;
        if (!xaTypeIsDiff || xaCurrentTypeCount >= 2) {
            xaCurrentType = null;
            // todo: is it required?
            xaTypeIsDiff = false;
            xaCurrentTypeCount = 0;
        }
    } else {
        setType(NODE);
    }
}

private void xSpiceBracketClosed() {
    stopXANodeArray();

    setType(BR_R);
}


private List<String> xaTypes = Arrays.asList("%v","%i","%g","%h","%d","%vnam","%vd","%id","%gd","%hd");
private List<String> xaDiffTypes = Arrays.asList("%vd","%id","%gd","%hd");

private boolean xSpiceAProcessNodeType() {
    String text = getText();
    // todo: validate all texts?
    if (!text.startsWith("%")) {
        return false;
    }

    setType(XA_NODE_TYPE);

    int nodeType = getXaNodeType(text);


    if (lexerHelper.isLBracketFollowsToken(getInputAsString(), _tokenStartCharIndex)) {
        //xSpiceANodeType()
        xSpiceANodeType.addLast(nodeType);
    } else {
        // not an array
        if (xaDiffTypes.contains(text.toLowerCase())) {
            xaTypeIsDiff = true;
        } else {
            xaTypeIsDiff = false;
        }

        xaCurrentTypeCount = 0;
        xaCurrentType = nodeType;
    }







    return true;
}

private int getXaNodeType(String text) {

    if (text.equalsIgnoreCase("%vnam")) {
        return H_V;
    } else {
        return NODE;
    }
}


private int qTransistorNodeCount = 0;
private void startMQTransistor() {
    qTransistorNodeCount = 0;
    mode(M_Q_TRANSISTOR);
}

private void qTransistorVal() {
    qTransistorNodeCount++;
    if (qTransistorNodeCount < 4) {
        setType(NODE);
        return;
    } else if (qTransistorNodeCount == 4) {
        if (!lexerHelper.isNewlineAfterMeOrKeyNeighbour(getInputAsString(), _tokenStartCharIndex)) {
            setType(NODE);
            return;
        }
    }

    setType(MODEL_NAME);
    mode(M_KV);
}

private boolean plotIsAnalyzeType;
private boolean plotIsNodeType;
private boolean plotIsVNotI;
private int plotParCount;

private void startMPlot() {
    plotIsAnalyzeType = true;
    plotIsNodeType = true;
    plotParCount = 0;
    mode(M_PLOT);
}

private void plotVal() {
    if (plotIsAnalyzeType) {
        setType(PLOT_TYPE);
        plotIsAnalyzeType = false;
        return;
    }

    if (plotIsNodeType) {
        String text = getText();

        plotIsVNotI = !(text.startsWith("i") || text.startsWith("I"));

        plotIsNodeType = false;


        setType(PLOT_POINT_TYPE);

        // setType(VAL);
        return;
    }

    int type = plotIsVNotI ? NODE : H_V;

    setType(type);
}

private void plotParL() {
    setType(PAR_L);

    plotParCount++;

    // todo: is it right for .plot? is it right for .print?
    if (plotIsNodeType && plotParCount == 1) {
        plotIsVNotI = true;

        plotIsNodeType = false;

        return;
    }
}

private void plotParR() {
    setType(PAR_R);

    plotParCount--;

    if (plotParCount == 0) {
        plotIsNodeType = true;
    }
}

private void comment() {
    setChannel(HIDDEN);
    setType(COMMENT);
}

private void valInDefaultMode() {
    String text = getText();

    if (text == null) {
        setType(BC);
        return;
    }

    if (text.equalsIgnoreCase(".include")) {
        setType(INCLUDE);
        mode(M_INCLUDE_SPACE);
        return;
    }

    if (text.equalsIgnoreCase(".option")) {
        setType(OPTION);
        mode(M_KV);
        return;
    }

    setType(BC);
}

private char[] spacesArray = new char[]{'\r', '\n', ' ', '\t'};

private boolean isSpaceAfterToken() {
    int nextPos = _tokenStartCharIndex+getText().length();
    String s = getInputAsString();
    if (nextPos >= s.length()) {
        return true;
    }
    char c = s.charAt(nextPos);
    return ArrayUtils.contains(spacesArray, c);
}

}


NODE: [a-z]+;



VAL: [0-9]+;
KV_KEY: [0-9]+;
COMMA: ',';

HEAD_R: [rR] [0-9]+;
WS: [ \t] -> channel(HIDDEN);
NEWLINE: F_NL;
EQ : '=';
EXPR : F_EXPR;

SUBCKT_NAME : [0-9]+;

PAR_L : '(';
PAR_R : ')';

BR_L : '[';
BR_R : ']';


// todo: rename
// todo: string includes quotes, don't use it
MODEL_NAME: F_VAL+;

PULSE: 'PULSE';
SIN: 'SIN';
EXP: 'EXP';
PWL: 'PWL';
SFFM: 'SFFM';
AM: 'AM';
TRNOISE: 'TRNOISE';
TRRANDOM: 'TRRANDOM';
EXTERNAL: 'EXTERNAL';

POLY : 'POLY';



COMMENT: 'COMMENT';


XA_NODE_TYPE : '%v';

INCLUDE: '.INCLUDE';
FILENAME: 'FILENAME';

OPTION: '.OPTION';

PLOT_TYPE: 'TRAN';
PLOT_POINT_TYPE : 'V';


BC: .;

mode M_FIRSTLINE;
COMMENT_FIRSTLINEZ999: ~[\r\n]+ {comment();};
NL_Z999 : F_NL {newline();mode(M_DEFAULT);};
BC_Z999: . {bc();};

mode M_DEFAULT;
// https://stackoverflow.com/questions/16382589/antlr4-lexer-matching-start-of-line-end-of-line
COMMENT_LS_Z01: {getCharPositionInLine() == 0}? '*' ~[\r\n]* {comment();}; // todo: \r
COMMENT_EOL_Z01: '$' ~[\r\n]* {comment();}; // todo: \r



H_MODEL: F_H_MODEL {mode(M_MODEL_KV);};

H_R: [rR] F_VAL+ {startMNode(2, M_R_KV);};
H_C: [cC] F_VAL+ {startMNode(2, M_R_KV);};
H_K: [kK] F_VAL+ {startMNodeTyped(2, M_KV, H_L);};
H_L: [lL] F_VAL+ {startMNode(2, M_R_KV);};

H_S: [sS] F_VAL+ {startMNode(4, M_MODEL_KV);} ;
H_W: [wW] F_VAL+ {startMNode(2, M_W_SRC);} ;

H_V: [vV] F_VAL+ {startMNode(2, M_SRC_KV);};
H_I: [iI] F_VAL+ {startMNode(2, M_SRC_KV);};


H_E: [eE] F_VAL+ {startMDepSource(true); };
H_G: [gG] F_VAL+ {startMDepSource(true); };

H_F: [fF] F_VAL+ {startMDepSource(false); };
H_H: [hH] F_VAL+ {startMDepSource(false); };

H_A: [aA] F_VAL+ {startMXspiceA(); };

H_T: [tT] F_VAL+ {startMNode(4, M_KV);};
H_O: [oO] F_VAL+ {startMNode(4, M_MODEL_KV);};
H_U: [uU] F_VAL+ {startMNode(3, M_MODEL_KV);};
H_Y: [yY] F_VAL+ {startMNode(4, M_MODEL_KV);};
// todo: H_P


H_D: [dD] F_VAL+ {startMNode(2, M_MODEL_KV);};

H_Q: [qQ] F_VAL+ {startMQTransistor();};
H_J: [jJ] F_VAL+ {startMNode(3, M_MODEL_KV);};
H_Z: [zZ] F_VAL+ {startMNode(3, M_MODEL_KV);};


H_M: [mM] F_VAL+ {startMNode(4, M_MODEL_KV);};

H_SUBCKT: F_SUBCKT {startMSubckt();}; // todo: head
H_SUBCKT_TAIL: F_SUBCKT_TAIL {mode(M_SUBCKT_TAIL);};
H_X: [xX] F_VAL+ {mode(M_X);};



// todo: into valInDefaultMode
TRAN: F_TRAN {mode(M_KV);};
PRINT: F_PRINT {startMPlot();};

// VAL01: {isSpaceAfterToken()}? F_VAL+  {valInDefaultMode();};
VAL01: F_VAL+  {valInDefaultMode();};



WS_Z01 : F_WS {whitespace();};
NL_Z01 : F_NL {newline();};
BC_Z01: . {bc();};

mode M_NODE;
VL: F_VAL+ {node();};
WS_Z00 : F_WS {whitespace();};
NL_Z00 : F_NL {newline();};
COMMENT_EOL_Z00: '$' ~[\r\n]* {comment();};

BC_Z00: . {bc();};
mode M_KV;
VAL_Z10 : F_VAL+ {kvVal(VAL);};
EXPR_Z10: F_EXPR {kvVal(EXPR);};
COMMA_Z10: ',' {setType(COMMA);};
EQ_Z10 : '=' {setType(EQ);};
PAR_L10: '(' {setType(PAR_L);};
PAR_R10: ')' {setType(PAR_R);};
WS_Z10 : F_WS {whitespace();};
NL_Z10 : F_NL {newline();};
COMMENT_EOL_Z10: '$' ~[\r\n]* {comment();};
BC_Z10: . {bc();};

mode M_SRC_KV;
VAL_Z11 : F_VAL+ {srcKvVal(VAL);};
EXPR_Z11: F_EXPR {srcKvVal(EXPR);};
COMMA_Z11: ',' {setType(COMMA);};
EQ_Z11 : '=' {setType(EQ);};
PAR_L11: '(' {setType(PAR_L);};
PAR_R11: ')' {setType(PAR_R);};
WS_Z11 : F_WS {whitespace();};
NL_Z11 : F_NL {newline();};
COMMENT_EOL_Z11: '$' ~[\r\n]* {comment();};
BC_Z11: . {bc();};

// todo: one mode with arg?
mode M_R_KV;
VAL_Z12 : F_VAL+ {kvRVal(); mode(M_KV); };
EXPR_Z12: F_EXPR {kvVal(EXPR); mode(M_KV); };
COMMA_Z12: ',' {setType(COMMA); mode(M_KV); };
EQ_Z12 : '=' {setType(EQ); mode(M_KV); };
PAR_L12: '(' {setType(PAR_L); mode(M_KV); };
PAR_R12: ')' {setType(PAR_R); mode(M_KV); };
WS_Z12 : F_WS {whitespace();};
NL_Z12 : F_NL {newline();};
COMMENT_EOL_Z12: '$' ~[\r\n]* {comment(); mode(M_KV);};
BC_Z12: . {bc();  mode(M_KV); };

mode M_MODEL_KV;
VAL_Z13 : F_VAL+ {kvModelVal(); mode(M_KV); };
EXPR_Z13: F_EXPR {kvVal(EXPR); mode(M_KV); };
COMMA_Z13: ',' {setType(COMMA); mode(M_KV); };
EQ_Z13 : '=' {setType(EQ); mode(M_KV); };
PAR_L13: '(' {setType(PAR_L); mode(M_KV); };
PAR_R13: ')' {setType(PAR_R); mode(M_KV); };
WS_Z13 : F_WS {whitespace(); };
NL_Z13 : F_NL {newline();};
COMMENT_EOL_Z13: '$' ~[\r\n]* {comment(); mode(M_KV);};
BC_Z13: . {bc();  mode(M_KV); };




mode M_SUBCKT_HEAD;
VAL_Z20 : F_VAL+ {subcktVal();};
EQ_Z20 : '=' {setType(EQ);};
WS_Z20 : F_WS {whitespace();};
NL_Z20 : F_NL {newline();};
COMMENT_EOL_Z20: '$' ~[\r\n]* {comment();};
BC_Z20: . {bc();};

mode M_SUBCKT_TAIL;
VAL_Z30 : F_VAL+ {setType(SUBCKT_NAME);}; // todo: bad character/ERR after first occurance
WS_Z30 : F_WS {whitespace();};
NL_Z30 : F_NL {newline();};
COMMENT_EOL_Z30: '$' ~[\r\n]* {comment();};
BC_Z30: . {bc();};

mode M_X;
VAL_Z40 : F_VAL+ {xVal();}; // todo: bad character/ERR after first occurance
EQ_Z40 : '=' {setType(EQ);};
WS_Z40 : F_WS {whitespace();};
NL_Z40 : F_NL {newline();};
COMMENT_EOL_Z40: '$' ~[\r\n]* {comment();};
BC_Z40: . {bc();};


mode M_SRC_DEP;
PAR_L50: '(' {whitespace();};
PAR_R50: ')' {whitespace();};
VAL_Z50 : F_VAL+ {srcDepVal();}; // todo: bad character/ERR after first occurance

WS_Z50 : F_WS {whitespace();};
NL_Z50 : F_NL {newline();};
COMMENT_EOL_Z50: '$' ~[\r\n]* {comment();};
BC_Z50: . {bc();};

mode M_XSPICE_A;
VAL_Z60 : (F_VAL | '%')+ {xSpiceAVal();}; // todo: bad character/ERR after first occurance
PAR_L60: '(' {setType(PAR_L);};
PAR_R60: ')' {setType(PAR_R);};
BR_L60 : '[' {setType(BR_L);};
BR_R60 : ']' {xSpiceBracketClosed();};
WS_Z60 : F_WS {whitespace();};
NL_Z60 : F_NL {newline();};
COMMENT_EOL_Z60: '$' ~[\r\n]* {comment();};
BC_Z60: . {bc();};


mode M_W_SRC;
VAL_Z70 : F_VAL+ {setType(H_V);mode(M_MODEL_KV);}; // todo: bad character/ERR after first occurance
WS_Z70 : F_WS {whitespace();};
NL_Z70 : F_NL {newline();};
COMMENT_EOL_Z70: '$' ~[\r\n]* {comment();};
BC_Z70: . {bc();};

mode M_Q_TRANSISTOR;
VAL_Z80 : F_VAL+ {qTransistorVal();};
WS_Z80 : F_WS {whitespace();};
NL_Z80 : F_NL {newline();};
COMMENT_EOL_Z80: '$' ~[\r\n]* {comment();};
BC_Z80: . {bc();};

mode M_PLOT;
VAL_Z90 : F_VAL+ {plotVal();};
PAR_L90: '(' {plotParL();};
PAR_R90: ')' {plotParR();};
COMMA_Z90: ',' {setType(COMMA);};
WS_Z90 : F_WS {whitespace();};
NL_Z90 : F_NL {newline();};
COMMENT_EOL_Z90: '$' ~[\r\n]* {comment();};
BC_Z90: . {bc();};

mode M_INCLUDE_SPACE;
//WS_Z100 : F_WS+ {whitespace();mode(M_INCLUDE_PATH);};
WS_Z100 : F_WS+ {whitespace();};
NL_Z100 : F_NL {newline();};
FILENAME_Z100: {!ArrayUtils.contains(spacesArray, getInputAsString().charAt(_tokenStartCharIndex))}? ~[\r\n]+ {setType(FILENAME);};
BC_Z100: . {bc();};
//mode M_INCLUDE_PATH;
//NL_Z110 : F_NL {newline();};
//FILENAME_Z110 : ~[\r\n]+ {setType(FILENAME);};
//BC_Z110: . {bc();};


fragment F_VAL: [a-zA-Z0-9_.+\-];
fragment F_NL: '\r' ? '\n';
fragment F_WS:  ' ' | '\t' | (F_NL '+'); // todo: '+' escape
fragment F_EXPR: '\'' (~['])* '\'';
fragment F_SUBCKT: '.'[sS][uU][bB][cC][kK][tT];
// todo: rename F_ENDS
fragment F_SUBCKT_TAIL: '.'[eE][nN][dD][sS];  // todo: not-capturing space/\t, otherwise autocomplete starts instantly
fragment F_H_MODEL: '.'[mM][oO][dD][eE][lL];
fragment F_TRAN: '.'[tT][rR][aA][nN];
fragment F_PRINT: '.'[pP][rR][iI][nN][tT];