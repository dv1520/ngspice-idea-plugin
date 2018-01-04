package org.ngs.add.idea.pi;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * Each line type has two arrays: expected tokens (by NgsLexer.getTokenType(e))
 * and display str for each entry. List size of tokens and names must be the same.
 *
 * Created by z on 30.12.17.
 */
public class HighlightDescriptions {


    public static final String REST_PARAM = "_REST";
    
    public static List<List<String>> expectedR = Lists.newArrayList(
            Lists.newArrayList("H_R", "NODE", "NODE", "VAL", REST_PARAM),
            Lists.newArrayList("H_R", "NODE", "NODE", "MODEL_NAME", REST_PARAM));

    public static List<List<String>> rAdd = Lists.newArrayList(
            Lists.newArrayList("name", "N1", "N2", "R", "<Rest>"),
            Lists.newArrayList("name", "N1", "N2", "Model", "<Rest>")
    );

    //-------------------------------------------------------------------------

    public static List<List<String>> expectedC = Lists.newArrayList(
            Lists.newArrayList("H_C", "NODE", "NODE", "VAL", REST_PARAM),
            Lists.newArrayList("H_C", "NODE", "NODE", "MODEL_NAME", REST_PARAM),
            Lists.newArrayList("H_C", "NODE", "NODE", "VAL", "MODEL_NAME", REST_PARAM)
    );

    public static List<List<String>> cAdd = Lists.newArrayList(
            Lists.newArrayList("name", "N+", "N-", "C", "<Rest>"),
            Lists.newArrayList("name", "N+", "N-", "Model", "<Rest>"),
            Lists.newArrayList("name", "N+", "N-", "", "Model", "<Rest>")
    );

    //-------------------------------------------------------------------------

    public static List<List<String>> expectedL = Lists.newArrayList(
            Lists.newArrayList("H_L", "NODE", "NODE", "VAL", REST_PARAM),
            Lists.newArrayList("H_L", "NODE", "NODE", "MODEL_NAME", REST_PARAM),
            Lists.newArrayList("H_L", "NODE", "NODE", "VAL", "MODEL_NAME", REST_PARAM)
    );

    public static List<List<String>> lAdd = Lists.newArrayList(
            Lists.newArrayList("name", "N+", "N-", "L", "<Rest>"),
            Lists.newArrayList("name", "N+", "N-", "Model", "<Rest>"),
            Lists.newArrayList("name", "N+", "N-", "L", "Model", "<Rest>")
    );

    //-------------------------------------------------------------------------
    public static List<List<String>> expectedK = Collections.singletonList(
            Lists.newArrayList("H_K", "H_L", "H_L", "VAL")
    );

    public static List<List<String>> kAdd = Collections.singletonList(
            Lists.newArrayList("name", "LName1", "LName2", "K")
    );

    //-------------------------------------------------------------------------

    public static List<List<String>> expectedS = Collections.singletonList(
            Lists.newArrayList("H_S", "NODE", "NODE", "NODE", "NODE", "MODEL_NAME", "VAL")
    );

    public static List<List<String>> sAdd = Collections.singletonList(
            Lists.newArrayList("name", "N+", "N-", "Nctrl+", "Nctrl-", "Model", "ON")
    );

    //-------------------------------------------------------------------------

    public static List<List<String>> expectedW = Collections.singletonList(
            Lists.newArrayList("H_W", "NODE", "NODE", "H_V", "MODEL_NAME", "VAL")
    );

    public static List<List<String>> wAdd = Collections.singletonList(
            Lists.newArrayList("name", "N+", "N-", "Vname", "Model", "ON")
    );

    //-------------------------------------------------------------------------

    public static List<List<String>> expectedO = Collections.singletonList(
            Lists.newArrayList("H_O", "NODE", "NODE", "NODE", "NODE", "MODEL_NAME")
    );

    public static List<List<String>> oAdd = Collections.singletonList(
            Lists.newArrayList("name", "Np1.1", "Np1.2", "Np2.1", "Np2.2", "Model")
    );
    //-------------------------------------------------------------------------

    public static List<List<String>> expectedT = Collections.singletonList(
            Lists.newArrayList("H_T", "NODE", "NODE", "NODE", "NODE", "KV_KEY", "EQ", "VAL", REST_PARAM)
    );

    public static List<List<String>> tAdd = Collections.singletonList(
            Lists.newArrayList("name", "Np1.1", "Np1.2", "Np2.1", "Np2.2", "", "", "Val", "<Rest>")
    );

    //-------------------------------------------------------------------------
    public static List<List<String>> expectedU = Collections.singletonList(
            Lists.newArrayList("H_U", "NODE", "NODE", "NODE", "MODEL_NAME", "KV_KEY", "EQ", "VAL", REST_PARAM)
    );

    public static List<List<String>> uAdd = Collections.singletonList(
            Lists.newArrayList("name", "N1", "N2", "Ncap", "Model", "", "", "Val", "<Rest>")
    );
    //-------------------------------------------------------------------------
    public static List<List<String>> expectedY = Collections.singletonList(
            Lists.newArrayList("H_Y", "NODE", "NODE", "NODE", "NODE", "MODEL_NAME", REST_PARAM)
    );

    public static List<List<String>> yAdd = Collections.singletonList(
            Lists.newArrayList("name", "N1", "0", "N2", "0", "Model", "<Rest>")
    );
    //-------------------------------------------------------------------------

    public static List<List<String>> expectedD = Collections.singletonList(
            Lists.newArrayList("H_D", "NODE", "NODE", "MODEL_NAME", REST_PARAM));

    public static List<List<String>> dAdd = Collections.singletonList(
            Lists.newArrayList("name", "N+", "N-", "Model", "<Rest>")
    );


    //-------------------------------------------------------------------------

    public static List<List<String>> expectedQ = Lists.newArrayList(
            Lists.newArrayList("H_Q", "NODE", "NODE", "NODE", "MODEL_NAME", REST_PARAM),
            Lists.newArrayList("H_Q", "NODE", "NODE", "NODE", "NODE", "MODEL_NAME", REST_PARAM));

    public static List<List<String>> qAdd = Lists.newArrayList(
            Lists.newArrayList("name", "Ncol", "Nbase", "Nemit", "Model", "<Rest>"),
            Lists.newArrayList("name", "Ncol", "Nbase", "Nemit", "Nsubstr", "Model", "<Rest>")
    );



    //-------------------------------------------------------------------------

    public static List<List<String>> expectedJ = Collections.singletonList(
            Lists.newArrayList("H_J", "NODE", "NODE", "NODE", "MODEL_NAME", REST_PARAM));

    public static List<List<String>> jAdd = Collections.singletonList(
            Lists.newArrayList("name", "Ndrain", "Ngate", "Nsource", "Model", "<Rest>")
    );

    //-------------------------------------------------------------------------

    public static List<List<String>> expectedZ = Collections.singletonList(
            Lists.newArrayList("H_Z", "NODE", "NODE", "NODE", "MODEL_NAME", REST_PARAM));

    public static List<List<String>> zAdd = Collections.singletonList(
            Lists.newArrayList("name", "Ndrain", "Ngate", "Nsource", "Model", "<Rest>")
    );

    //-------------------------------------------------------------------------

    public static List<List<String>> expectedM = Collections.singletonList(
            Lists.newArrayList("H_M", "NODE", "NODE", "NODE", "NODE", "MODEL_NAME", REST_PARAM));

    public static List<List<String>> mAdd = Collections.singletonList(
            Lists.newArrayList("name", "Ndrain", "Ngate", "Nsource", "Nbulk", "Model", "<Rest>")
    );
    //-------------------------------------------------------------------------

    public static List<List<String>> expectedModel = Collections.singletonList(
            Lists.newArrayList("H_MODEL", "MODEL_NAME", "VAL", REST_PARAM));

    public static List<List<String>> modelAdd = Collections.singletonList(
            Lists.newArrayList(".model", "Name", "Type", "<Rest>")
    );

    //-------------------------------------------------------------------------
    // they are not used, but the expected.size() == 1 is used to show the help label.
    public static List<List<String>> expectedX = Collections.singletonList(
            Lists.newArrayList("H_X"));

    public static List<List<String>> xAdd = Collections.singletonList(
            Lists.newArrayList("name")
    );
    //-------------------------------------------------------------------------
    //-------------------------------------------------------------------------
    public static List<List<String>> expectedV = Collections.singletonList(
            Lists.newArrayList("H_V", "NODE", "NODE", "VAL", REST_PARAM));

    public static List<List<String>> vAdd = Collections.singletonList(
            Lists.newArrayList("name", "N+", "N-", "Val", "<Rest>")
    );
}
