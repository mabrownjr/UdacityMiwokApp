package com.example.android.miwok;

/**
 * Created by mikea on 6/11/2017.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a defaut translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private  String mMiwokTranslation;

    /** Image of the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object
     *  @param defaultTranslation is the word in a language that the user is already familiar with
     *                                                      (Such as English)
     * @param miwokTranslation is the word in Miwok language
     * @param audioResourceId is the audio for the designed word
     *  */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    /**
     * A copy constructor for the objects of numbers, family, and colors layout
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                                                      (Such as English)
     * @param miwokTranslation is the word in Miwok language
     *
     * @param imageResourceId is the image for the designated word
     *
     * @param audioResourceId is the audio for the designed word
     * */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default transation of the word
     * */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     * */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the Image of the word
     * */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns true if the object has an image and return false if it doesn't
     * */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}
