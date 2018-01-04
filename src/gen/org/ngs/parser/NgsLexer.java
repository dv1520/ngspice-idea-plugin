// Generated from /home/src/jetbrains-plugin-sample/src/grammars/org/ngs/parser/NgsLexer.g4 by ANTLR 4.7
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
		POLY=25, COMMENT=26, XA_NODE_TYPE=27, INCLUDE=28, FILENAME=29, OPTION=30, 
		PLOT_TYPE=31, PLOT_POINT_TYPE=32, BC=33, COMMENT_FIRSTLINEZ999=34, NL_Z999=35, 
		BC_Z999=36, COMMENT_LS_Z01=37, COMMENT_EOL_Z01=38, H_MODEL=39, H_R=40, 
		H_C=41, H_K=42, H_L=43, H_S=44, H_W=45, H_V=46, H_I=47, H_E=48, H_G=49, 
		H_F=50, H_H=51, H_A=52, H_T=53, H_O=54, H_U=55, H_Y=56, H_D=57, H_Q=58, 
		H_J=59, H_Z=60, H_M=61, H_SUBCKT=62, H_SUBCKT_TAIL=63, H_X=64, TRAN=65, 
		PRINT=66, VAL01=67, WS_Z01=68, NL_Z01=69, BC_Z01=70, VL=71, WS_Z00=72, 
		NL_Z00=73, COMMENT_EOL_Z00=74, BC_Z00=75, VAL_Z10=76, EXPR_Z10=77, COMMA_Z10=78, 
		EQ_Z10=79, PAR_L10=80, PAR_R10=81, WS_Z10=82, NL_Z10=83, COMMENT_EOL_Z10=84, 
		BC_Z10=85, VAL_Z11=86, EXPR_Z11=87, COMMA_Z11=88, EQ_Z11=89, PAR_L11=90, 
		PAR_R11=91, WS_Z11=92, NL_Z11=93, COMMENT_EOL_Z11=94, BC_Z11=95, VAL_Z12=96, 
		EXPR_Z12=97, COMMA_Z12=98, EQ_Z12=99, PAR_L12=100, PAR_R12=101, WS_Z12=102, 
		NL_Z12=103, COMMENT_EOL_Z12=104, BC_Z12=105, VAL_Z13=106, EXPR_Z13=107, 
		COMMA_Z13=108, EQ_Z13=109, PAR_L13=110, PAR_R13=111, WS_Z13=112, NL_Z13=113, 
		COMMENT_EOL_Z13=114, BC_Z13=115, VAL_Z20=116, EQ_Z20=117, WS_Z20=118, 
		NL_Z20=119, COMMENT_EOL_Z20=120, BC_Z20=121, VAL_Z30=122, WS_Z30=123, 
		NL_Z30=124, COMMENT_EOL_Z30=125, BC_Z30=126, VAL_Z40=127, EQ_Z40=128, 
		WS_Z40=129, NL_Z40=130, COMMENT_EOL_Z40=131, BC_Z40=132, PAR_L50=133, 
		PAR_R50=134, VAL_Z50=135, WS_Z50=136, NL_Z50=137, COMMENT_EOL_Z50=138, 
		BC_Z50=139, VAL_Z60=140, PAR_L60=141, PAR_R60=142, BR_L60=143, BR_R60=144, 
		WS_Z60=145, NL_Z60=146, COMMENT_EOL_Z60=147, BC_Z60=148, VAL_Z70=149, 
		WS_Z70=150, NL_Z70=151, COMMENT_EOL_Z70=152, BC_Z70=153, VAL_Z80=154, 
		WS_Z80=155, NL_Z80=156, COMMENT_EOL_Z80=157, BC_Z80=158, VAL_Z90=159, 
		PAR_L90=160, PAR_R90=161, COMMA_Z90=162, WS_Z90=163, NL_Z90=164, COMMENT_EOL_Z90=165, 
		BC_Z90=166, WS_Z100=167, NL_Z100=168, FILENAME_Z100=169, BC_Z100=170;
	public static final int
		M_FIRSTLINE=1, M_DEFAULT=2, M_NODE=3, M_KV=4, M_SRC_KV=5, M_R_KV=6, M_MODEL_KV=7, 
		M_SUBCKT_HEAD=8, M_SUBCKT_TAIL=9, M_X=10, M_SRC_DEP=11, M_XSPICE_A=12, 
		M_W_SRC=13, M_Q_TRANSISTOR=14, M_PLOT=15, M_INCLUDE_SPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "M_FIRSTLINE", "M_DEFAULT", "M_NODE", "M_KV", "M_SRC_KV", 
		"M_R_KV", "M_MODEL_KV", "M_SUBCKT_HEAD", "M_SUBCKT_TAIL", "M_X", "M_SRC_DEP", 
		"M_XSPICE_A", "M_W_SRC", "M_Q_TRANSISTOR", "M_PLOT", "M_INCLUDE_SPACE"
	};

	public static final String[] ruleNames = {
		"NODE", "VAL", "KV_KEY", "COMMA", "HEAD_R", "WS", "NEWLINE", "EQ", "EXPR", 
		"SUBCKT_NAME", "PAR_L", "PAR_R", "BR_L", "BR_R", "MODEL_NAME", "PULSE", 
		"SIN", "EXP", "PWL", "SFFM", "AM", "TRNOISE", "TRRANDOM", "EXTERNAL", 
		"POLY", "COMMENT", "XA_NODE_TYPE", "INCLUDE", "FILENAME", "OPTION", "PLOT_TYPE", 
		"PLOT_POINT_TYPE", "BC", "COMMENT_FIRSTLINEZ999", "NL_Z999", "BC_Z999", 
		"COMMENT_LS_Z01", "COMMENT_EOL_Z01", "H_MODEL", "H_R", "H_C", "H_K", "H_L", 
		"H_S", "H_W", "H_V", "H_I", "H_E", "H_G", "H_F", "H_H", "H_A", "H_T", 
		"H_O", "H_U", "H_Y", "H_D", "H_Q", "H_J", "H_Z", "H_M", "H_SUBCKT", "H_SUBCKT_TAIL", 
		"H_X", "TRAN", "PRINT", "VAL01", "WS_Z01", "NL_Z01", "BC_Z01", "VL", "WS_Z00", 
		"NL_Z00", "COMMENT_EOL_Z00", "BC_Z00", "VAL_Z10", "EXPR_Z10", "COMMA_Z10", 
		"EQ_Z10", "PAR_L10", "PAR_R10", "WS_Z10", "NL_Z10", "COMMENT_EOL_Z10", 
		"BC_Z10", "VAL_Z11", "EXPR_Z11", "COMMA_Z11", "EQ_Z11", "PAR_L11", "PAR_R11", 
		"WS_Z11", "NL_Z11", "COMMENT_EOL_Z11", "BC_Z11", "VAL_Z12", "EXPR_Z12", 
		"COMMA_Z12", "EQ_Z12", "PAR_L12", "PAR_R12", "WS_Z12", "NL_Z12", "COMMENT_EOL_Z12", 
		"BC_Z12", "VAL_Z13", "EXPR_Z13", "COMMA_Z13", "EQ_Z13", "PAR_L13", "PAR_R13", 
		"WS_Z13", "NL_Z13", "COMMENT_EOL_Z13", "BC_Z13", "VAL_Z20", "EQ_Z20", 
		"WS_Z20", "NL_Z20", "COMMENT_EOL_Z20", "BC_Z20", "VAL_Z30", "WS_Z30", 
		"NL_Z30", "COMMENT_EOL_Z30", "BC_Z30", "VAL_Z40", "EQ_Z40", "WS_Z40", 
		"NL_Z40", "COMMENT_EOL_Z40", "BC_Z40", "PAR_L50", "PAR_R50", "VAL_Z50", 
		"WS_Z50", "NL_Z50", "COMMENT_EOL_Z50", "BC_Z50", "VAL_Z60", "PAR_L60", 
		"PAR_R60", "BR_L60", "BR_R60", "WS_Z60", "NL_Z60", "COMMENT_EOL_Z60", 
		"BC_Z60", "VAL_Z70", "WS_Z70", "NL_Z70", "COMMENT_EOL_Z70", "BC_Z70", 
		"VAL_Z80", "WS_Z80", "NL_Z80", "COMMENT_EOL_Z80", "BC_Z80", "VAL_Z90", 
		"PAR_L90", "PAR_R90", "COMMA_Z90", "WS_Z90", "NL_Z90", "COMMENT_EOL_Z90", 
		"BC_Z90", "WS_Z100", "NL_Z100", "FILENAME_Z100", "BC_Z100", "F_VAL", "F_NL", 
		"F_WS", "F_EXPR", "F_SUBCKT", "F_SUBCKT_TAIL", "F_H_MODEL", "F_TRAN", 
		"F_PRINT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'PULSE'", "'SIN'", "'EXP'", "'PWL'", "'SFFM'", 
		"'AM'", "'TRNOISE'", "'TRRANDOM'", "'EXTERNAL'", "'POLY'", "'COMMENT'", 
		"'%v'", "'.INCLUDE'", "'FILENAME'", "'.OPTION'", "'TRAN'", "'V'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NODE", "VAL", "KV_KEY", "COMMA", "HEAD_R", "WS", "NEWLINE", "EQ", 
		"EXPR", "SUBCKT_NAME", "PAR_L", "PAR_R", "BR_L", "BR_R", "MODEL_NAME", 
		"PULSE", "SIN", "EXP", "PWL", "SFFM", "AM", "TRNOISE", "TRRANDOM", "EXTERNAL", 
		"POLY", "COMMENT", "XA_NODE_TYPE", "INCLUDE", "FILENAME", "OPTION", "PLOT_TYPE", 
		"PLOT_POINT_TYPE", "BC", "COMMENT_FIRSTLINEZ999", "NL_Z999", "BC_Z999", 
		"COMMENT_LS_Z01", "COMMENT_EOL_Z01", "H_MODEL", "H_R", "H_C", "H_K", "H_L", 
		"H_S", "H_W", "H_V", "H_I", "H_E", "H_G", "H_F", "H_H", "H_A", "H_T", 
		"H_O", "H_U", "H_Y", "H_D", "H_Q", "H_J", "H_Z", "H_M", "H_SUBCKT", "H_SUBCKT_TAIL", 
		"H_X", "TRAN", "PRINT", "VAL01", "WS_Z01", "NL_Z01", "BC_Z01", "VL", "WS_Z00", 
		"NL_Z00", "COMMENT_EOL_Z00", "BC_Z00", "VAL_Z10", "EXPR_Z10", "COMMA_Z10", 
		"EQ_Z10", "PAR_L10", "PAR_R10", "WS_Z10", "NL_Z10", "COMMENT_EOL_Z10", 
		"BC_Z10", "VAL_Z11", "EXPR_Z11", "COMMA_Z11", "EQ_Z11", "PAR_L11", "PAR_R11", 
		"WS_Z11", "NL_Z11", "COMMENT_EOL_Z11", "BC_Z11", "VAL_Z12", "EXPR_Z12", 
		"COMMA_Z12", "EQ_Z12", "PAR_L12", "PAR_R12", "WS_Z12", "NL_Z12", "COMMENT_EOL_Z12", 
		"BC_Z12", "VAL_Z13", "EXPR_Z13", "COMMA_Z13", "EQ_Z13", "PAR_L13", "PAR_R13", 
		"WS_Z13", "NL_Z13", "COMMENT_EOL_Z13", "BC_Z13", "VAL_Z20", "EQ_Z20", 
		"WS_Z20", "NL_Z20", "COMMENT_EOL_Z20", "BC_Z20", "VAL_Z30", "WS_Z30", 
		"NL_Z30", "COMMENT_EOL_Z30", "BC_Z30", "VAL_Z40", "EQ_Z40", "WS_Z40", 
		"NL_Z40", "COMMENT_EOL_Z40", "BC_Z40", "PAR_L50", "PAR_R50", "VAL_Z50", 
		"WS_Z50", "NL_Z50", "COMMENT_EOL_Z50", "BC_Z50", "VAL_Z60", "PAR_L60", 
		"PAR_R60", "BR_L60", "BR_R60", "WS_Z60", "NL_Z60", "COMMENT_EOL_Z60", 
		"BC_Z60", "VAL_Z70", "WS_Z70", "NL_Z70", "COMMENT_EOL_Z70", "BC_Z70", 
		"VAL_Z80", "WS_Z80", "NL_Z80", "COMMENT_EOL_Z80", "BC_Z80", "VAL_Z90", 
		"PAR_L90", "PAR_R90", "COMMA_Z90", "WS_Z90", "NL_Z90", "COMMENT_EOL_Z90", 
		"BC_Z90", "WS_Z100", "NL_Z100", "FILENAME_Z100", "BC_Z100"
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
			VAL_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 76:
			EXPR_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
			COMMA_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 78:
			EQ_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 79:
			PAR_L10_action((RuleContext)_localctx, actionIndex);
			break;
		case 80:
			PAR_R10_action((RuleContext)_localctx, actionIndex);
			break;
		case 81:
			WS_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 82:
			NL_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 83:
			COMMENT_EOL_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 84:
			BC_Z10_action((RuleContext)_localctx, actionIndex);
			break;
		case 85:
			VAL_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 86:
			EXPR_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 87:
			COMMA_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 88:
			EQ_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 89:
			PAR_L11_action((RuleContext)_localctx, actionIndex);
			break;
		case 90:
			PAR_R11_action((RuleContext)_localctx, actionIndex);
			break;
		case 91:
			WS_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 92:
			NL_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 93:
			COMMENT_EOL_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 94:
			BC_Z11_action((RuleContext)_localctx, actionIndex);
			break;
		case 95:
			VAL_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
			EXPR_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 97:
			COMMA_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 98:
			EQ_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 99:
			PAR_L12_action((RuleContext)_localctx, actionIndex);
			break;
		case 100:
			PAR_R12_action((RuleContext)_localctx, actionIndex);
			break;
		case 101:
			WS_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 102:
			NL_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 103:
			COMMENT_EOL_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 104:
			BC_Z12_action((RuleContext)_localctx, actionIndex);
			break;
		case 105:
			VAL_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 106:
			EXPR_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 107:
			COMMA_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 108:
			EQ_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 109:
			PAR_L13_action((RuleContext)_localctx, actionIndex);
			break;
		case 110:
			PAR_R13_action((RuleContext)_localctx, actionIndex);
			break;
		case 111:
			WS_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 112:
			NL_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 113:
			COMMENT_EOL_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 114:
			BC_Z13_action((RuleContext)_localctx, actionIndex);
			break;
		case 115:
			VAL_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 116:
			EQ_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 117:
			WS_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 118:
			NL_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 119:
			COMMENT_EOL_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 120:
			BC_Z20_action((RuleContext)_localctx, actionIndex);
			break;
		case 121:
			VAL_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 122:
			WS_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 123:
			NL_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 124:
			COMMENT_EOL_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 125:
			BC_Z30_action((RuleContext)_localctx, actionIndex);
			break;
		case 126:
			VAL_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 127:
			EQ_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 128:
			WS_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 129:
			NL_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 130:
			COMMENT_EOL_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 131:
			BC_Z40_action((RuleContext)_localctx, actionIndex);
			break;
		case 132:
			PAR_L50_action((RuleContext)_localctx, actionIndex);
			break;
		case 133:
			PAR_R50_action((RuleContext)_localctx, actionIndex);
			break;
		case 134:
			VAL_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 135:
			WS_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 136:
			NL_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 137:
			COMMENT_EOL_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 138:
			BC_Z50_action((RuleContext)_localctx, actionIndex);
			break;
		case 139:
			VAL_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 140:
			PAR_L60_action((RuleContext)_localctx, actionIndex);
			break;
		case 141:
			PAR_R60_action((RuleContext)_localctx, actionIndex);
			break;
		case 142:
			BR_L60_action((RuleContext)_localctx, actionIndex);
			break;
		case 143:
			BR_R60_action((RuleContext)_localctx, actionIndex);
			break;
		case 144:
			WS_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 145:
			NL_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 146:
			COMMENT_EOL_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 147:
			BC_Z60_action((RuleContext)_localctx, actionIndex);
			break;
		case 148:
			VAL_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 149:
			WS_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 150:
			NL_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 151:
			COMMENT_EOL_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 152:
			BC_Z70_action((RuleContext)_localctx, actionIndex);
			break;
		case 153:
			VAL_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 154:
			WS_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 155:
			NL_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 156:
			COMMENT_EOL_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 157:
			BC_Z80_action((RuleContext)_localctx, actionIndex);
			break;
		case 158:
			VAL_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 159:
			PAR_L90_action((RuleContext)_localctx, actionIndex);
			break;
		case 160:
			PAR_R90_action((RuleContext)_localctx, actionIndex);
			break;
		case 161:
			COMMA_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 162:
			WS_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 163:
			NL_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 164:
			COMMENT_EOL_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 165:
			BC_Z90_action((RuleContext)_localctx, actionIndex);
			break;
		case 166:
			WS_Z100_action((RuleContext)_localctx, actionIndex);
			break;
		case 167:
			NL_Z100_action((RuleContext)_localctx, actionIndex);
			break;
		case 168:
			FILENAME_Z100_action((RuleContext)_localctx, actionIndex);
			break;
		case 169:
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
			bc();
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
	private void VAL_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:
			kvVal(VAL);
			break;
		}
	}
	private void EXPR_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:
			kvVal(EXPR);
			break;
		}
	}
	private void COMMA_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:
			setType(COMMA);
			break;
		}
	}
	private void EQ_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:
			setType(EQ);
			break;
		}
	}
	private void PAR_L10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46:
			setType(PAR_L);
			break;
		}
	}
	private void PAR_R10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47:
			setType(PAR_R);
			break;
		}
	}
	private void WS_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48:
			whitespace();
			break;
		}
	}
	private void NL_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 49:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 50:
			comment();
			break;
		}
	}
	private void BC_Z10_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 51:
			bc();
			break;
		}
	}
	private void VAL_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 52:
			srcKvVal(VAL);
			break;
		}
	}
	private void EXPR_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 53:
			srcKvVal(EXPR);
			break;
		}
	}
	private void COMMA_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 54:
			setType(COMMA);
			break;
		}
	}
	private void EQ_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 55:
			setType(EQ);
			break;
		}
	}
	private void PAR_L11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 56:
			setType(PAR_L);
			break;
		}
	}
	private void PAR_R11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 57:
			setType(PAR_R);
			break;
		}
	}
	private void WS_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 58:
			whitespace();
			break;
		}
	}
	private void NL_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 59:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 60:
			comment();
			break;
		}
	}
	private void BC_Z11_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 61:
			bc();
			break;
		}
	}
	private void VAL_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 62:
			kvRVal(); mode(M_KV); 
			break;
		}
	}
	private void EXPR_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 63:
			kvVal(EXPR); mode(M_KV); 
			break;
		}
	}
	private void COMMA_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 64:
			setType(COMMA); mode(M_KV); 
			break;
		}
	}
	private void EQ_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 65:
			setType(EQ); mode(M_KV); 
			break;
		}
	}
	private void PAR_L12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 66:
			setType(PAR_L); mode(M_KV); 
			break;
		}
	}
	private void PAR_R12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 67:
			setType(PAR_R); mode(M_KV); 
			break;
		}
	}
	private void WS_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 68:
			whitespace();
			break;
		}
	}
	private void NL_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 69:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 70:
			comment(); mode(M_KV);
			break;
		}
	}
	private void BC_Z12_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 71:
			bc();  mode(M_KV); 
			break;
		}
	}
	private void VAL_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 72:
			kvModelVal(); mode(M_KV); 
			break;
		}
	}
	private void EXPR_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 73:
			kvVal(EXPR); mode(M_KV); 
			break;
		}
	}
	private void COMMA_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 74:
			setType(COMMA); mode(M_KV); 
			break;
		}
	}
	private void EQ_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 75:
			setType(EQ); mode(M_KV); 
			break;
		}
	}
	private void PAR_L13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 76:
			setType(PAR_L); mode(M_KV); 
			break;
		}
	}
	private void PAR_R13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 77:
			setType(PAR_R); mode(M_KV); 
			break;
		}
	}
	private void WS_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 78:
			whitespace(); 
			break;
		}
	}
	private void NL_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 79:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 80:
			comment(); mode(M_KV);
			break;
		}
	}
	private void BC_Z13_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 81:
			bc();  mode(M_KV); 
			break;
		}
	}
	private void VAL_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 82:
			subcktVal();
			break;
		}
	}
	private void EQ_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 83:
			setType(EQ);
			break;
		}
	}
	private void WS_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 84:
			whitespace();
			break;
		}
	}
	private void NL_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 85:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 86:
			comment();
			break;
		}
	}
	private void BC_Z20_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 87:
			bc();
			break;
		}
	}
	private void VAL_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 88:
			setType(SUBCKT_NAME);
			break;
		}
	}
	private void WS_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 89:
			whitespace();
			break;
		}
	}
	private void NL_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 90:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 91:
			comment();
			break;
		}
	}
	private void BC_Z30_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 92:
			bc();
			break;
		}
	}
	private void VAL_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 93:
			xVal();
			break;
		}
	}
	private void EQ_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 94:
			setType(EQ);
			break;
		}
	}
	private void WS_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 95:
			whitespace();
			break;
		}
	}
	private void NL_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 96:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 97:
			comment();
			break;
		}
	}
	private void BC_Z40_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 98:
			bc();
			break;
		}
	}
	private void PAR_L50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 99:
			whitespace();
			break;
		}
	}
	private void PAR_R50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 100:
			whitespace();
			break;
		}
	}
	private void VAL_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 101:
			srcDepVal();
			break;
		}
	}
	private void WS_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 102:
			whitespace();
			break;
		}
	}
	private void NL_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 103:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 104:
			comment();
			break;
		}
	}
	private void BC_Z50_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 105:
			bc();
			break;
		}
	}
	private void VAL_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 106:
			xSpiceAVal();
			break;
		}
	}
	private void PAR_L60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 107:
			setType(PAR_L);
			break;
		}
	}
	private void PAR_R60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 108:
			setType(PAR_R);
			break;
		}
	}
	private void BR_L60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 109:
			setType(BR_L);
			break;
		}
	}
	private void BR_R60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 110:
			xSpiceBracketClosed();
			break;
		}
	}
	private void WS_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 111:
			whitespace();
			break;
		}
	}
	private void NL_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 112:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 113:
			comment();
			break;
		}
	}
	private void BC_Z60_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 114:
			bc();
			break;
		}
	}
	private void VAL_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 115:
			setType(H_V);mode(M_MODEL_KV);
			break;
		}
	}
	private void WS_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 116:
			whitespace();
			break;
		}
	}
	private void NL_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 117:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 118:
			comment();
			break;
		}
	}
	private void BC_Z70_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 119:
			bc();
			break;
		}
	}
	private void VAL_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 120:
			qTransistorVal();
			break;
		}
	}
	private void WS_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 121:
			whitespace();
			break;
		}
	}
	private void NL_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 122:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 123:
			comment();
			break;
		}
	}
	private void BC_Z80_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 124:
			bc();
			break;
		}
	}
	private void VAL_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 125:
			plotVal();
			break;
		}
	}
	private void PAR_L90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 126:
			plotParL();
			break;
		}
	}
	private void PAR_R90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 127:
			plotParR();
			break;
		}
	}
	private void COMMA_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 128:
			setType(COMMA);
			break;
		}
	}
	private void WS_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 129:
			whitespace();
			break;
		}
	}
	private void NL_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 130:
			newline();
			break;
		}
	}
	private void COMMENT_EOL_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 131:
			comment();
			break;
		}
	}
	private void BC_Z90_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 132:
			bc();
			break;
		}
	}
	private void WS_Z100_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 133:
			whitespace();
			break;
		}
	}
	private void NL_Z100_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 134:
			newline();
			break;
		}
	}
	private void FILENAME_Z100_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 135:
			setType(FILENAME);
			break;
		}
	}
	private void BC_Z100_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 136:
			bc();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return COMMENT_LS_Z01_sempred((RuleContext)_localctx, predIndex);
		case 168:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u00ac\u04fa\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\3\2\6\2\u017b\n\2\r\2\16\2\u017c"+
		"\3\3\6\3\u0180\n\3\r\3\16\3\u0181\3\4\6\4\u0185\n\4\r\4\16\4\u0186\3\5"+
		"\3\5\3\6\3\6\6\6\u018d\n\6\r\6\16\6\u018e\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\6\13\u019c\n\13\r\13\16\13\u019d\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\6\20\u01a9\n\20\r\20\16\20\u01aa\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\6#\u0215"+
		"\n#\r#\16#\u0216\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\7&\u0224\n&\f&\16&\u0227"+
		"\13&\3&\3&\3\'\3\'\7\'\u022d\n\'\f\'\16\'\u0230\13\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\6)\u0239\n)\r)\16)\u023a\3)\3)\3*\3*\6*\u0241\n*\r*\16*\u0242\3"+
		"*\3*\3+\3+\6+\u0249\n+\r+\16+\u024a\3+\3+\3,\3,\6,\u0251\n,\r,\16,\u0252"+
		"\3,\3,\3-\3-\6-\u0259\n-\r-\16-\u025a\3-\3-\3.\3.\6.\u0261\n.\r.\16.\u0262"+
		"\3.\3.\3/\3/\6/\u0269\n/\r/\16/\u026a\3/\3/\3\60\3\60\6\60\u0271\n\60"+
		"\r\60\16\60\u0272\3\60\3\60\3\61\3\61\6\61\u0279\n\61\r\61\16\61\u027a"+
		"\3\61\3\61\3\62\3\62\6\62\u0281\n\62\r\62\16\62\u0282\3\62\3\62\3\63\3"+
		"\63\6\63\u0289\n\63\r\63\16\63\u028a\3\63\3\63\3\64\3\64\6\64\u0291\n"+
		"\64\r\64\16\64\u0292\3\64\3\64\3\65\3\65\6\65\u0299\n\65\r\65\16\65\u029a"+
		"\3\65\3\65\3\66\3\66\6\66\u02a1\n\66\r\66\16\66\u02a2\3\66\3\66\3\67\3"+
		"\67\6\67\u02a9\n\67\r\67\16\67\u02aa\3\67\3\67\38\38\68\u02b1\n8\r8\16"+
		"8\u02b2\38\38\39\39\69\u02b9\n9\r9\169\u02ba\39\39\3:\3:\6:\u02c1\n:\r"+
		":\16:\u02c2\3:\3:\3;\3;\6;\u02c9\n;\r;\16;\u02ca\3;\3;\3<\3<\6<\u02d1"+
		"\n<\r<\16<\u02d2\3<\3<\3=\3=\6=\u02d9\n=\r=\16=\u02da\3=\3=\3>\3>\6>\u02e1"+
		"\n>\r>\16>\u02e2\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\6A\u02ef\nA\rA\16A\u02f0"+
		"\3A\3A\3B\3B\3B\3C\3C\3C\3D\6D\u02fc\nD\rD\16D\u02fd\3D\3D\3E\3E\3E\3"+
		"F\3F\3F\3G\3G\3G\3H\6H\u030c\nH\rH\16H\u030d\3H\3H\3I\3I\3I\3J\3J\3J\3"+
		"K\3K\7K\u031a\nK\fK\16K\u031d\13K\3K\3K\3L\3L\3L\3M\6M\u0325\nM\rM\16"+
		"M\u0326\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3"+
		"T\3T\3T\3U\3U\7U\u0342\nU\fU\16U\u0345\13U\3U\3U\3V\3V\3V\3W\6W\u034d"+
		"\nW\rW\16W\u034e\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\"+
		"\3]\3]\3]\3^\3^\3^\3_\3_\7_\u036a\n_\f_\16_\u036d\13_\3_\3_\3`\3`\3`\3"+
		"a\6a\u0375\na\ra\16a\u0376\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3e\3"+
		"f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\7i\u0392\ni\fi\16i\u0395\13i\3i\3i\3j"+
		"\3j\3j\3k\6k\u039d\nk\rk\16k\u039e\3k\3k\3l\3l\3l\3m\3m\3m\3n\3n\3n\3"+
		"o\3o\3o\3p\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s\7s\u03ba\ns\fs\16s\u03bd\13s"+
		"\3s\3s\3t\3t\3t\3u\6u\u03c5\nu\ru\16u\u03c6\3u\3u\3v\3v\3v\3w\3w\3w\3"+
		"x\3x\3x\3y\3y\7y\u03d6\ny\fy\16y\u03d9\13y\3y\3y\3z\3z\3z\3{\6{\u03e1"+
		"\n{\r{\16{\u03e2\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\7~\u03ef\n~\f~\16~\u03f2"+
		"\13~\3~\3~\3\177\3\177\3\177\3\u0080\6\u0080\u03fa\n\u0080\r\u0080\16"+
		"\u0080\u03fb\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3"+
		"\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\7\u0084\u040b\n\u0084\f"+
		"\u0084\16\u0084\u040e\13\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\6\u0088\u041c"+
		"\n\u0088\r\u0088\16\u0088\u041d\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\7\u008b\u042a\n\u008b\f\u008b"+
		"\16\u008b\u042d\13\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d"+
		"\3\u008d\6\u008d\u0436\n\u008d\r\u008d\16\u008d\u0437\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\7\u0094\u0450\n\u0094\f\u0094\16\u0094\u0453\13\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0096\6\u0096\u045b\n\u0096"+
		"\r\u0096\16\u0096\u045c\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\7\u0099\u0469\n\u0099\f\u0099\16\u0099"+
		"\u046c\13\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009b\6\u009b"+
		"\u0474\n\u009b\r\u009b\16\u009b\u0475\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\7\u009e\u0482\n\u009e"+
		"\f\u009e\16\u009e\u0485\13\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u00a0\6\u00a0\u048d\n\u00a0\r\u00a0\16\u00a0\u048e\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\7\u00a6"+
		"\u04a4\n\u00a6\f\u00a6\16\u00a6\u04a7\13\u00a6\3\u00a6\3\u00a6\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a8\6\u00a8\u04af\n\u00a8\r\u00a8\16\u00a8\u04b0"+
		"\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\6\u00aa\u04ba"+
		"\n\u00aa\r\u00aa\16\u00aa\u04bb\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ad\5\u00ad\u04c6\n\u00ad\3\u00ad\3\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u04ce\n\u00ae\3\u00af\3\u00af\7\u00af"+
		"\u04d2\n\u00af\f\u00af\16\u00af\u04d5\13\u00af\3\u00af\3\u00af\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\2\2\u00b5\23\3\25\4\27"+
		"\5\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\61\22\63\23\65\24"+
		"\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K\37M O!Q\"S#U$W%Y&[\'](_)a"+
		"*c+e,g-i.k/m\60o\61q\62s\63u\64w\65y\66{\67}8\1779\u0081:\u0083;\u0085"+
		"<\u0087=\u0089>\u008b?\u008d@\u008fA\u0091B\u0093C\u0095D\u0097E\u0099"+
		"F\u009bG\u009dH\u009fI\u00a1J\u00a3K\u00a5L\u00a7M\u00a9N\u00abO\u00ad"+
		"P\u00afQ\u00b1R\u00b3S\u00b5T\u00b7U\u00b9V\u00bbW\u00bdX\u00bfY\u00c1"+
		"Z\u00c3[\u00c5\\\u00c7]\u00c9^\u00cb_\u00cd`\u00cfa\u00d1b\u00d3c\u00d5"+
		"d\u00d7e\u00d9f\u00dbg\u00ddh\u00dfi\u00e1j\u00e3k\u00e5l\u00e7m\u00e9"+
		"n\u00ebo\u00edp\u00efq\u00f1r\u00f3s\u00f5t\u00f7u\u00f9v\u00fbw\u00fd"+
		"x\u00ffy\u0101z\u0103{\u0105|\u0107}\u0109~\u010b\177\u010d\u0080\u010f"+
		"\u0081\u0111\u0082\u0113\u0083\u0115\u0084\u0117\u0085\u0119\u0086\u011b"+
		"\u0087\u011d\u0088\u011f\u0089\u0121\u008a\u0123\u008b\u0125\u008c\u0127"+
		"\u008d\u0129\u008e\u012b\u008f\u012d\u0090\u012f\u0091\u0131\u0092\u0133"+
		"\u0093\u0135\u0094\u0137\u0095\u0139\u0096\u013b\u0097\u013d\u0098\u013f"+
		"\u0099\u0141\u009a\u0143\u009b\u0145\u009c\u0147\u009d\u0149\u009e\u014b"+
		"\u009f\u014d\u00a0\u014f\u00a1\u0151\u00a2\u0153\u00a3\u0155\u00a4\u0157"+
		"\u00a5\u0159\u00a6\u015b\u00a7\u015d\u00a8\u015f\u00a9\u0161\u00aa\u0163"+
		"\u00ab\u0165\u00ac\u0167\2\u0169\2\u016b\2\u016d\2\u016f\2\u0171\2\u0173"+
		"\2\u0175\2\u0177\2\23\2\3\4\5\6\7\b\t\n\13\f\r\16\17\20\21\22\"\3\2c|"+
		"\3\2\62;\4\2TTtt\4\2\13\13\"\"\4\2\f\f\17\17\4\2EEee\4\2MMmm\4\2NNnn\4"+
		"\2UUuu\4\2YYyy\4\2XXxx\4\2KKkk\4\2GGgg\4\2IIii\4\2HHhh\4\2JJjj\4\2CCc"+
		"c\4\2VVvv\4\2QQqq\4\2WWww\4\2[[{{\4\2FFff\4\2SSss\4\2LLll\4\2\\\\||\4"+
		"\2OOoo\4\2ZZzz\b\2--/\60\62;C\\aac|\3\2))\4\2DDdd\4\2PPpp\4\2RRrr\2\u0521"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2"+
		"\2\4[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2\4c\3\2\2\2\4e\3\2\2\2\4"+
		"g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\4q\3\2\2\2\4s\3"+
		"\2\2\2\4u\3\2\2\2\4w\3\2\2\2\4y\3\2\2\2\4{\3\2\2\2\4}\3\2\2\2\4\177\3"+
		"\2\2\2\4\u0081\3\2\2\2\4\u0083\3\2\2\2\4\u0085\3\2\2\2\4\u0087\3\2\2\2"+
		"\4\u0089\3\2\2\2\4\u008b\3\2\2\2\4\u008d\3\2\2\2\4\u008f\3\2\2\2\4\u0091"+
		"\3\2\2\2\4\u0093\3\2\2\2\4\u0095\3\2\2\2\4\u0097\3\2\2\2\4\u0099\3\2\2"+
		"\2\4\u009b\3\2\2\2\4\u009d\3\2\2\2\5\u009f\3\2\2\2\5\u00a1\3\2\2\2\5\u00a3"+
		"\3\2\2\2\5\u00a5\3\2\2\2\5\u00a7\3\2\2\2\6\u00a9\3\2\2\2\6\u00ab\3\2\2"+
		"\2\6\u00ad\3\2\2\2\6\u00af\3\2\2\2\6\u00b1\3\2\2\2\6\u00b3\3\2\2\2\6\u00b5"+
		"\3\2\2\2\6\u00b7\3\2\2\2\6\u00b9\3\2\2\2\6\u00bb\3\2\2\2\7\u00bd\3\2\2"+
		"\2\7\u00bf\3\2\2\2\7\u00c1\3\2\2\2\7\u00c3\3\2\2\2\7\u00c5\3\2\2\2\7\u00c7"+
		"\3\2\2\2\7\u00c9\3\2\2\2\7\u00cb\3\2\2\2\7\u00cd\3\2\2\2\7\u00cf\3\2\2"+
		"\2\b\u00d1\3\2\2\2\b\u00d3\3\2\2\2\b\u00d5\3\2\2\2\b\u00d7\3\2\2\2\b\u00d9"+
		"\3\2\2\2\b\u00db\3\2\2\2\b\u00dd\3\2\2\2\b\u00df\3\2\2\2\b\u00e1\3\2\2"+
		"\2\b\u00e3\3\2\2\2\t\u00e5\3\2\2\2\t\u00e7\3\2\2\2\t\u00e9\3\2\2\2\t\u00eb"+
		"\3\2\2\2\t\u00ed\3\2\2\2\t\u00ef\3\2\2\2\t\u00f1\3\2\2\2\t\u00f3\3\2\2"+
		"\2\t\u00f5\3\2\2\2\t\u00f7\3\2\2\2\n\u00f9\3\2\2\2\n\u00fb\3\2\2\2\n\u00fd"+
		"\3\2\2\2\n\u00ff\3\2\2\2\n\u0101\3\2\2\2\n\u0103\3\2\2\2\13\u0105\3\2"+
		"\2\2\13\u0107\3\2\2\2\13\u0109\3\2\2\2\13\u010b\3\2\2\2\13\u010d\3\2\2"+
		"\2\f\u010f\3\2\2\2\f\u0111\3\2\2\2\f\u0113\3\2\2\2\f\u0115\3\2\2\2\f\u0117"+
		"\3\2\2\2\f\u0119\3\2\2\2\r\u011b\3\2\2\2\r\u011d\3\2\2\2\r\u011f\3\2\2"+
		"\2\r\u0121\3\2\2\2\r\u0123\3\2\2\2\r\u0125\3\2\2\2\r\u0127\3\2\2\2\16"+
		"\u0129\3\2\2\2\16\u012b\3\2\2\2\16\u012d\3\2\2\2\16\u012f\3\2\2\2\16\u0131"+
		"\3\2\2\2\16\u0133\3\2\2\2\16\u0135\3\2\2\2\16\u0137\3\2\2\2\16\u0139\3"+
		"\2\2\2\17\u013b\3\2\2\2\17\u013d\3\2\2\2\17\u013f\3\2\2\2\17\u0141\3\2"+
		"\2\2\17\u0143\3\2\2\2\20\u0145\3\2\2\2\20\u0147\3\2\2\2\20\u0149\3\2\2"+
		"\2\20\u014b\3\2\2\2\20\u014d\3\2\2\2\21\u014f\3\2\2\2\21\u0151\3\2\2\2"+
		"\21\u0153\3\2\2\2\21\u0155\3\2\2\2\21\u0157\3\2\2\2\21\u0159\3\2\2\2\21"+
		"\u015b\3\2\2\2\21\u015d\3\2\2\2\22\u015f\3\2\2\2\22\u0161\3\2\2\2\22\u0163"+
		"\3\2\2\2\22\u0165\3\2\2\2\23\u017a\3\2\2\2\25\u017f\3\2\2\2\27\u0184\3"+
		"\2\2\2\31\u0188\3\2\2\2\33\u018a\3\2\2\2\35\u0190\3\2\2\2\37\u0194\3\2"+
		"\2\2!\u0196\3\2\2\2#\u0198\3\2\2\2%\u019b\3\2\2\2\'\u019f\3\2\2\2)\u01a1"+
		"\3\2\2\2+\u01a3\3\2\2\2-\u01a5\3\2\2\2/\u01a8\3\2\2\2\61\u01ac\3\2\2\2"+
		"\63\u01b2\3\2\2\2\65\u01b6\3\2\2\2\67\u01ba\3\2\2\29\u01be\3\2\2\2;\u01c3"+
		"\3\2\2\2=\u01c6\3\2\2\2?\u01ce\3\2\2\2A\u01d7\3\2\2\2C\u01e0\3\2\2\2E"+
		"\u01e5\3\2\2\2G\u01ed\3\2\2\2I\u01f0\3\2\2\2K\u01f9\3\2\2\2M\u0202\3\2"+
		"\2\2O\u020a\3\2\2\2Q\u020f\3\2\2\2S\u0211\3\2\2\2U\u0214\3\2\2\2W\u021a"+
		"\3\2\2\2Y\u021d\3\2\2\2[\u0220\3\2\2\2]\u022a\3\2\2\2_\u0233\3\2\2\2a"+
		"\u0236\3\2\2\2c\u023e\3\2\2\2e\u0246\3\2\2\2g\u024e\3\2\2\2i\u0256\3\2"+
		"\2\2k\u025e\3\2\2\2m\u0266\3\2\2\2o\u026e\3\2\2\2q\u0276\3\2\2\2s\u027e"+
		"\3\2\2\2u\u0286\3\2\2\2w\u028e\3\2\2\2y\u0296\3\2\2\2{\u029e\3\2\2\2}"+
		"\u02a6\3\2\2\2\177\u02ae\3\2\2\2\u0081\u02b6\3\2\2\2\u0083\u02be\3\2\2"+
		"\2\u0085\u02c6\3\2\2\2\u0087\u02ce\3\2\2\2\u0089\u02d6\3\2\2\2\u008b\u02de"+
		"\3\2\2\2\u008d\u02e6\3\2\2\2\u008f\u02e9\3\2\2\2\u0091\u02ec\3\2\2\2\u0093"+
		"\u02f4\3\2\2\2\u0095\u02f7\3\2\2\2\u0097\u02fb\3\2\2\2\u0099\u0301\3\2"+
		"\2\2\u009b\u0304\3\2\2\2\u009d\u0307\3\2\2\2\u009f\u030b\3\2\2\2\u00a1"+
		"\u0311\3\2\2\2\u00a3\u0314\3\2\2\2\u00a5\u0317\3\2\2\2\u00a7\u0320\3\2"+
		"\2\2\u00a9\u0324\3\2\2\2\u00ab\u032a\3\2\2\2\u00ad\u032d\3\2\2\2\u00af"+
		"\u0330\3\2\2\2\u00b1\u0333\3\2\2\2\u00b3\u0336\3\2\2\2\u00b5\u0339\3\2"+
		"\2\2\u00b7\u033c\3\2\2\2\u00b9\u033f\3\2\2\2\u00bb\u0348\3\2\2\2\u00bd"+
		"\u034c\3\2\2\2\u00bf\u0352\3\2\2\2\u00c1\u0355\3\2\2\2\u00c3\u0358\3\2"+
		"\2\2\u00c5\u035b\3\2\2\2\u00c7\u035e\3\2\2\2\u00c9\u0361\3\2\2\2\u00cb"+
		"\u0364\3\2\2\2\u00cd\u0367\3\2\2\2\u00cf\u0370\3\2\2\2\u00d1\u0374\3\2"+
		"\2\2\u00d3\u037a\3\2\2\2\u00d5\u037d\3\2\2\2\u00d7\u0380\3\2\2\2\u00d9"+
		"\u0383\3\2\2\2\u00db\u0386\3\2\2\2\u00dd\u0389\3\2\2\2\u00df\u038c\3\2"+
		"\2\2\u00e1\u038f\3\2\2\2\u00e3\u0398\3\2\2\2\u00e5\u039c\3\2\2\2\u00e7"+
		"\u03a2\3\2\2\2\u00e9\u03a5\3\2\2\2\u00eb\u03a8\3\2\2\2\u00ed\u03ab\3\2"+
		"\2\2\u00ef\u03ae\3\2\2\2\u00f1\u03b1\3\2\2\2\u00f3\u03b4\3\2\2\2\u00f5"+
		"\u03b7\3\2\2\2\u00f7\u03c0\3\2\2\2\u00f9\u03c4\3\2\2\2\u00fb\u03ca\3\2"+
		"\2\2\u00fd\u03cd\3\2\2\2\u00ff\u03d0\3\2\2\2\u0101\u03d3\3\2\2\2\u0103"+
		"\u03dc\3\2\2\2\u0105\u03e0\3\2\2\2\u0107\u03e6\3\2\2\2\u0109\u03e9\3\2"+
		"\2\2\u010b\u03ec\3\2\2\2\u010d\u03f5\3\2\2\2\u010f\u03f9\3\2\2\2\u0111"+
		"\u03ff\3\2\2\2\u0113\u0402\3\2\2\2\u0115\u0405\3\2\2\2\u0117\u0408\3\2"+
		"\2\2\u0119\u0411\3\2\2\2\u011b\u0414\3\2\2\2\u011d\u0417\3\2\2\2\u011f"+
		"\u041b\3\2\2\2\u0121\u0421\3\2\2\2\u0123\u0424\3\2\2\2\u0125\u0427\3\2"+
		"\2\2\u0127\u0430\3\2\2\2\u0129\u0435\3\2\2\2\u012b\u043b\3\2\2\2\u012d"+
		"\u043e\3\2\2\2\u012f\u0441\3\2\2\2\u0131\u0444\3\2\2\2\u0133\u0447\3\2"+
		"\2\2\u0135\u044a\3\2\2\2\u0137\u044d\3\2\2\2\u0139\u0456\3\2\2\2\u013b"+
		"\u045a\3\2\2\2\u013d\u0460\3\2\2\2\u013f\u0463\3\2\2\2\u0141\u0466\3\2"+
		"\2\2\u0143\u046f\3\2\2\2\u0145\u0473\3\2\2\2\u0147\u0479\3\2\2\2\u0149"+
		"\u047c\3\2\2\2\u014b\u047f\3\2\2\2\u014d\u0488\3\2\2\2\u014f\u048c\3\2"+
		"\2\2\u0151\u0492\3\2\2\2\u0153\u0495\3\2\2\2\u0155\u0498\3\2\2\2\u0157"+
		"\u049b\3\2\2\2\u0159\u049e\3\2\2\2\u015b\u04a1\3\2\2\2\u015d\u04aa\3\2"+
		"\2\2\u015f\u04ae\3\2\2\2\u0161\u04b4\3\2\2\2\u0163\u04b7\3\2\2\2\u0165"+
		"\u04bf\3\2\2\2\u0167\u04c2\3\2\2\2\u0169\u04c5\3\2\2\2\u016b\u04cd\3\2"+
		"\2\2\u016d\u04cf\3\2\2\2\u016f\u04d8\3\2\2\2\u0171\u04e0\3\2\2\2\u0173"+
		"\u04e6\3\2\2\2\u0175\u04ed\3\2\2\2\u0177\u04f3\3\2\2\2\u0179\u017b\t\2"+
		"\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\24\3\2\2\2\u017e\u0180\t\3\2\2\u017f\u017e\3\2\2"+
		"\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\26"+
		"\3\2\2\2\u0183\u0185\t\3\2\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\30\3\2\2\2\u0188\u0189\7.\2\2"+
		"\u0189\32\3\2\2\2\u018a\u018c\t\4\2\2\u018b\u018d\t\3\2\2\u018c\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\34\3\2\2\2\u0190\u0191\t\5\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b\7\2"+
		"\2\u0193\36\3\2\2\2\u0194\u0195\5\u0169\u00ad\2\u0195 \3\2\2\2\u0196\u0197"+
		"\7?\2\2\u0197\"\3\2\2\2\u0198\u0199\5\u016d\u00af\2\u0199$\3\2\2\2\u019a"+
		"\u019c\t\3\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e&\3\2\2\2\u019f\u01a0\7*\2\2\u01a0(\3\2"+
		"\2\2\u01a1\u01a2\7+\2\2\u01a2*\3\2\2\2\u01a3\u01a4\7]\2\2\u01a4,\3\2\2"+
		"\2\u01a5\u01a6\7_\2\2\u01a6.\3\2\2\2\u01a7\u01a9\5\u0167\u00ac\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\60\3\2\2\2\u01ac\u01ad\7R\2\2\u01ad\u01ae\7W\2\2\u01ae\u01af"+
		"\7N\2\2\u01af\u01b0\7U\2\2\u01b0\u01b1\7G\2\2\u01b1\62\3\2\2\2\u01b2\u01b3"+
		"\7U\2\2\u01b3\u01b4\7K\2\2\u01b4\u01b5\7P\2\2\u01b5\64\3\2\2\2\u01b6\u01b7"+
		"\7G\2\2\u01b7\u01b8\7Z\2\2\u01b8\u01b9\7R\2\2\u01b9\66\3\2\2\2\u01ba\u01bb"+
		"\7R\2\2\u01bb\u01bc\7Y\2\2\u01bc\u01bd\7N\2\2\u01bd8\3\2\2\2\u01be\u01bf"+
		"\7U\2\2\u01bf\u01c0\7H\2\2\u01c0\u01c1\7H\2\2\u01c1\u01c2\7O\2\2\u01c2"+
		":\3\2\2\2\u01c3\u01c4\7C\2\2\u01c4\u01c5\7O\2\2\u01c5<\3\2\2\2\u01c6\u01c7"+
		"\7V\2\2\u01c7\u01c8\7T\2\2\u01c8\u01c9\7P\2\2\u01c9\u01ca\7Q\2\2\u01ca"+
		"\u01cb\7K\2\2\u01cb\u01cc\7U\2\2\u01cc\u01cd\7G\2\2\u01cd>\3\2\2\2\u01ce"+
		"\u01cf\7V\2\2\u01cf\u01d0\7T\2\2\u01d0\u01d1\7T\2\2\u01d1\u01d2\7C\2\2"+
		"\u01d2\u01d3\7P\2\2\u01d3\u01d4\7F\2\2\u01d4\u01d5\7Q\2\2\u01d5\u01d6"+
		"\7O\2\2\u01d6@\3\2\2\2\u01d7\u01d8\7G\2\2\u01d8\u01d9\7Z\2\2\u01d9\u01da"+
		"\7V\2\2\u01da\u01db\7G\2\2\u01db\u01dc\7T\2\2\u01dc\u01dd\7P\2\2\u01dd"+
		"\u01de\7C\2\2\u01de\u01df\7N\2\2\u01dfB\3\2\2\2\u01e0\u01e1\7R\2\2\u01e1"+
		"\u01e2\7Q\2\2\u01e2\u01e3\7N\2\2\u01e3\u01e4\7[\2\2\u01e4D\3\2\2\2\u01e5"+
		"\u01e6\7E\2\2\u01e6\u01e7\7Q\2\2\u01e7\u01e8\7O\2\2\u01e8\u01e9\7O\2\2"+
		"\u01e9\u01ea\7G\2\2\u01ea\u01eb\7P\2\2\u01eb\u01ec\7V\2\2\u01ecF\3\2\2"+
		"\2\u01ed\u01ee\7\'\2\2\u01ee\u01ef\7x\2\2\u01efH\3\2\2\2\u01f0\u01f1\7"+
		"\60\2\2\u01f1\u01f2\7K\2\2\u01f2\u01f3\7P\2\2\u01f3\u01f4\7E\2\2\u01f4"+
		"\u01f5\7N\2\2\u01f5\u01f6\7W\2\2\u01f6\u01f7\7F\2\2\u01f7\u01f8\7G\2\2"+
		"\u01f8J\3\2\2\2\u01f9\u01fa\7H\2\2\u01fa\u01fb\7K\2\2\u01fb\u01fc\7N\2"+
		"\2\u01fc\u01fd\7G\2\2\u01fd\u01fe\7P\2\2\u01fe\u01ff\7C\2\2\u01ff\u0200"+
		"\7O\2\2\u0200\u0201\7G\2\2\u0201L\3\2\2\2\u0202\u0203\7\60\2\2\u0203\u0204"+
		"\7Q\2\2\u0204\u0205\7R\2\2\u0205\u0206\7V\2\2\u0206\u0207\7K\2\2\u0207"+
		"\u0208\7Q\2\2\u0208\u0209\7P\2\2\u0209N\3\2\2\2\u020a\u020b\7V\2\2\u020b"+
		"\u020c\7T\2\2\u020c\u020d\7C\2\2\u020d\u020e\7P\2\2\u020eP\3\2\2\2\u020f"+
		"\u0210\7X\2\2\u0210R\3\2\2\2\u0211\u0212\13\2\2\2\u0212T\3\2\2\2\u0213"+
		"\u0215\n\6\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\b#\3\2\u0219"+
		"V\3\2\2\2\u021a\u021b\5\u0169\u00ad\2\u021b\u021c\b$\4\2\u021cX\3\2\2"+
		"\2\u021d\u021e\13\2\2\2\u021e\u021f\b%\5\2\u021fZ\3\2\2\2\u0220\u0221"+
		"\6&\2\2\u0221\u0225\7,\2\2\u0222\u0224\n\6\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0228\u0229\b&\6\2\u0229\\\3\2\2\2\u022a\u022e"+
		"\7&\2\2\u022b\u022d\n\6\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0232\b\'\7\2\u0232^\3\2\2\2\u0233\u0234\5\u0173\u00b2\2\u0234"+
		"\u0235\b(\b\2\u0235`\3\2\2\2\u0236\u0238\t\4\2\2\u0237\u0239\5\u0167\u00ac"+
		"\2\u0238\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\b)\t\2\u023db\3\2\2\2\u023e\u0240"+
		"\t\7\2\2\u023f\u0241\5\u0167\u00ac\2\u0240\u023f\3\2\2\2\u0241\u0242\3"+
		"\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\b*\n\2\u0245d\3\2\2\2\u0246\u0248\t\b\2\2\u0247\u0249\5\u0167\u00ac"+
		"\2\u0248\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\b+\13\2\u024df\3\2\2\2\u024e"+
		"\u0250\t\t\2\2\u024f\u0251\5\u0167\u00ac\2\u0250\u024f\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0255\b,\f\2\u0255h\3\2\2\2\u0256\u0258\t\n\2\2\u0257\u0259\5\u0167\u00ac"+
		"\2\u0258\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\b-\r\2\u025dj\3\2\2\2\u025e\u0260"+
		"\t\13\2\2\u025f\u0261\5\u0167\u00ac\2\u0260\u025f\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0265\b.\16\2\u0265l\3\2\2\2\u0266\u0268\t\f\2\2\u0267\u0269\5\u0167"+
		"\u00ac\2\u0268\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\b/\17\2\u026dn\3\2\2\2"+
		"\u026e\u0270\t\r\2\2\u026f\u0271\5\u0167\u00ac\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0275\b\60\20\2\u0275p\3\2\2\2\u0276\u0278\t\16\2\2\u0277\u0279"+
		"\5\u0167\u00ac\2\u0278\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278\3"+
		"\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\b\61\21\2\u027d"+
		"r\3\2\2\2\u027e\u0280\t\17\2\2\u027f\u0281\5\u0167\u00ac\2\u0280\u027f"+
		"\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0285\b\62\22\2\u0285t\3\2\2\2\u0286\u0288\t\20\2"+
		"\2\u0287\u0289\5\u0167\u00ac\2\u0288\u0287\3\2\2\2\u0289\u028a\3\2\2\2"+
		"\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d"+
		"\b\63\23\2\u028dv\3\2\2\2\u028e\u0290\t\21\2\2\u028f\u0291\5\u0167\u00ac"+
		"\2\u0290\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\b\64\24\2\u0295x\3\2\2\2\u0296"+
		"\u0298\t\22\2\2\u0297\u0299\5\u0167\u00ac\2\u0298\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029d\b\65\25\2\u029dz\3\2\2\2\u029e\u02a0\t\23\2\2\u029f\u02a1"+
		"\5\u0167\u00ac\2\u02a0\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0\3"+
		"\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\b\66\26\2\u02a5"+
		"|\3\2\2\2\u02a6\u02a8\t\24\2\2\u02a7\u02a9\5\u0167\u00ac\2\u02a8\u02a7"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ad\b\67\27\2\u02ad~\3\2\2\2\u02ae\u02b0\t\25\2"+
		"\2\u02af\u02b1\5\u0167\u00ac\2\u02b0\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2"+
		"\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5"+
		"\b8\30\2\u02b5\u0080\3\2\2\2\u02b6\u02b8\t\26\2\2\u02b7\u02b9\5\u0167"+
		"\u00ac\2\u02b8\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\b9\31\2\u02bd\u0082\3\2"+
		"\2\2\u02be\u02c0\t\27\2\2\u02bf\u02c1\5\u0167\u00ac\2\u02c0\u02bf\3\2"+
		"\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\b:\32\2\u02c5\u0084\3\2\2\2\u02c6\u02c8\t\30"+
		"\2\2\u02c7\u02c9\5\u0167\u00ac\2\u02c8\u02c7\3\2\2\2\u02c9\u02ca\3\2\2"+
		"\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd"+
		"\b;\33\2\u02cd\u0086\3\2\2\2\u02ce\u02d0\t\31\2\2\u02cf\u02d1\5\u0167"+
		"\u00ac\2\u02d0\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\b<\34\2\u02d5\u0088\3\2"+
		"\2\2\u02d6\u02d8\t\32\2\2\u02d7\u02d9\5\u0167\u00ac\2\u02d8\u02d7\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02dd\b=\35\2\u02dd\u008a\3\2\2\2\u02de\u02e0\t\33"+
		"\2\2\u02df\u02e1\5\u0167\u00ac\2\u02e0\u02df\3\2\2\2\u02e1\u02e2\3\2\2"+
		"\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5"+
		"\b>\36\2\u02e5\u008c\3\2\2\2\u02e6\u02e7\5\u016f\u00b0\2\u02e7\u02e8\b"+
		"?\37\2\u02e8\u008e\3\2\2\2\u02e9\u02ea\5\u0171\u00b1\2\u02ea\u02eb\b@"+
		" \2\u02eb\u0090\3\2\2\2\u02ec\u02ee\t\34\2\2\u02ed\u02ef\5\u0167\u00ac"+
		"\2\u02ee\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1"+
		"\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\bA!\2\u02f3\u0092\3\2\2\2\u02f4"+
		"\u02f5\5\u0175\u00b3\2\u02f5\u02f6\bB\"\2\u02f6\u0094\3\2\2\2\u02f7\u02f8"+
		"\5\u0177\u00b4\2\u02f8\u02f9\bC#\2\u02f9\u0096\3\2\2\2\u02fa\u02fc\5\u0167"+
		"\u00ac\2\u02fb\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\bD$\2\u0300\u0098\3\2\2"+
		"\2\u0301\u0302\5\u016b\u00ae\2\u0302\u0303\bE%\2\u0303\u009a\3\2\2\2\u0304"+
		"\u0305\5\u0169\u00ad\2\u0305\u0306\bF&\2\u0306\u009c\3\2\2\2\u0307\u0308"+
		"\13\2\2\2\u0308\u0309\bG\'\2\u0309\u009e\3\2\2\2\u030a\u030c\5\u0167\u00ac"+
		"\2\u030b\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\bH(\2\u0310\u00a0\3\2\2\2\u0311"+
		"\u0312\5\u016b\u00ae\2\u0312\u0313\bI)\2\u0313\u00a2\3\2\2\2\u0314\u0315"+
		"\5\u0169\u00ad\2\u0315\u0316\bJ*\2\u0316\u00a4\3\2\2\2\u0317\u031b\7&"+
		"\2\2\u0318\u031a\n\6\2\2\u0319\u0318\3\2\2\2\u031a\u031d\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031e\u031f\bK+\2\u031f\u00a6\3\2\2\2\u0320\u0321\13\2\2\2\u0321"+
		"\u0322\bL,\2\u0322\u00a8\3\2\2\2\u0323\u0325\5\u0167\u00ac\2\u0324\u0323"+
		"\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\bM-\2\u0329\u00aa\3\2\2\2\u032a\u032b\5\u016d"+
		"\u00af\2\u032b\u032c\bN.\2\u032c\u00ac\3\2\2\2\u032d\u032e\7.\2\2\u032e"+
		"\u032f\bO/\2\u032f\u00ae\3\2\2\2\u0330\u0331\7?\2\2\u0331\u0332\bP\60"+
		"\2\u0332\u00b0\3\2\2\2\u0333\u0334\7*\2\2\u0334\u0335\bQ\61\2\u0335\u00b2"+
		"\3\2\2\2\u0336\u0337\7+\2\2\u0337\u0338\bR\62\2\u0338\u00b4\3\2\2\2\u0339"+
		"\u033a\5\u016b\u00ae\2\u033a\u033b\bS\63\2\u033b\u00b6\3\2\2\2\u033c\u033d"+
		"\5\u0169\u00ad\2\u033d\u033e\bT\64\2\u033e\u00b8\3\2\2\2\u033f\u0343\7"+
		"&\2\2\u0340\u0342\n\6\2\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0343\3\2"+
		"\2\2\u0346\u0347\bU\65\2\u0347\u00ba\3\2\2\2\u0348\u0349\13\2\2\2\u0349"+
		"\u034a\bV\66\2\u034a\u00bc\3\2\2\2\u034b\u034d\5\u0167\u00ac\2\u034c\u034b"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u0351\bW\67\2\u0351\u00be\3\2\2\2\u0352\u0353\5\u016d"+
		"\u00af\2\u0353\u0354\bX8\2\u0354\u00c0\3\2\2\2\u0355\u0356\7.\2\2\u0356"+
		"\u0357\bY9\2\u0357\u00c2\3\2\2\2\u0358\u0359\7?\2\2\u0359\u035a\bZ:\2"+
		"\u035a\u00c4\3\2\2\2\u035b\u035c\7*\2\2\u035c\u035d\b[;\2\u035d\u00c6"+
		"\3\2\2\2\u035e\u035f\7+\2\2\u035f\u0360\b\\<\2\u0360\u00c8\3\2\2\2\u0361"+
		"\u0362\5\u016b\u00ae\2\u0362\u0363\b]=\2\u0363\u00ca\3\2\2\2\u0364\u0365"+
		"\5\u0169\u00ad\2\u0365\u0366\b^>\2\u0366\u00cc\3\2\2\2\u0367\u036b\7&"+
		"\2\2\u0368\u036a\n\6\2\2\u0369\u0368\3\2\2\2\u036a\u036d\3\2\2\2\u036b"+
		"\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2\2\2\u036d\u036b\3\2"+
		"\2\2\u036e\u036f\b_?\2\u036f\u00ce\3\2\2\2\u0370\u0371\13\2\2\2\u0371"+
		"\u0372\b`@\2\u0372\u00d0\3\2\2\2\u0373\u0375\5\u0167\u00ac\2\u0374\u0373"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u0379\baA\2\u0379\u00d2\3\2\2\2\u037a\u037b\5\u016d"+
		"\u00af\2\u037b\u037c\bbB\2\u037c\u00d4\3\2\2\2\u037d\u037e\7.\2\2\u037e"+
		"\u037f\bcC\2\u037f\u00d6\3\2\2\2\u0380\u0381\7?\2\2\u0381\u0382\bdD\2"+
		"\u0382\u00d8\3\2\2\2\u0383\u0384\7*\2\2\u0384\u0385\beE\2\u0385\u00da"+
		"\3\2\2\2\u0386\u0387\7+\2\2\u0387\u0388\bfF\2\u0388\u00dc\3\2\2\2\u0389"+
		"\u038a\5\u016b\u00ae\2\u038a\u038b\bgG\2\u038b\u00de\3\2\2\2\u038c\u038d"+
		"\5\u0169\u00ad\2\u038d\u038e\bhH\2\u038e\u00e0\3\2\2\2\u038f\u0393\7&"+
		"\2\2\u0390\u0392\n\6\2\2\u0391\u0390\3\2\2\2\u0392\u0395\3\2\2\2\u0393"+
		"\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0396\3\2\2\2\u0395\u0393\3\2"+
		"\2\2\u0396\u0397\biI\2\u0397\u00e2\3\2\2\2\u0398\u0399\13\2\2\2\u0399"+
		"\u039a\bjJ\2\u039a\u00e4\3\2\2\2\u039b\u039d\5\u0167\u00ac\2\u039c\u039b"+
		"\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a1\bkK\2\u03a1\u00e6\3\2\2\2\u03a2\u03a3\5\u016d"+
		"\u00af\2\u03a3\u03a4\blL\2\u03a4\u00e8\3\2\2\2\u03a5\u03a6\7.\2\2\u03a6"+
		"\u03a7\bmM\2\u03a7\u00ea\3\2\2\2\u03a8\u03a9\7?\2\2\u03a9\u03aa\bnN\2"+
		"\u03aa\u00ec\3\2\2\2\u03ab\u03ac\7*\2\2\u03ac\u03ad\boO\2\u03ad\u00ee"+
		"\3\2\2\2\u03ae\u03af\7+\2\2\u03af\u03b0\bpP\2\u03b0\u00f0\3\2\2\2\u03b1"+
		"\u03b2\5\u016b\u00ae\2\u03b2\u03b3\bqQ\2\u03b3\u00f2\3\2\2\2\u03b4\u03b5"+
		"\5\u0169\u00ad\2\u03b5\u03b6\brR\2\u03b6\u00f4\3\2\2\2\u03b7\u03bb\7&"+
		"\2\2\u03b8\u03ba\n\6\2\2\u03b9\u03b8\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb"+
		"\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb\3\2"+
		"\2\2\u03be\u03bf\bsS\2\u03bf\u00f6\3\2\2\2\u03c0\u03c1\13\2\2\2\u03c1"+
		"\u03c2\btT\2\u03c2\u00f8\3\2\2\2\u03c3\u03c5\5\u0167\u00ac\2\u03c4\u03c3"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"\u03c8\3\2\2\2\u03c8\u03c9\buU\2\u03c9\u00fa\3\2\2\2\u03ca\u03cb\7?\2"+
		"\2\u03cb\u03cc\bvV\2\u03cc\u00fc\3\2\2\2\u03cd\u03ce\5\u016b\u00ae\2\u03ce"+
		"\u03cf\bwW\2\u03cf\u00fe\3\2\2\2\u03d0\u03d1\5\u0169\u00ad\2\u03d1\u03d2"+
		"\bxX\2\u03d2\u0100\3\2\2\2\u03d3\u03d7\7&\2\2\u03d4\u03d6\n\6\2\2\u03d5"+
		"\u03d4\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2"+
		"\2\2\u03d8\u03da\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03db\byY\2\u03db\u0102"+
		"\3\2\2\2\u03dc\u03dd\13\2\2\2\u03dd\u03de\bzZ\2\u03de\u0104\3\2\2\2\u03df"+
		"\u03e1\5\u0167\u00ac\2\u03e0\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e0"+
		"\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\b{[\2\u03e5"+
		"\u0106\3\2\2\2\u03e6\u03e7\5\u016b\u00ae\2\u03e7\u03e8\b|\\\2\u03e8\u0108"+
		"\3\2\2\2\u03e9\u03ea\5\u0169\u00ad\2\u03ea\u03eb\b}]\2\u03eb\u010a\3\2"+
		"\2\2\u03ec\u03f0\7&\2\2\u03ed\u03ef\n\6\2\2\u03ee\u03ed\3\2\2\2\u03ef"+
		"\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\3\2"+
		"\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\b~^\2\u03f4\u010c\3\2\2\2\u03f5\u03f6"+
		"\13\2\2\2\u03f6\u03f7\b\177_\2\u03f7\u010e\3\2\2\2\u03f8\u03fa\5\u0167"+
		"\u00ac\2\u03f9\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\b\u0080`\2\u03fe\u0110"+
		"\3\2\2\2\u03ff\u0400\7?\2\2\u0400\u0401\b\u0081a\2\u0401\u0112\3\2\2\2"+
		"\u0402\u0403\5\u016b\u00ae\2\u0403\u0404\b\u0082b\2\u0404\u0114\3\2\2"+
		"\2\u0405\u0406\5\u0169\u00ad\2\u0406\u0407\b\u0083c\2\u0407\u0116\3\2"+
		"\2\2\u0408\u040c\7&\2\2\u0409\u040b\n\6\2\2\u040a\u0409\3\2\2\2\u040b"+
		"\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\3\2"+
		"\2\2\u040e\u040c\3\2\2\2\u040f\u0410\b\u0084d\2\u0410\u0118\3\2\2\2\u0411"+
		"\u0412\13\2\2\2\u0412\u0413\b\u0085e\2\u0413\u011a\3\2\2\2\u0414\u0415"+
		"\7*\2\2\u0415\u0416\b\u0086f\2\u0416\u011c\3\2\2\2\u0417\u0418\7+\2\2"+
		"\u0418\u0419\b\u0087g\2\u0419\u011e\3\2\2\2\u041a\u041c\5\u0167\u00ac"+
		"\2\u041b\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e"+
		"\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\b\u0088h\2\u0420\u0120\3\2\2"+
		"\2\u0421\u0422\5\u016b\u00ae\2\u0422\u0423\b\u0089i\2\u0423\u0122\3\2"+
		"\2\2\u0424\u0425\5\u0169\u00ad\2\u0425\u0426\b\u008aj\2\u0426\u0124\3"+
		"\2\2\2\u0427\u042b\7&\2\2\u0428\u042a\n\6\2\2\u0429\u0428\3\2\2\2\u042a"+
		"\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\3\2"+
		"\2\2\u042d\u042b\3\2\2\2\u042e\u042f\b\u008bk\2\u042f\u0126\3\2\2\2\u0430"+
		"\u0431\13\2\2\2\u0431\u0432\b\u008cl\2\u0432\u0128\3\2\2\2\u0433\u0436"+
		"\5\u0167\u00ac\2\u0434\u0436\7\'\2\2\u0435\u0433\3\2\2\2\u0435\u0434\3"+
		"\2\2\2\u0436\u0437\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u043a\b\u008dm\2\u043a\u012a\3\2\2\2\u043b\u043c"+
		"\7*\2\2\u043c\u043d\b\u008en\2\u043d\u012c\3\2\2\2\u043e\u043f\7+\2\2"+
		"\u043f\u0440\b\u008fo\2\u0440\u012e\3\2\2\2\u0441\u0442\7]\2\2\u0442\u0443"+
		"\b\u0090p\2\u0443\u0130\3\2\2\2\u0444\u0445\7_\2\2\u0445\u0446\b\u0091"+
		"q\2\u0446\u0132\3\2\2\2\u0447\u0448\5\u016b\u00ae\2\u0448\u0449\b\u0092"+
		"r\2\u0449\u0134\3\2\2\2\u044a\u044b\5\u0169\u00ad\2\u044b\u044c\b\u0093"+
		"s\2\u044c\u0136\3\2\2\2\u044d\u0451\7&\2\2\u044e\u0450\n\6\2\2\u044f\u044e"+
		"\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452"+
		"\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0455\b\u0094t\2\u0455\u0138"+
		"\3\2\2\2\u0456\u0457\13\2\2\2\u0457\u0458\b\u0095u\2\u0458\u013a\3\2\2"+
		"\2\u0459\u045b\5\u0167\u00ac\2\u045a\u0459\3\2\2\2\u045b\u045c\3\2\2\2"+
		"\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f"+
		"\b\u0096v\2\u045f\u013c\3\2\2\2\u0460\u0461\5\u016b\u00ae\2\u0461\u0462"+
		"\b\u0097w\2\u0462\u013e\3\2\2\2\u0463\u0464\5\u0169\u00ad\2\u0464\u0465"+
		"\b\u0098x\2\u0465\u0140\3\2\2\2\u0466\u046a\7&\2\2\u0467\u0469\n\6\2\2"+
		"\u0468\u0467\3\2\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046d\3\2\2\2\u046c\u046a\3\2\2\2\u046d\u046e\b\u0099y"+
		"\2\u046e\u0142\3\2\2\2\u046f\u0470\13\2\2\2\u0470\u0471\b\u009az\2\u0471"+
		"\u0144\3\2\2\2\u0472\u0474\5\u0167\u00ac\2\u0473\u0472\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u0478\b\u009b{\2\u0478\u0146\3\2\2\2\u0479\u047a\5\u016b\u00ae\2\u047a"+
		"\u047b\b\u009c|\2\u047b\u0148\3\2\2\2\u047c\u047d\5\u0169\u00ad\2\u047d"+
		"\u047e\b\u009d}\2\u047e\u014a\3\2\2\2\u047f\u0483\7&\2\2\u0480\u0482\n"+
		"\6\2\2\u0481\u0480\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u0486\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u0487\b\u009e"+
		"~\2\u0487\u014c\3\2\2\2\u0488\u0489\13\2\2\2\u0489\u048a\b\u009f\177\2"+
		"\u048a\u014e\3\2\2\2\u048b\u048d\5\u0167\u00ac\2\u048c\u048b\3\2\2\2\u048d"+
		"\u048e\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2"+
		"\2\2\u0490\u0491\b\u00a0\u0080\2\u0491\u0150\3\2\2\2\u0492\u0493\7*\2"+
		"\2\u0493\u0494\b\u00a1\u0081\2\u0494\u0152\3\2\2\2\u0495\u0496\7+\2\2"+
		"\u0496\u0497\b\u00a2\u0082\2\u0497\u0154\3\2\2\2\u0498\u0499\7.\2\2\u0499"+
		"\u049a\b\u00a3\u0083\2\u049a\u0156\3\2\2\2\u049b\u049c\5\u016b\u00ae\2"+
		"\u049c\u049d\b\u00a4\u0084\2\u049d\u0158\3\2\2\2\u049e\u049f\5\u0169\u00ad"+
		"\2\u049f\u04a0\b\u00a5\u0085\2\u04a0\u015a\3\2\2\2\u04a1\u04a5\7&\2\2"+
		"\u04a2\u04a4\n\6\2\2\u04a3\u04a2\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8"+
		"\u04a9\b\u00a6\u0086\2\u04a9\u015c\3\2\2\2\u04aa\u04ab\13\2\2\2\u04ab"+
		"\u04ac\b\u00a7\u0087\2\u04ac\u015e\3\2\2\2\u04ad\u04af\5\u016b\u00ae\2"+
		"\u04ae\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\b\u00a8\u0088\2\u04b3\u0160\3"+
		"\2\2\2\u04b4\u04b5\5\u0169\u00ad\2\u04b5\u04b6\b\u00a9\u0089\2\u04b6\u0162"+
		"\3\2\2\2\u04b7\u04b9\6\u00aa\3\2\u04b8\u04ba\n\6\2\2\u04b9\u04b8\3\2\2"+
		"\2\u04ba\u04bb\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd"+
		"\3\2\2\2\u04bd\u04be\b\u00aa\u008a\2\u04be\u0164\3\2\2\2\u04bf\u04c0\13"+
		"\2\2\2\u04c0\u04c1\b\u00ab\u008b\2\u04c1\u0166\3\2\2\2\u04c2\u04c3\t\35"+
		"\2\2\u04c3\u0168\3\2\2\2\u04c4\u04c6\7\17\2\2\u04c5\u04c4\3\2\2\2\u04c5"+
		"\u04c6\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\7\f\2\2\u04c8\u016a\3\2"+
		"\2\2\u04c9\u04ce\t\5\2\2\u04ca\u04cb\5\u0169\u00ad\2\u04cb\u04cc\7-\2"+
		"\2\u04cc\u04ce\3\2\2\2\u04cd\u04c9\3\2\2\2\u04cd\u04ca\3\2\2\2\u04ce\u016c"+
		"\3\2\2\2\u04cf\u04d3\7)\2\2\u04d0\u04d2\n\36\2\2\u04d1\u04d0\3\2\2\2\u04d2"+
		"\u04d5\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\3\2"+
		"\2\2\u04d5\u04d3\3\2\2\2\u04d6\u04d7\7)\2\2\u04d7\u016e\3\2\2\2\u04d8"+
		"\u04d9\7\60\2\2\u04d9\u04da\t\n\2\2\u04da\u04db\t\25\2\2\u04db\u04dc\t"+
		"\37\2\2\u04dc\u04dd\t\7\2\2\u04dd\u04de\t\b\2\2\u04de\u04df\t\23\2\2\u04df"+
		"\u0170\3\2\2\2\u04e0\u04e1\7\60\2\2\u04e1\u04e2\t\16\2\2\u04e2\u04e3\t"+
		" \2\2\u04e3\u04e4\t\27\2\2\u04e4\u04e5\t\n\2\2\u04e5\u0172\3\2\2\2\u04e6"+
		"\u04e7\7\60\2\2\u04e7\u04e8\t\33\2\2\u04e8\u04e9\t\24\2\2\u04e9\u04ea"+
		"\t\27\2\2\u04ea\u04eb\t\16\2\2\u04eb\u04ec\t\t\2\2\u04ec\u0174\3\2\2\2"+
		"\u04ed\u04ee\7\60\2\2\u04ee\u04ef\t\23\2\2\u04ef\u04f0\t\4\2\2\u04f0\u04f1"+
		"\t\22\2\2\u04f1\u04f2\t \2\2\u04f2\u0176\3\2\2\2\u04f3\u04f4\7\60\2\2"+
		"\u04f4\u04f5\t!\2\2\u04f5\u04f6\t\4\2\2\u04f6\u04f7\t\r\2\2\u04f7\u04f8"+
		"\t \2\2\u04f8\u04f9\t\23\2\2\u04f9\u0178\3\2\2\2T\2\3\4\5\6\7\b\t\n\13"+
		"\f\r\16\17\20\21\22\u017c\u0181\u0186\u018e\u019d\u01aa\u0216\u0225\u022e"+
		"\u023a\u0242\u024a\u0252\u025a\u0262\u026a\u0272\u027a\u0282\u028a\u0292"+
		"\u029a\u02a2\u02aa\u02b2\u02ba\u02c2\u02ca\u02d2\u02da\u02e2\u02f0\u02fd"+
		"\u030d\u031b\u0326\u0343\u034e\u036b\u0376\u0393\u039e\u03bb\u03c6\u03d7"+
		"\u03e2\u03f0\u03fb\u040c\u041d\u042b\u0435\u0437\u0451\u045c\u046a\u0475"+
		"\u0483\u048e\u04a5\u04b0\u04bb\u04c5\u04cd\u04d3\u008c\2\3\2\3#\2\3$\3"+
		"\3%\4\3&\5\3\'\6\3(\7\3)\b\3*\t\3+\n\3,\13\3-\f\3.\r\3/\16\3\60\17\3\61"+
		"\20\3\62\21\3\63\22\3\64\23\3\65\24\3\66\25\3\67\26\38\27\39\30\3:\31"+
		"\3;\32\3<\33\3=\34\3>\35\3?\36\3@\37\3A \3B!\3C\"\3D#\3E$\3F%\3G&\3H\'"+
		"\3I(\3J)\3K*\3L+\3M,\3N-\3O.\3P/\3Q\60\3R\61\3S\62\3T\63\3U\64\3V\65\3"+
		"W\66\3X\67\3Y8\3Z9\3[:\3\\;\3]<\3^=\3_>\3`?\3a@\3bA\3cB\3dC\3eD\3fE\3"+
		"gF\3hG\3iH\3jI\3kJ\3lK\3mL\3nM\3oN\3pO\3qP\3rQ\3sR\3tS\3uT\3vU\3wV\3x"+
		"W\3yX\3zY\3{Z\3|[\3}\\\3~]\3\177^\3\u0080_\3\u0081`\3\u0082a\3\u0083b"+
		"\3\u0084c\3\u0085d\3\u0086e\3\u0087f\3\u0088g\3\u0089h\3\u008ai\3\u008b"+
		"j\3\u008ck\3\u008dl\3\u008em\3\u008fn\3\u0090o\3\u0091p\3\u0092q\3\u0093"+
		"r\3\u0094s\3\u0095t\3\u0096u\3\u0097v\3\u0098w\3\u0099x\3\u009ay\3\u009b"+
		"z\3\u009c{\3\u009d|\3\u009e}\3\u009f~\3\u00a0\177\3\u00a1\u0080\3\u00a2"+
		"\u0081\3\u00a3\u0082\3\u00a4\u0083\3\u00a5\u0084\3\u00a6\u0085\3\u00a7"+
		"\u0086\3\u00a8\u0087\3\u00a9\u0088\3\u00aa\u0089\3\u00ab\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}