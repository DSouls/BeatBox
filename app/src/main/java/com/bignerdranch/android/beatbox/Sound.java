package com.bignerdranch.android.beatbox;

/**
 * Created by Alex on 2017/3/13.
 */

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] componets = assetPath.split("/");
        String filename = componets[componets.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
