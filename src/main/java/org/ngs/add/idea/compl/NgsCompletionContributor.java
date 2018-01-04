package org.ngs.add.idea.compl;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.util.ProcessingContext;
import org.antlr.jetbrains.adaptor.xpath.XPath;
import org.ngs.adapter.NgsLanguage;
import org.jetbrains.annotations.NotNull;
import org.ngs.parser.NgsLexer;
import org.ngs.parser.NgsParser;
import org.ngs.add.jb.NgsModelPsiNode;
import org.ngs.add.jb.NgsNodePsiNode;
import org.ngs.add.jb.NgsSubcktNamePsiNode;

import java.util.*;
import java.util.function.BiConsumer;

import static org.ngs.add.util.MyIdeaUtils.getRuleType;
import static org.ngs.add.util.MyIdeaUtils.getTokenType;

/**
 * Created by z on 16.08.17.
 */
public class NgsCompletionContributor extends CompletionContributor {

    public NgsCompletionContributor() {
        addComplete(NgsNodePsiNode.class, this::autocompleteNode);
        addComplete(NgsSubcktNamePsiNode.class, this::autocompleteSubcktName);
        addComplete(LeafPsiElement.class, this::autocompletePlot);
        addComplete(NgsModelPsiNode.class, this::autocompleteModelName);
    }

    // Plot

    private boolean  autocompletePlot(PsiElement position, CompletionResultSet resultSet) {
        if (autocompletePlotType(position, resultSet)) {
            return true;
        }

        if (autocompletePlotPointType(position, resultSet)) {
            return true;
        }

        return false;
    }


    private boolean autocompletePlotType(PsiElement position, CompletionResultSet resultSet) {
        if (getTokenType(position) != NgsLexer.PLOT_TYPE) {
            return false;
        }


        resultSet.addElement(LookupElementBuilder.create("tran"));
        resultSet.addElement(LookupElementBuilder.create("dc"));
        resultSet.addElement(LookupElementBuilder.create("ac"));

        return true;
    }

    private boolean autocompletePlotPointType(PsiElement position, CompletionResultSet resultSet) {
        if (getTokenType(position) != NgsLexer.PLOT_POINT_TYPE) {
            return false;
        }


        resultSet.addElement(LookupElementBuilder.create("i").withInsertHandler(new PlotPointTypeParenthesisHandler()));
        resultSet.addElement(LookupElementBuilder.create("v").withInsertHandler(new PlotPointTypeParenthesisHandler()));

        return true;
    }

    // Model

    private void autocompleteModelName(PsiElement position, CompletionResultSet resultSet) {
        boolean isTargetModelLine = getRuleType(position.getParent()) == NgsParser.RULE_model_entry;

        for (PsiElement e: getModelNames(position)) {
            boolean isModelLine = getRuleType(e.getParent()) == NgsParser.RULE_model_entry;
            if (isModelLine != isTargetModelLine) {
                resultSet.addElement(LookupElementBuilder.create(e.getText()));
            }
        }
    }

    public static List<PsiElement> getModelNames(PsiElement position) {
        PsiElement circuit = getParentCircuit(position);

        Collection<? extends PsiElement> elements = XPath.findAll(NgsLanguage.INSTANCE, circuit, "/circuit/line//MODEL_NAME");

        List<PsiElement> result = new ArrayList<>(elements);

        return result;
    }

    // Add parenthesis to to plot type, if they were not inserted.
    private static class PlotPointTypeParenthesisHandler implements InsertHandler<LookupElement> {
        @Override
        public void handleInsert(InsertionContext context, LookupElement item) {
            context.getCompletionChar();

            final Editor editor = context.getEditor();
            final Document document = editor.getDocument();
            context.commitDocument();


            int caret = editor.getCaretModel().getOffset();
            CharSequence charSequence = document.getCharsSequence();
            Character nextChar = getNextChar(charSequence, caret);


            if (Character.valueOf('(').equals(nextChar)) {
                // already have parenthesis
                return;
            }

            // v) -> v(); v A -> v() A;
            boolean isNextRightParenthesis = Character.valueOf(')').equals(nextChar);
            String toInsert = isNextRightParenthesis ? "(" : "()";

            document.insertString(caret, toInsert);
            editor.getCaretModel().moveToOffset(caret + 1);
        }

        private Character getNextChar(CharSequence charSequence, int caret) {
            int length = charSequence.length();
            for (int i = caret; i < length; i++) {
                char c = charSequence.charAt(i);
                if (c == ' ' || c == '\t') {
                    continue;
                }

                return Character.valueOf(c);
            }

            return null;
        }
    }

    // Subcircuit

    private void autocompleteSubcktName(PsiElement position, CompletionResultSet resultSet) {
        PsiElement parent = position.getParent();

        if (getRuleType(parent) == NgsParser.RULE_x_entry) {

            addToResult(getXEntrySubcktNames(parent), resultSet);

            return;
        }

        addToResult(getSubcktTailNames(parent), resultSet);
    }

    private static Collection<? extends PsiElement> getXEntrySubcktNames(PsiElement parent) {
        PsiElement circuit = getParentCircuit(parent);
        if (circuit == null) {
            // is it required?
            return Collections.emptyList();
        }

        Collection<? extends PsiElement> subcktNames = XPath.findAll(NgsLanguage.INSTANCE, circuit, "/circuit/subckt/subckt_head_entry/SUBCKT_NAME");

        return subcktNames;

    }

    public static Collection<? extends PsiElement> getSubcktTailNames(PsiElement parent) {
        if (getRuleType(parent) == NgsParser.RULE_subckt_tail_entry) {
            PsiElement subckt = parent.getParent();
            if (getRuleType(subckt) != NgsParser.RULE_subckt) {
                return Collections.emptyList();
            }

            Collection<? extends PsiElement> subcktNames = XPath.findAll(NgsLanguage.INSTANCE, subckt, "/subckt/subckt_head_entry/SUBCKT_NAME");
            return subcktNames;
        }

        return Collections.emptyList();

    }

    // Node

    private void autocompleteNode(PsiElement position, CompletionResultSet resultSet) {
        PsiElement parent = position.getParent();

        if (getRuleType(parent) == NgsParser.RULE_subckt_head_entry) {
            completeSubcktHeadNode(parent, resultSet);
            return;
        }

        completeGenericNode(parent, resultSet);
    }

    private void completeSubcktHeadNode(PsiElement parent, CompletionResultSet resultSet) {
        addSubcircuitHeadNodes(parent, resultSet);

        Collection<? extends PsiElement> circuits = XPath.findAll(NgsLanguage.INSTANCE, parent.getParent(), "/subckt/circuit");


        PsiElement circuit = firstOrNull(circuits);

        addCircuitNodes(circuit, resultSet);
    }

    private void completeGenericNode(PsiElement parent, CompletionResultSet resultSet) {
        while (parent != null && getRuleType(parent) != NgsParser.RULE_circuit) {
            parent = parent.getParent();
        }

        if (parent == null) {
            return;
        }

        addCircuitNodes(parent, resultSet);


        PsiElement subckt = parent.getParent();

        Collection<? extends PsiElement> heads = XPath.findAll(NgsLanguage.INSTANCE, subckt, "/subckt/subckt_head_entry");
        PsiElement head = firstOrNull(heads);


        addSubcircuitHeadNodes(head, resultSet);
    }

    private void addCircuitNodes(PsiElement circuit, CompletionResultSet resultSet) {
        if (getRuleType(circuit) != NgsParser.RULE_circuit) {
            return;
        }


        Collection<? extends PsiElement> nodes = XPath.findAll(NgsLanguage.INSTANCE, circuit, "/circuit/line//NODE");

        for (PsiElement e: nodes) {
            resultSet.addElement(LookupElementBuilder.create(e.getText()));
        }
    }


    private void addSubcircuitHeadNodes(PsiElement head, CompletionResultSet resultSet) {
        if (getRuleType(head) != NgsParser.RULE_subckt_head_entry) {
            return;
        }

        Collection<? extends PsiElement> nodes2 = XPath.findAll(NgsLanguage.INSTANCE, head, "/subckt_head_entry//NODE");

        for (PsiElement e: nodes2) {
            resultSet.addElement(LookupElementBuilder.create(e.getText()));
        }
    }

    // utils

    private <T extends PsiElement> void addComplete(Class<T> clazz, BiConsumer<PsiElement, CompletionResultSet> func) {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(clazz).withLanguage(NgsLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        func.accept(parameters.getPosition(), resultSet);
                    }
                }
        );
    }

    private static void addToResult(Collection<? extends PsiElement> elements, CompletionResultSet resultSet) {
        for (PsiElement e: elements) {
            resultSet.addElement(LookupElementBuilder.create(e.getText()));
        }
    }

    // public utils
    public static <T> T firstOrNull(Collection<T> collection) {
        if (collection.isEmpty()) {return null;}

        return collection.iterator().next();
    }

    public static PsiElement getParentCircuit(PsiElement element) {
        while (element != null && getRuleType(element) != NgsParser.RULE_circuit) {
            element = element.getParent();
        }

        return element;
    }
}
