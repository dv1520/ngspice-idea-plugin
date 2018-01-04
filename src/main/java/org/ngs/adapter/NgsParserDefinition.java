package org.ngs.adapter;

import org.ngs.adapter.psi.NgsPsiFileRoot;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.antlr.jetbrains.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import org.ngs.parser.NgsLexer;
import org.ngs.parser.NgsParser;

import java.util.List;

public class NgsParserDefinition implements ParserDefinition {
	public static final IFileElementType FILE =
		new IFileElementType(NgsLanguage.INSTANCE);

	public static TokenIElementType NODE;


	static {
		PSIElementTypeFactory.defineLanguageIElementTypes(NgsLanguage.INSTANCE,
		                                                  NgsParser.tokenNames,
		                                                  NgsParser.ruleNames);
		List<TokenIElementType> tokenIElementTypes =
			PSIElementTypeFactory.getTokenIElementTypes(NgsLanguage.INSTANCE);
		NODE = tokenIElementTypes.get(NgsLexer.NODE);
	}

	public static final TokenSet COMMENTS =
		PSIElementTypeFactory.createTokenSet(
			NgsLanguage.INSTANCE
				,NgsLexer.COMMENT
		);

	public static final TokenSet WHITESPACE =
		PSIElementTypeFactory.createTokenSet(
			NgsLanguage.INSTANCE,
				NgsLexer.WS
//				NgsLexer.NEWLINE
		);

	public static final TokenSet STRING =
		PSIElementTypeFactory.createTokenSet(
			NgsLanguage.INSTANCE);

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		NgsLexer lexer = new NgsLexer(null, true);
		return new ANTLRLexerAdaptor(NgsLanguage.INSTANCE, lexer);
	}

	@NotNull
	public PsiParser createParser(final Project project) {
		final NgsParser parser = new NgsParser(null);
		return new ANTLRParserAdaptor(NgsLanguage.INSTANCE, parser) {
			@Override
			protected ParseTree parse(Parser parser, IElementType root) {
				return ((NgsParser) parser).root();
			}
		};
	}

	/** "Tokens of those types are automatically skipped by PsiBuilder." */
	@NotNull
	public TokenSet getWhitespaceTokens() {
		return WHITESPACE;
	}

	@NotNull
	public TokenSet getCommentTokens() {
		return COMMENTS;
	}

	@NotNull
	public TokenSet getStringLiteralElements() {
		return STRING;
	}

	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
		return SpaceRequirements.MAY;
	}

	/** What is the IFileElementType of the root parse tree node? It
	 *  is called from {@link #createFile(FileViewProvider)} at least.
	 */
	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	/** Create the root of your PSI tree (a PsiFile).
	 *
	 *  From IntelliJ IDEA Architectural Overview:
	 *  "A PSI (Program Structure Interface) file is the root of a structure
	 *  representing the contents of a file as a hierarchy of elements
	 *  in a particular programming language."
	 *
	 *  PsiFile is to be distinguished from a FileASTNode, which is a parse
	 *  tree node that eventually becomes a PsiFile. From PsiFile, we can get
	 *  it back via: {@link PsiFile#getNode}.
	 */
	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new NgsPsiFileRoot(viewProvider);
	}

	/** Convert from *NON-LEAF* parse node (AST they call it)
	 *  to PSI node. Leaves are created in the AST factory.
	 *  Rename re-factoring can cause this to be
	 *  called on a TokenIElementType since we want to rename ID nodes.
	 *  In that case, this method is called to create the root node
	 *  but with ID type. Kind of strange, but we can simply create a
	 *  ASTWrapperPsiElement to make everything work correctly.
	 *
	 *  RuleIElementType.  Ah! It's that ID is the root
	 *  IElementType requested to parse, which means that the root
	 *  node returned from parsetree->PSI conversion.  But, it
	 *  must be a CompositeElement! The adaptor calls
	 *  rootMarker.done(root) to finish off the PSI conversion.
	 *  See {@link ANTLRParserAdaptor#parse(IElementType root,
	 *  PsiBuilder)}
	 *
	 *  If you don't care to distinguish PSI nodes by type, it is
	 *  sufficient to create a {@link ANTLRPsiNode} around
	 *  the parse tree node
	 */
	@NotNull
	public PsiElement createElement(ASTNode node) {
		return new ANTLRPsiNode(node);
	}
}
