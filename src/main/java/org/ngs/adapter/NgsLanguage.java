package org.ngs.adapter;

import com.intellij.lang.Language;

public class NgsLanguage extends Language {
    public static final NgsLanguage INSTANCE = new NgsLanguage();

    private NgsLanguage() {
        super("Ngspice");
    }
}
