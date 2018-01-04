package org.ngs.add.util;

/**
 * Created by z on 24.10.17.
 */
public class NgsSettings {

    public static int getMaxAllowedLines() {
        return getProperty("ngs.runner.maxSamples", (int) 1e5);
    }

    public static int getMaxAllowedChartSamples() {
        return getProperty("ngs.runner.maxChartSamples", 600);
    }

    private static int getProperty(String name, int defaultValue) {
        String s = System.getProperty(name);

        if (s != null) {
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return defaultValue;
    }

    private static String getPluginBaseDir() {
        String path = System.getProperty("idea.plugins.path");
        if (path != null && !path.isEmpty()) {
            return path;
        }

        path = "";


        String userPrefix = System.getProperty("user.home");            // c:/users/user
        String selector = System.getProperty("idea.paths.selector");    // IdeaIC2017.2
        if (userPrefix != null && selector != null) {
            path = String.format("%s/.%s/config/plugins", userPrefix, selector);
        } else {
            path = ".";
        }


        return path;
    }

    public static String getPluginPath() {
        String baseDir = getPluginBaseDir();

        return baseDir + "/" + "ngspice-plugin";
    }



}
