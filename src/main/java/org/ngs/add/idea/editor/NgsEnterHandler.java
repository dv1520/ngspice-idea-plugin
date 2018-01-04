package org.ngs.add.idea.editor;

import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegateAdapter;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Ref;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleManager;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Deindint on Enter after .subckt
 * .subckt name a b
 * r1 a b 1k [indented]
 * .ends name [Enter -> deindent]
 * <p>
 * Created by z on 04.08.17.
 */
public class NgsEnterHandler extends EnterHandlerDelegateAdapter {

    private Pattern endsPattern = Pattern.compile("(?i)^\\s*(\\.ends)");
    private Matcher endsMatcher = endsPattern.matcher("");


    @Override
    public Result preprocessEnter(@NotNull PsiFile file, @NotNull Editor editor, @NotNull final Ref<Integer> caretOffset, @NotNull Ref<Integer> caretAdvance, @NotNull DataContext dataContext, EditorActionHandler originalHandler) {
        final Document document = editor.getDocument();

        CharSequence text = document.getCharsSequence();


        int caret = editor.getCaretModel().getOffset();

        if (caret == 0 || text.charAt(caret - 1) == '\n') {
            return Result.Continue;
        }

        int prevNewline = findNewline(text, caret - 1, false);
        final int lineStart = prevNewline + 1;

        if (isNotAfterSubcircuitEnd(text, lineStart, caret)) {
            return Result.Continue;
        }

        final Project project = CommonDataKeys.PROJECT.getData(dataContext);
        PsiDocumentManager.getInstance(project).commitDocument(editor.getDocument());

        ApplicationManager.getApplication().runWriteAction(() -> {
                    CodeStyleManager.getInstance(project).adjustLineIndent(file, lineStart);

                    PsiDocumentManager.getInstance(project).commitDocument(editor.getDocument());

                    CharSequence text2 = document.getCharsSequence();

                    int nextNewline = findNewline(text2, prevNewline + 1, true);

                    caretOffset.set(nextNewline);
                }

        );

        return super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler);
    }

    private int findNewline(CharSequence s, int startPos, boolean isForwardNotBackward) {
        if (startPos < 0) {
            startPos = 0;
        }
        if (startPos >= s.length()) {
            startPos = s.length() - 1;
        }
        int i = startPos;

        if (isForwardNotBackward) {
            for (; i < s.length(); i++) {
                if (s.charAt(i) == '\n') {
                    break;
                }
            }
        } else {
            for (; i > 0; i--) {
                if (s.charAt(i) == '\n') {
                    break;
                }
            }
        }

        return i;
    }

    private boolean isNotAfterSubcircuitEnd(CharSequence text, int lineStart, int caret) {
        endsMatcher.reset(text);
        endsMatcher.region(lineStart, text.length());

        // not a .ends
        if (!endsMatcher.find()) {
            return true;
        }

        // '  <caret> .ends' - must add newline as usual
        int endsStop = endsMatcher.end(1);
        if (caret < endsStop) {
            return true;
        }

        return false;
    }
}
