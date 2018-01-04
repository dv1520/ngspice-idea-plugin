package org.ngs.add.idea;

import com.intellij.lang.refactoring.NamesValidator;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * Created by z on 23.07.17.
 */
public class NgsNamesValidator implements NamesValidator {

    @Override
    public boolean isKeyword(@NotNull String name, Project project) {
        return true;
    }

    @Override
    public boolean isIdentifier(@NotNull String name, Project project) {
        return true;
    }
}
