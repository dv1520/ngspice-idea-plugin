package org.ngs.add;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by z on 06.07.17.
 */
public class LexerHelper {
    private String eol = "(\r?\n|$)";
    private String val = "[0-9a-zA-Z_\\-+.']+";
    private String valPercent = "[%0-9a-zA-Z_]+";
    private String ws;
    private String eqSign;
    private Matcher mEqSign;

    private String lBrAfterMe;
    private Matcher mLBrAfterMe;

    private String eqSignAfterNeighbour;
    private Matcher mEqSignAfterNeighbour;

    private String endOfLineAfterMe;
    private Matcher mEndOfLineAfterMe;

    private String newlineAfterMeOrKeyNeighbour;
    private Matcher mNewlineAfterMeOrKeyNeighbour;

    public LexerHelper() {
        initRegex();
    }

    private void initRegex() {

        initWs();
        initEqSign();
        initEndOfLineCheck();
        initLBracket();

        initTransistor();
    }

    private void initEndOfLineCheck() {
        endOfLineAfterMe = "^ val  s  eol "
                .replace(" val ", val)
                .replace(" s ", ws + "*")
                .replace(" eol ", eol)
                ;
        Pattern p = Pattern.compile(endOfLineAfterMe);
        Matcher m = p.matcher("");

        mEndOfLineAfterMe = m;
    }

    private void initWs() {
        String newline = "\\r?\\n";
        String escapedNewline = "( nl )+".replace(" nl ", newline);
        String whitespace = "( |\t| enl \\+)".replace(" enl ", escapedNewline);

        this.ws = whitespace;
    }

    private void initEqSign() {
        // or not use at all
        String regex = "^ val  s = s  val "
                .replace(" val ", val)
                .replace(" s ", ws + "*")
                ;

        this.eqSign = regex;
        Pattern p = Pattern.compile(eqSign);
        Matcher m = p.matcher("");

        this.mEqSign = m;

        regex = "^ val  S  val  s = s  val "
                .replace(" val ", val)
                .replace(" s ", ws + "*")
                .replace(" S ", ws + "+")
        ;

        this.eqSignAfterNeighbour = regex;
        p = Pattern.compile(eqSignAfterNeighbour);
        m = p.matcher("");

        this.mEqSignAfterNeighbour = m;
    }

    private void initTransistor() {
        String newline = "\\r?\\n";

        String regex = "^ val  s ($| nl | val  s =)"
                .replace(" val ", val)
                .replace(" s ", ws + "*")
                .replace(" nl ", newline)
                ;

        this.newlineAfterMeOrKeyNeighbour = regex;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("");

        this.mNewlineAfterMeOrKeyNeighbour = m;
    }

    private void initLBracket() {
        String regex = "^ val  s  lbr "
                .replace(" val ", valPercent)
                .replace(" s ", ws + "*")
                .replace(" lbr ", "\\[")
                ;

        this.lBrAfterMe = regex;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("");

        this.mLBrAfterMe = m;
    }


    public boolean isEqualSignFollowToken(String s, int tokenStart) {
        return find(mEqSign, s, tokenStart);
    }

    public boolean isEqualSignFollowsNeighbour(String s, int tokenStart) {
        return find(mEqSignAfterNeighbour, s, tokenStart);
    }

    public boolean isNewlineAfterMeOrKeyNeighbour(String s, int tokenStart) {
        return find(mNewlineAfterMeOrKeyNeighbour, s, tokenStart);
    }

    public boolean isEndOfLineNext(String s, int tokenStart) {
        return find(mEndOfLineAfterMe, s, tokenStart);
    }


    public boolean isLBracketFollowsToken(String s, int tokenStart) {
        return find(mLBrAfterMe, s, tokenStart);
    }

    private boolean find(Matcher m, String s, int tokenStart) {
        m.reset(s);
        m.region(tokenStart, s.length());

        return m.find();
    }
}
