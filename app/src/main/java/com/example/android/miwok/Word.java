package com.example.android.miwok;

/**
 * Created by Larry Osakwe on 5/30/2017.
 */

public class Word {

    private String miwokWord;
    private String defaultWord;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String defaultWord, String miwokWord) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
    }

    public Word(String defaultWord, String miwokWord , int imageResourceId) {
        this.miwokWord = miwokWord;
        this.defaultWord = defaultWord;
        this.imageResourceId = imageResourceId;
    }

    public String getDefaultWord() {
        return this.defaultWord;
    }

    public String getMiwokWord() {
        return this.miwokWord;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

}
