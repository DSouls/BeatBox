package com.bignerdranch.android.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 2017/3/13.
 */

public class BeatBox {

    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";
    private AssetManager mAssets;
    private List<Sound> mSounds = new ArrayList<>();

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        loudSounds();
    }

    private void loudSounds() {
        String[] soundNames;
        try {
            soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.d(TAG, "Found " + soundNames.length + " sounds");
        } catch (IOException ioe) {
            Log.e(TAG, "could not list assets" + ioe);
            return;
        }

        for(String filename : soundNames) {
            String assetPath = SOUNDS_FOLDER + "/" + filename;
            Sound sound = new Sound(assetPath);
            mSounds.add(sound);
        }
    }
    public List<Sound> getSounds() {
        return mSounds;
    }

}
