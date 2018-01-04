package org.ngs.ngo;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.ngs.add.run.ReaderForServerMode;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by z on 08.10.17.
 */
public class TestServerOutputParser {

    @Test
    public void testServerOutputParser() throws Exception {
        ReaderForServerMode reader = new ReaderForServerMode();

        final List<List<Double>> result = new ArrayList<>();
        reader.setRowFunc(row -> {
            final Double[] arr = new Double[row.size()];
            for (int i = 0; i < row.size(); i++) {
                double val = -999;
                try {val = Double.parseDouble(row.get(i));} catch (NumberFormatException e) {e.printStackTrace();}
                arr[i] = val;
            }

            // one thread, no need of the sync.
            result.add(Arrays.asList(arr));
        });


        readFileInChunks(reader);

        String expected = "[[0.0, 0.0, 0.0, 0.0, 0.0], [18530.0, 0.001851996000000254, 5.0, 2.499999999999999, -0.00125], [18531.0, 0.001852096000000254, 5.0, 2.499999999999999, -0.00125], [18532.0, 0.001852196000000254, 5.0, 2.499999999999999, -0.00125]]";
        String actual = result.toString();

        assertEquals(expected, actual);
    }

    private void readFileInChunks(ReaderForServerMode reader) throws Exception{
        // FIle has str 'Reference value :  1.91670e-03' from stdout
        String str = FileUtils.readFileToString(new File("src/test/testdata/out/server-output-with-reference.txt"));

        // One line is received in two chunks, without '\n' between them.
        int index = str.indexOf("209600");

        String part1 = str.substring(0, index);
        String part2 = str.substring(index);

        String[] strArr1 = part1.split("\n");

        // All line must end with '\n'
        for (int i = 0; i < strArr1.length - 1; i++) {
            reader.processLine(strArr1[i] + "\n");
        }

        // Except for the one, which consists of two chunks
        reader.processLine(strArr1[strArr1.length - 1]);

        // And all others are also have '\n'
        for (String s: part2.split("\n")) {
            reader.processLine(s + "\n");
        }

    }
}
