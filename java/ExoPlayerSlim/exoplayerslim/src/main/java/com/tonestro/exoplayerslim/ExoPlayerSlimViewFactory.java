package com.tonestro.exoplayerslim;

import android.content.Context;
import android.view.View;

import com.google.android.exoplayer2.ui.PlayerView;

public class ExoPlayerSlimViewFactory {

    private ExoPlayerSlimViewFactory() {
    }

    public static View Create(Context context) {
        return new PlayerView(context);
    }
}
