package com.tonestro.exoplayerslim;

import android.content.Context;

public class ExoPlayerSlimFactory {

    private ExoPlayerSlimFactory() {
    }

    public static ExoPlayerSlim create(Context context) {
        return new ExoPlayerSlimImpl(context);
    }

    public static ExoPlayerSlim create(Context context, String url) {
        ExoPlayerSlim player = new ExoPlayerSlimImpl(context);
        player.initializeFromUrl(url);
        return player;
    }
}
