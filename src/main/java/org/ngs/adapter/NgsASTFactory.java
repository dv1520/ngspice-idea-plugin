package org.ngs.adapter;

import com.intellij.core.CoreASTFactory;
import com.intellij.lang.ParserDefinition;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.psi.impl.source.tree.LeafElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.impl.source.tree.PsiCoreCommentImpl;
import com.intellij.psi.tree.IElementType;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
//import org.antlr.jetbrains.sample.parser.SampleLanguageLexer;
import org.jetbrains.annotations.NotNull;
import org.ngs.parser.NgsLexer;
import org.ngs.add.jb.NgsFilenamePsiNode;
import org.ngs.add.jb.NgsModelPsiNode;
import org.ngs.add.jb.NgsNodePsiNode;
import org.ngs.add.jb.NgsSubcktNamePsiNode;

/** How to create parse tree nodes (Jetbrains calls them AST nodes). Later
 *  non-leaf nodes are converted to PSI nodes by the {@link ParserDefinition}.
 *  Leaf nodes are already considered PSI nodes.  This is mostly just
 *  {@link CoreASTFactory} but with comments on the methods that you might want
 *  to override.
 */
public class NgsASTFactory extends CoreASTFactory {
	/** Create an internal parse tree node. FileElement for root or a parse tree CompositeElement (not
	 *  PSI) for the token.
	 *  The FileElement is a parse tree node, which is converted to a PsiFile
	 *  by {@link ParserDefinition#createFile}.
	 */
	@NotNull
    @Override
    public CompositeElement createComposite(IElementType type) {
	    return super.createComposite(type);
    }

	/** Create a parse tree (AST) leaf node from a token. Doubles as a PSI leaf node.
	 *  Does not see whitespace tokens.  Default impl makes {@link LeafPsiElement}
	 *  or {@link PsiCoreCommentImpl} depending on {@link ParserDefinition#getCommentTokens()}.
	 */
	@NotNull
	@Override
	public LeafElement createLeaf(@NotNull IElementType type, CharSequence text) {
		if (type instanceof TokenIElementType) {
			TokenIElementType tokenType = (TokenIElementType) type;
			int tp = tokenType.getANTLRTokenType();

			if (tp == NgsLexer.NODE) {
				return new NgsNodePsiNode(type, text);
			}

			if (tp == NgsLexer.SUBCKT_NAME) {
				return new NgsSubcktNamePsiNode(type, text);
			}

			if (tp == NgsLexer.MODEL_NAME) {
				return new NgsModelPsiNode(type, text);
			}

			if (tp == NgsLexer.FILENAME) {
				return new NgsFilenamePsiNode(type, text);
			}
		}

		return super.createLeaf(type, text);
    }
}
