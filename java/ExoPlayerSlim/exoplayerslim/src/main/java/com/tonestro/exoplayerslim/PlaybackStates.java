package com.tonestro.exoplayerslim;

public class PlaybackStates {

    private PlaybackStates() {
    }

    /**
     * The player does not have any media to play.
     */
    public static final int STATE_IDLE = 1;
    /**
     * The player is not able to immediately play from its current position. This state typically
     * occurs when more data needs to be loaded.
     */
    public static final int STATE_BUFFERING = 2;
    /**
     * The player is able to immediately play from its current position. The player will be playing if
     * {@link #getPlayWhenReady()} is true, and paused otherwise.
     */
    public static final int STATE_READY = 3;
    /**
     * The player has finished playing the media.
     */
    public static final int STATE_ENDED = 4;
}
