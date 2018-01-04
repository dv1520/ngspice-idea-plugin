package org.ngs.adapter.psi;

import org.ngs.adapter.NgsFileType;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import org.ngs.adapter.Icons;
import org.ngs.adapter.NgsLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class NgsPsiFileRoot extends PsiFileBase implements ScopeNode {
    public NgsPsiFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NgsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NgsFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Ngspice circuit file";
    }

    @Override
    public Icon getIcon(int flags) {
        return Icons.NGS_ICON;
    }

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@Override
	public ScopeNode getContext() {
		return null;
	}

	@Nullable
	@Override
	public PsiElement resolve(PsiNamedElement element) {
		return null;
	}
}
