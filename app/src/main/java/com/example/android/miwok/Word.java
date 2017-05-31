package com.example.android.miwok;

/**
 * Created by Larry Osakwe on 5/30/2017.
 */

public class Word {

    private String miwokWord;
    private String defaultWord;


    public Word(String defaultWord, String miwokWord) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
    }

    public String getDefaultWord() {
        return this.defaultWord;
    }

    public String getMiwokWord() {
        return this.miwokWord;
    }

}
