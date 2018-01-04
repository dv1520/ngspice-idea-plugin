package org.ngs.add.jb;

import com.intellij.pom.PomTarget;
import com.intellij.pom.PomTargetPsiElement;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.LocalSearchScope;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiLeafNode;
import org.ngs.adapter.NgsLanguage;
import org.ngs.adapter.NgsParserDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.ngs.add.util.MyIdeaUtils;
import org.ngs.parser.NgsParser;

/**
 * Created by z on 11.07.17.
 */
public class NgsNodePsiNode extends ANTLRPsiLeafNode implements PsiNamedElement, PomTargetPsiElement, PsiNameIdentifierOwner {

    private PomTarget target = new PomTargetAlwaysValid();

    @NotNull
    @Override
    public PomTarget getTarget() {
        return target;
    }

    public NgsNodePsiNode(IElementType type, CharSequence text) {
        super(type, text);
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        PsiElement ngsNode = createNgsNode(name);

        return this.replace(ngsNode);
    }

    @Override
    public String getName() {
        return getText();
    }

    @Override
    public PsiReference getReference() {
        return new NgsNodePsiReference(this);
    }

    @NotNull
    @Override
    public SearchScope getUseScope() {
        PsiElement parent = getParent();

        while (parent != null && MyIdeaUtils.getRuleType(parent) != NgsParser.RULE_circuit) {
            parent = parent.getParent();
        }

        if (parent == null) {
            return super.getUseScope();
        }

        return new LocalSearchScope(parent);
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

    private PsiElement createNgsNode(String name) {
        String text = String.format("r1 %s 2 2k", name);

        PsiElement context = getParent() == null ? null : getContext();

        PsiElement rEntry = MyIdeaUtils.createLeafFromText(getProject(),
                NgsLanguage.INSTANCE,
                context,
                text,
                NgsParserDefinition.NODE);

        PsiElement ngsNode = rEntry.getChildren()[1];

        return ngsNode;
    }
}
