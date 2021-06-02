package com.tonestro.exoplayerslim;

public interface ExoPlayerSlimListener {
    void onPlayWhenReadyChanged(boolean playWhenReady, int reason);

    void onPlaybackStateChanged(int state);

    void onIsPlayingChanged(boolean isPlaying);

    void onPlayerError(Exception error);
}
