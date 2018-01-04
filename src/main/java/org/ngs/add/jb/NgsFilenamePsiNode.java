package org.ngs.add.jb;

import com.intellij.pom.PomTarget;
import com.intellij.pom.PomTargetPsiElement;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.EverythingGlobalScope;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiLeafNode;
import org.ngs.adapter.NgsLanguage;
import org.ngs.adapter.NgsParserDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.ngs.add.util.MyIdeaUtils;

/**
 * Created by z on 26.08.17.
 */
public class NgsFilenamePsiNode extends ANTLRPsiLeafNode implements PsiNamedElement
        , PomTargetPsiElement
        , PsiNameIdentifierOwner {

    PomTarget pomTarget = new PomTargetAlwaysValid();

    @NotNull
    @Override
    public PomTarget getTarget() {
        return pomTarget;
    }


    public NgsFilenamePsiNode(IElementType type, CharSequence text) {
        super(type, text);
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        PsiElement ngsNode = createFilenameNode(name);

        return this.replace(ngsNode);
    }

    @Override
    public PsiReference getReference() {
        return new NgsFilenamePsiReference(this);
    }

    @NotNull
    @Override
    public SearchScope getUseScope() {
        return new EverythingGlobalScope(getProject());
    }

    @Override
    public String getName() {
        return getText();
    }

    private PsiElement createFilenameNode(String name) {
        String text = String.format(".include %s", name);

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
