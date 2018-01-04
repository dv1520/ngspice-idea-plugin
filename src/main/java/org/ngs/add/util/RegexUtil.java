package org.ngs.add.util;

/**
 * Created by z on 20.08.17.
 */
public class RegexUtil {
    public static String toRegex(String regex) {
        regex = regex
                .replace(" s ", "\\s*")
                .replace(" S ", "\\s+");

        return regex;
    }

    public static String toRegexCaseIndependent(String regex) {
        String result = "(?i)" + toRegex(regex);

        return result;
    }
}
