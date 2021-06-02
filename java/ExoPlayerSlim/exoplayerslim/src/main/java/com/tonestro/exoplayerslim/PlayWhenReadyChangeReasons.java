package com.tonestro.exoplayerslim;

public class PlayWhenReadyChangeReasons {

    private PlayWhenReadyChangeReasons() {
    }

    /**
     * Playback has been started or paused by a call to {@link #setPlayWhenReady(boolean)}.
     */
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;

    /**
     * Playback has been paused because of a loss of audio focus.
     */
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;

    /**
     * Playback has been paused to avoid becoming noisy.
     */
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;

    /**
     * Playback has been started or paused because of a remote change.
     */
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;

    /**
     * Playback has been paused at the end of a media item.
     */
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
}
