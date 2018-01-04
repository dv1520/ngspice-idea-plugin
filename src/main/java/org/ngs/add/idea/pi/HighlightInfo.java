package org.ngs.add.idea.pi;

import com.google.common.collect.Lists;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiWhiteSpace;
import org.ngs.parser.NgsLexer;
import org.ngs.parser.NgsParser;

import java.util.*;

import static org.ngs.add.util.MyIdeaUtils.getRuleType;
import static org.ngs.add.util.MyIdeaUtils.getTokenType;

/**
 * Class to highlight cursored element on Ctrl+P.
 *
 * Each line type has a few variants (see HighlightDescriptions)
 * a. H_R(1) NODE(2) NODE(3) VAL(4)
 * b. H_R(1) NODE(2) NODE(3) MODEL_NAME(4)
 *
 * The line itself:
 * r1 1 2* 1k
 *
 * We iterate all leafs. First we wait for H_R, then for NODE, then for NODE.
 * On cursored element we stop, and the last match is highlighted.
 * Any unexpected element is ignored (errors, for example).
 *
 * The next position is different. If it is VAL, we choose (a), but not (b),
 * so (b) is dropped and not highlighted.
 *
 * So in the algo we check both chains, a and b. If element does not match anything,
 * it is ignored. If it matches both chains, we go to the next chain-element.
 * If match is valid is only for the one chain, the second is removed from search.
 *
 * On the finish we highlight all remain chains.
 *
 *
 * Created by z on 17.12.17.
 */
public class HighlightInfo {
    private String delim = ", ";

    private boolean isXEntryHighlight;
    private List<List<String>> tokensExpected = new ArrayList<>();
    private List<List<String>> tokensDisplay = new ArrayList<>();


    // X entry requires own logic, these lists are mutable.
    private List<List<String>> xEntryElements = Collections.singletonList(
            Lists.newArrayList("H_X", "NODE", "NODE", "SUBCKT_NAME")
    );

    private List<List<String>> xEntryNames = Collections.singletonList(
            Lists.newArrayList("name", "N", "N", "Subcircuit Name")
    );

    public boolean init(PsiElement root) {
        int rule = getRuleType(root);
        List<List<String>> expected;
        List<List<String>> names;

        boolean isXEntry = false;
        if (rule == NgsParser.RULE_r_entry) {
            expected = HighlightDescriptions.expectedR;
            names = HighlightDescriptions.rAdd;
        } else if (rule == NgsParser.RULE_c_entry) {
            expected = HighlightDescriptions.expectedC;
            names = HighlightDescriptions.cAdd;
        } else if (rule == NgsParser.RULE_l_entry) {
            expected = HighlightDescriptions.expectedL;
            names = HighlightDescriptions.lAdd;
        } else if (rule == NgsParser.RULE_k_entry) {
            expected = HighlightDescriptions.expectedK;
            names = HighlightDescriptions.kAdd;
        } else if (rule == NgsParser.RULE_s_entry) {
            expected = HighlightDescriptions.expectedS;
            names = HighlightDescriptions.sAdd;
        } else if (rule == NgsParser.RULE_w_entry) {
            expected = HighlightDescriptions.expectedW;
            names = HighlightDescriptions.wAdd;
        } else if (rule == NgsParser.RULE_t_entry) {
            expected = HighlightDescriptions.expectedT;
            names = HighlightDescriptions.tAdd;
        } else if (rule == NgsParser.RULE_o_entry) {
            expected = HighlightDescriptions.expectedO;
            names = HighlightDescriptions.oAdd;
        } else if (rule == NgsParser.RULE_u_entry) {
            expected = HighlightDescriptions.expectedU;
            names = HighlightDescriptions.uAdd;
        } else if (rule == NgsParser.RULE_y_entry) {
            expected = HighlightDescriptions.expectedY;
            names = HighlightDescriptions.yAdd;
        } else if (rule == NgsParser.RULE_v_entry) {
            expected = HighlightDescriptions.expectedV;
            names = HighlightDescriptions.vAdd;
        } else if (rule == NgsParser.RULE_d_entry) {
            expected = HighlightDescriptions.expectedD;
            names = HighlightDescriptions.dAdd;
        } else if (rule == NgsParser.RULE_q_entry) {
            expected = HighlightDescriptions.expectedQ;
            names = HighlightDescriptions.qAdd;
        } else if (rule == NgsParser.RULE_j_entry) {
            expected = HighlightDescriptions.expectedJ;
            names = HighlightDescriptions.jAdd;
        } else if (rule == NgsParser.RULE_z_entry) {
            expected = HighlightDescriptions.expectedZ;
            names = HighlightDescriptions.zAdd;
        } else if (rule == NgsParser.RULE_m_entry) {
            expected = HighlightDescriptions.expectedM;
            names = HighlightDescriptions.mAdd;
        } else if (rule == NgsParser.RULE_model_entry) {
            expected = HighlightDescriptions.expectedModel;
            names = HighlightDescriptions.modelAdd;
        } else if(rule == NgsParser.RULE_x_entry) {
            // x_entry has variable number of nodes, so it has a dynamic template.
            expected = HighlightDescriptions.expectedX;
            names = HighlightDescriptions.xAdd;
            isXEntry = true;
        } else {
            return false;
        }


        if (!isXEntry) {
            init(expected, names, isXEntry);
        } else {
            setXEntryHighlight(root);
        }

        failOnIncorrectState();

        return true;
    }

    public int getItemCount() {
        return tokensExpected.size();
    }

    public boolean isXEntryHighlight() {
        return isXEntryHighlight;
    }

    public int getStartOffset(int line, int tokenNum) {
        return getOffset(line, tokenNum);
    }

    public int getEndOffset(int line, int tokenNum) {
        return getOffset(line, tokenNum + 1) - delim.length();
    }

    public int getTokenNum(PsiElement root, PsiElement elementToFind, List<Integer> validChains) {
        FlatIterator iterator = new FlatIterator();
        iterator.init(root);

        validChains.clear();
        for (int i = 0; i < tokensExpected.size(); i++) {validChains.add(i);}

        int foundIndex = 0;

        while (iterator.hasNext()) {
            PsiElement e = iterator.next();

            if (e instanceof PsiWhiteSpace) {
                if (e == elementToFind) {
                    break;
                }

                continue;
            }

            int tokenType = getTokenType(e);
            if (tokenType < 0) {
                continue;
            }


            String actualToken;
            try {
                // if index is too large
                actualToken = NgsLexer.getRuleName(tokenType);
            } catch (Exception e1) {
                e1.printStackTrace();
                continue;
            }

            // Main search method
            boolean isSomethingMatches = isTokenMatchesSomeChain(validChains, foundIndex, actualToken);

            if (isSomethingMatches) {
                foundIndex++;
            }

            if (e == elementToFind) {
                break;
            }
        }

        return foundIndex-1;
    }

    public String toLabel(int line) {
        List<String> tokens = tokensDisplay.get(line);

        StringBuilder sb = new StringBuilder();

        for (String s: tokens) {
            if (sb.length() > 0) {sb.append(delim);}
            sb.append(s);
        }

        return sb.toString();
    }

    // returns RULE_line element for it child
    // line(r_entry(H_R, *NODE* , NODE, VAL)) -> line
    public static PsiElement getRootLineElement(PsiElement element) {
        PsiElement parent = element;
        int rule = getRuleType(parent);

        while (parent != null &&  rule != NgsParser.RULE_line && rule != NgsParser.RULE_eol) {
            parent = parent.getParent();
            rule = getRuleType(parent);
        }

        if (rule == NgsParser.RULE_eol) {
            // when the element has errors, for example, if it is incomplete
            // "r1 n1 " : line(r_entry), WHITESPACE, eol
            do {
                parent = parent.getPrevSibling();
            } while (parent instanceof PsiWhiteSpace);
        }

        if (parent == null) {
            // Space is pressed after the last element
            if (element instanceof PsiWhiteSpace) {
                PsiElement root = element;
                do {
                    root = root.getPrevSibling();
                } while (root instanceof PsiWhiteSpace);

                if (getRuleType(root) == NgsParser.RULE_line) {
                    return root.getFirstChild();
                }
            }
        }

        if (parent == null) {
            return null;
        }

        return parent.getFirstChild();
    }

    private void failOnIncorrectState() {
        if (tokensExpected.size() != tokensDisplay.size()) {
            throw new RuntimeException("List sizes must be the same " +
                    tokensExpected.size() + "/" + tokensDisplay.size());
        }
    }

    private void init(List<List<String>> tokensExpected,
                      List<List<String>> tokensDisplay,
                      boolean isXEntry) {
        this.tokensExpected = tokensExpected;
        this.tokensDisplay = tokensDisplay;
        this.isXEntryHighlight = isXEntry;

        if (!isXEntry) {

            xEntryElements.get(0).clear();
            xEntryNames.get(0).clear();
        }
    }

    private void setXEntryHighlight(PsiElement root) {
        isXEntryHighlight = true;
        List<String> elements = xEntryElements.get(0);
        List<String> names = xEntryNames.get(0);

        FlatIterator iterator = new FlatIterator();
        iterator.init(root);


        elements.clear();
        names.clear();

        // 1. Default head item
        elements.add("H_X");
        names.add("name");

        while (iterator.hasNext()) {
            PsiElement e = iterator.next();
            int tokenType = getTokenType(e);

            // 2. List of nodes
            if (tokenType == NgsLexer.NODE) {
                elements.add("NODE");
                names.add("N");
            }

            // Stop on the subcircuit name
            if (tokenType == NgsLexer.SUBCKT_NAME) {
                elements.add("SUBCKT_NAME");
                names.add("Subcircuit Name");
                break;
            }
        }

        elements.add(HighlightDescriptions.REST_PARAM);
        names.add("<Rest>");


        init(xEntryElements, xEntryNames, true);
    }

    private int getOffset(int line, int tokenNum) {
        List<String> tokens = tokensDisplay.get(line);
        int offset = 0;
        int i;
        for (i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);
            if (i == tokenNum) {
                return offset;
            }

            offset += token.length() + ", ".length();
        }
        // Useful for the end position of the last token
        if (i == tokenNum) {
            return offset;
        }

        return 0;
    }


    /**
     * Removes from the validChains, if required.
     */
    private boolean isTokenMatchesSomeChain(List<Integer> validChains, int foundIndex, String actualToken) {
        boolean isSomethingMatched = false;
        for (int i = 0; i < tokensExpected.size(); i++) {
            if (!validChains.contains(i)) {
                continue;
            }

            List<String> chain = tokensExpected.get(i);

            if (foundIndex >= chain.size()) {continue;}
            if (isValidToken(chain.get(foundIndex), actualToken)) {
                isSomethingMatched = true;
            }
        }

        if (isSomethingMatched) {
            for (int i = 0; i < tokensExpected.size(); i++) {
                List<String> chain = tokensExpected.get(i);
                if (foundIndex >= chain.size()) {continue;}
                if (!isValidToken(chain.get(foundIndex), (actualToken))) {
                    if (validChains.contains(i)) {
                        validChains.remove(Integer.valueOf(i));
                    }

                }
            }
        }

        return isSomethingMatched;
    }


    private boolean isValidToken(String expected, String actual) {
        if (expected == HighlightDescriptions.REST_PARAM) {
            return true;
        }

        return expected.equals(actual);
    }
}
