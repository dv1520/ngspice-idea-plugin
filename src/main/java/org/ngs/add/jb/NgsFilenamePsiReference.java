package org.ngs.add.jb;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.indexing.FileBasedIndex;
import org.ngs.adapter.NgsFileType;
import org.apache.commons.io.FilenameUtils;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by z on 26.08.17.
 */
public class NgsFilenamePsiReference extends PsiPolyVariantReferenceBase<NgsFilenamePsiNode> {

    public NgsFilenamePsiReference(NgsFilenamePsiNode element) {
        /** WARNING: You must send up the text range or you get this error:
         * "Cannot find manipulator for PsiElement(ID) in org.antlr.jetbrains.sample.SampleElementRef"...
         *  when you click on an identifier.  During rename you get this
         *  error too if you don't impl handleElementRename().
         *
         *  The range is relative to start of the token; I guess for
         *  qualified references we might want to use just a part of the name.
         *  Or we might look inside string literals for stuff.
         */
        super(element, new TextRange(0, element.getText().length()));
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        String name = myElement.getText();
        String originalFile = addPathIfRelative(
                myElement.getContainingFile().getVirtualFile().getCanonicalPath(), name);
        VirtualFile vf = LocalFileSystem.getInstance().findFileByPath(originalFile);

        Project project = myElement.getProject();
        if (vf != null) {
            PsiFile psiFile = PsiManager.getInstance(project).findFile(vf);

            if (psiFile != null) {
                return new ResolveResult[]{new PsiElementResolveResult(psiFile)};
            }
        }


        List<PsiFile> files = getAllFilesWithName(name);

        List<ResolveResult> result = files.stream().map(PsiElementResolveResult::new).collect(Collectors.toList());

        return result.toArray(new ResolveResult[result.size()]);
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        String originalName = myElement.getName();
        String parent = FilenameUtils.getFullPath(originalName);
        if (parent != null && !parent.isEmpty()) {
            String originalShortName = FilenameUtils.getName(originalName);

            newElementName = parent + newElementName;
        }
        return myElement.setName(newElementName);
    }

    public static String addPathIfRelative(String baseFileToGetPath, String fileName) {
        String dir = FilenameUtils.getFullPath(baseFileToGetPath);
        if (!isAbsolutePath(fileName)) {
            fileName = dir + "/" + fileName;
        }

        return fileName;
    }

    public static boolean isAbsolutePath(String filename) {
        return !FilenameUtils.getPrefix(filename).isEmpty();
    }

    @SuppressWarnings("deprecation")
    private List<PsiFile> getAllFilesWithName(String name) {
        Project project = myElement.getProject();
        Collection<VirtualFile> files = FileBasedIndex.getInstance().getContainingFiles(
                FileTypeIndex.NAME,
                NgsFileType.INSTANCE,
                GlobalSearchScope.allScope(project));

        List<PsiFile> result = new ArrayList<>();
        for (VirtualFile vf : files) {
            if (vf.getName().equals(name)) {
                PsiFile f = PsiManager.getInstance(project).findFile(vf);
                if (f != null) {
                    result.add(f);
                }
            }
        }

        return result;
    }

}
