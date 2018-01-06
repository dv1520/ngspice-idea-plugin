package org.ngs.add.idea.fmt;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.ngs.parser.NgsLexer;
import org.ngs.parser.NgsParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.ngs.add.util.MyIdeaUtils.getRuleType;
import static org.ngs.add.util.MyIdeaUtils.getTokenType;

/**
 * Created by z on 23.07.17.
 */
public class NgsBlock extends AbstractBlock {

    private Indent indent = null;

    public NgsBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment) {
        super(node, wrap, alignment);
    }

    @Override
    protected List<Block> buildChildren() {
        return addChildren(myNode);
    }

    private NgsBlock createBlock(ASTNode node) {
        Wrap wrap = Wrap.createWrap(WrapType.NONE, false);
        Alignment alignment = Alignment.createAlignment();

        NgsBlock block = new NgsBlock(node, wrap, alignment);

        block.indent = Indent.getNoneIndent();


        return block;
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Indent getIndent() {
        return indent;
    }

    @NotNull
    @Override
    public ChildAttributes getChildAttributes(int newChildIndex) {
        int rl = getRuleType(myNode.getPsi());
        if (rl == NgsParser.RULE_subckt) {
            return new ChildAttributes(Indent.getNormalIndent(), null);
        }
        return super.getChildAttributes(newChildIndex);
    }

    private List<Block> addChildren(ASTNode node) {
        int rt = getRuleType(node.getPsi());

        boolean isIndentLeaf =
                   rt == NgsParser.RULE_line
                || rt == NgsParser.RULE_subckt_head_entry
                || rt == NgsParser.RULE_subckt_tail_entry;

        if (isIndentLeaf) {
            return Collections.emptyList();
        }

        List<Block> blocks = new ArrayList<>();

        ASTNode child = node.getFirstChildNode();
        while (child != null) {
            PsiElement e = child.getPsi();
            int tokenType = getTokenType(e);
            int childRuleType = getRuleType(e);

            if (!(e instanceof PsiWhiteSpace) && tokenType != NgsLexer.NEWLINE) {
                // Newline symbols must be out of any block, otherwise
                // indent will be broken.
                // However, if the last statement in file is '.ends', and we hit 'Enter',
                // the new line will have extra indent. It will be removed, if there
                // will be some block after the '.ends', and we use a newline as
                // this one.
                if (childRuleType == NgsParser.RULE_eol) {
                    if (getRuleType(e.getPrevSibling()) != NgsParser.RULE_subckt) {
                        child = child.getTreeNext();
                        continue;
                    }
                }

                NgsBlock block = createBlock(child);

                int ruleType = getRuleType(child.getPsi());

                // The root entries are not indented.
                boolean isNotIndentedCircuit = rt == NgsParser.RULE_root;

                if (!isNotIndentedCircuit) {
                    if (ruleType == NgsParser.RULE_circuit) {
                        // 1) .subckt sb 1 2
                        // 2) .ends sb
                        // If subcircuit body is empty, it will take place on the line(2).
                        // It will indent line, and .ends will get 4 spaces, and
                        // we don't want that.
                        if (!e.getTextRange().isEmpty()) {
                            block.indent = Indent.getNormalIndent();
                        }

                    }
                }

                blocks.add(block);
            }


            child = child.getTreeNext();
        }

        return blocks;
    }
}
