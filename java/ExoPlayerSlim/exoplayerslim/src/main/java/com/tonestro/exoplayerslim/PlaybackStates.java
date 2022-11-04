package com.tonestro.exoplayerslim;

public class PlaybackStates {

    private PlaybackStates() {
    }

    /**
     * The player is idle, meaning it holds only limited resources. The player must be {@link
     * #prepare() prepared} before it will play the media.
     */
    public static final int STATE_IDLE = 1;

    /**
     * The player is not able to immediately play the media, but is doing work toward being able to do
     * so. This state typically occurs when the player needs to buffer more data before playback can
     * start.
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
