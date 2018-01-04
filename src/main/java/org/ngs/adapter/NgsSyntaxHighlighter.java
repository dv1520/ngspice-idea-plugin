package org.ngs.adapter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;
import org.ngs.parser.NgsLexer;
import org.ngs.parser.NgsParser;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/** A highlighter is really just a mapping from token type to
 *  some text attributes using {@link #getTokenHighlights(IElementType)}.
 *  The reason that it returns an array, TextAttributesKey[], is
 *  that you might want to mix the attributes of a few known highlighters.
 *  A {@link TextAttributesKey} is just a name for that a theme
 *  or IDE skin can set. For example, {@link com.intellij.openapi.editor.DefaultLanguageHighlighterColors#KEYWORD}
 *  is the key that maps to what identifiers look like in the editor.
 *  To change it, see dialog: Editor > Colors & Fonts > Language Defaults.
 *
 *  From <a href="http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support/syntax_highlighting_and_error_highlighting.html">doc</a>:
 *  "The mapping of the TextAttributesKey to specific attributes used
 *  in an editor is defined by the EditorColorsScheme class, and can
 *  be configured by the user if the plugin provides an appropriate
 *  configuration interface.
 *  ...
 *  The syntax highlighter returns the {@link TextAttributesKey}
 * instances for each token type which needs special highlighting.
 * For highlighting lexer errors, the standard TextAttributesKey
 * for bad characters HighlighterColors.BAD_CHARACTER can be used."
 */
public class NgsSyntaxHighlighter extends SyntaxHighlighterBase {
	private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
	public static final TextAttributesKey ID =
		createTextAttributesKey("SAMPLE_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
	public static final TextAttributesKey KEYWORD =
		createTextAttributesKey("SAMPLE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey STRING =
		createTextAttributesKey("SAMPLE_STRING", DefaultLanguageHighlighterColors.STRING);
	public static final TextAttributesKey LINE_COMMENT =
		createTextAttributesKey("SAMPLE_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey BLOCK_COMMENT =
		createTextAttributesKey("SAMPLE_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);






	public static final TextAttributesKey VAL =
			createTextAttributesKey("NGSPICE_VAL", DefaultLanguageHighlighterColors.NUMBER);
	public static final TextAttributesKey KV_KEY =
			createTextAttributesKey("NGSPICE_KV_KEY", DefaultLanguageHighlighterColors.STATIC_METHOD);
	public static final TextAttributesKey LINE_HEAD =
//			createTextAttributesKey("NGSPICE_LINE_HEAD", DefaultLanguageHighlighterColors.KEYWORD);
//			JavaHighlightingColors.TYPE_PARAMETER_NAME_ATTRIBUTES;
//			JavaHighlightingColors.ANNOTATION_NAME_ATTRIBUTES;
			createTextAttributesKey("NGSPICE_LINE_HEAD", DefaultLanguageHighlighterColors.CLASS_NAME);

	public static final TextAttributesKey MODEL =
			createTextAttributesKey("NGSPICE_MODEL", DefaultLanguageHighlighterColors.INSTANCE_FIELD);

	public static final TextAttributesKey NODE =
			createTextAttributesKey("NGSPICE_NODE", DefaultLanguageHighlighterColors.STATIC_FIELD);
	public static final TextAttributesKey SUBCKT =
			createTextAttributesKey("NGSPICE_SUBCKT", DefaultLanguageHighlighterColors.MARKUP_ATTRIBUTE);


	static {
		PSIElementTypeFactory.defineLanguageIElementTypes(NgsLanguage.INSTANCE,
		                                                  NgsParser.tokenNames,
		                                                  NgsParser.ruleNames);
	}

	@NotNull
	@Override
	public Lexer getHighlightingLexer() {
		NgsLexer lexer = new NgsLexer(null, true);
		return new ANTLRLexerAdaptor(NgsLanguage.INSTANCE, lexer);
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
		if (!(tokenType instanceof TokenIElementType)) {
			return EMPTY_KEYS;
		}


		// 11 -- H_SUBCKT

		int antlrTokenType = ((TokenIElementType) tokenType).getANTLRTokenType();

		TextAttributesKey result;
		switch (antlrTokenType) {
			case NgsLexer.VAL:
				result = VAL;
				break;
			case NgsLexer.KV_KEY:
				result = KV_KEY;
				break;

			case NgsLexer.H_A:
			case NgsLexer.H_D:
			case NgsLexer.H_E:
			case NgsLexer.H_F:
			case NgsLexer.H_I:
			case NgsLexer.H_J:
			case NgsLexer.H_K:
			case NgsLexer.H_L:
			case NgsLexer.H_M:
			case NgsLexer.H_Q:
			case NgsLexer.H_R:
			case NgsLexer.H_S:
			case NgsLexer.H_W:
			case NgsLexer.H_T:
			case NgsLexer.H_O:
			case NgsLexer.H_U:
			case NgsLexer.H_V:
			case NgsLexer.H_Y:
			case NgsLexer.H_X:
			case NgsLexer.H_Z:
				result = LINE_HEAD;
				break;
			case NgsLexer.NODE:
				result = NODE;
				break;
			case NgsLexer.H_SUBCKT:
			case NgsLexer.H_SUBCKT_TAIL:
				result = SUBCKT;
				break;
			case NgsLexer.COMMENT:
				result = LINE_COMMENT;
				break;
			case NgsLexer.MODEL_NAME:
				result = MODEL;
				break;
			default:
				return EMPTY_KEYS;
		}

		return new TextAttributesKey[]{result};
	}
}
