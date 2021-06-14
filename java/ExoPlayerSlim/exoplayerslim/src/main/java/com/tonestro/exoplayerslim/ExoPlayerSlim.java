package com.tonestro.exoplayerslim;

import android.view.View;

import java.io.Closeable;

public interface ExoPlayerSlim extends Closeable {

    void addListener(ExoPlayerSlimListener listener);

    boolean removeListener(ExoPlayerSlimListener listener);

    void initializeFromUrl(String url);

    void play();

    void pause();

    void stop(boolean reset);

    void seekTo(long millis);

    long getCurrentPosition();

    long getDuration();

    boolean getPlayWhenReady();

    void setPlayWhenReady(boolean playWhenReady);

    /**
     * Use this method to set the repeat mode after the player was initialized
     * @param repeatMode Repeat mode given in @{@link RepeatModes}
     */
    void setRepeatMode(int repeatMode);

    int getRepeatMode();

    void attachPlayerView(View playerView, boolean useNativeControls, int aspectRatio);

    void detachPlayerView(View playerView);
}
