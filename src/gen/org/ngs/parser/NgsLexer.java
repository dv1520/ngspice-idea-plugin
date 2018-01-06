// Generated from /home/src/ngspice-idea-plugin/src/main/grammars/org/ngs/parser/NgsLexer.g4 by ANTLR 4.7
package org.ngs.parser;

import org.apache.commons.lang.ArrayUtils;
import org.ngs.add.LexerHelper;
import org.antlr.jetbrains.adaptor.lexer.CharSequenceCharStream;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NgsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NODE=1, VAL=2, KV_KEY=3, COMMA=4, HEAD_R=5, WS=6, NEWLINE=7, EQ=8, EXPR=9, 
		SUBCKT_NAME=10, PAR_L=11, PAR_R=12, BR_L=13, BR_R=14, MODEL_NAME=15, PULSE=16, 
		SIN=17, EXP=18, PWL=19, SFFM=20, AM=21, TRNOISE=22, TRRANDOM=23, EXTERNAL=24, 
		POLY=25, COMMENT=26, XA_NODE_TYPE=27, INCLUDE=28, FILENAME=29, OPTIONS=30, 
		PLOT_TYPE=31, PLOT_POINT_TYPE=32, BC=33, COMMENT_FIRSTLINEZ999=34, NL_Z999=35, 
		BC_Z999=36, COMMENT_LS_Z01=37, COMMENT_EOL_Z01=38, H_MODEL=39, H_R=40, 
		H_C=41, H_K=42, H_L=43, H_S=44, H_W=45, H_V=46, H_I=47, H_E=48, H_G=49, 
		H_F=50, H_H=51, H_A=52, H_T=53, H_O=54, H_U=55, H_Y=56, H_D=57, H_Q=58, 
		H_J=59, H_Z=60, H_M=61, H_SUBCKT=62, H_SUBCKT_TAIL=63, H_X=64, TRAN=65, 
		PRINT=66, VAL01=67, WS_Z01=68, NL_Z01=69, BC_Z01=70, VL=71, WS_Z00=72, 
		NL_Z00=73, COMMENT_EOL_Z00=74, BC_Z00=75, BC_Z05=76, NL_Z05=77, VAL_Z10=78, 
		EXPR_Z10=79, COMMA_Z10=80, EQ_Z10=81, PAR_L10=82, PAR_R10=83, WS_Z10=84, 
		NL_Z10=85, COMMENT_EOL_Z10=86, BC_Z10=87, VAL_Z11=88, EXPR_Z11=89, COMMA_Z11=90, 
		EQ_Z11=91, PAR_L11=92, PAR_R11=93, WS_Z11=94, NL_Z11=95, COMMENT_EOL_Z11=96, 
		BC_Z11=97, VAL_Z12=98, EXPR_Z12=99, COMMA_Z12=100, EQ_Z12=101, PAR_L12=102, 
		PAR_R12=103, WS_Z12=104, NL_Z12=105, COMMENT_EOL_Z12=106, BC_Z12=107, 
		VAL_Z13=108, EXPR_Z13=109, COMMA_Z13=110, EQ_Z13=111, PAR_L13=112, PAR_R13=113, 
		WS_Z13=114, NL_Z13=115, COMMENT_EOL_Z13=116, BC_Z13=117, VAL_Z20=118, 
		EQ_Z20=119, WS_Z20=120, NL_Z20=121, COMMENT_EOL_Z20=122, BC_Z20=123, VAL_Z30=124, 
		WS_Z30=125, NL_Z30=126, COMMENT_EOL_Z30=127, BC_Z30=128, VAL_Z40=129, 
		EQ_Z40=130, WS_Z40=131, NL_Z40=132, COMMENT_EOL_Z40=133, BC_Z40=134, PAR_L50=135, 
		PAR_R50=136, VAL_Z50=137, WS_Z50=138, NL_Z50=139, COMMENT_EOL_Z50=140, 
		BC_Z50=141, VAL_Z60=142, PAR_L60=143, PAR_R60=144, BR_L60=145, BR_R60=146, 
		WS_Z60=147, NL_Z60=148, COMMENT_EOL_Z60=149, BC_Z60=150, VAL_Z70=151, 
		WS_Z70=152, NL_Z70=153, COMMENT_EOL_Z70=154, BC_Z70=155, VAL_Z80=156, 
		WS_Z80=157, NL_Z80=158, COMMENT_EOL_Z80=159, BC_Z80=160, VAL_Z90=161, 
		PAR_L90=162, PAR_R90=163, COMMA_Z90=164, WS_Z90=165, NL_Z90=166, COMMENT_EOL_Z90=167, 
		BC_Z90=168, WS_Z100=169, NL_Z100=170, FILENAME_Z100=171, BC_Z100=172;
	public static final int
		M_FIRSTLINE=1, M_DEFAULT=2, M_NODE=3, M_BC=4, M_KV=5, M_SRC_KV=6, M_R_KV=7, 
		M_MODEL_KV=8, M_SUBCKT_HEAD=9, M_SUBCKT_TAIL=10, M_X=11, M_SRC_DEP=12, 
		M_XSPICE_A=13, M_W_SRC=14, M_Q_TRANSISTOR=15, M_PLOT=16, M_INCLUDE_SPACE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "M_FIRSTLINE", "M_DEFAULT", "M_NODE", "M_BC", "M_KV", 
		"M_SRC_KV", "M_R_KV", "M_MODEL_KV", "M_SUBCKT_HEAD", "M_SUBCKT_TAIL", 
		"M_X", "M_SRC_DEP", "M_XSPICE_A", "M_W_SRC", "M_Q_TRANSISTOR", "M_PLOT", 
		"M_INCLUDE_SPACE"
	};

	public static final String[] ruleNames = {
		"NODE", "VAL", "KV_KEY", "COMMA", "HEAD_R", "WS", "NEWLINE", "EQ", "EXPR", 
		"SUBCKT_NAME", "PAR_L", "PAR_R", "BR_L", "BR_R", "MODEL_NAME", "PULSE", 
		"SIN", "EXP", "PWL", "SFFM", "AM", "TRNOISE", "TRRANDOM", "EXTERNAL", 
		"POLY", "COMMENT", "XA_NODE_TYPE", "INCLUDE", "FILENAME", "OPTIONS", "PLOT_TYPE", 
		"PLOT_POINT_TYPE", "BC", "COMMENT_FIRSTLINEZ999", "NL_Z999", "BC_Z999", 
		"COMMENT_LS_Z01", "COMMENT_EOL_Z01", "H_MODEL", "H_R", "H_C", "H_K", "H_L", 
		"H_S", "H_W", "H_V", "H_I", "H_E", "H_G", "H_F", "H_H", "H_A", "H_T", 
		"H_O", "H_U", "H_Y", "H_D", "H_Q", "H_J", "H_Z", "H_M", "H_SUBCKT", "H_SUBCKT_TAIL", 
		"H_X", "TRAN", "PRINT", "VAL01", "WS_Z01", "NL_Z01", "BC_Z01", "VL", "WS_Z00", 
		"NL_Z00", "COMMENT_EOL_Z00", "BC_Z00", "BC_Z05", "NL_Z05", "VAL_Z10", 
		"EXPR_Z10", "COMMA_Z10", "EQ_Z10", "PAR_L10", "PAR_R10", "WS_Z10", "NL_Z10", 
		"COMMENT_EOL_Z10", "BC_Z10", "VAL_Z11", "EXPR_Z11", "COMMA_Z11", "EQ_Z11", 
		"PAR_L11", "PAR_R11", "WS_Z11", "NL_Z11", "COMMENT_EOL_Z11", "BC_Z11", 
		"VAL_Z12", "EXPR_Z12", "COMMA_Z12", "EQ_Z12", "PAR_L12", "PAR_R12", "WS_Z12", 
		"NL_Z12", "COMMENT_EOL_Z12", "BC_Z12", "VAL_Z13", "EXPR_Z13", "COMMA_Z13", 
		"EQ_Z13", "PAR_L13", "PAR_R13", "WS_Z13", "NL_Z13", "COMMENT_EOL_Z13", 
		"BC_Z13", "VAL_Z20", "EQ_Z20", "WS_Z20", "NL_Z20", "COMMENT_EOL_Z20", 
		"BC_Z20", "VAL_Z30", "WS_Z30", "NL_Z30", "COMMENT_EOL_Z30", "BC_Z30", 
		"VAL_Z40", "EQ_Z40", "WS_Z40", "NL_Z40", "COMMENT_EOL_Z40", "BC_Z40", 
		"PAR_L50", "PAR_R50", "VAL_Z50", "WS_Z50", "NL_Z50", "COMMENT_EOL_Z50", 
		"BC_Z50", "VAL_Z60", "PAR_L60", "PAR_R60", "BR_L60", "BR_R60", "WS_Z60", 
		"NL_Z60", "COMMENT_EOL_Z60", "BC_Z60", "VAL_Z70", "WS_Z70", "NL_Z70", 
		"COMMENT_EOL_Z70", "BC_Z70", "VAL_Z80", "WS_Z80", "NL_Z80", "COMMENT_EOL_Z80", 
		"BC_Z80", "VAL_Z90", "PAR_L90", "PAR_R90", "COMMA_Z90", "WS_Z90", "NL_Z90", 
		"COMMENT_EOL_Z90", "BC_Z90", "WS_Z100", "NL_Z100", "FILENAME_Z100", "BC_Z100", 
		"F_VAL", "F_NL", "F_WS", "F_EXPR", "F_SUBCKT", "F_SUBCKT_TAIL", "F_H_MODEL", 
		"F_TRAN", "F_PRINT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'PULSE'", "'SIN'", "'EXP'", "'PWL'", "'SFFM'", 
		"'AM'", "'TRNOISE'", "'TRRANDOM'", "'EXTERNAL'", "'POLY'", "'COMMENT'", 
		"'%v'", "'.INCLUDE'", "'FILENAME'", "'.OPTIONS'", "'TRAN'", "'V'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NODE", "VAL", "KV_KEY", "COMMA", "HEAD_R", "WS", "NEWLINE", "EQ", 
		"EXPR", "SUBCKT_NAME", "PAR_L", "PAR_R", "BR_L", "BR_R", "MODEL_NAME", 
		"PULSE", "SIN", "EXP", "PWL", "SFFM", "AM", "TRNOISE", "TRRANDOM", "EXTERNAL", 
		"POLY", "COMMENT", "XA_NODE_TYPE", "INCLUDE", "FILENAME", "OPTIONS", "PLOT_TYPE", 
		"PLOT_POINT_TYPE", "BC", "COMMENT_FIRSTLINEZ999", "NL_Z999", "BC_Z999", 
		"COMMENT_LS_Z01", "COMMENT_EOL_Z01", "H_MODEL", "H_R", "H_C", "H_K", "H_L", 
		"H_S", "H_W", "H_V", "H_I", "H_E", "H_G", "H_F", "H_H", "H_A", "H_T", 
		"H_O", "H_U", "H_Y", "H_D", "H_Q", "H_J", "H_Z", "H_M", "H_SUBCKT", "H_SUBCKT_TAIL", 
		"H_X", "TRAN", "PRINT", "VAL01", "WS_Z01", "NL_Z01", "BC_Z01", "VL", "WS_Z00", 
		"NL_Z00", "COMMENT_EOL_Z00", "BC_Z00", "BC_Z05", "NL_Z05", "VAL_Z10", 
		"EXPR_Z10", "COMMA_Z10", "EQ_Z10", "PAR_L10", "PAR_R10", "WS_Z10", "NL_Z10", 
		"COMMENT_EOL_Z10", "BC_Z10", "VAL_Z11", "EXPR_Z11", "COMMA_Z11", "EQ_Z11", 
		"PAR_L11", "PAR_R11", "WS_Z11", "NL_Z11", "COMMENT_EOL_Z11", "BC_Z11", 
		"VAL_Z12", "EXPR_Z12", "COMMA_Z12", "EQ_Z12", "PAR_L12", "PAR_R12", "WS_Z12", 
		"NL_Z12", "COMMENT_EOL_Z12", "BC_Z12", "VAL_Z13", "EXPR_Z13", "COMMA_Z13", 
		"EQ_Z13", "PAR_L13", "PAR_R13", "WS_Z13", "NL_Z13", "COMMENT_EOL_Z13", 
		"BC_Z13", "VAL_Z20", "EQ_Z20", "WS_Z20", "NL_Z20", "COMMENT_EOL_Z20", 
		"BC_Z20", "VAL_Z30", "WS_Z30", "NL_Z30", "COMMENT_EOL_Z30", "BC_Z30", 
		"VAL_Z40", "EQ_Z40", "WS_Z40", "NL_Z40", "COMMENT_EOL_Z40", "BC_Z40", 
		"PAR_L50", "PAR_R50", "VAL_Z50", "WS_Z50", "NL_Z50", "COMMENT_EOL_Z50", 
		"BC_Z50", "VAL_Z60", "PAR_L60", "PAR_R60", "BR_L60", "BR_R60", "WS_Z60", 
		"NL_Z60", "COMMENT_EOL_Z60", "BC_Z60", "VAL_Z70", "WS_Z70", "NL_Z70", 
		"COMMENT_EOL_Z70", "BC_Z70", "VAL_Z80", "WS_Z80", "NL_Z80", "COMMENT_EOL_Z80", 
		"BC_Z80", "VAL_Z90", "PAR_L90", "PAR_R90", "COMMA_Z90", "WS_Z90", "NL_Z90", 
		"COMMENT_EOL_Z90", "BC_Z90", "WS_Z100", "NL_Z100", "FILENAME_Z100", "BC_Z100"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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
	        defaultModeBc();
	        return;
	    }

	    if (text.equalsIgnoreCase(".include")) {
	        setType(INCLUDE);
	        mode(M_INCLUDE_SPACE);
	        return;
	    }

	    if (text.equalsIgnoreCase(".options")) {
	        setType(OPTIONS);
	        mode(M_KV);
	        return;
	    }

	    defaultModeBc();
	}

	private void defaultModeBc() {
	    bc();          // token type
	    mode(M_BC); // rest of line is also BC
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



	public NgsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NgsLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 33:
			COMMENT_FIRSTLINEZ999_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			NL_Z999_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			BC_Z999_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			COMMENT_LS_Z01_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			COMMENT_EOL_Z01_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			H_MODEL_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			H_R_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			H_C_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			H_K_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			H_L_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			H_S_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			H_W_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			H_V_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			H_I_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			H_E_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			H_G_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			H_F_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			H_H_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			H_A_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			H_T_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			H_O_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			H_U_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			H_Y_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			H_D_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			H_Q_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			H_J_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			H_Z_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
			H_M_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			H_SUBCKT_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			H_SUBCKT_TAIL_action((RuleContext)_localctx, actionIndex);
			break;
		case 63:
			H_X_action((RuleContext)_localctx, actionIndex);
			break;
		case 64:
			TRAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
			PRINT_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			VAL01_action((RuleContext)_localctx, actionIndex);
			break;
		case 67:
			WS_Z01_action((RuleContext)_localctx, actionIndex);
			break;
		case 68:
			NL_Z01_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
			BC_Z01_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			VL_action((RuleContext)_localctx, actionIndex);
			break;
		case 71:
			WS_Z00_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			NL_Z00_action((RuleContext)_localctx, actionIndex);
			break;
		case 73:
			COMMENT_EOL_Z00_action((RuleContext)_localctx, actionIndex);
			break;
		case 74:
			BC_Z00_action((RuleContext)_localctx, actionIndex);
			break;
		case 75:
			BC_Z05_action((RuleContext)_localctx, actionIndex);
			break;
		case 76:
			NL_Z05_action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
			VAL_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 78:
			EXPR_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 79:
			COMMA_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 80:
			EQ_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 81:
			PAR_L10_action((RuleContext)_localctx, actionIndex);
			break;
		case 82:
			PAR_R10_action((RuleContext)_localctx, actionIndex);
			break;
		case 83:
			WS_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 84:
			NL_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 85:
			COMMENT_EOL_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 86:
			BC_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 87:
			VAL_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 88:
			EXPR_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 89:
			COMMA_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 90:
			EQ_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 91:
			PAR_L11_action((RuleContext)_localctx, actionIndex);
			break;
		case 92:
			PAR_R11_action((RuleContext)_localctx, actionIndex);
			break;
		case 93:
			WS_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 94:
			NL_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 95:
			COMMENT_EOL_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
			BC_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 97:
			VAL_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 98:
			EXPR_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 99:
			COMMA_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 100:
			EQ_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 101:
			PAR_L12_action((RuleContext)_localctx, actionIndex);
			break;
		case 102:
			PAR_R12_action((RuleContext)_localctx, actionIndex);
			break;
		case 103:
			WS_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 104:
			NL_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 105:
			COMMENT_EOL_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 106:
			BC_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 107:
			VAL_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 108:
			EXPR_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 109:
			COMMA_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 110:
			EQ_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 111:
			PAR_L13_action((RuleContext)_localctx, actionIndex);
			break;
		case 112:
			PAR_R13_action((RuleContext)_localctx, actionIndex);
			break;
		case 113:
			WS_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 114:
			NL_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 115:
			COMMENT_EOL_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 116:
			BC_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 117:
			VAL_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 118:
			EQ_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 119:
			WS_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 120:
			NL_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 121:
			COMMENT_EOL_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 122:
			BC_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 123:
			VAL_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 124:
			WS_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 125:
			NL_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 126:
			COMMENT_EOL_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 127:
			BC_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 128:
			VAL_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 129:
			EQ_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 130:
			WS_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 131:
			NL_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 132:
			COMMENT_EOL_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 133:
			BC_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 134:
			PAR_L50_action((RuleContext)_localctx, actionIndex);
			break;
		case 135:
			PAR_R50_action((RuleContext)_localctx, actionIndex);
			break;
		case 136:
			VAL_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 137:
			WS_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 138:
			NL_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 139:
			COMMENT_EOL_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 140:
			BC_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 141:
			VAL_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 142:
			PAR_L60_action((RuleContext)_localctx, actionIndex);
			break;
		case 143:
			PAR_R60_action((RuleContext)_localctx, actionIndex);
			break;
		case 144:
			BR_L60_action((RuleContext)_localctx, actionIndex);
			break;
		case 145:
			BR_R60_action((RuleContext)_localctx, actionIndex);
			break;
		case 146:
			WS_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 147:
			NL_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 148:
			COMMENT_EOL_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 149:
			BC_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 150:
			VAL_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 151:
			WS_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 152:
			NL_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 153:
			COMMENT_EOL_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 154:
			BC_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 155:
			VAL_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 156:
			WS_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 157:
			NL_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 158:
			COMMENT_EOL_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 159:
			BC_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 160:
			VAL_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 161:
			PAR_L90_action((RuleContext)_localctx, actionIndex);
			break;
		case 162:
			PAR_R90_action((RuleContext)_localctx, actionIndex);
			break;
		case 163:
			COMMA_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 164:
			WS_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 165:
			NL_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 166:
			COMMENT_EOL_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 167:
			BC_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 168:
			WS_Z100_action((RuleContext)_localctx, actionIndex);
			break;
		case 169:
			NL_Z100_action((RuleContext)_localctx, actionIndex);
			break;
		case 170:
			FILENAME_Z100_action((RuleContext)_localctx, actionIndex);
			break;
		case 171:
			BC_Z100_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_FIRSTLINEZ999_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			comment();
			break;
		}
	}
	private void NL_Z999_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			newline();mode(M_DEFAULT);
			break;
		}
	}
	private void BC_Z999_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			bc();
			break;
		}
	}
	private void COMMENT_LS_Z01_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			comment();
			break;
		}
	}
	private void COMMENT_EOL_Z01_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			comment();
			break;
		}
	}
	private void H_MODEL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			mode(M_MODEL_KV);
			break;
		}
	}
	private void H_R_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			startMNode(2, M_R_KV);
			break;
		}
	}
	private void H_C_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			startMNode(2, M_R_KV);
			break;
		}
	}
	private void H_K_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			startMNodeTyped(2, M_KV, H_L);
			break;
		}
	}
	private void H_L_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			startMNode(2, M_R_KV);
			break;
		}
	}
	private void H_S_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			startMNode(4, M_MODEL_KV);
			break;
		}
	}
	private void H_W_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			startMNode(2, M_W_SRC);
			break;
		}
	}
	private void H_V_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			startMNode(2, M_SRC_KV);
			break;
		}
	}
	private void H_I_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			startMNode(2, M_SRC_KV);
			break;
		}
	}
	private void H_E_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			startMDepSource(true); 
			break;
		}
	}
	private void H_G_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			startMDepSource(true); 
			break;
		}
	}
	private void H_F_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			startMDepSource(false); 
			break;
		}
	}
	private void H_H_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			startMDepSource(false); 
			break;
		}
	}
	private void H_A_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			startMXspiceA(); 
			break;
		}
	}
	private void H_T_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			startMNode(4, M_KV);
			break;
		}
	}
	private void H_O_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			startMNode(4, M_MODEL_KV);
			break;
		}
	}
	private void H_U_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			startMNode(3, M_MODEL_KV);
			break;
		}
	}
	private void H_Y_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			startMNode(4, M_MODEL_KV);
			break;
		}
	}
	private void H_D_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			startMNode(2, M_MODEL_KV);
			break;
		}
	}
	private void H_Q_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			startMQTransistor();
			break;
		}
	}
	private void H_J_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			startMNode(3, M_MODEL_KV);
			break;
		}
	}
	private void H_Z_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			startMNode(3, M_MODEL_KV);
			break;
		}
	}
	private void H_M_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			startMNode(4, M_MODEL_KV);
			break;
		}
	}
	private void H_SUBCKT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			startMSubckt();
			break;
		}
	}
	private void H_SUBCKT_TAIL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			mode(M_SUBCKT_TAIL);
			break;
		}
	}
	private void H_X_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			mode(M_X);
			break;
		}
	}
	private void TRAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			mode(M_KV);
			break;
		}
	}
	private void PRINT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			startMPlot();
			break;
		}
	}
	private void VAL01_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			valInDefaultMode();
			break;
		}
	}
	private void WS_Z01_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:
			whitespace();
			break;
		}
	}
	private void NL_Z01_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:
			newline();
			break;
		}
	}
	private void BC_Z01_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36:
			defaultModeBc();
			break;
		}
	}
	private void VL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:
			node();
			break;
		}
	}
	private void WS_Z00_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38:
			whitespace();
			break;
		}
	}
	private void NL_Z00_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z00_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40:
			comment();
			break;
		}
	}
	private void BC_Z00_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41:
			bc();
			break;
		}
	}
	private void BC_Z05_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:
			bc();
			break;
		}
	}
	private void NL_Z05_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:
			newline();
			break;
		}
	}
	private void VAL_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:
			kvVal(VAL);
			break;
		}
	}
	private void EXPR_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:
			kvVal(EXPR);
			break;
		}
	}
	private void COMMA_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46:
			setType(COMMA);
			break;
		}
	}
	private void EQ_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47:
			setType(EQ);
			break;
		}
	}
	private void PAR_L10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48:
			setType(PAR_L);
			break;
		}
	}
	private void PAR_R10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 49:
			setType(PAR_R);
			break;
		}
	}
	private void WS_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 50:
			whitespace();
			break;
		}
	}
	private void NL_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 51:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 52:
			comment();
			break;
		}
	}
	private void BC_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 53:
			bc();
			break;
		}
	}
	private void VAL_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 54:
			srcKvVal(VAL);
			break;
		}
	}
	private void EXPR_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 55:
			srcKvVal(EXPR);
			break;
		}
	}
	private void COMMA_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 56:
			setType(COMMA);
			break;
		}
	}
	private void EQ_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 57:
			setType(EQ);
			break;
		}
	}
	private void PAR_L11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 58:
			setType(PAR_L);
			break;
		}
	}
	private void PAR_R11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 59:
			setType(PAR_R);
			break;
		}
	}
	private void WS_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 60:
			whitespace();
			break;
		}
	}
	private void NL_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 61:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 62:
			comment();
			break;
		}
	}
	private void BC_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 63:
			bc();
			break;
		}
	}
	private void VAL_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 64:
			kvRVal(); mode(M_KV); 
			break;
		}
	}
	private void EXPR_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 65:
			kvVal(EXPR); mode(M_KV); 
			break;
		}
	}
	private void COMMA_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 66:
			setType(COMMA); mode(M_KV); 
			break;
		}
	}
	private void EQ_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 67:
			setType(EQ); mode(M_KV); 
			break;
		}
	}
	private void PAR_L12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 68:
			setType(PAR_L); mode(M_KV); 
			break;
		}
	}
	private void PAR_R12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 69:
			setType(PAR_R); mode(M_KV); 
			break;
		}
	}
	private void WS_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 70:
			whitespace();
			break;
		}
	}
	private void NL_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 71:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 72:
			comment(); mode(M_KV);
			break;
		}
	}
	private void BC_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 73:
			bc();  mode(M_KV); 
			break;
		}
	}
	private void VAL_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 74:
			kvModelVal(); mode(M_KV); 
			break;
		}
	}
	private void EXPR_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 75:
			kvVal(EXPR); mode(M_KV); 
			break;
		}
	}
	private void COMMA_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 76:
			setType(COMMA); mode(M_KV); 
			break;
		}
	}
	private void EQ_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 77:
			setType(EQ); mode(M_KV); 
			break;
		}
	}
	private void PAR_L13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 78:
			setType(PAR_L); mode(M_KV); 
			break;
		}
	}
	private void PAR_R13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 79:
			setType(PAR_R); mode(M_KV); 
			break;
		}
	}
	private void WS_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 80:
			whitespace(); 
			break;
		}
	}
	private void NL_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 81:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 82:
			comment(); mode(M_KV);
			break;
		}
	}
	private void BC_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 83:
			bc();  mode(M_KV); 
			break;
		}
	}
	private void VAL_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 84:
			subcktVal();
			break;
		}
	}
	private void EQ_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 85:
			setType(EQ);
			break;
		}
	}
	private void WS_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 86:
			whitespace();
			break;
		}
	}
	private void NL_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 87:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 88:
			comment();
			break;
		}
	}
	private void BC_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 89:
			bc();
			break;
		}
	}
	private void VAL_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 90:
			setType(SUBCKT_NAME);
			break;
		}
	}
	private void WS_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 91:
			whitespace();
			break;
		}
	}
	private void NL_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 92:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 93:
			comment();
			break;
		}
	}
	private void BC_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 94:
			bc();
			break;
		}
	}
	private void VAL_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 95:
			xVal();
			break;
		}
	}
	private void EQ_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 96:
			setType(EQ);
			break;
		}
	}
	private void WS_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 97:
			whitespace();
			break;
		}
	}
	private void NL_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 98:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 99:
			comment();
			break;
		}
	}
	private void BC_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 100:
			bc();
			break;
		}
	}
	private void PAR_L50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 101:
			whitespace();
			break;
		}
	}
	private void PAR_R50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 102:
			whitespace();
			break;
		}
	}
	private void VAL_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 103:
			srcDepVal();
			break;
		}
	}
	private void WS_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 104:
			whitespace();
			break;
		}
	}
	private void NL_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 105:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 106:
			comment();
			break;
		}
	}
	private void BC_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 107:
			bc();
			break;
		}
	}
	private void VAL_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 108:
			xSpiceAVal();
			break;
		}
	}
	private void PAR_L60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 109:
			setType(PAR_L);
			break;
		}
	}
	private void PAR_R60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 110:
			setType(PAR_R);
			break;
		}
	}
	private void BR_L60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 111:
			setType(BR_L);
			break;
		}
	}
	private void BR_R60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 112:
			xSpiceBracketClosed();
			break;
		}
	}
	private void WS_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 113:
			whitespace();
			break;
		}
	}
	private void NL_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 114:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 115:
			comment();
			break;
		}
	}
	private void BC_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 116:
			bc();
			break;
		}
	}
	private void VAL_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 117:
			setType(H_V);mode(M_MODEL_KV);
			break;
		}
	}
	private void WS_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 118:
			whitespace();
			break;
		}
	}
	private void NL_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 119:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 120:
			comment();
			break;
		}
	}
	private void BC_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 121:
			bc();
			break;
		}
	}
	private void VAL_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 122:
			qTransistorVal();
			break;
		}
	}
	private void WS_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 123:
			whitespace();
			break;
		}
	}
	private void NL_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 124:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 125:
			comment();
			break;
		}
	}
	private void BC_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 126:
			bc();
			break;
		}
	}
	private void VAL_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 127:
			plotVal();
			break;
		}
	}
	private void PAR_L90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 128:
			plotParL();
			break;
		}
	}
	private void PAR_R90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 129:
			plotParR();
			break;
		}
	}
	private void COMMA_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 130:
			setType(COMMA);
			break;
		}
	}
	private void WS_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 131:
			whitespace();
			break;
		}
	}
	private void NL_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 132:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 133:
			comment();
			break;
		}
	}
	private void BC_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 134:
			bc();
			break;
		}
	}
	private void WS_Z100_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 135:
			whitespace();
			break;
		}
	}
	private void NL_Z100_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 136:
			newline();
			break;
		}
	}
	private void FILENAME_Z100_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 137:
			setType(FILENAME);
			break;
		}
	}
	private void BC_Z100_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 138:
			bc();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return COMMENT_LS_Z01_sempred((RuleContext)_localctx, predIndex);
		case 170:
			return FILENAME_Z100_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean COMMENT_LS_Z01_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getCharPositionInLine() == 0;
		}
		return true;
	}
	private boolean FILENAME_Z100_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !ArrayUtils.contains(spacesArray, getInputAsString().charAt(_tokenStartCharIndex));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u00ae\u050a\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6"+
		"\t\u00b6\3\2\6\2\u0180\n\2\r\2\16\2\u0181\3\3\6\3\u0185\n\3\r\3\16\3\u0186"+
		"\3\4\6\4\u018a\n\4\r\4\16\4\u018b\3\5\3\5\3\6\3\6\6\6\u0192\n\6\r\6\16"+
		"\6\u0193\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13\u01a1\n\13"+
		"\r\13\16\13\u01a2\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20\u01ae"+
		"\n\20\r\20\16\20\u01af\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\6#\u021b\n#\r#\16#\u021c\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\3&\7&\u022a\n&\f&\16&\u022d\13&\3&\3&\3\'\3"+
		"\'\7\'\u0233\n\'\f\'\16\'\u0236\13\'\3\'\3\'\3(\3(\3(\3)\3)\6)\u023f\n"+
		")\r)\16)\u0240\3)\3)\3*\3*\6*\u0247\n*\r*\16*\u0248\3*\3*\3+\3+\6+\u024f"+
		"\n+\r+\16+\u0250\3+\3+\3,\3,\6,\u0257\n,\r,\16,\u0258\3,\3,\3-\3-\6-\u025f"+
		"\n-\r-\16-\u0260\3-\3-\3.\3.\6.\u0267\n.\r.\16.\u0268\3.\3.\3/\3/\6/\u026f"+
		"\n/\r/\16/\u0270\3/\3/\3\60\3\60\6\60\u0277\n\60\r\60\16\60\u0278\3\60"+
		"\3\60\3\61\3\61\6\61\u027f\n\61\r\61\16\61\u0280\3\61\3\61\3\62\3\62\6"+
		"\62\u0287\n\62\r\62\16\62\u0288\3\62\3\62\3\63\3\63\6\63\u028f\n\63\r"+
		"\63\16\63\u0290\3\63\3\63\3\64\3\64\6\64\u0297\n\64\r\64\16\64\u0298\3"+
		"\64\3\64\3\65\3\65\6\65\u029f\n\65\r\65\16\65\u02a0\3\65\3\65\3\66\3\66"+
		"\6\66\u02a7\n\66\r\66\16\66\u02a8\3\66\3\66\3\67\3\67\6\67\u02af\n\67"+
		"\r\67\16\67\u02b0\3\67\3\67\38\38\68\u02b7\n8\r8\168\u02b8\38\38\39\3"+
		"9\69\u02bf\n9\r9\169\u02c0\39\39\3:\3:\6:\u02c7\n:\r:\16:\u02c8\3:\3:"+
		"\3;\3;\6;\u02cf\n;\r;\16;\u02d0\3;\3;\3<\3<\6<\u02d7\n<\r<\16<\u02d8\3"+
		"<\3<\3=\3=\6=\u02df\n=\r=\16=\u02e0\3=\3=\3>\3>\6>\u02e7\n>\r>\16>\u02e8"+
		"\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\6A\u02f5\nA\rA\16A\u02f6\3A\3A\3B\3B\3"+
		"B\3C\3C\3C\3D\6D\u0302\nD\rD\16D\u0303\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3"+
		"G\3H\6H\u0312\nH\rH\16H\u0313\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\7K\u0320\n"+
		"K\fK\16K\u0323\13K\3K\3K\3L\3L\3L\3M\6M\u032b\nM\rM\16M\u032c\3M\3M\3"+
		"N\3N\3N\3O\6O\u0335\nO\rO\16O\u0336\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3"+
		"S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\7W\u0352\nW\fW\16W\u0355\13W"+
		"\3W\3W\3X\3X\3X\3Y\6Y\u035d\nY\rY\16Y\u035e\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3"+
		"\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3_\3`\3`\3`\3a\3a\7a\u037a\na\fa\16"+
		"a\u037d\13a\3a\3a\3b\3b\3b\3c\6c\u0385\nc\rc\16c\u0386\3c\3c\3d\3d\3d"+
		"\3e\3e\3e\3f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k\7k\u03a2"+
		"\nk\fk\16k\u03a5\13k\3k\3k\3l\3l\3l\3m\6m\u03ad\nm\rm\16m\u03ae\3m\3m"+
		"\3n\3n\3n\3o\3o\3o\3p\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u"+
		"\7u\u03ca\nu\fu\16u\u03cd\13u\3u\3u\3v\3v\3v\3w\6w\u03d5\nw\rw\16w\u03d6"+
		"\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3z\3{\3{\7{\u03e6\n{\f{\16{\u03e9\13{\3"+
		"{\3{\3|\3|\3|\3}\6}\u03f1\n}\r}\16}\u03f2\3}\3}\3~\3~\3~\3\177\3\177\3"+
		"\177\3\u0080\3\u0080\7\u0080\u03ff\n\u0080\f\u0080\16\u0080\u0402\13\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082\6\u0082\u040a\n\u0082"+
		"\r\u0082\16\u0082\u040b\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\7\u0086\u041b"+
		"\n\u0086\f\u0086\16\u0086\u041e\13\u0086\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\6\u008a"+
		"\u042c\n\u008a\r\u008a\16\u008a\u042d\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\7\u008d\u043a\n\u008d"+
		"\f\u008d\16\u008d\u043d\13\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\6\u008f\u0446\n\u008f\r\u008f\16\u008f\u0447\3\u008f"+
		"\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\7\u0096\u0460\n\u0096\f\u0096\16\u0096\u0463"+
		"\13\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0098\6\u0098\u046b"+
		"\n\u0098\r\u0098\16\u0098\u046c\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\7\u009b\u0479\n\u009b\f\u009b"+
		"\16\u009b\u047c\13\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\6\u009d\u0484\n\u009d\r\u009d\16\u009d\u0485\3\u009d\3\u009d\3\u009e"+
		"\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\7\u00a0\u0492"+
		"\n\u00a0\f\u00a0\16\u00a0\u0495\13\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a2\6\u00a2\u049d\n\u00a2\r\u00a2\16\u00a2\u049e\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\7\u00a8\u04b4\n\u00a8\f\u00a8\16\u00a8\u04b7\13\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00aa\6\u00aa\u04bf\n\u00aa\r\u00aa\16\u00aa"+
		"\u04c0\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\6\u00ac"+
		"\u04ca\n\u00ac\r\u00ac\16\u00ac\u04cb\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ae\3\u00ae\3\u00af\5\u00af\u04d6\n\u00af\3\u00af\3\u00af"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u04de\n\u00b0\3\u00b1\3\u00b1"+
		"\7\u00b1\u04e2\n\u00b1\f\u00b1\16\u00b1\u04e5\13\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\2\2\u00b7\24"+
		"\3\26\4\30\5\32\6\34\7\36\b \t\"\n$\13&\f(\r*\16,\17.\20\60\21\62\22\64"+
		"\23\66\248\25:\26<\27>\30@\31B\32D\33F\34H\35J\36L\37N P!R\"T#V$X%Z&\\"+
		"\'^(`)b*d+f,h-j.l/n\60p\61r\62t\63v\64x\65z\66|\67~8\u00809\u0082:\u0084"+
		";\u0086<\u0088=\u008a>\u008c?\u008e@\u0090A\u0092B\u0094C\u0096D\u0098"+
		"E\u009aF\u009cG\u009eH\u00a0I\u00a2J\u00a4K\u00a6L\u00a8M\u00aaN\u00ac"+
		"O\u00aeP\u00b0Q\u00b2R\u00b4S\u00b6T\u00b8U\u00baV\u00bcW\u00beX\u00c0"+
		"Y\u00c2Z\u00c4[\u00c6\\\u00c8]\u00ca^\u00cc_\u00ce`\u00d0a\u00d2b\u00d4"+
		"c\u00d6d\u00d8e\u00daf\u00dcg\u00deh\u00e0i\u00e2j\u00e4k\u00e6l\u00e8"+
		"m\u00ean\u00eco\u00eep\u00f0q\u00f2r\u00f4s\u00f6t\u00f8u\u00fav\u00fc"+
		"w\u00fex\u0100y\u0102z\u0104{\u0106|\u0108}\u010a~\u010c\177\u010e\u0080"+
		"\u0110\u0081\u0112\u0082\u0114\u0083\u0116\u0084\u0118\u0085\u011a\u0086"+
		"\u011c\u0087\u011e\u0088\u0120\u0089\u0122\u008a\u0124\u008b\u0126\u008c"+
		"\u0128\u008d\u012a\u008e\u012c\u008f\u012e\u0090\u0130\u0091\u0132\u0092"+
		"\u0134\u0093\u0136\u0094\u0138\u0095\u013a\u0096\u013c\u0097\u013e\u0098"+
		"\u0140\u0099\u0142\u009a\u0144\u009b\u0146\u009c\u0148\u009d\u014a\u009e"+
		"\u014c\u009f\u014e\u00a0\u0150\u00a1\u0152\u00a2\u0154\u00a3\u0156\u00a4"+
		"\u0158\u00a5\u015a\u00a6\u015c\u00a7\u015e\u00a8\u0160\u00a9\u0162\u00aa"+
		"\u0164\u00ab\u0166\u00ac\u0168\u00ad\u016a\u00ae\u016c\2\u016e\2\u0170"+
		"\2\u0172\2\u0174\2\u0176\2\u0178\2\u017a\2\u017c\2\24\2\3\4\5\6\7\b\t"+
		"\n\13\f\r\16\17\20\21\22\23#\3\2c|\3\2\62;\4\2TTtt\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\4\2EEee\4\2MMmm\4\2NNnn\4\2UUuu\4\2YYyy\4\2XXxx\4\2KKkk\4\2G"+
		"Ggg\4\2IIii\4\2HHhh\4\2JJjj\4\2CCcc\4\2VVvv\4\2QQqq\4\2WWww\4\2[[{{\4"+
		"\2FFff\4\2SSss\4\2LLll\4\2\\\\||\4\2OOoo\4\2ZZzz\3\2\f\f\b\2--/\60\62"+
		";C\\aac|\3\2))\4\2DDdd\4\2PPpp\4\2RRrr\2\u0531\2\24\3\2\2\2\2\26\3\2\2"+
		"\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\""+
		"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2"+
		"\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2"+
		":\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3"+
		"\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2"+
		"\2\2T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\4\\\3\2\2\2\4^\3\2\2\2"+
		"\4`\3\2\2\2\4b\3\2\2\2\4d\3\2\2\2\4f\3\2\2\2\4h\3\2\2\2\4j\3\2\2\2\4l"+
		"\3\2\2\2\4n\3\2\2\2\4p\3\2\2\2\4r\3\2\2\2\4t\3\2\2\2\4v\3\2\2\2\4x\3\2"+
		"\2\2\4z\3\2\2\2\4|\3\2\2\2\4~\3\2\2\2\4\u0080\3\2\2\2\4\u0082\3\2\2\2"+
		"\4\u0084\3\2\2\2\4\u0086\3\2\2\2\4\u0088\3\2\2\2\4\u008a\3\2\2\2\4\u008c"+
		"\3\2\2\2\4\u008e\3\2\2\2\4\u0090\3\2\2\2\4\u0092\3\2\2\2\4\u0094\3\2\2"+
		"\2\4\u0096\3\2\2\2\4\u0098\3\2\2\2\4\u009a\3\2\2\2\4\u009c\3\2\2\2\4\u009e"+
		"\3\2\2\2\5\u00a0\3\2\2\2\5\u00a2\3\2\2\2\5\u00a4\3\2\2\2\5\u00a6\3\2\2"+
		"\2\5\u00a8\3\2\2\2\6\u00aa\3\2\2\2\6\u00ac\3\2\2\2\7\u00ae\3\2\2\2\7\u00b0"+
		"\3\2\2\2\7\u00b2\3\2\2\2\7\u00b4\3\2\2\2\7\u00b6\3\2\2\2\7\u00b8\3\2\2"+
		"\2\7\u00ba\3\2\2\2\7\u00bc\3\2\2\2\7\u00be\3\2\2\2\7\u00c0\3\2\2\2\b\u00c2"+
		"\3\2\2\2\b\u00c4\3\2\2\2\b\u00c6\3\2\2\2\b\u00c8\3\2\2\2\b\u00ca\3\2\2"+
		"\2\b\u00cc\3\2\2\2\b\u00ce\3\2\2\2\b\u00d0\3\2\2\2\b\u00d2\3\2\2\2\b\u00d4"+
		"\3\2\2\2\t\u00d6\3\2\2\2\t\u00d8\3\2\2\2\t\u00da\3\2\2\2\t\u00dc\3\2\2"+
		"\2\t\u00de\3\2\2\2\t\u00e0\3\2\2\2\t\u00e2\3\2\2\2\t\u00e4\3\2\2\2\t\u00e6"+
		"\3\2\2\2\t\u00e8\3\2\2\2\n\u00ea\3\2\2\2\n\u00ec\3\2\2\2\n\u00ee\3\2\2"+
		"\2\n\u00f0\3\2\2\2\n\u00f2\3\2\2\2\n\u00f4\3\2\2\2\n\u00f6\3\2\2\2\n\u00f8"+
		"\3\2\2\2\n\u00fa\3\2\2\2\n\u00fc\3\2\2\2\13\u00fe\3\2\2\2\13\u0100\3\2"+
		"\2\2\13\u0102\3\2\2\2\13\u0104\3\2\2\2\13\u0106\3\2\2\2\13\u0108\3\2\2"+
		"\2\f\u010a\3\2\2\2\f\u010c\3\2\2\2\f\u010e\3\2\2\2\f\u0110\3\2\2\2\f\u0112"+
		"\3\2\2\2\r\u0114\3\2\2\2\r\u0116\3\2\2\2\r\u0118\3\2\2\2\r\u011a\3\2\2"+
		"\2\r\u011c\3\2\2\2\r\u011e\3\2\2\2\16\u0120\3\2\2\2\16\u0122\3\2\2\2\16"+
		"\u0124\3\2\2\2\16\u0126\3\2\2\2\16\u0128\3\2\2\2\16\u012a\3\2\2\2\16\u012c"+
		"\3\2\2\2\17\u012e\3\2\2\2\17\u0130\3\2\2\2\17\u0132\3\2\2\2\17\u0134\3"+
		"\2\2\2\17\u0136\3\2\2\2\17\u0138\3\2\2\2\17\u013a\3\2\2\2\17\u013c\3\2"+
		"\2\2\17\u013e\3\2\2\2\20\u0140\3\2\2\2\20\u0142\3\2\2\2\20\u0144\3\2\2"+
		"\2\20\u0146\3\2\2\2\20\u0148\3\2\2\2\21\u014a\3\2\2\2\21\u014c\3\2\2\2"+
		"\21\u014e\3\2\2\2\21\u0150\3\2\2\2\21\u0152\3\2\2\2\22\u0154\3\2\2\2\22"+
		"\u0156\3\2\2\2\22\u0158\3\2\2\2\22\u015a\3\2\2\2\22\u015c\3\2\2\2\22\u015e"+
		"\3\2\2\2\22\u0160\3\2\2\2\22\u0162\3\2\2\2\23\u0164\3\2\2\2\23\u0166\3"+
		"\2\2\2\23\u0168\3\2\2\2\23\u016a\3\2\2\2\24\u017f\3\2\2\2\26\u0184\3\2"+
		"\2\2\30\u0189\3\2\2\2\32\u018d\3\2\2\2\34\u018f\3\2\2\2\36\u0195\3\2\2"+
		"\2 \u0199\3\2\2\2\"\u019b\3\2\2\2$\u019d\3\2\2\2&\u01a0\3\2\2\2(\u01a4"+
		"\3\2\2\2*\u01a6\3\2\2\2,\u01a8\3\2\2\2.\u01aa\3\2\2\2\60\u01ad\3\2\2\2"+
		"\62\u01b1\3\2\2\2\64\u01b7\3\2\2\2\66\u01bb\3\2\2\28\u01bf\3\2\2\2:\u01c3"+
		"\3\2\2\2<\u01c8\3\2\2\2>\u01cb\3\2\2\2@\u01d3\3\2\2\2B\u01dc\3\2\2\2D"+
		"\u01e5\3\2\2\2F\u01ea\3\2\2\2H\u01f2\3\2\2\2J\u01f5\3\2\2\2L\u01fe\3\2"+
		"\2\2N\u0207\3\2\2\2P\u0210\3\2\2\2R\u0215\3\2\2\2T\u0217\3\2\2\2V\u021a"+
		"\3\2\2\2X\u0220\3\2\2\2Z\u0223\3\2\2\2\\\u0226\3\2\2\2^\u0230\3\2\2\2"+
		"`\u0239\3\2\2\2b\u023c\3\2\2\2d\u0244\3\2\2\2f\u024c\3\2\2\2h\u0254\3"+
		"\2\2\2j\u025c\3\2\2\2l\u0264\3\2\2\2n\u026c\3\2\2\2p\u0274\3\2\2\2r\u027c"+
		"\3\2\2\2t\u0284\3\2\2\2v\u028c\3\2\2\2x\u0294\3\2\2\2z\u029c\3\2\2\2|"+
		"\u02a4\3\2\2\2~\u02ac\3\2\2\2\u0080\u02b4\3\2\2\2\u0082\u02bc\3\2\2\2"+
		"\u0084\u02c4\3\2\2\2\u0086\u02cc\3\2\2\2\u0088\u02d4\3\2\2\2\u008a\u02dc"+
		"\3\2\2\2\u008c\u02e4\3\2\2\2\u008e\u02ec\3\2\2\2\u0090\u02ef\3\2\2\2\u0092"+
		"\u02f2\3\2\2\2\u0094\u02fa\3\2\2\2\u0096\u02fd\3\2\2\2\u0098\u0301\3\2"+
		"\2\2\u009a\u0307\3\2\2\2\u009c\u030a\3\2\2\2\u009e\u030d\3\2\2\2\u00a0"+
		"\u0311\3\2\2\2\u00a2\u0317\3\2\2\2\u00a4\u031a\3\2\2\2\u00a6\u031d\3\2"+
		"\2\2\u00a8\u0326\3\2\2\2\u00aa\u032a\3\2\2\2\u00ac\u0330\3\2\2\2\u00ae"+
		"\u0334\3\2\2\2\u00b0\u033a\3\2\2\2\u00b2\u033d\3\2\2\2\u00b4\u0340\3\2"+
		"\2\2\u00b6\u0343\3\2\2\2\u00b8\u0346\3\2\2\2\u00ba\u0349\3\2\2\2\u00bc"+
		"\u034c\3\2\2\2\u00be\u034f\3\2\2\2\u00c0\u0358\3\2\2\2\u00c2\u035c\3\2"+
		"\2\2\u00c4\u0362\3\2\2\2\u00c6\u0365\3\2\2\2\u00c8\u0368\3\2\2\2\u00ca"+
		"\u036b\3\2\2\2\u00cc\u036e\3\2\2\2\u00ce\u0371\3\2\2\2\u00d0\u0374\3\2"+
		"\2\2\u00d2\u0377\3\2\2\2\u00d4\u0380\3\2\2\2\u00d6\u0384\3\2\2\2\u00d8"+
		"\u038a\3\2\2\2\u00da\u038d\3\2\2\2\u00dc\u0390\3\2\2\2\u00de\u0393\3\2"+
		"\2\2\u00e0\u0396\3\2\2\2\u00e2\u0399\3\2\2\2\u00e4\u039c\3\2\2\2\u00e6"+
		"\u039f\3\2\2\2\u00e8\u03a8\3\2\2\2\u00ea\u03ac\3\2\2\2\u00ec\u03b2\3\2"+
		"\2\2\u00ee\u03b5\3\2\2\2\u00f0\u03b8\3\2\2\2\u00f2\u03bb\3\2\2\2\u00f4"+
		"\u03be\3\2\2\2\u00f6\u03c1\3\2\2\2\u00f8\u03c4\3\2\2\2\u00fa\u03c7\3\2"+
		"\2\2\u00fc\u03d0\3\2\2\2\u00fe\u03d4\3\2\2\2\u0100\u03da\3\2\2\2\u0102"+
		"\u03dd\3\2\2\2\u0104\u03e0\3\2\2\2\u0106\u03e3\3\2\2\2\u0108\u03ec\3\2"+
		"\2\2\u010a\u03f0\3\2\2\2\u010c\u03f6\3\2\2\2\u010e\u03f9\3\2\2\2\u0110"+
		"\u03fc\3\2\2\2\u0112\u0405\3\2\2\2\u0114\u0409\3\2\2\2\u0116\u040f\3\2"+
		"\2\2\u0118\u0412\3\2\2\2\u011a\u0415\3\2\2\2\u011c\u0418\3\2\2\2\u011e"+
		"\u0421\3\2\2\2\u0120\u0424\3\2\2\2\u0122\u0427\3\2\2\2\u0124\u042b\3\2"+
		"\2\2\u0126\u0431\3\2\2\2\u0128\u0434\3\2\2\2\u012a\u0437\3\2\2\2\u012c"+
		"\u0440\3\2\2\2\u012e\u0445\3\2\2\2\u0130\u044b\3\2\2\2\u0132\u044e\3\2"+
		"\2\2\u0134\u0451\3\2\2\2\u0136\u0454\3\2\2\2\u0138\u0457\3\2\2\2\u013a"+
		"\u045a\3\2\2\2\u013c\u045d\3\2\2\2\u013e\u0466\3\2\2\2\u0140\u046a\3\2"+
		"\2\2\u0142\u0470\3\2\2\2\u0144\u0473\3\2\2\2\u0146\u0476\3\2\2\2\u0148"+
		"\u047f\3\2\2\2\u014a\u0483\3\2\2\2\u014c\u0489\3\2\2\2\u014e\u048c\3\2"+
		"\2\2\u0150\u048f\3\2\2\2\u0152\u0498\3\2\2\2\u0154\u049c\3\2\2\2\u0156"+
		"\u04a2\3\2\2\2\u0158\u04a5\3\2\2\2\u015a\u04a8\3\2\2\2\u015c\u04ab\3\2"+
		"\2\2\u015e\u04ae\3\2\2\2\u0160\u04b1\3\2\2\2\u0162\u04ba\3\2\2\2\u0164"+
		"\u04be\3\2\2\2\u0166\u04c4\3\2\2\2\u0168\u04c7\3\2\2\2\u016a\u04cf\3\2"+
		"\2\2\u016c\u04d2\3\2\2\2\u016e\u04d5\3\2\2\2\u0170\u04dd\3\2\2\2\u0172"+
		"\u04df\3\2\2\2\u0174\u04e8\3\2\2\2\u0176\u04f0\3\2\2\2\u0178\u04f6\3\2"+
		"\2\2\u017a\u04fd\3\2\2\2\u017c\u0503\3\2\2\2\u017e\u0180\t\2\2\2\u017f"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\25\3\2\2\2\u0183\u0185\t\3\2\2\u0184\u0183\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\27\3\2\2\2\u0188"+
		"\u018a\t\3\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\31\3\2\2\2\u018d\u018e\7.\2\2\u018e\33"+
		"\3\2\2\2\u018f\u0191\t\4\2\2\u0190\u0192\t\3\2\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\35\3\2\2"+
		"\2\u0195\u0196\t\5\2\2\u0196\u0197\3\2\2\2\u0197\u0198\b\7\2\2\u0198\37"+
		"\3\2\2\2\u0199\u019a\5\u016e\u00af\2\u019a!\3\2\2\2\u019b\u019c\7?\2\2"+
		"\u019c#\3\2\2\2\u019d\u019e\5\u0172\u00b1\2\u019e%\3\2\2\2\u019f\u01a1"+
		"\t\3\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\'\3\2\2\2\u01a4\u01a5\7*\2\2\u01a5)\3\2\2\2\u01a6"+
		"\u01a7\7+\2\2\u01a7+\3\2\2\2\u01a8\u01a9\7]\2\2\u01a9-\3\2\2\2\u01aa\u01ab"+
		"\7_\2\2\u01ab/\3\2\2\2\u01ac\u01ae\5\u016c\u00ae\2\u01ad\u01ac\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\61"+
		"\3\2\2\2\u01b1\u01b2\7R\2\2\u01b2\u01b3\7W\2\2\u01b3\u01b4\7N\2\2\u01b4"+
		"\u01b5\7U\2\2\u01b5\u01b6\7G\2\2\u01b6\63\3\2\2\2\u01b7\u01b8\7U\2\2\u01b8"+
		"\u01b9\7K\2\2\u01b9\u01ba\7P\2\2\u01ba\65\3\2\2\2\u01bb\u01bc\7G\2\2\u01bc"+
		"\u01bd\7Z\2\2\u01bd\u01be\7R\2\2\u01be\67\3\2\2\2\u01bf\u01c0\7R\2\2\u01c0"+
		"\u01c1\7Y\2\2\u01c1\u01c2\7N\2\2\u01c29\3\2\2\2\u01c3\u01c4\7U\2\2\u01c4"+
		"\u01c5\7H\2\2\u01c5\u01c6\7H\2\2\u01c6\u01c7\7O\2\2\u01c7;\3\2\2\2\u01c8"+
		"\u01c9\7C\2\2\u01c9\u01ca\7O\2\2\u01ca=\3\2\2\2\u01cb\u01cc\7V\2\2\u01cc"+
		"\u01cd\7T\2\2\u01cd\u01ce\7P\2\2\u01ce\u01cf\7Q\2\2\u01cf\u01d0\7K\2\2"+
		"\u01d0\u01d1\7U\2\2\u01d1\u01d2\7G\2\2\u01d2?\3\2\2\2\u01d3\u01d4\7V\2"+
		"\2\u01d4\u01d5\7T\2\2\u01d5\u01d6\7T\2\2\u01d6\u01d7\7C\2\2\u01d7\u01d8"+
		"\7P\2\2\u01d8\u01d9\7F\2\2\u01d9\u01da\7Q\2\2\u01da\u01db\7O\2\2\u01db"+
		"A\3\2\2\2\u01dc\u01dd\7G\2\2\u01dd\u01de\7Z\2\2\u01de\u01df\7V\2\2\u01df"+
		"\u01e0\7G\2\2\u01e0\u01e1\7T\2\2\u01e1\u01e2\7P\2\2\u01e2\u01e3\7C\2\2"+
		"\u01e3\u01e4\7N\2\2\u01e4C\3\2\2\2\u01e5\u01e6\7R\2\2\u01e6\u01e7\7Q\2"+
		"\2\u01e7\u01e8\7N\2\2\u01e8\u01e9\7[\2\2\u01e9E\3\2\2\2\u01ea\u01eb\7"+
		"E\2\2\u01eb\u01ec\7Q\2\2\u01ec\u01ed\7O\2\2\u01ed\u01ee\7O\2\2\u01ee\u01ef"+
		"\7G\2\2\u01ef\u01f0\7P\2\2\u01f0\u01f1\7V\2\2\u01f1G\3\2\2\2\u01f2\u01f3"+
		"\7\'\2\2\u01f3\u01f4\7x\2\2\u01f4I\3\2\2\2\u01f5\u01f6\7\60\2\2\u01f6"+
		"\u01f7\7K\2\2\u01f7\u01f8\7P\2\2\u01f8\u01f9\7E\2\2\u01f9\u01fa\7N\2\2"+
		"\u01fa\u01fb\7W\2\2\u01fb\u01fc\7F\2\2\u01fc\u01fd\7G\2\2\u01fdK\3\2\2"+
		"\2\u01fe\u01ff\7H\2\2\u01ff\u0200\7K\2\2\u0200\u0201\7N\2\2\u0201\u0202"+
		"\7G\2\2\u0202\u0203\7P\2\2\u0203\u0204\7C\2\2\u0204\u0205\7O\2\2\u0205"+
		"\u0206\7G\2\2\u0206M\3\2\2\2\u0207\u0208\7\60\2\2\u0208\u0209\7Q\2\2\u0209"+
		"\u020a\7R\2\2\u020a\u020b\7V\2\2\u020b\u020c\7K\2\2\u020c\u020d\7Q\2\2"+
		"\u020d\u020e\7P\2\2\u020e\u020f\7U\2\2\u020fO\3\2\2\2\u0210\u0211\7V\2"+
		"\2\u0211\u0212\7T\2\2\u0212\u0213\7C\2\2\u0213\u0214\7P\2\2\u0214Q\3\2"+
		"\2\2\u0215\u0216\7X\2\2\u0216S\3\2\2\2\u0217\u0218\13\2\2\2\u0218U\3\2"+
		"\2\2\u0219\u021b\n\6\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\b#"+
		"\3\2\u021fW\3\2\2\2\u0220\u0221\5\u016e\u00af\2\u0221\u0222\b$\4\2\u0222"+
		"Y\3\2\2\2\u0223\u0224\13\2\2\2\u0224\u0225\b%\5\2\u0225[\3\2\2\2\u0226"+
		"\u0227\6&\2\2\u0227\u022b\7,\2\2\u0228\u022a\n\6\2\2\u0229\u0228\3\2\2"+
		"\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f\b&\6\2\u022f]\3\2\2\2\u0230\u0234"+
		"\7&\2\2\u0231\u0233\n\6\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2"+
		"\2\2\u0237\u0238\b\'\7\2\u0238_\3\2\2\2\u0239\u023a\5\u0178\u00b4\2\u023a"+
		"\u023b\b(\b\2\u023ba\3\2\2\2\u023c\u023e\t\4\2\2\u023d\u023f\5\u016c\u00ae"+
		"\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\b)\t\2\u0243c\3\2\2\2\u0244\u0246"+
		"\t\7\2\2\u0245\u0247\5\u016c\u00ae\2\u0246\u0245\3\2\2\2\u0247\u0248\3"+
		"\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\b*\n\2\u024be\3\2\2\2\u024c\u024e\t\b\2\2\u024d\u024f\5\u016c\u00ae"+
		"\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251"+
		"\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\b+\13\2\u0253g\3\2\2\2\u0254"+
		"\u0256\t\t\2\2\u0255\u0257\5\u016c\u00ae\2\u0256\u0255\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025b\b,\f\2\u025bi\3\2\2\2\u025c\u025e\t\n\2\2\u025d\u025f\5\u016c\u00ae"+
		"\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\b-\r\2\u0263k\3\2\2\2\u0264\u0266"+
		"\t\13\2\2\u0265\u0267\5\u016c\u00ae\2\u0266\u0265\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\b.\16\2\u026bm\3\2\2\2\u026c\u026e\t\f\2\2\u026d\u026f\5\u016c"+
		"\u00ae\2\u026e\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\b/\17\2\u0273o\3\2\2\2"+
		"\u0274\u0276\t\r\2\2\u0275\u0277\5\u016c\u00ae\2\u0276\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2"+
		"\2\2\u027a\u027b\b\60\20\2\u027bq\3\2\2\2\u027c\u027e\t\16\2\2\u027d\u027f"+
		"\5\u016c\u00ae\2\u027e\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u027e\3"+
		"\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\b\61\21\2\u0283"+
		"s\3\2\2\2\u0284\u0286\t\17\2\2\u0285\u0287\5\u016c\u00ae\2\u0286\u0285"+
		"\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028b\b\62\22\2\u028bu\3\2\2\2\u028c\u028e\t\20\2"+
		"\2\u028d\u028f\5\u016c\u00ae\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2"+
		"\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293"+
		"\b\63\23\2\u0293w\3\2\2\2\u0294\u0296\t\21\2\2\u0295\u0297\5\u016c\u00ae"+
		"\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\b\64\24\2\u029by\3\2\2\2\u029c"+
		"\u029e\t\22\2\2\u029d\u029f\5\u016c\u00ae\2\u029e\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a3\b\65\25\2\u02a3{\3\2\2\2\u02a4\u02a6\t\23\2\2\u02a5\u02a7"+
		"\5\u016c\u00ae\2\u02a6\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6\3"+
		"\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\b\66\26\2\u02ab"+
		"}\3\2\2\2\u02ac\u02ae\t\24\2\2\u02ad\u02af\5\u016c\u00ae\2\u02ae\u02ad"+
		"\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\b\67\27\2\u02b3\177\3\2\2\2\u02b4\u02b6\t\25"+
		"\2\2\u02b5\u02b7\5\u016c\u00ae\2\u02b6\u02b5\3\2\2\2\u02b7\u02b8\3\2\2"+
		"\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb"+
		"\b8\30\2\u02bb\u0081\3\2\2\2\u02bc\u02be\t\26\2\2\u02bd\u02bf\5\u016c"+
		"\u00ae\2\u02be\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\b9\31\2\u02c3\u0083\3\2"+
		"\2\2\u02c4\u02c6\t\27\2\2\u02c5\u02c7\5\u016c\u00ae\2\u02c6\u02c5\3\2"+
		"\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cb\b:\32\2\u02cb\u0085\3\2\2\2\u02cc\u02ce\t\30"+
		"\2\2\u02cd\u02cf\5\u016c\u00ae\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2"+
		"\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3"+
		"\b;\33\2\u02d3\u0087\3\2\2\2\u02d4\u02d6\t\31\2\2\u02d5\u02d7\5\u016c"+
		"\u00ae\2\u02d6\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\b<\34\2\u02db\u0089\3\2"+
		"\2\2\u02dc\u02de\t\32\2\2\u02dd\u02df\5\u016c\u00ae\2\u02de\u02dd\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u02e3\b=\35\2\u02e3\u008b\3\2\2\2\u02e4\u02e6\t\33"+
		"\2\2\u02e5\u02e7\5\u016c\u00ae\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2"+
		"\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb"+
		"\b>\36\2\u02eb\u008d\3\2\2\2\u02ec\u02ed\5\u0174\u00b2\2\u02ed\u02ee\b"+
		"?\37\2\u02ee\u008f\3\2\2\2\u02ef\u02f0\5\u0176\u00b3\2\u02f0\u02f1\b@"+
		" \2\u02f1\u0091\3\2\2\2\u02f2\u02f4\t\34\2\2\u02f3\u02f5\5\u016c\u00ae"+
		"\2\u02f4\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\bA!\2\u02f9\u0093\3\2\2\2\u02fa"+
		"\u02fb\5\u017a\u00b5\2\u02fb\u02fc\bB\"\2\u02fc\u0095\3\2\2\2\u02fd\u02fe"+
		"\5\u017c\u00b6\2\u02fe\u02ff\bC#\2\u02ff\u0097\3\2\2\2\u0300\u0302\5\u016c"+
		"\u00ae\2\u0301\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0301\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\bD$\2\u0306\u0099\3\2\2"+
		"\2\u0307\u0308\5\u0170\u00b0\2\u0308\u0309\bE%\2\u0309\u009b\3\2\2\2\u030a"+
		"\u030b\5\u016e\u00af\2\u030b\u030c\bF&\2\u030c\u009d\3\2\2\2\u030d\u030e"+
		"\13\2\2\2\u030e\u030f\bG\'\2\u030f\u009f\3\2\2\2\u0310\u0312\5\u016c\u00ae"+
		"\2\u0311\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\bH(\2\u0316\u00a1\3\2\2\2\u0317"+
		"\u0318\5\u0170\u00b0\2\u0318\u0319\bI)\2\u0319\u00a3\3\2\2\2\u031a\u031b"+
		"\5\u016e\u00af\2\u031b\u031c\bJ*\2\u031c\u00a5\3\2\2\2\u031d\u0321\7&"+
		"\2\2\u031e\u0320\n\6\2\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0324\u0325\bK+\2\u0325\u00a7\3\2\2\2\u0326\u0327\13\2\2\2\u0327"+
		"\u0328\bL,\2\u0328\u00a9\3\2\2\2\u0329\u032b\n\35\2\2\u032a\u0329\3\2"+
		"\2\2\u032b\u032c\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u032f\bM-\2\u032f\u00ab\3\2\2\2\u0330\u0331\5\u016e"+
		"\u00af\2\u0331\u0332\bN.\2\u0332\u00ad\3\2\2\2\u0333\u0335\5\u016c\u00ae"+
		"\2\u0334\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\bO/\2\u0339\u00af\3\2\2\2\u033a"+
		"\u033b\5\u0172\u00b1\2\u033b\u033c\bP\60\2\u033c\u00b1\3\2\2\2\u033d\u033e"+
		"\7.\2\2\u033e\u033f\bQ\61\2\u033f\u00b3\3\2\2\2\u0340\u0341\7?\2\2\u0341"+
		"\u0342\bR\62\2\u0342\u00b5\3\2\2\2\u0343\u0344\7*\2\2\u0344\u0345\bS\63"+
		"\2\u0345\u00b7\3\2\2\2\u0346\u0347\7+\2\2\u0347\u0348\bT\64\2\u0348\u00b9"+
		"\3\2\2\2\u0349\u034a\5\u0170\u00b0\2\u034a\u034b\bU\65\2\u034b\u00bb\3"+
		"\2\2\2\u034c\u034d\5\u016e\u00af\2\u034d\u034e\bV\66\2\u034e\u00bd\3\2"+
		"\2\2\u034f\u0353\7&\2\2\u0350\u0352\n\6\2\2\u0351\u0350\3\2\2\2\u0352"+
		"\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2"+
		"\2\2\u0355\u0353\3\2\2\2\u0356\u0357\bW\67\2\u0357\u00bf\3\2\2\2\u0358"+
		"\u0359\13\2\2\2\u0359\u035a\bX8\2\u035a\u00c1\3\2\2\2\u035b\u035d\5\u016c"+
		"\u00ae\2\u035c\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035c\3\2\2\2\u035e"+
		"\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\bY9\2\u0361\u00c3\3\2\2"+
		"\2\u0362\u0363\5\u0172\u00b1\2\u0363\u0364\bZ:\2\u0364\u00c5\3\2\2\2\u0365"+
		"\u0366\7.\2\2\u0366\u0367\b[;\2\u0367\u00c7\3\2\2\2\u0368\u0369\7?\2\2"+
		"\u0369\u036a\b\\<\2\u036a\u00c9\3\2\2\2\u036b\u036c\7*\2\2\u036c\u036d"+
		"\b]=\2\u036d\u00cb\3\2\2\2\u036e\u036f\7+\2\2\u036f\u0370\b^>\2\u0370"+
		"\u00cd\3\2\2\2\u0371\u0372\5\u0170\u00b0\2\u0372\u0373\b_?\2\u0373\u00cf"+
		"\3\2\2\2\u0374\u0375\5\u016e\u00af\2\u0375\u0376\b`@\2\u0376\u00d1\3\2"+
		"\2\2\u0377\u037b\7&\2\2\u0378\u037a\n\6\2\2\u0379\u0378\3\2\2\2\u037a"+
		"\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2"+
		"\2\2\u037d\u037b\3\2\2\2\u037e\u037f\baA\2\u037f\u00d3\3\2\2\2\u0380\u0381"+
		"\13\2\2\2\u0381\u0382\bbB\2\u0382\u00d5\3\2\2\2\u0383\u0385\5\u016c\u00ae"+
		"\2\u0384\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387"+
		"\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\bcC\2\u0389\u00d7\3\2\2\2\u038a"+
		"\u038b\5\u0172\u00b1\2\u038b\u038c\bdD\2\u038c\u00d9\3\2\2\2\u038d\u038e"+
		"\7.\2\2\u038e\u038f\beE\2\u038f\u00db\3\2\2\2\u0390\u0391\7?\2\2\u0391"+
		"\u0392\bfF\2\u0392\u00dd\3\2\2\2\u0393\u0394\7*\2\2\u0394\u0395\bgG\2"+
		"\u0395\u00df\3\2\2\2\u0396\u0397\7+\2\2\u0397\u0398\bhH\2\u0398\u00e1"+
		"\3\2\2\2\u0399\u039a\5\u0170\u00b0\2\u039a\u039b\biI\2\u039b\u00e3\3\2"+
		"\2\2\u039c\u039d\5\u016e\u00af\2\u039d\u039e\bjJ\2\u039e\u00e5\3\2\2\2"+
		"\u039f\u03a3\7&\2\2\u03a0\u03a2\n\6\2\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5"+
		"\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5"+
		"\u03a3\3\2\2\2\u03a6\u03a7\bkK\2\u03a7\u00e7\3\2\2\2\u03a8\u03a9\13\2"+
		"\2\2\u03a9\u03aa\blL\2\u03aa\u00e9\3\2\2\2\u03ab\u03ad\5\u016c\u00ae\2"+
		"\u03ac\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af"+
		"\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\bmM\2\u03b1\u00eb\3\2\2\2\u03b2"+
		"\u03b3\5\u0172\u00b1\2\u03b3\u03b4\bnN\2\u03b4\u00ed\3\2\2\2\u03b5\u03b6"+
		"\7.\2\2\u03b6\u03b7\boO\2\u03b7\u00ef\3\2\2\2\u03b8\u03b9\7?\2\2\u03b9"+
		"\u03ba\bpP\2\u03ba\u00f1\3\2\2\2\u03bb\u03bc\7*\2\2\u03bc\u03bd\bqQ\2"+
		"\u03bd\u00f3\3\2\2\2\u03be\u03bf\7+\2\2\u03bf\u03c0\brR\2\u03c0\u00f5"+
		"\3\2\2\2\u03c1\u03c2\5\u0170\u00b0\2\u03c2\u03c3\bsS\2\u03c3\u00f7\3\2"+
		"\2\2\u03c4\u03c5\5\u016e\u00af\2\u03c5\u03c6\btT\2\u03c6\u00f9\3\2\2\2"+
		"\u03c7\u03cb\7&\2\2\u03c8\u03ca\n\6\2\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd"+
		"\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd"+
		"\u03cb\3\2\2\2\u03ce\u03cf\buU\2\u03cf\u00fb\3\2\2\2\u03d0\u03d1\13\2"+
		"\2\2\u03d1\u03d2\bvV\2\u03d2\u00fd\3\2\2\2\u03d3\u03d5\5\u016c\u00ae\2"+
		"\u03d4\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7"+
		"\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\bwW\2\u03d9\u00ff\3\2\2\2\u03da"+
		"\u03db\7?\2\2\u03db\u03dc\bxX\2\u03dc\u0101\3\2\2\2\u03dd\u03de\5\u0170"+
		"\u00b0\2\u03de\u03df\byY\2\u03df\u0103\3\2\2\2\u03e0\u03e1\5\u016e\u00af"+
		"\2\u03e1\u03e2\bzZ\2\u03e2\u0105\3\2\2\2\u03e3\u03e7\7&\2\2\u03e4\u03e6"+
		"\n\6\2\2\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7"+
		"\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\b{"+
		"[\2\u03eb\u0107\3\2\2\2\u03ec\u03ed\13\2\2\2\u03ed\u03ee\b|\\\2\u03ee"+
		"\u0109\3\2\2\2\u03ef\u03f1\5\u016c\u00ae\2\u03f0\u03ef\3\2\2\2\u03f1\u03f2"+
		"\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f5\b}]\2\u03f5\u010b\3\2\2\2\u03f6\u03f7\5\u0170\u00b0\2\u03f7\u03f8"+
		"\b~^\2\u03f8\u010d\3\2\2\2\u03f9\u03fa\5\u016e\u00af\2\u03fa\u03fb\b\177"+
		"_\2\u03fb\u010f\3\2\2\2\u03fc\u0400\7&\2\2\u03fd\u03ff\n\6\2\2\u03fe\u03fd"+
		"\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0404\b\u0080`\2\u0404\u0111"+
		"\3\2\2\2\u0405\u0406\13\2\2\2\u0406\u0407\b\u0081a\2\u0407\u0113\3\2\2"+
		"\2\u0408\u040a\5\u016c\u00ae\2\u0409\u0408\3\2\2\2\u040a\u040b\3\2\2\2"+
		"\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e"+
		"\b\u0082b\2\u040e\u0115\3\2\2\2\u040f\u0410\7?\2\2\u0410\u0411\b\u0083"+
		"c\2\u0411\u0117\3\2\2\2\u0412\u0413\5\u0170\u00b0\2\u0413\u0414\b\u0084"+
		"d\2\u0414\u0119\3\2\2\2\u0415\u0416\5\u016e\u00af\2\u0416\u0417\b\u0085"+
		"e\2\u0417\u011b\3\2\2\2\u0418\u041c\7&\2\2\u0419\u041b\n\6\2\2\u041a\u0419"+
		"\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u041f\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0420\b\u0086f\2\u0420\u011d"+
		"\3\2\2\2\u0421\u0422\13\2\2\2\u0422\u0423\b\u0087g\2\u0423\u011f\3\2\2"+
		"\2\u0424\u0425\7*\2\2\u0425\u0426\b\u0088h\2\u0426\u0121\3\2\2\2\u0427"+
		"\u0428\7+\2\2\u0428\u0429\b\u0089i\2\u0429\u0123\3\2\2\2\u042a\u042c\5"+
		"\u016c\u00ae\2\u042b\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042b\3\2"+
		"\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\b\u008aj\2\u0430"+
		"\u0125\3\2\2\2\u0431\u0432\5\u0170\u00b0\2\u0432\u0433\b\u008bk\2\u0433"+
		"\u0127\3\2\2\2\u0434\u0435\5\u016e\u00af\2\u0435\u0436\b\u008cl\2\u0436"+
		"\u0129\3\2\2\2\u0437\u043b\7&\2\2\u0438\u043a\n\6\2\2\u0439\u0438\3\2"+
		"\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043e\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u043f\b\u008dm\2\u043f\u012b"+
		"\3\2\2\2\u0440\u0441\13\2\2\2\u0441\u0442\b\u008en\2\u0442\u012d\3\2\2"+
		"\2\u0443\u0446\5\u016c\u00ae\2\u0444\u0446\7\'\2\2\u0445\u0443\3\2\2\2"+
		"\u0445\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448"+
		"\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\b\u008fo\2\u044a\u012f\3\2\2"+
		"\2\u044b\u044c\7*\2\2\u044c\u044d\b\u0090p\2\u044d\u0131\3\2\2\2\u044e"+
		"\u044f\7+\2\2\u044f\u0450\b\u0091q\2\u0450\u0133\3\2\2\2\u0451\u0452\7"+
		"]\2\2\u0452\u0453\b\u0092r\2\u0453\u0135\3\2\2\2\u0454\u0455\7_\2\2\u0455"+
		"\u0456\b\u0093s\2\u0456\u0137\3\2\2\2\u0457\u0458\5\u0170\u00b0\2\u0458"+
		"\u0459\b\u0094t\2\u0459\u0139\3\2\2\2\u045a\u045b\5\u016e\u00af\2\u045b"+
		"\u045c\b\u0095u\2\u045c\u013b\3\2\2\2\u045d\u0461\7&\2\2\u045e\u0460\n"+
		"\6\2\2\u045f\u045e\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u0465\b\u0096"+
		"v\2\u0465\u013d\3\2\2\2\u0466\u0467\13\2\2\2\u0467\u0468\b\u0097w\2\u0468"+
		"\u013f\3\2\2\2\u0469\u046b\5\u016c\u00ae\2\u046a\u0469\3\2\2\2\u046b\u046c"+
		"\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u046f\b\u0098x\2\u046f\u0141\3\2\2\2\u0470\u0471\5\u0170\u00b0\2\u0471"+
		"\u0472\b\u0099y\2\u0472\u0143\3\2\2\2\u0473\u0474\5\u016e\u00af\2\u0474"+
		"\u0475\b\u009az\2\u0475\u0145\3\2\2\2\u0476\u047a\7&\2\2\u0477\u0479\n"+
		"\6\2\2\u0478\u0477\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e\b\u009b"+
		"{\2\u047e\u0147\3\2\2\2\u047f\u0480\13\2\2\2\u0480\u0481\b\u009c|\2\u0481"+
		"\u0149\3\2\2\2\u0482\u0484\5\u016c\u00ae\2\u0483\u0482\3\2\2\2\u0484\u0485"+
		"\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0488\b\u009d}\2\u0488\u014b\3\2\2\2\u0489\u048a\5\u0170\u00b0\2\u048a"+
		"\u048b\b\u009e~\2\u048b\u014d\3\2\2\2\u048c\u048d\5\u016e\u00af\2\u048d"+
		"\u048e\b\u009f\177\2\u048e\u014f\3\2\2\2\u048f\u0493\7&\2\2\u0490\u0492"+
		"\n\6\2\2\u0491\u0490\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u0497\b\u00a0"+
		"\u0080\2\u0497\u0151\3\2\2\2\u0498\u0499\13\2\2\2\u0499\u049a\b\u00a1"+
		"\u0081\2\u049a\u0153\3\2\2\2\u049b\u049d\5\u016c\u00ae\2\u049c\u049b\3"+
		"\2\2\2\u049d\u049e\3\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f"+
		"\u04a0\3\2\2\2\u04a0\u04a1\b\u00a2\u0082\2\u04a1\u0155\3\2\2\2\u04a2\u04a3"+
		"\7*\2\2\u04a3\u04a4\b\u00a3\u0083\2\u04a4\u0157\3\2\2\2\u04a5\u04a6\7"+
		"+\2\2\u04a6\u04a7\b\u00a4\u0084\2\u04a7\u0159\3\2\2\2\u04a8\u04a9\7.\2"+
		"\2\u04a9\u04aa\b\u00a5\u0085\2\u04aa\u015b\3\2\2\2\u04ab\u04ac\5\u0170"+
		"\u00b0\2\u04ac\u04ad\b\u00a6\u0086\2\u04ad\u015d\3\2\2\2\u04ae\u04af\5"+
		"\u016e\u00af\2\u04af\u04b0\b\u00a7\u0087\2\u04b0\u015f\3\2\2\2\u04b1\u04b5"+
		"\7&\2\2\u04b2\u04b4\n\6\2\2\u04b3\u04b2\3\2\2\2\u04b4\u04b7\3\2\2\2\u04b5"+
		"\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7\u04b5\3\2"+
		"\2\2\u04b8\u04b9\b\u00a8\u0088\2\u04b9\u0161\3\2\2\2\u04ba\u04bb\13\2"+
		"\2\2\u04bb\u04bc\b\u00a9\u0089\2\u04bc\u0163\3\2\2\2\u04bd\u04bf\5\u0170"+
		"\u00b0\2\u04be\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04be\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\b\u00aa\u008a\2\u04c3\u0165"+
		"\3\2\2\2\u04c4\u04c5\5\u016e\u00af\2\u04c5\u04c6\b\u00ab\u008b\2\u04c6"+
		"\u0167\3\2\2\2\u04c7\u04c9\6\u00ac\3\2\u04c8\u04ca\n\6\2\2\u04c9\u04c8"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc"+
		"\u04cd\3\2\2\2\u04cd\u04ce\b\u00ac\u008c\2\u04ce\u0169\3\2\2\2\u04cf\u04d0"+
		"\13\2\2\2\u04d0\u04d1\b\u00ad\u008d\2\u04d1\u016b\3\2\2\2\u04d2\u04d3"+
		"\t\36\2\2\u04d3\u016d\3\2\2\2\u04d4\u04d6\7\17\2\2\u04d5\u04d4\3\2\2\2"+
		"\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\7\f\2\2\u04d8\u016f"+
		"\3\2\2\2\u04d9\u04de\t\5\2\2\u04da\u04db\5\u016e\u00af\2\u04db\u04dc\7"+
		"-\2\2\u04dc\u04de\3\2\2\2\u04dd\u04d9\3\2\2\2\u04dd\u04da\3\2\2\2\u04de"+
		"\u0171\3\2\2\2\u04df\u04e3\7)\2\2\u04e0\u04e2\n\37\2\2\u04e1\u04e0\3\2"+
		"\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"\u04e6\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u04e7\7)\2\2\u04e7\u0173\3\2"+
		"\2\2\u04e8\u04e9\7\60\2\2\u04e9\u04ea\t\n\2\2\u04ea\u04eb\t\25\2\2\u04eb"+
		"\u04ec\t \2\2\u04ec\u04ed\t\7\2\2\u04ed\u04ee\t\b\2\2\u04ee\u04ef\t\23"+
		"\2\2\u04ef\u0175\3\2\2\2\u04f0\u04f1\7\60\2\2\u04f1\u04f2\t\16\2\2\u04f2"+
		"\u04f3\t!\2\2\u04f3\u04f4\t\27\2\2\u04f4\u04f5\t\n\2\2\u04f5\u0177\3\2"+
		"\2\2\u04f6\u04f7\7\60\2\2\u04f7\u04f8\t\33\2\2\u04f8\u04f9\t\24\2\2\u04f9"+
		"\u04fa\t\27\2\2\u04fa\u04fb\t\16\2\2\u04fb\u04fc\t\t\2\2\u04fc\u0179\3"+
		"\2\2\2\u04fd\u04fe\7\60\2\2\u04fe\u04ff\t\23\2\2\u04ff\u0500\t\4\2\2\u0500"+
		"\u0501\t\22\2\2\u0501\u0502\t!\2\2\u0502\u017b\3\2\2\2\u0503\u0504\7\60"+
		"\2\2\u0504\u0505\t\"\2\2\u0505\u0506\t\4\2\2\u0506\u0507\t\r\2\2\u0507"+
		"\u0508\t!\2\2\u0508\u0509\t\23\2\2\u0509\u017d\3\2\2\2V\2\3\4\5\6\7\b"+
		"\t\n\13\f\r\16\17\20\21\22\23\u0181\u0186\u018b\u0193\u01a2\u01af\u021c"+
		"\u022b\u0234\u0240\u0248\u0250\u0258\u0260\u0268\u0270\u0278\u0280\u0288"+
		"\u0290\u0298\u02a0\u02a8\u02b0\u02b8\u02c0\u02c8\u02d0\u02d8\u02e0\u02e8"+
		"\u02f6\u0303\u0313\u0321\u032c\u0336\u0353\u035e\u037b\u0386\u03a3\u03ae"+
		"\u03cb\u03d6\u03e7\u03f2\u0400\u040b\u041c\u042d\u043b\u0445\u0447\u0461"+
		"\u046c\u047a\u0485\u0493\u049e\u04b5\u04c0\u04cb\u04d5\u04dd\u04e3\u008e"+
		"\2\3\2\3#\2\3$\3\3%\4\3&\5\3\'\6\3(\7\3)\b\3*\t\3+\n\3,\13\3-\f\3.\r\3"+
		"/\16\3\60\17\3\61\20\3\62\21\3\63\22\3\64\23\3\65\24\3\66\25\3\67\26\3"+
		"8\27\39\30\3:\31\3;\32\3<\33\3=\34\3>\35\3?\36\3@\37\3A \3B!\3C\"\3D#"+
		"\3E$\3F%\3G&\3H\'\3I(\3J)\3K*\3L+\3M,\3N-\3O.\3P/\3Q\60\3R\61\3S\62\3"+
		"T\63\3U\64\3V\65\3W\66\3X\67\3Y8\3Z9\3[:\3\\;\3]<\3^=\3_>\3`?\3a@\3bA"+
		"\3cB\3dC\3eD\3fE\3gF\3hG\3iH\3jI\3kJ\3lK\3mL\3nM\3oN\3pO\3qP\3rQ\3sR\3"+
		"tS\3uT\3vU\3wV\3xW\3yX\3zY\3{Z\3|[\3}\\\3~]\3\177^\3\u0080_\3\u0081`\3"+
		"\u0082a\3\u0083b\3\u0084c\3\u0085d\3\u0086e\3\u0087f\3\u0088g\3\u0089"+
		"h\3\u008ai\3\u008bj\3\u008ck\3\u008dl\3\u008em\3\u008fn\3\u0090o\3\u0091"+
		"p\3\u0092q\3\u0093r\3\u0094s\3\u0095t\3\u0096u\3\u0097v\3\u0098w\3\u0099"+
		"x\3\u009ay\3\u009bz\3\u009c{\3\u009d|\3\u009e}\3\u009f~\3\u00a0\177\3"+
		"\u00a1\u0080\3\u00a2\u0081\3\u00a3\u0082\3\u00a4\u0083\3\u00a5\u0084\3"+
		"\u00a6\u0085\3\u00a7\u0086\3\u00a8\u0087\3\u00a9\u0088\3\u00aa\u0089\3"+
		"\u00ab\u008a\3\u00ac\u008b\3\u00ad\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}