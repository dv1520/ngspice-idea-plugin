package org.ngs.adapter;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

/**
 * Created by z on 14.11.17.
 */
public class NgsCommenter implements Commenter {
    @Nullable
    @Override
    public String getLineCommentPrefix() {
        // * should be at the start of the line
        // code formatting can add whitespaces, so we use '$'
        return "$";
    }

    @Nullable
    @Override
    public String getBlockCommentPrefix() {
        return null;
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return null;
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentPrefix() {
        return null;
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentSuffix() {
        return null;
    }
}