package org.ngs.add.util;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by z on 20.08.17.
 */
public class NgsConfigHelper {
    public static void main(String[] args) {
        fixConfigFiles("/home/src/old/ngspice/linux/usr/local/bin/ngspice");
    }
    public static void fixConfigFiles(String ngspiceBinary) {

        File bin = new File(ngspiceBinary);
        String localDir = getLocalDirFromNgspiceBinary(ngspiceBinary);
        if (localDir.isEmpty()) {
            return;
        }

        String spinit = String.format("%sshare/ngspice/scripts/spinit", localDir);
        String modelDir = String.format("%slib/ngspice", localDir);


        try {

            List<String> fileLines = Files.readAllLines(Paths.get(spinit));
            List<String> updatedLines = Files.lines(Paths.get(spinit))
                    .map(line -> (updateModelLine(line, modelDir)))
                    .collect(Collectors.toList())
                    ;

            if (!updatedLines.equals(fileLines)) {
                // Backup old config
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd.HH-mm-ss");
                String time = LocalDateTime.now().format(formatter);
                String backupName = spinit + "." + time + ".bckp";
                Files.copy(Paths.get(spinit), Paths.get(backupName));
                // Update paths in the config.
                Files.write(Paths.get(spinit), updatedLines);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Pattern pattern =
            Pattern.compile(RegexUtil.toRegexCaseIndependent("^( s )codemodel( S ).*(analog|digital|xtradev|xtraevt|spice2poly|table)\\.cm$"));




    private static String updateModelLine(String line, String newPath) {
        Matcher m = pattern.matcher(line);
        if (m.find()) {
            String firstSpace = m.group(1);
            String secondSpace = m.group(2);
            String shortName = m.group(3);

            return String.format("%scodemodel%s%s/%s.cm", firstSpace, secondSpace, newPath,shortName);

        } else {
            return line;
        }

    }

    public static String getLocalDirFromNgspiceBinary(String ngspiceBinary) {
        String dir = nthParent(ngspiceBinary, 2);
        return dir;
    }

    private static String nthParent(String s, int n) {
        for (int i = 0; i < n; i++) {
            s = FilenameUtils.getFullPathNoEndSeparator(s);
        }

        if (!s.isEmpty()) {
            s = s + "/";
        }
        return s;
    }
}
