// Generated from /home/src/ngspice-idea-plugin/src/main/grammars/org/ngs/parser/NgsParser.g4 by ANTLR 4.7
package org.ngs.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NgsParser extends Parser {
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
		RULE_root = 0, RULE_circuit = 1, RULE_line = 2, RULE_err_entry = 3, RULE_tran_entry = 4, 
		RULE_print_entry = 5, RULE_include_entry = 6, RULE_options_entry = 7, 
		RULE_print_node = 8, RULE_print_node_v = 9, RULE_print_node_i = 10, RULE_d_entry = 11, 
		RULE_q_entry = 12, RULE_j_entry = 13, RULE_z_entry = 14, RULE_m_entry = 15, 
		RULE_t_entry = 16, RULE_o_entry = 17, RULE_u_entry = 18, RULE_y_entry = 19, 
		RULE_s_entry = 20, RULE_w_entry = 21, RULE_r_entry = 22, RULE_c_entry = 23, 
		RULE_k_entry = 24, RULE_l_entry = 25, RULE_i_entry = 26, RULE_v_entry = 27, 
		RULE_v_val = 28, RULE_v_tran = 29, RULE_e_entry = 30, RULE_e_poly = 31, 
		RULE_e_simple = 32, RULE_g_entry = 33, RULE_f_entry = 34, RULE_h_entry = 35, 
		RULE_f_poly = 36, RULE_f_simple = 37, RULE_x_entry = 38, RULE_kv_entry = 39, 
		RULE_kvpair = 40, RULE_subckt = 41, RULE_subckt_head_entry = 42, RULE_subckt_tail_entry = 43, 
		RULE_a_entry = 44, RULE_a_node = 45, RULE_a_arr = 46, RULE_a_val = 47, 
		RULE_a_val_typed_node = 48, RULE_a_val_typed_v = 49, RULE_model_entry = 50, 
		RULE_eol = 51, RULE_ffff = 52;
	public static final String[] ruleNames = {
		"root", "circuit", "line", "err_entry", "tran_entry", "print_entry", "include_entry", 
		"options_entry", "print_node", "print_node_v", "print_node_i", "d_entry", 
		"q_entry", "j_entry", "z_entry", "m_entry", "t_entry", "o_entry", "u_entry", 
		"y_entry", "s_entry", "w_entry", "r_entry", "c_entry", "k_entry", "l_entry", 
		"i_entry", "v_entry", "v_val", "v_tran", "e_entry", "e_poly", "e_simple", 
		"g_entry", "f_entry", "h_entry", "f_poly", "f_simple", "x_entry", "kv_entry", 
		"kvpair", "subckt", "subckt_head_entry", "subckt_tail_entry", "a_entry", 
		"a_node", "a_arr", "a_val", "a_val_typed_node", "a_val_typed_v", "model_entry", 
		"eol", "ffff"
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

	@Override
	public String getGrammarFileName() { return "NgsParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NgsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public CircuitContext circuit() {
			return getRuleContext(CircuitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NgsParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			circuit();
			setState(107);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CircuitContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(NgsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NgsParser.NEWLINE, i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SubcktContext> subckt() {
			return getRuleContexts(SubcktContext.class);
		}
		public SubcktContext subckt(int i) {
			return getRuleContext(SubcktContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public CircuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circuit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterCircuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitCircuit(this);
		}
	}

	public final CircuitContext circuit() throws RecognitionException {
		CircuitContext _localctx = new CircuitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_circuit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INCLUDE:
				case OPTIONS:
				case BC:
				case H_MODEL:
				case H_R:
				case H_C:
				case H_K:
				case H_L:
				case H_S:
				case H_W:
				case H_V:
				case H_I:
				case H_E:
				case H_G:
				case H_F:
				case H_H:
				case H_A:
				case H_T:
				case H_O:
				case H_U:
				case H_Y:
				case H_D:
				case H_Q:
				case H_J:
				case H_Z:
				case H_M:
				case H_SUBCKT:
				case H_X:
				case TRAN:
				case PRINT:
					{
					{
					setState(111);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case H_SUBCKT:
						{
						setState(109);
						subckt();
						}
						break;
					case INCLUDE:
					case OPTIONS:
					case BC:
					case H_MODEL:
					case H_R:
					case H_C:
					case H_K:
					case H_L:
					case H_S:
					case H_W:
					case H_V:
					case H_I:
					case H_E:
					case H_G:
					case H_F:
					case H_H:
					case H_A:
					case H_T:
					case H_O:
					case H_U:
					case H_Y:
					case H_D:
					case H_Q:
					case H_J:
					case H_Z:
					case H_M:
					case H_X:
					case TRAN:
					case PRINT:
						{
						setState(110);
						line();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(113);
					eol();
					}
					}
					break;
				case NEWLINE:
					{
					setState(115);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (NEWLINE - 7)) | (1L << (INCLUDE - 7)) | (1L << (OPTIONS - 7)) | (1L << (BC - 7)) | (1L << (H_MODEL - 7)) | (1L << (H_R - 7)) | (1L << (H_C - 7)) | (1L << (H_K - 7)) | (1L << (H_L - 7)) | (1L << (H_S - 7)) | (1L << (H_W - 7)) | (1L << (H_V - 7)) | (1L << (H_I - 7)) | (1L << (H_E - 7)) | (1L << (H_G - 7)) | (1L << (H_F - 7)) | (1L << (H_H - 7)) | (1L << (H_A - 7)) | (1L << (H_T - 7)) | (1L << (H_O - 7)) | (1L << (H_U - 7)) | (1L << (H_Y - 7)) | (1L << (H_D - 7)) | (1L << (H_Q - 7)) | (1L << (H_J - 7)) | (1L << (H_Z - 7)) | (1L << (H_M - 7)) | (1L << (H_SUBCKT - 7)) | (1L << (H_X - 7)) | (1L << (TRAN - 7)) | (1L << (PRINT - 7)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public R_entryContext r_entry() {
			return getRuleContext(R_entryContext.class,0);
		}
		public C_entryContext c_entry() {
			return getRuleContext(C_entryContext.class,0);
		}
		public L_entryContext l_entry() {
			return getRuleContext(L_entryContext.class,0);
		}
		public V_entryContext v_entry() {
			return getRuleContext(V_entryContext.class,0);
		}
		public I_entryContext i_entry() {
			return getRuleContext(I_entryContext.class,0);
		}
		public E_entryContext e_entry() {
			return getRuleContext(E_entryContext.class,0);
		}
		public G_entryContext g_entry() {
			return getRuleContext(G_entryContext.class,0);
		}
		public F_entryContext f_entry() {
			return getRuleContext(F_entryContext.class,0);
		}
		public H_entryContext h_entry() {
			return getRuleContext(H_entryContext.class,0);
		}
		public X_entryContext x_entry() {
			return getRuleContext(X_entryContext.class,0);
		}
		public A_entryContext a_entry() {
			return getRuleContext(A_entryContext.class,0);
		}
		public Model_entryContext model_entry() {
			return getRuleContext(Model_entryContext.class,0);
		}
		public K_entryContext k_entry() {
			return getRuleContext(K_entryContext.class,0);
		}
		public S_entryContext s_entry() {
			return getRuleContext(S_entryContext.class,0);
		}
		public W_entryContext w_entry() {
			return getRuleContext(W_entryContext.class,0);
		}
		public T_entryContext t_entry() {
			return getRuleContext(T_entryContext.class,0);
		}
		public O_entryContext o_entry() {
			return getRuleContext(O_entryContext.class,0);
		}
		public U_entryContext u_entry() {
			return getRuleContext(U_entryContext.class,0);
		}
		public Y_entryContext y_entry() {
			return getRuleContext(Y_entryContext.class,0);
		}
		public D_entryContext d_entry() {
			return getRuleContext(D_entryContext.class,0);
		}
		public Q_entryContext q_entry() {
			return getRuleContext(Q_entryContext.class,0);
		}
		public J_entryContext j_entry() {
			return getRuleContext(J_entryContext.class,0);
		}
		public Z_entryContext z_entry() {
			return getRuleContext(Z_entryContext.class,0);
		}
		public M_entryContext m_entry() {
			return getRuleContext(M_entryContext.class,0);
		}
		public Tran_entryContext tran_entry() {
			return getRuleContext(Tran_entryContext.class,0);
		}
		public Print_entryContext print_entry() {
			return getRuleContext(Print_entryContext.class,0);
		}
		public Include_entryContext include_entry() {
			return getRuleContext(Include_entryContext.class,0);
		}
		public Options_entryContext options_entry() {
			return getRuleContext(Options_entryContext.class,0);
		}
		public Err_entryContext err_entry() {
			return getRuleContext(Err_entryContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H_R:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				r_entry();
				}
				break;
			case H_C:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				c_entry();
				}
				break;
			case H_L:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				l_entry();
				}
				break;
			case H_V:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				v_entry();
				}
				break;
			case H_I:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				i_entry();
				}
				break;
			case H_E:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				e_entry();
				}
				break;
			case H_G:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				g_entry();
				}
				break;
			case H_F:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				f_entry();
				}
				break;
			case H_H:
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				h_entry();
				}
				break;
			case H_X:
				enterOuterAlt(_localctx, 10);
				{
				setState(129);
				x_entry();
				}
				break;
			case H_A:
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				a_entry();
				}
				break;
			case H_MODEL:
				enterOuterAlt(_localctx, 12);
				{
				setState(131);
				model_entry();
				}
				break;
			case H_K:
				enterOuterAlt(_localctx, 13);
				{
				setState(132);
				k_entry();
				}
				break;
			case H_S:
				enterOuterAlt(_localctx, 14);
				{
				setState(133);
				s_entry();
				}
				break;
			case H_W:
				enterOuterAlt(_localctx, 15);
				{
				setState(134);
				w_entry();
				}
				break;
			case H_T:
				enterOuterAlt(_localctx, 16);
				{
				setState(135);
				t_entry();
				}
				break;
			case H_O:
				enterOuterAlt(_localctx, 17);
				{
				setState(136);
				o_entry();
				}
				break;
			case H_U:
				enterOuterAlt(_localctx, 18);
				{
				setState(137);
				u_entry();
				}
				break;
			case H_Y:
				enterOuterAlt(_localctx, 19);
				{
				setState(138);
				y_entry();
				}
				break;
			case H_D:
				enterOuterAlt(_localctx, 20);
				{
				setState(139);
				d_entry();
				}
				break;
			case H_Q:
				enterOuterAlt(_localctx, 21);
				{
				setState(140);
				q_entry();
				}
				break;
			case H_J:
				enterOuterAlt(_localctx, 22);
				{
				setState(141);
				j_entry();
				}
				break;
			case H_Z:
				enterOuterAlt(_localctx, 23);
				{
				setState(142);
				z_entry();
				}
				break;
			case H_M:
				enterOuterAlt(_localctx, 24);
				{
				setState(143);
				m_entry();
				}
				break;
			case TRAN:
				enterOuterAlt(_localctx, 25);
				{
				setState(144);
				tran_entry();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 26);
				{
				setState(145);
				print_entry();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 27);
				{
				setState(146);
				include_entry();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 28);
				{
				setState(147);
				options_entry();
				}
				break;
			case BC:
				enterOuterAlt(_localctx, 29);
				{
				setState(148);
				err_entry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Err_entryContext extends ParserRuleContext {
		public List<TerminalNode> BC() { return getTokens(NgsParser.BC); }
		public TerminalNode BC(int i) {
			return getToken(NgsParser.BC, i);
		}
		public Err_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_err_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterErr_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitErr_entry(this);
		}
	}

	public final Err_entryContext err_entry() throws RecognitionException {
		Err_entryContext _localctx = new Err_entryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_err_entry);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(151);
					match(BC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tran_entryContext extends ParserRuleContext {
		public TerminalNode TRAN() { return getToken(NgsParser.TRAN, 0); }
		public List<TerminalNode> VAL() { return getTokens(NgsParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(NgsParser.VAL, i);
		}
		public Tran_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tran_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterTran_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitTran_entry(this);
		}
	}

	public final Tran_entryContext tran_entry() throws RecognitionException {
		Tran_entryContext _localctx = new Tran_entryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tran_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TRAN);
			setState(157);
			match(VAL);
			setState(158);
			match(VAL);
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(159);
				match(VAL);
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(160);
					match(VAL);
					}
					break;
				}
				}
				break;
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL) {
				{
				setState(165);
				match(VAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_entryContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(NgsParser.PRINT, 0); }
		public TerminalNode PLOT_TYPE() { return getToken(NgsParser.PLOT_TYPE, 0); }
		public List<Print_nodeContext> print_node() {
			return getRuleContexts(Print_nodeContext.class);
		}
		public Print_nodeContext print_node(int i) {
			return getRuleContext(Print_nodeContext.class,i);
		}
		public Print_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterPrint_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitPrint_entry(this);
		}
	}

	public final Print_entryContext print_entry() throws RecognitionException {
		Print_entryContext _localctx = new Print_entryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PRINT);
			setState(169);
			match(PLOT_TYPE);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				print_node();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PAR_L || _la==PLOT_POINT_TYPE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Include_entryContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(NgsParser.INCLUDE, 0); }
		public TerminalNode FILENAME() { return getToken(NgsParser.FILENAME, 0); }
		public Include_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterInclude_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitInclude_entry(this);
		}
	}

	public final Include_entryContext include_entry() throws RecognitionException {
		Include_entryContext _localctx = new Include_entryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_include_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(INCLUDE);
			setState(176);
			match(FILENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Options_entryContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(NgsParser.OPTIONS, 0); }
		public List<TerminalNode> KV_KEY() { return getTokens(NgsParser.KV_KEY); }
		public TerminalNode KV_KEY(int i) {
			return getToken(NgsParser.KV_KEY, i);
		}
		public List<TerminalNode> EQ() { return getTokens(NgsParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(NgsParser.EQ, i);
		}
		public List<TerminalNode> VAL() { return getTokens(NgsParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(NgsParser.VAL, i);
		}
		public Options_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterOptions_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitOptions_entry(this);
		}
	}

	public final Options_entryContext options_entry() throws RecognitionException {
		Options_entryContext _localctx = new Options_entryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_options_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(OPTIONS);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				match(KV_KEY);
				setState(180);
				match(EQ);
				setState(181);
				match(VAL);
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KV_KEY );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_nodeContext extends ParserRuleContext {
		public Print_node_iContext print_node_i() {
			return getRuleContext(Print_node_iContext.class,0);
		}
		public Print_node_vContext print_node_v() {
			return getRuleContext(Print_node_vContext.class,0);
		}
		public Print_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterPrint_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitPrint_node(this);
		}
	}

	public final Print_nodeContext print_node() throws RecognitionException {
		Print_nodeContext _localctx = new Print_nodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print_node);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				print_node_i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				print_node_v();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_node_vContext extends ParserRuleContext {
		public TerminalNode PAR_L() { return getToken(NgsParser.PAR_L, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode PAR_R() { return getToken(NgsParser.PAR_R, 0); }
		public TerminalNode PLOT_POINT_TYPE() { return getToken(NgsParser.PLOT_POINT_TYPE, 0); }
		public TerminalNode COMMA() { return getToken(NgsParser.COMMA, 0); }
		public Print_node_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_node_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterPrint_node_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitPrint_node_v(this);
		}
	}

	public final Print_node_vContext print_node_v() throws RecognitionException {
		Print_node_vContext _localctx = new Print_node_vContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print_node_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLOT_POINT_TYPE) {
				{
				setState(190);
				match(PLOT_POINT_TYPE);
				}
			}

			setState(193);
			match(PAR_L);
			setState(194);
			match(NODE);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(195);
				match(COMMA);
				setState(196);
				match(NODE);
				}
			}

			setState(199);
			match(PAR_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_node_iContext extends ParserRuleContext {
		public TerminalNode PLOT_POINT_TYPE() { return getToken(NgsParser.PLOT_POINT_TYPE, 0); }
		public TerminalNode PAR_L() { return getToken(NgsParser.PAR_L, 0); }
		public TerminalNode H_V() { return getToken(NgsParser.H_V, 0); }
		public TerminalNode PAR_R() { return getToken(NgsParser.PAR_R, 0); }
		public Print_node_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_node_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterPrint_node_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitPrint_node_i(this);
		}
	}

	public final Print_node_iContext print_node_i() throws RecognitionException {
		Print_node_iContext _localctx = new Print_node_iContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print_node_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(PLOT_POINT_TYPE);
			setState(202);
			match(PAR_L);
			setState(203);
			match(H_V);
			setState(204);
			match(PAR_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class D_entryContext extends ParserRuleContext {
		public TerminalNode H_D() { return getToken(NgsParser.H_D, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public D_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterD_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitD_entry(this);
		}
	}

	public final D_entryContext d_entry() throws RecognitionException {
		D_entryContext _localctx = new D_entryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_d_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(H_D);
			setState(207);
			match(NODE);
			setState(208);
			match(NODE);
			setState(209);
			match(MODEL_NAME);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(210);
				kv_entry();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Q_entryContext extends ParserRuleContext {
		public TerminalNode H_Q() { return getToken(NgsParser.H_Q, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public Q_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterQ_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitQ_entry(this);
		}
	}

	public final Q_entryContext q_entry() throws RecognitionException {
		Q_entryContext _localctx = new Q_entryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_q_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(H_Q);
			setState(217);
			match(NODE);
			setState(218);
			match(NODE);
			setState(219);
			match(NODE);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NODE) {
				{
				setState(220);
				match(NODE);
				}
			}

			setState(223);
			match(MODEL_NAME);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(224);
				kv_entry();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class J_entryContext extends ParserRuleContext {
		public TerminalNode H_J() { return getToken(NgsParser.H_J, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public J_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterJ_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitJ_entry(this);
		}
	}

	public final J_entryContext j_entry() throws RecognitionException {
		J_entryContext _localctx = new J_entryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_j_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(H_J);
			setState(231);
			match(NODE);
			setState(232);
			match(NODE);
			setState(233);
			match(NODE);
			setState(234);
			match(MODEL_NAME);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(235);
				kv_entry();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Z_entryContext extends ParserRuleContext {
		public TerminalNode H_Z() { return getToken(NgsParser.H_Z, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public Z_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterZ_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitZ_entry(this);
		}
	}

	public final Z_entryContext z_entry() throws RecognitionException {
		Z_entryContext _localctx = new Z_entryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_z_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(H_Z);
			setState(242);
			match(NODE);
			setState(243);
			match(NODE);
			setState(244);
			match(NODE);
			setState(245);
			match(MODEL_NAME);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(246);
				kv_entry();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_entryContext extends ParserRuleContext {
		public TerminalNode H_M() { return getToken(NgsParser.H_M, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public M_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterM_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitM_entry(this);
		}
	}

	public final M_entryContext m_entry() throws RecognitionException {
		M_entryContext _localctx = new M_entryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_m_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(H_M);
			setState(253);
			match(NODE);
			setState(254);
			match(NODE);
			setState(255);
			match(NODE);
			setState(256);
			match(NODE);
			setState(257);
			match(MODEL_NAME);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(258);
				kv_entry();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_entryContext extends ParserRuleContext {
		public TerminalNode H_T() { return getToken(NgsParser.H_T, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public T_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterT_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitT_entry(this);
		}
	}

	public final T_entryContext t_entry() throws RecognitionException {
		T_entryContext _localctx = new T_entryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_t_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(H_T);
			setState(265);
			match(NODE);
			setState(266);
			match(NODE);
			setState(267);
			match(NODE);
			setState(268);
			match(NODE);
			setState(269);
			kvpair();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(270);
				kv_entry();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class O_entryContext extends ParserRuleContext {
		public TerminalNode H_O() { return getToken(NgsParser.H_O, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public O_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterO_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitO_entry(this);
		}
	}

	public final O_entryContext o_entry() throws RecognitionException {
		O_entryContext _localctx = new O_entryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_o_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(H_O);
			setState(277);
			match(NODE);
			setState(278);
			match(NODE);
			setState(279);
			match(NODE);
			setState(280);
			match(NODE);
			setState(281);
			match(MODEL_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class U_entryContext extends ParserRuleContext {
		public TerminalNode H_U() { return getToken(NgsParser.H_U, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public U_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterU_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitU_entry(this);
		}
	}

	public final U_entryContext u_entry() throws RecognitionException {
		U_entryContext _localctx = new U_entryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_u_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(H_U);
			setState(284);
			match(NODE);
			setState(285);
			match(NODE);
			setState(286);
			match(NODE);
			setState(287);
			match(MODEL_NAME);
			setState(288);
			kvpair();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(289);
				kv_entry();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Y_entryContext extends ParserRuleContext {
		public TerminalNode H_Y() { return getToken(NgsParser.H_Y, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public Y_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterY_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitY_entry(this);
		}
	}

	public final Y_entryContext y_entry() throws RecognitionException {
		Y_entryContext _localctx = new Y_entryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_y_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(H_Y);
			setState(296);
			match(NODE);
			setState(297);
			match(NODE);
			setState(298);
			match(NODE);
			setState(299);
			match(NODE);
			setState(300);
			match(MODEL_NAME);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(301);
				kv_entry();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_entryContext extends ParserRuleContext {
		public TerminalNode H_S() { return getToken(NgsParser.H_S, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public TerminalNode VAL() { return getToken(NgsParser.VAL, 0); }
		public S_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterS_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitS_entry(this);
		}
	}

	public final S_entryContext s_entry() throws RecognitionException {
		S_entryContext _localctx = new S_entryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_s_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(H_S);
			setState(308);
			match(NODE);
			setState(309);
			match(NODE);
			setState(310);
			match(NODE);
			setState(311);
			match(NODE);
			setState(312);
			match(MODEL_NAME);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL) {
				{
				setState(313);
				match(VAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class W_entryContext extends ParserRuleContext {
		public TerminalNode H_W() { return getToken(NgsParser.H_W, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode H_V() { return getToken(NgsParser.H_V, 0); }
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public TerminalNode VAL() { return getToken(NgsParser.VAL, 0); }
		public W_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterW_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitW_entry(this);
		}
	}

	public final W_entryContext w_entry() throws RecognitionException {
		W_entryContext _localctx = new W_entryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_w_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(H_W);
			setState(317);
			match(NODE);
			setState(318);
			match(NODE);
			setState(319);
			match(H_V);
			setState(320);
			match(MODEL_NAME);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL) {
				{
				setState(321);
				match(VAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_entryContext extends ParserRuleContext {
		public TerminalNode H_R() { return getToken(NgsParser.H_R, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public R_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterR_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitR_entry(this);
		}
	}

	public final R_entryContext r_entry() throws RecognitionException {
		R_entryContext _localctx = new R_entryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_r_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(H_R);
			setState(325);
			match(NODE);
			setState(326);
			match(NODE);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODEL_NAME) {
				{
				setState(327);
				match(MODEL_NAME);
				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(330);
				kv_entry();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_entryContext extends ParserRuleContext {
		public TerminalNode H_C() { return getToken(NgsParser.H_C, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public C_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterC_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitC_entry(this);
		}
	}

	public final C_entryContext c_entry() throws RecognitionException {
		C_entryContext _localctx = new C_entryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_c_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(H_C);
			setState(337);
			match(NODE);
			setState(338);
			match(NODE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODEL_NAME) {
				{
				setState(339);
				match(MODEL_NAME);
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(342);
				kv_entry();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class K_entryContext extends ParserRuleContext {
		public TerminalNode H_K() { return getToken(NgsParser.H_K, 0); }
		public List<TerminalNode> H_L() { return getTokens(NgsParser.H_L); }
		public TerminalNode H_L(int i) {
			return getToken(NgsParser.H_L, i);
		}
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public K_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterK_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitK_entry(this);
		}
	}

	public final K_entryContext k_entry() throws RecognitionException {
		K_entryContext _localctx = new K_entryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_k_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(H_K);
			setState(349);
			match(H_L);
			setState(350);
			match(H_L);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(351);
				kv_entry();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L_entryContext extends ParserRuleContext {
		public TerminalNode H_L() { return getToken(NgsParser.H_L, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public L_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterL_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitL_entry(this);
		}
	}

	public final L_entryContext l_entry() throws RecognitionException {
		L_entryContext _localctx = new L_entryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_l_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(H_L);
			setState(358);
			match(NODE);
			setState(359);
			match(NODE);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODEL_NAME) {
				{
				setState(360);
				match(MODEL_NAME);
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(363);
				kv_entry();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class I_entryContext extends ParserRuleContext {
		public TerminalNode H_I() { return getToken(NgsParser.H_I, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public List<V_valContext> v_val() {
			return getRuleContexts(V_valContext.class);
		}
		public V_valContext v_val(int i) {
			return getRuleContext(V_valContext.class,i);
		}
		public I_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterI_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitI_entry(this);
		}
	}

	public final I_entryContext i_entry() throws RecognitionException {
		I_entryContext _localctx = new I_entryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_i_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(H_I);
			setState(370);
			match(NODE);
			setState(371);
			match(NODE);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << PULSE) | (1L << SIN) | (1L << EXP) | (1L << PWL) | (1L << SFFM) | (1L << AM) | (1L << TRNOISE) | (1L << TRRANDOM) | (1L << EXTERNAL))) != 0)) {
				{
				{
				setState(372);
				v_val();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class V_entryContext extends ParserRuleContext {
		public TerminalNode H_V() { return getToken(NgsParser.H_V, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public List<V_valContext> v_val() {
			return getRuleContexts(V_valContext.class);
		}
		public V_valContext v_val(int i) {
			return getRuleContext(V_valContext.class,i);
		}
		public V_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterV_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitV_entry(this);
		}
	}

	public final V_entryContext v_entry() throws RecognitionException {
		V_entryContext _localctx = new V_entryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_v_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(H_V);
			setState(379);
			match(NODE);
			setState(380);
			match(NODE);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL) | (1L << PULSE) | (1L << SIN) | (1L << EXP) | (1L << PWL) | (1L << SFFM) | (1L << AM) | (1L << TRNOISE) | (1L << TRRANDOM) | (1L << EXTERNAL))) != 0)) {
				{
				{
				setState(381);
				v_val();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class V_valContext extends ParserRuleContext {
		public V_tranContext v_tran() {
			return getRuleContext(V_tranContext.class,0);
		}
		public TerminalNode VAL() { return getToken(NgsParser.VAL, 0); }
		public V_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterV_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitV_val(this);
		}
	}

	public final V_valContext v_val() throws RecognitionException {
		V_valContext _localctx = new V_valContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_v_val);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PULSE:
			case SIN:
			case EXP:
			case PWL:
			case SFFM:
			case AM:
			case TRNOISE:
			case TRRANDOM:
			case EXTERNAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				v_tran();
				}
				break;
			case VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class V_tranContext extends ParserRuleContext {
		public TerminalNode PULSE() { return getToken(NgsParser.PULSE, 0); }
		public TerminalNode PAR_L() { return getToken(NgsParser.PAR_L, 0); }
		public List<TerminalNode> VAL() { return getTokens(NgsParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(NgsParser.VAL, i);
		}
		public TerminalNode PAR_R() { return getToken(NgsParser.PAR_R, 0); }
		public TerminalNode SIN() { return getToken(NgsParser.SIN, 0); }
		public TerminalNode EXP() { return getToken(NgsParser.EXP, 0); }
		public TerminalNode PWL() { return getToken(NgsParser.PWL, 0); }
		public TerminalNode SFFM() { return getToken(NgsParser.SFFM, 0); }
		public TerminalNode AM() { return getToken(NgsParser.AM, 0); }
		public TerminalNode TRNOISE() { return getToken(NgsParser.TRNOISE, 0); }
		public TerminalNode TRRANDOM() { return getToken(NgsParser.TRRANDOM, 0); }
		public TerminalNode EXTERNAL() { return getToken(NgsParser.EXTERNAL, 0); }
		public V_tranContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_tran; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterV_tran(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitV_tran(this);
		}
	}

	public final V_tranContext v_tran() throws RecognitionException {
		V_tranContext _localctx = new V_tranContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_v_tran);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PULSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(PULSE);
				setState(392);
				match(PAR_L);
				setState(393);
				match(VAL);
				setState(394);
				match(VAL);
				setState(395);
				match(VAL);
				setState(396);
				match(VAL);
				setState(397);
				match(VAL);
				setState(398);
				match(VAL);
				setState(399);
				match(VAL);
				setState(400);
				match(PAR_R);
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(SIN);
				setState(402);
				match(PAR_L);
				setState(403);
				match(VAL);
				setState(404);
				match(VAL);
				setState(405);
				match(VAL);
				setState(406);
				match(VAL);
				setState(407);
				match(VAL);
				setState(408);
				match(PAR_R);
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(EXP);
				setState(410);
				match(PAR_L);
				setState(411);
				match(VAL);
				setState(412);
				match(VAL);
				setState(413);
				match(VAL);
				setState(414);
				match(VAL);
				setState(415);
				match(VAL);
				setState(416);
				match(VAL);
				setState(417);
				match(PAR_R);
				}
				break;
			case PWL:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(PWL);
				setState(419);
				match(PAR_L);
				setState(420);
				match(VAL);
				setState(421);
				match(VAL);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAL) {
					{
					{
					setState(422);
					match(VAL);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				match(PAR_R);
				}
				break;
			case SFFM:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				match(SFFM);
				setState(430);
				match(PAR_L);
				setState(431);
				match(VAL);
				setState(432);
				match(VAL);
				setState(433);
				match(VAL);
				setState(434);
				match(VAL);
				setState(435);
				match(VAL);
				setState(436);
				match(PAR_R);
				}
				break;
			case AM:
				enterOuterAlt(_localctx, 6);
				{
				setState(437);
				match(AM);
				setState(438);
				match(PAR_L);
				setState(439);
				match(VAL);
				setState(440);
				match(VAL);
				setState(441);
				match(VAL);
				setState(442);
				match(VAL);
				setState(443);
				match(VAL);
				setState(444);
				match(PAR_R);
				}
				break;
			case TRNOISE:
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
				match(TRNOISE);
				setState(446);
				match(PAR_L);
				setState(447);
				match(VAL);
				setState(448);
				match(VAL);
				setState(449);
				match(VAL);
				setState(450);
				match(VAL);
				setState(451);
				match(VAL);
				setState(452);
				match(VAL);
				setState(453);
				match(VAL);
				setState(454);
				match(PAR_R);
				}
				break;
			case TRRANDOM:
				enterOuterAlt(_localctx, 8);
				{
				setState(455);
				match(TRRANDOM);
				setState(456);
				match(PAR_L);
				setState(457);
				match(VAL);
				setState(458);
				match(VAL);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL) {
					{
					setState(459);
					match(VAL);
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAL) {
						{
						setState(460);
						match(VAL);
						setState(462);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==VAL) {
							{
							setState(461);
							match(VAL);
							}
						}

						}
					}

					}
				}

				setState(468);
				match(PAR_R);
				}
				break;
			case EXTERNAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(469);
				match(EXTERNAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class E_entryContext extends ParserRuleContext {
		public TerminalNode H_E() { return getToken(NgsParser.H_E, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public E_polyContext e_poly() {
			return getRuleContext(E_polyContext.class,0);
		}
		public E_simpleContext e_simple() {
			return getRuleContext(E_simpleContext.class,0);
		}
		public E_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterE_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitE_entry(this);
		}
	}

	public final E_entryContext e_entry() throws RecognitionException {
		E_entryContext _localctx = new E_entryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_e_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(472);
			match(H_E);
			setState(473);
			match(NODE);
			setState(474);
			match(NODE);
			}
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLY:
				{
				setState(476);
				e_poly();
				}
				break;
			case NODE:
				{
				setState(477);
				e_simple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class E_polyContext extends ParserRuleContext {
		public TerminalNode POLY() { return getToken(NgsParser.POLY, 0); }
		public List<TerminalNode> VAL() { return getTokens(NgsParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(NgsParser.VAL, i);
		}
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public E_polyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_poly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterE_poly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitE_poly(this);
		}
	}

	public final E_polyContext e_poly() throws RecognitionException {
		E_polyContext _localctx = new E_polyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_e_poly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(POLY);
			setState(481);
			match(VAL);
			setState(483); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(482);
				match(NODE);
				}
				}
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NODE );
			setState(488); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(487);
				match(VAL);
				}
				}
				setState(490); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class E_simpleContext extends ParserRuleContext {
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode VAL() { return getToken(NgsParser.VAL, 0); }
		public E_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterE_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitE_simple(this);
		}
	}

	public final E_simpleContext e_simple() throws RecognitionException {
		E_simpleContext _localctx = new E_simpleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_e_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(NODE);
			setState(493);
			match(NODE);
			setState(494);
			match(VAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class G_entryContext extends ParserRuleContext {
		public TerminalNode H_G() { return getToken(NgsParser.H_G, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public E_polyContext e_poly() {
			return getRuleContext(E_polyContext.class,0);
		}
		public E_simpleContext e_simple() {
			return getRuleContext(E_simpleContext.class,0);
		}
		public G_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterG_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitG_entry(this);
		}
	}

	public final G_entryContext g_entry() throws RecognitionException {
		G_entryContext _localctx = new G_entryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_g_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(496);
			match(H_G);
			setState(497);
			match(NODE);
			setState(498);
			match(NODE);
			}
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLY:
				{
				setState(500);
				e_poly();
				}
				break;
			case NODE:
				{
				setState(501);
				e_simple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_entryContext extends ParserRuleContext {
		public TerminalNode H_F() { return getToken(NgsParser.H_F, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public F_polyContext f_poly() {
			return getRuleContext(F_polyContext.class,0);
		}
		public F_simpleContext f_simple() {
			return getRuleContext(F_simpleContext.class,0);
		}
		public F_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterF_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitF_entry(this);
		}
	}

	public final F_entryContext f_entry() throws RecognitionException {
		F_entryContext _localctx = new F_entryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_f_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504);
			match(H_F);
			setState(505);
			match(NODE);
			setState(506);
			match(NODE);
			}
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLY:
				{
				setState(508);
				f_poly();
				}
				break;
			case H_V:
				{
				setState(509);
				f_simple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H_entryContext extends ParserRuleContext {
		public TerminalNode H_H() { return getToken(NgsParser.H_H, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public F_polyContext f_poly() {
			return getRuleContext(F_polyContext.class,0);
		}
		public F_simpleContext f_simple() {
			return getRuleContext(F_simpleContext.class,0);
		}
		public H_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterH_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitH_entry(this);
		}
	}

	public final H_entryContext h_entry() throws RecognitionException {
		H_entryContext _localctx = new H_entryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_h_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(512);
			match(H_H);
			setState(513);
			match(NODE);
			setState(514);
			match(NODE);
			}
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLY:
				{
				setState(516);
				f_poly();
				}
				break;
			case H_V:
				{
				setState(517);
				f_simple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_polyContext extends ParserRuleContext {
		public TerminalNode POLY() { return getToken(NgsParser.POLY, 0); }
		public List<TerminalNode> VAL() { return getTokens(NgsParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(NgsParser.VAL, i);
		}
		public List<TerminalNode> H_V() { return getTokens(NgsParser.H_V); }
		public TerminalNode H_V(int i) {
			return getToken(NgsParser.H_V, i);
		}
		public F_polyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_poly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterF_poly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitF_poly(this);
		}
	}

	public final F_polyContext f_poly() throws RecognitionException {
		F_polyContext _localctx = new F_polyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_f_poly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(POLY);
			setState(521);
			match(VAL);
			setState(523); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(522);
				match(H_V);
				}
				}
				setState(525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==H_V );
			setState(528); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(527);
				match(VAL);
				}
				}
				setState(530); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_simpleContext extends ParserRuleContext {
		public TerminalNode H_V() { return getToken(NgsParser.H_V, 0); }
		public TerminalNode VAL() { return getToken(NgsParser.VAL, 0); }
		public F_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterF_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitF_simple(this);
		}
	}

	public final F_simpleContext f_simple() throws RecognitionException {
		F_simpleContext _localctx = new F_simpleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_f_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(H_V);
			setState(533);
			match(VAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class X_entryContext extends ParserRuleContext {
		public TerminalNode H_X() { return getToken(NgsParser.H_X, 0); }
		public TerminalNode SUBCKT_NAME() { return getToken(NgsParser.SUBCKT_NAME, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public List<KvpairContext> kvpair() {
			return getRuleContexts(KvpairContext.class);
		}
		public KvpairContext kvpair(int i) {
			return getRuleContext(KvpairContext.class,i);
		}
		public X_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterX_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitX_entry(this);
		}
	}

	public final X_entryContext x_entry() throws RecognitionException {
		X_entryContext _localctx = new X_entryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_x_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(H_X);
			setState(537); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(536);
				match(NODE);
				}
				}
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NODE );
			setState(541);
			match(SUBCKT_NAME);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KV_KEY) {
				{
				{
				setState(542);
				kvpair();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kv_entryContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(NgsParser.VAL, 0); }
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public Kv_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kv_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterKv_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitKv_entry(this);
		}
	}

	public final Kv_entryContext kv_entry() throws RecognitionException {
		Kv_entryContext _localctx = new Kv_entryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kv_entry);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(VAL);
				}
				break;
			case KV_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				kvpair();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KvpairContext extends ParserRuleContext {
		public TerminalNode KV_KEY() { return getToken(NgsParser.KV_KEY, 0); }
		public TerminalNode EQ() { return getToken(NgsParser.EQ, 0); }
		public List<TerminalNode> VAL() { return getTokens(NgsParser.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(NgsParser.VAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NgsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NgsParser.COMMA, i);
		}
		public KvpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvpair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterKvpair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitKvpair(this);
		}
	}

	public final KvpairContext kvpair() throws RecognitionException {
		KvpairContext _localctx = new KvpairContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kvpair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(KV_KEY);
			setState(553);
			match(EQ);
			setState(554);
			match(VAL);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(555);
				match(COMMA);
				setState(556);
				match(VAL);
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubcktContext extends ParserRuleContext {
		public Subckt_head_entryContext subckt_head_entry() {
			return getRuleContext(Subckt_head_entryContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(NgsParser.NEWLINE, 0); }
		public CircuitContext circuit() {
			return getRuleContext(CircuitContext.class,0);
		}
		public Subckt_tail_entryContext subckt_tail_entry() {
			return getRuleContext(Subckt_tail_entryContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubcktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subckt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterSubckt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitSubckt(this);
		}
	}

	public final SubcktContext subckt() throws RecognitionException {
		SubcktContext _localctx = new SubcktContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_subckt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			subckt_head_entry();
			setState(563);
			match(NEWLINE);
			setState(564);
			circuit();
			setState(565);
			subckt_tail_entry();
			setState(566);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subckt_head_entryContext extends ParserRuleContext {
		public TerminalNode H_SUBCKT() { return getToken(NgsParser.H_SUBCKT, 0); }
		public TerminalNode SUBCKT_NAME() { return getToken(NgsParser.SUBCKT_NAME, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public List<Kv_entryContext> kv_entry() {
			return getRuleContexts(Kv_entryContext.class);
		}
		public Kv_entryContext kv_entry(int i) {
			return getRuleContext(Kv_entryContext.class,i);
		}
		public Subckt_head_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subckt_head_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterSubckt_head_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitSubckt_head_entry(this);
		}
	}

	public final Subckt_head_entryContext subckt_head_entry() throws RecognitionException {
		Subckt_head_entryContext _localctx = new Subckt_head_entryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_subckt_head_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(H_SUBCKT);
			setState(569);
			match(SUBCKT_NAME);
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(570);
				match(NODE);
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NODE );
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL || _la==KV_KEY) {
				{
				{
				setState(575);
				kv_entry();
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subckt_tail_entryContext extends ParserRuleContext {
		public TerminalNode H_SUBCKT_TAIL() { return getToken(NgsParser.H_SUBCKT_TAIL, 0); }
		public TerminalNode SUBCKT_NAME() { return getToken(NgsParser.SUBCKT_NAME, 0); }
		public Subckt_tail_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subckt_tail_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterSubckt_tail_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitSubckt_tail_entry(this);
		}
	}

	public final Subckt_tail_entryContext subckt_tail_entry() throws RecognitionException {
		Subckt_tail_entryContext _localctx = new Subckt_tail_entryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_subckt_tail_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(H_SUBCKT_TAIL);
			setState(582);
			match(SUBCKT_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_entryContext extends ParserRuleContext {
		public TerminalNode H_A() { return getToken(NgsParser.H_A, 0); }
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public List<A_nodeContext> a_node() {
			return getRuleContexts(A_nodeContext.class);
		}
		public A_nodeContext a_node(int i) {
			return getRuleContext(A_nodeContext.class,i);
		}
		public A_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterA_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitA_entry(this);
		}
	}

	public final A_entryContext a_entry() throws RecognitionException {
		A_entryContext _localctx = new A_entryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_a_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(H_A);
			setState(586); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(585);
				a_node();
				}
				}
				setState(588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NODE) | (1L << BR_L) | (1L << XA_NODE_TYPE) | (1L << H_V))) != 0) );
			setState(590);
			match(MODEL_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_nodeContext extends ParserRuleContext {
		public A_arrContext a_arr() {
			return getRuleContext(A_arrContext.class,0);
		}
		public A_valContext a_val() {
			return getRuleContext(A_valContext.class,0);
		}
		public A_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterA_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitA_node(this);
		}
	}

	public final A_nodeContext a_node() throws RecognitionException {
		A_nodeContext _localctx = new A_nodeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_a_node);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				a_arr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				a_val();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_arrContext extends ParserRuleContext {
		public TerminalNode BR_L() { return getToken(NgsParser.BR_L, 0); }
		public A_valContext a_val() {
			return getRuleContext(A_valContext.class,0);
		}
		public TerminalNode BR_R() { return getToken(NgsParser.BR_R, 0); }
		public TerminalNode XA_NODE_TYPE() { return getToken(NgsParser.XA_NODE_TYPE, 0); }
		public A_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterA_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitA_arr(this);
		}
	}

	public final A_arrContext a_arr() throws RecognitionException {
		A_arrContext _localctx = new A_arrContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_a_arr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XA_NODE_TYPE) {
				{
				setState(596);
				match(XA_NODE_TYPE);
				}
			}

			setState(599);
			match(BR_L);
			setState(600);
			a_val();
			setState(601);
			match(BR_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_valContext extends ParserRuleContext {
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode H_V() { return getToken(NgsParser.H_V, 0); }
		public A_val_typed_nodeContext a_val_typed_node() {
			return getRuleContext(A_val_typed_nodeContext.class,0);
		}
		public A_val_typed_vContext a_val_typed_v() {
			return getRuleContext(A_val_typed_vContext.class,0);
		}
		public A_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterA_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitA_val(this);
		}
	}

	public final A_valContext a_val() throws RecognitionException {
		A_valContext _localctx = new A_valContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_a_val);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(NODE);
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(604);
					match(NODE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(H_V);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				a_val_typed_node();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(609);
				a_val_typed_v();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_val_typed_nodeContext extends ParserRuleContext {
		public TerminalNode XA_NODE_TYPE() { return getToken(NgsParser.XA_NODE_TYPE, 0); }
		public TerminalNode PAR_L() { return getToken(NgsParser.PAR_L, 0); }
		public List<TerminalNode> NODE() { return getTokens(NgsParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(NgsParser.NODE, i);
		}
		public TerminalNode PAR_R() { return getToken(NgsParser.PAR_R, 0); }
		public A_val_typed_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_val_typed_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterA_val_typed_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitA_val_typed_node(this);
		}
	}

	public final A_val_typed_nodeContext a_val_typed_node() throws RecognitionException {
		A_val_typed_nodeContext _localctx = new A_val_typed_nodeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_a_val_typed_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(XA_NODE_TYPE);
			setState(613);
			match(PAR_L);
			setState(614);
			match(NODE);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NODE) {
				{
				setState(615);
				match(NODE);
				}
			}

			setState(618);
			match(PAR_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_val_typed_vContext extends ParserRuleContext {
		public TerminalNode XA_NODE_TYPE() { return getToken(NgsParser.XA_NODE_TYPE, 0); }
		public TerminalNode PAR_L() { return getToken(NgsParser.PAR_L, 0); }
		public TerminalNode H_V() { return getToken(NgsParser.H_V, 0); }
		public TerminalNode PAR_R() { return getToken(NgsParser.PAR_R, 0); }
		public A_val_typed_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_val_typed_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterA_val_typed_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitA_val_typed_v(this);
		}
	}

	public final A_val_typed_vContext a_val_typed_v() throws RecognitionException {
		A_val_typed_vContext _localctx = new A_val_typed_vContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_a_val_typed_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(XA_NODE_TYPE);
			setState(621);
			match(PAR_L);
			setState(622);
			match(H_V);
			setState(623);
			match(PAR_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_entryContext extends ParserRuleContext {
		public TerminalNode H_MODEL() { return getToken(NgsParser.H_MODEL, 0); }
		public TerminalNode MODEL_NAME() { return getToken(NgsParser.MODEL_NAME, 0); }
		public TerminalNode VAL() { return getToken(NgsParser.VAL, 0); }
		public TerminalNode PAR_L() { return getToken(NgsParser.PAR_L, 0); }
		public List<KvpairContext> kvpair() {
			return getRuleContexts(KvpairContext.class);
		}
		public KvpairContext kvpair(int i) {
			return getRuleContext(KvpairContext.class,i);
		}
		public TerminalNode PAR_R() { return getToken(NgsParser.PAR_R, 0); }
		public Model_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterModel_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitModel_entry(this);
		}
	}

	public final Model_entryContext model_entry() throws RecognitionException {
		Model_entryContext _localctx = new Model_entryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_model_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(H_MODEL);
			setState(626);
			match(MODEL_NAME);
			setState(627);
			match(VAL);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAR_L) {
				{
				setState(628);
				match(PAR_L);
				}
			}

			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KV_KEY) {
				{
				{
				setState(631);
				kvpair();
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAR_R) {
				{
				setState(637);
				match(PAR_R);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(NgsParser.NEWLINE, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(640);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FfffContext extends ParserRuleContext {
		public FfffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ffff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).enterFfff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NgsParserListener ) ((NgsParserListener)listener).exitFfff(this);
		}
	}

	public final FfffContext ffff() throws RecognitionException {
		FfffContext _localctx = new FfffContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ffff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ae\u0289\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\3\3\3\5\3r\n\3\3\3\3\3\3\3\6\3w"+
		"\n\3\r\3\16\3x\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0098"+
		"\n\4\3\5\6\5\u009b\n\5\r\5\16\5\u009c\3\6\3\6\3\6\3\6\3\6\5\6\u00a4\n"+
		"\6\5\6\u00a6\n\6\3\6\5\6\u00a9\n\6\3\7\3\7\3\7\6\7\u00ae\n\7\r\7\16\7"+
		"\u00af\3\b\3\b\3\b\3\t\3\t\3\t\3\t\6\t\u00b9\n\t\r\t\16\t\u00ba\3\n\3"+
		"\n\5\n\u00bf\n\n\3\13\5\13\u00c2\n\13\3\13\3\13\3\13\3\13\5\13\u00c8\n"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00d6\n\r\f"+
		"\r\16\r\u00d9\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e0\n\16\3\16\3\16"+
		"\7\16\u00e4\n\16\f\16\16\16\u00e7\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00ef\n\17\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00fa\n\20\f\20\16\20\u00fd\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u0106\n\21\f\21\16\21\u0109\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u0112\n\22\f\22\16\22\u0115\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0125\n\24\f\24"+
		"\16\24\u0128\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0131\n\25"+
		"\f\25\16\25\u0134\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013d"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0145\n\27\3\30\3\30\3\30\3\30"+
		"\5\30\u014b\n\30\3\30\7\30\u014e\n\30\f\30\16\30\u0151\13\30\3\31\3\31"+
		"\3\31\3\31\5\31\u0157\n\31\3\31\7\31\u015a\n\31\f\31\16\31\u015d\13\31"+
		"\3\32\3\32\3\32\3\32\7\32\u0163\n\32\f\32\16\32\u0166\13\32\3\33\3\33"+
		"\3\33\3\33\5\33\u016c\n\33\3\33\7\33\u016f\n\33\f\33\16\33\u0172\13\33"+
		"\3\34\3\34\3\34\3\34\7\34\u0178\n\34\f\34\16\34\u017b\13\34\3\35\3\35"+
		"\3\35\3\35\7\35\u0181\n\35\f\35\16\35\u0184\13\35\3\36\3\36\5\36\u0188"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u01aa\n\37\f\37\16\37\u01ad\13\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u01d1\n\37\5\37\u01d3\n\37\5\37\u01d5\n"+
		"\37\3\37\3\37\5\37\u01d9\n\37\3 \3 \3 \3 \3 \3 \5 \u01e1\n \3!\3!\3!\6"+
		"!\u01e6\n!\r!\16!\u01e7\3!\6!\u01eb\n!\r!\16!\u01ec\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\5#\u01f9\n#\3$\3$\3$\3$\3$\3$\5$\u0201\n$\3%\3%\3%\3"+
		"%\3%\3%\5%\u0209\n%\3&\3&\3&\6&\u020e\n&\r&\16&\u020f\3&\6&\u0213\n&\r"+
		"&\16&\u0214\3\'\3\'\3\'\3(\3(\6(\u021c\n(\r(\16(\u021d\3(\3(\7(\u0222"+
		"\n(\f(\16(\u0225\13(\3)\3)\5)\u0229\n)\3*\3*\3*\3*\3*\7*\u0230\n*\f*\16"+
		"*\u0233\13*\3+\3+\3+\3+\3+\3+\3,\3,\3,\6,\u023e\n,\r,\16,\u023f\3,\7,"+
		"\u0243\n,\f,\16,\u0246\13,\3-\3-\3-\3.\3.\6.\u024d\n.\r.\16.\u024e\3."+
		"\3.\3/\3/\5/\u0255\n/\3\60\5\60\u0258\n\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\5\61\u0260\n\61\3\61\3\61\3\61\5\61\u0265\n\61\3\62\3\62\3\62\3\62"+
		"\5\62\u026b\n\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\5\64\u0278\n\64\3\64\7\64\u027b\n\64\f\64\16\64\u027e\13\64\3\64\5\64"+
		"\u0281\n\64\3\65\3\65\5\65\u0285\n\65\3\66\3\66\3\66\2\2\67\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhj\2\2\2\u02b6\2l\3\2\2\2\4v\3\2\2\2\6\u0097\3\2\2\2\b\u009a\3\2"+
		"\2\2\n\u009e\3\2\2\2\f\u00aa\3\2\2\2\16\u00b1\3\2\2\2\20\u00b4\3\2\2\2"+
		"\22\u00be\3\2\2\2\24\u00c1\3\2\2\2\26\u00cb\3\2\2\2\30\u00d0\3\2\2\2\32"+
		"\u00da\3\2\2\2\34\u00e8\3\2\2\2\36\u00f3\3\2\2\2 \u00fe\3\2\2\2\"\u010a"+
		"\3\2\2\2$\u0116\3\2\2\2&\u011d\3\2\2\2(\u0129\3\2\2\2*\u0135\3\2\2\2,"+
		"\u013e\3\2\2\2.\u0146\3\2\2\2\60\u0152\3\2\2\2\62\u015e\3\2\2\2\64\u0167"+
		"\3\2\2\2\66\u0173\3\2\2\28\u017c\3\2\2\2:\u0187\3\2\2\2<\u01d8\3\2\2\2"+
		">\u01da\3\2\2\2@\u01e2\3\2\2\2B\u01ee\3\2\2\2D\u01f2\3\2\2\2F\u01fa\3"+
		"\2\2\2H\u0202\3\2\2\2J\u020a\3\2\2\2L\u0216\3\2\2\2N\u0219\3\2\2\2P\u0228"+
		"\3\2\2\2R\u022a\3\2\2\2T\u0234\3\2\2\2V\u023a\3\2\2\2X\u0247\3\2\2\2Z"+
		"\u024a\3\2\2\2\\\u0254\3\2\2\2^\u0257\3\2\2\2`\u0264\3\2\2\2b\u0266\3"+
		"\2\2\2d\u026e\3\2\2\2f\u0273\3\2\2\2h\u0284\3\2\2\2j\u0286\3\2\2\2lm\5"+
		"\4\3\2mn\7\2\2\3n\3\3\2\2\2or\5T+\2pr\5\6\4\2qo\3\2\2\2qp\3\2\2\2rs\3"+
		"\2\2\2st\5h\65\2tw\3\2\2\2uw\7\t\2\2vq\3\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y\5\3\2\2\2z\u0098\5.\30\2{\u0098\5\60\31\2|\u0098\5\64"+
		"\33\2}\u0098\58\35\2~\u0098\5\66\34\2\177\u0098\5> \2\u0080\u0098\5D#"+
		"\2\u0081\u0098\5F$\2\u0082\u0098\5H%\2\u0083\u0098\5N(\2\u0084\u0098\5"+
		"Z.\2\u0085\u0098\5f\64\2\u0086\u0098\5\62\32\2\u0087\u0098\5*\26\2\u0088"+
		"\u0098\5,\27\2\u0089\u0098\5\"\22\2\u008a\u0098\5$\23\2\u008b\u0098\5"+
		"&\24\2\u008c\u0098\5(\25\2\u008d\u0098\5\30\r\2\u008e\u0098\5\32\16\2"+
		"\u008f\u0098\5\34\17\2\u0090\u0098\5\36\20\2\u0091\u0098\5 \21\2\u0092"+
		"\u0098\5\n\6\2\u0093\u0098\5\f\7\2\u0094\u0098\5\16\b\2\u0095\u0098\5"+
		"\20\t\2\u0096\u0098\5\b\5\2\u0097z\3\2\2\2\u0097{\3\2\2\2\u0097|\3\2\2"+
		"\2\u0097}\3\2\2\2\u0097~\3\2\2\2\u0097\177\3\2\2\2\u0097\u0080\3\2\2\2"+
		"\u0097\u0081\3\2\2\2\u0097\u0082\3\2\2\2\u0097\u0083\3\2\2\2\u0097\u0084"+
		"\3\2\2\2\u0097\u0085\3\2\2\2\u0097\u0086\3\2\2\2\u0097\u0087\3\2\2\2\u0097"+
		"\u0088\3\2\2\2\u0097\u0089\3\2\2\2\u0097\u008a\3\2\2\2\u0097\u008b\3\2"+
		"\2\2\u0097\u008c\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097"+
		"\u008f\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2"+
		"\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\7\3\2\2\2\u0099\u009b\7#\2\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\t\3"+
		"\2\2\2\u009e\u009f\7C\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a5\7\4\2\2\u00a1"+
		"\u00a3\7\4\2\2\u00a2\u00a4\7\4\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a9\7\4\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\13\3\2\2\2\u00aa\u00ab\7D\2\2\u00ab\u00ad\7!\2\2\u00ac\u00ae"+
		"\5\22\n\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\r\3\2\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3"+
		"\7\37\2\2\u00b3\17\3\2\2\2\u00b4\u00b8\7 \2\2\u00b5\u00b6\7\5\2\2\u00b6"+
		"\u00b7\7\n\2\2\u00b7\u00b9\7\4\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\21\3\2\2\2\u00bc\u00bf"+
		"\5\26\f\2\u00bd\u00bf\5\24\13\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2"+
		"\2\u00bf\23\3\2\2\2\u00c0\u00c2\7\"\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c7\7\3\2\2\u00c5"+
		"\u00c6\7\6\2\2\u00c6\u00c8\7\3\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\16\2\2\u00ca\25\3\2\2\2\u00cb\u00cc"+
		"\7\"\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf\7\16\2\2"+
		"\u00cf\27\3\2\2\2\u00d0\u00d1\7;\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\7"+
		"\3\2\2\u00d3\u00d7\7\21\2\2\u00d4\u00d6\5P)\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\31\3\2\2"+
		"\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7<\2\2\u00db\u00dc\7\3\2\2\u00dc\u00dd"+
		"\7\3\2\2\u00dd\u00df\7\3\2\2\u00de\u00e0\7\3\2\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5\7\21\2\2\u00e2\u00e4\5"+
		"P)\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\33\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7=\2\2"+
		"\u00e9\u00ea\7\3\2\2\u00ea\u00eb\7\3\2\2\u00eb\u00ec\7\3\2\2\u00ec\u00f0"+
		"\7\21\2\2\u00ed\u00ef\5P)\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\35\3\2\2\2\u00f2\u00f0\3\2\2"+
		"\2\u00f3\u00f4\7>\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7"+
		"\7\3\2\2\u00f7\u00fb\7\21\2\2\u00f8\u00fa\5P)\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\37\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100\7\3\2\2\u0100\u0101"+
		"\7\3\2\2\u0101\u0102\7\3\2\2\u0102\u0103\7\3\2\2\u0103\u0107\7\21\2\2"+
		"\u0104\u0106\5P)\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108!\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010b\7\67\2\2\u010b\u010c\7\3\2\2\u010c\u010d\7\3\2\2\u010d\u010e\7"+
		"\3\2\2\u010e\u010f\7\3\2\2\u010f\u0113\5R*\2\u0110\u0112\5P)\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"#\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\78\2\2\u0117\u0118\7\3\2\2\u0118"+
		"\u0119\7\3\2\2\u0119\u011a\7\3\2\2\u011a\u011b\7\3\2\2\u011b\u011c\7\21"+
		"\2\2\u011c%\3\2\2\2\u011d\u011e\79\2\2\u011e\u011f\7\3\2\2\u011f\u0120"+
		"\7\3\2\2\u0120\u0121\7\3\2\2\u0121\u0122\7\21\2\2\u0122\u0126\5R*\2\u0123"+
		"\u0125\5P)\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2"+
		"\2\u0126\u0127\3\2\2\2\u0127\'\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a"+
		"\7:\2\2\u012a\u012b\7\3\2\2\u012b\u012c\7\3\2\2\u012c\u012d\7\3\2\2\u012d"+
		"\u012e\7\3\2\2\u012e\u0132\7\21\2\2\u012f\u0131\5P)\2\u0130\u012f\3\2"+
		"\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		")\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7.\2\2\u0136\u0137\7\3\2\2\u0137"+
		"\u0138\7\3\2\2\u0138\u0139\7\3\2\2\u0139\u013a\7\3\2\2\u013a\u013c\7\21"+
		"\2\2\u013b\u013d\7\4\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"+\3\2\2\2\u013e\u013f\7/\2\2\u013f\u0140\7\3\2\2\u0140\u0141\7\3\2\2\u0141"+
		"\u0142\7\60\2\2\u0142\u0144\7\21\2\2\u0143\u0145\7\4\2\2\u0144\u0143\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145-\3\2\2\2\u0146\u0147\7*\2\2\u0147\u0148"+
		"\7\3\2\2\u0148\u014a\7\3\2\2\u0149\u014b\7\21\2\2\u014a\u0149\3\2\2\2"+
		"\u014a\u014b\3\2\2\2\u014b\u014f\3\2\2\2\u014c\u014e\5P)\2\u014d\u014c"+
		"\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"/\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7+\2\2\u0153\u0154\7\3\2\2\u0154"+
		"\u0156\7\3\2\2\u0155\u0157\7\21\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3"+
		"\2\2\2\u0157\u015b\3\2\2\2\u0158\u015a\5P)\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\61\3\2\2"+
		"\2\u015d\u015b\3\2\2\2\u015e\u015f\7,\2\2\u015f\u0160\7-\2\2\u0160\u0164"+
		"\7-\2\2\u0161\u0163\5P)\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\63\3\2\2\2\u0166\u0164\3\2\2"+
		"\2\u0167\u0168\7-\2\2\u0168\u0169\7\3\2\2\u0169\u016b\7\3\2\2\u016a\u016c"+
		"\7\21\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0170\3\2\2\2"+
		"\u016d\u016f\5P)\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\65\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0174\7\61\2\2\u0174\u0175\7\3\2\2\u0175\u0179\7\3\2\2\u0176\u0178\5"+
		":\36\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\67\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7\60\2"+
		"\2\u017d\u017e\7\3\2\2\u017e\u0182\7\3\2\2\u017f\u0181\5:\36\2\u0180\u017f"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"9\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0188\5<\37\2\u0186\u0188\7\4\2\2"+
		"\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188;\3\2\2\2\u0189\u018a\7"+
		"\22\2\2\u018a\u018b\7\r\2\2\u018b\u018c\7\4\2\2\u018c\u018d\7\4\2\2\u018d"+
		"\u018e\7\4\2\2\u018e\u018f\7\4\2\2\u018f\u0190\7\4\2\2\u0190\u0191\7\4"+
		"\2\2\u0191\u0192\7\4\2\2\u0192\u01d9\7\16\2\2\u0193\u0194\7\23\2\2\u0194"+
		"\u0195\7\r\2\2\u0195\u0196\7\4\2\2\u0196\u0197\7\4\2\2\u0197\u0198\7\4"+
		"\2\2\u0198\u0199\7\4\2\2\u0199\u019a\7\4\2\2\u019a\u01d9\7\16\2\2\u019b"+
		"\u019c\7\24\2\2\u019c\u019d\7\r\2\2\u019d\u019e\7\4\2\2\u019e\u019f\7"+
		"\4\2\2\u019f\u01a0\7\4\2\2\u01a0\u01a1\7\4\2\2\u01a1\u01a2\7\4\2\2\u01a2"+
		"\u01a3\7\4\2\2\u01a3\u01d9\7\16\2\2\u01a4\u01a5\7\25\2\2\u01a5\u01a6\7"+
		"\r\2\2\u01a6\u01a7\7\4\2\2\u01a7\u01ab\7\4\2\2\u01a8\u01aa\7\4\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01d9\7\16\2\2\u01af"+
		"\u01b0\7\26\2\2\u01b0\u01b1\7\r\2\2\u01b1\u01b2\7\4\2\2\u01b2\u01b3\7"+
		"\4\2\2\u01b3\u01b4\7\4\2\2\u01b4\u01b5\7\4\2\2\u01b5\u01b6\7\4\2\2\u01b6"+
		"\u01d9\7\16\2\2\u01b7\u01b8\7\27\2\2\u01b8\u01b9\7\r\2\2\u01b9\u01ba\7"+
		"\4\2\2\u01ba\u01bb\7\4\2\2\u01bb\u01bc\7\4\2\2\u01bc\u01bd\7\4\2\2\u01bd"+
		"\u01be\7\4\2\2\u01be\u01d9\7\16\2\2\u01bf\u01c0\7\30\2\2\u01c0\u01c1\7"+
		"\r\2\2\u01c1\u01c2\7\4\2\2\u01c2\u01c3\7\4\2\2\u01c3\u01c4\7\4\2\2\u01c4"+
		"\u01c5\7\4\2\2\u01c5\u01c6\7\4\2\2\u01c6\u01c7\7\4\2\2\u01c7\u01c8\7\4"+
		"\2\2\u01c8\u01d9\7\16\2\2\u01c9\u01ca\7\31\2\2\u01ca\u01cb\7\r\2\2\u01cb"+
		"\u01cc\7\4\2\2\u01cc\u01d4\7\4\2\2\u01cd\u01d2\7\4\2\2\u01ce\u01d0\7\4"+
		"\2\2\u01cf\u01d1\7\4\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d3\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01cd\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d9\7\16\2\2\u01d7\u01d9\7\32\2\2\u01d8\u0189\3\2\2\2\u01d8\u0193\3"+
		"\2\2\2\u01d8\u019b\3\2\2\2\u01d8\u01a4\3\2\2\2\u01d8\u01af\3\2\2\2\u01d8"+
		"\u01b7\3\2\2\2\u01d8\u01bf\3\2\2\2\u01d8\u01c9\3\2\2\2\u01d8\u01d7\3\2"+
		"\2\2\u01d9=\3\2\2\2\u01da\u01db\7\62\2\2\u01db\u01dc\7\3\2\2\u01dc\u01dd"+
		"\7\3\2\2\u01dd\u01e0\3\2\2\2\u01de\u01e1\5@!\2\u01df\u01e1\5B\"\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1?\3\2\2\2\u01e2\u01e3\7\33\2\2"+
		"\u01e3\u01e5\7\4\2\2\u01e4\u01e6\7\3\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01eb\7\4\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01edA\3\2\2\2\u01ee\u01ef\7\3\2\2\u01ef\u01f0"+
		"\7\3\2\2\u01f0\u01f1\7\4\2\2\u01f1C\3\2\2\2\u01f2\u01f3\7\63\2\2\u01f3"+
		"\u01f4\7\3\2\2\u01f4\u01f5\7\3\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f9\5@"+
		"!\2\u01f7\u01f9\5B\"\2\u01f8\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9E"+
		"\3\2\2\2\u01fa\u01fb\7\64\2\2\u01fb\u01fc\7\3\2\2\u01fc\u01fd\7\3\2\2"+
		"\u01fd\u0200\3\2\2\2\u01fe\u0201\5J&\2\u01ff\u0201\5L\'\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u01ff\3\2\2\2\u0201G\3\2\2\2\u0202\u0203\7\65\2\2\u0203"+
		"\u0204\7\3\2\2\u0204\u0205\7\3\2\2\u0205\u0208\3\2\2\2\u0206\u0209\5J"+
		"&\2\u0207\u0209\5L\'\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209I"+
		"\3\2\2\2\u020a\u020b\7\33\2\2\u020b\u020d\7\4\2\2\u020c\u020e\7\60\2\2"+
		"\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u0213\7\4\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215K\3\2\2\2"+
		"\u0216\u0217\7\60\2\2\u0217\u0218\7\4\2\2\u0218M\3\2\2\2\u0219\u021b\7"+
		"B\2\2\u021a\u021c\7\3\2\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0223\7\f"+
		"\2\2\u0220\u0222\5R*\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224O\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0229\7\4\2\2\u0227\u0229\5R*\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2"+
		"\2\u0229Q\3\2\2\2\u022a\u022b\7\5\2\2\u022b\u022c\7\n\2\2\u022c\u0231"+
		"\7\4\2\2\u022d\u022e\7\6\2\2\u022e\u0230\7\4\2\2\u022f\u022d\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232S\3\2\2\2"+
		"\u0233\u0231\3\2\2\2\u0234\u0235\5V,\2\u0235\u0236\7\t\2\2\u0236\u0237"+
		"\5\4\3\2\u0237\u0238\5X-\2\u0238\u0239\5h\65\2\u0239U\3\2\2\2\u023a\u023b"+
		"\7@\2\2\u023b\u023d\7\f\2\2\u023c\u023e\7\3\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0244\3\2"+
		"\2\2\u0241\u0243\5P)\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245W\3\2\2\2\u0246\u0244\3\2\2\2\u0247"+
		"\u0248\7A\2\2\u0248\u0249\7\f\2\2\u0249Y\3\2\2\2\u024a\u024c\7\66\2\2"+
		"\u024b\u024d\5\\/\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024c"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7\21\2\2"+
		"\u0251[\3\2\2\2\u0252\u0255\5^\60\2\u0253\u0255\5`\61\2\u0254\u0252\3"+
		"\2\2\2\u0254\u0253\3\2\2\2\u0255]\3\2\2\2\u0256\u0258\7\35\2\2\u0257\u0256"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\7\17\2\2"+
		"\u025a\u025b\5`\61\2\u025b\u025c\7\20\2\2\u025c_\3\2\2\2\u025d\u025f\7"+
		"\3\2\2\u025e\u0260\7\3\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0265\3\2\2\2\u0261\u0265\7\60\2\2\u0262\u0265\5b\62\2\u0263\u0265\5"+
		"d\63\2\u0264\u025d\3\2\2\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0263\3\2\2\2\u0265a\3\2\2\2\u0266\u0267\7\35\2\2\u0267\u0268\7\r\2\2"+
		"\u0268\u026a\7\3\2\2\u0269\u026b\7\3\2\2\u026a\u0269\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\7\16\2\2\u026dc\3\2\2\2\u026e"+
		"\u026f\7\35\2\2\u026f\u0270\7\r\2\2\u0270\u0271\7\60\2\2\u0271\u0272\7"+
		"\16\2\2\u0272e\3\2\2\2\u0273\u0274\7)\2\2\u0274\u0275\7\21\2\2\u0275\u0277"+
		"\7\4\2\2\u0276\u0278\7\r\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u027c\3\2\2\2\u0279\u027b\5R*\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2"+
		"\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c"+
		"\3\2\2\2\u027f\u0281\7\16\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2"+
		"\u0281g\3\2\2\2\u0282\u0285\7\t\2\2\u0283\u0285\3\2\2\2\u0284\u0282\3"+
		"\2\2\2\u0284\u0283\3\2\2\2\u0285i\3\2\2\2\u0286\u0287\3\2\2\2\u0287k\3"+
		"\2\2\2Aqvx\u0097\u009c\u00a3\u00a5\u00a8\u00af\u00ba\u00be\u00c1\u00c7"+
		"\u00d7\u00df\u00e5\u00f0\u00fb\u0107\u0113\u0126\u0132\u013c\u0144\u014a"+
		"\u014f\u0156\u015b\u0164\u016b\u0170\u0179\u0182\u0187\u01ab\u01d0\u01d2"+
		"\u01d4\u01d8\u01e0\u01e7\u01ec\u01f8\u0200\u0208\u020f\u0214\u021d\u0223"+
		"\u0228\u0231\u023f\u0244\u024e\u0254\u0257\u025f\u0264\u026a\u0277\u027c"+
		"\u0280\u0284";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}