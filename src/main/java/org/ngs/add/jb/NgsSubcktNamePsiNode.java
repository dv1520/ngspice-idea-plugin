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
import org.ngs.add.idea.compl.NgsCompletionContributor;
import org.ngs.add.util.MyIdeaUtils;

/**
 * Created by z on 16.08.17.
 */
public class NgsSubcktNamePsiNode extends ANTLRPsiLeafNode implements PsiNamedElement
        , PomTargetPsiElement
        , PsiNameIdentifierOwner {

    PomTarget pomTarget = new PomTargetAlwaysValid();

    @NotNull
    @Override
    public PomTarget getTarget() {
        return pomTarget;
    }

    public NgsSubcktNamePsiNode(IElementType type, CharSequence text) {
        super(type, text);
    }


    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        PsiElement ngsNode = createNgsSubcktName(name);

        return this.replace(ngsNode);
    }

    @Override
    public String getName() {
        return getText();
    }

    @Override
    public PsiReference getReference() {
        return new NgsSubcktNamePsiReference(this);
    }

    @NotNull
    @Override
    public SearchScope getUseScope() {
        PsiElement parent = NgsCompletionContributor.getParentCircuit(this);

        if (parent == null) {
            return super.getUseScope();
        }

        return new LocalSearchScope(parent);
    }

    private PsiElement createNgsSubcktName(String name) {
        String text = String.format("x1 1 2 %s", name);

        PsiElement context = getParent() == null ? null : getContext();
        PsiElement xEntry = MyIdeaUtils.createLeafFromText(getProject(),
                NgsLanguage.INSTANCE,
                context,
                text,
                NgsParserDefinition.NODE);

        PsiElement ngsNode = xEntry.getChildren()[3];

        return ngsNode;
    }
}
