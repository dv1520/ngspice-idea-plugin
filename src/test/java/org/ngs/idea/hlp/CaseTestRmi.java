package org.ngs.idea.hlp;

import junit.framework.TestCase;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by z on 18.11.17.
 */
public abstract class CaseTestRmi extends TestCase {
    IdeaTestService ideaService;
    @Override
    public void setUp() throws Exception {
        super.setUp();
        try {
            Registry registry = LocateRegistry.getRegistry(null);
            ideaService = (IdeaTestService) registry.lookup("IdeaTestService");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    protected void doTest(String filename, List<String> expectedOutput) {
        try {
            Map<String, Object> mp = ideaService.autocomplete(filename);
            List<String> strings = (List<String>)mp.get("result");


            Collections.sort(strings);
            Collections.sort(expectedOutput);
            assertEquals(expectedOutput, strings);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
