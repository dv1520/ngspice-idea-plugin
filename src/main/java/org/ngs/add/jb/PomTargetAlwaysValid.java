package org.ngs.add.jb;

import com.intellij.pom.PomTarget;

/**
 * Created by z on 19.08.17.
 */
public class PomTargetAlwaysValid implements PomTarget {
    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void navigate(boolean requestFocus) {

    }

    @Override
    public boolean canNavigate() {
        return true;
    }

    @Override
    public boolean canNavigateToSource() {
        return true;
    }
}
