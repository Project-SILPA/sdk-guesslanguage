package org.silpa.guesslanguage;

/**
 * Created by sujith on 30/7/14.
 */
public class LanguageInfo {
    private String langTag;
    private int langId;
    private String langName;

    public LanguageInfo(String langTag, int langId, String langName) {
        this.langTag = langTag;
        this.langId = langId;
        this.langName = langName;
    }

    public String getLanguageTag() {
        return this.langTag;
    }

    public int getLanguageId() {
        return this.langId;
    }

    public String getLanguageName() {
        return this.langName;
    }
}