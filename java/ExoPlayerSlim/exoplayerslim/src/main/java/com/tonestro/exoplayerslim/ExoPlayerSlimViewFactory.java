package com.tonestro.exoplayerslim;

import android.content.Context;
import android.view.View;

import com.google.android.exoplayer2.ui.StyledPlayerView;

public class ExoPlayerSlimViewFactory {

    private ExoPlayerSlimViewFactory() {
    }

    public static View create(Context context) {
        return new StyledPlayerView(context);
    }
}
