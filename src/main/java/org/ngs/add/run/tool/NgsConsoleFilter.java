package org.ngs.add.run.tool;

import com.google.common.collect.Maps;
import com.intellij.execution.filters.HyperlinkInfo;
import com.intellij.execution.filters.RegexpFilter;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import org.ngs.add.jb.NgsFilenamePsiReference;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NgsConsoleFilter extends RegexpFilter {
    private String filename;

    private Pattern pattern = Pattern.compile("Error on line (\\d+) : (.*)\\r?\\n?");
    private Map<String, List<String>> fileToLines = Maps.newHashMap();


    public NgsConsoleFilter(Project project, String filename) {
        super(project, "Error on $FILE_PATH$ $LINE$ :.*");
        this.filename = filename;
    }

    private List<String> getLines(String name) {
        List<String> lines = fileToLines.get(name);
        if (lines != null) {
            return lines;
        }


        VirtualFile file = VirtualFileManager.getInstance().getFileSystem("file").findFileByPath(name);

        try {
            lines = Files.readAllLines(Paths.get(name), file.getCharset());
        } catch (IOException e) {
            e.printStackTrace();

            lines = Collections.emptyList();
        }

        return lines;
    }

    @Override
    public Result applyFilter(String line, int entireLength) {
        Matcher m = pattern.matcher(line);
        if (!m.find()) {
            return null;
        }

        int lineNumber = -1;
        String sourceLine = m.group(2);

        try {
            lineNumber = Integer.parseInt(m.group(1)) - 1;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }

        String fn = getFilename(lineNumber, sourceLine);

        // Calculate the offsets relative to the entire text.
        final int highlightStartOffset = entireLength - line.length() + 0;
        final int highlightEndOffset = highlightStartOffset + m.end(1);
        final HyperlinkInfo info = createOpenFileHyperlink(fn, lineNumber, -1);
        return new Result(highlightStartOffset, highlightEndOffset, info);
    }

    private boolean isSameLine(List<String> lines, int lineNumber, String expectedLine) {
        if (lineNumber >= lines.size()) {
            return false;
        }

        String fileLine = lines.get(lineNumber);

        return fileLine.equals(expectedLine);
    }

    private String getFilename(int lineNumber, String expectedLine) {
        try {
            List<String> lines = getLines(filename);
            if (isSameLine(lines, lineNumber, expectedLine)) {
                return filename;
            }

            Pattern p = Pattern.compile("^(?i)\\.include\\s+(.*)$");
            Matcher m = p.matcher("");

            for (String s : lines) {
                m.reset(s);
                if (m.find()) {
                    String includedFile = m.group(1);

                    includedFile = NgsFilenamePsiReference.addPathIfRelative(filename, includedFile);

                    List<String> includedLines = getLines(includedFile);
                    if (isSameLine(includedLines, lineNumber, expectedLine)) {

                        return includedFile;
                    }
                }
            }

            return filename;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filename;
    }
}