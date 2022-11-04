package com.tonestro.exoplayerslim;

import com.google.android.exoplayer2.MediaItem;

public class RepeatModes {

    private RepeatModes() {
    }

    /**
     * Normal playback without repetition. "Previous" and "Next" actions move to the previous and next
     * {@link MediaItem} respectively, and do nothing when there is no previous or next {@link
     * MediaItem} to move to.
     */
    public static final int REPEAT_MODE_OFF = 0;

    /**
     * Repeats the currently playing {@link MediaItem} infinitely during ongoing playback. "Previous"
     * and "Next" actions behave as they do in {@link #REPEAT_MODE_OFF}, moving to the previous and
     * next {@link MediaItem} respectively, and doing nothing when there is no previous or next {@link
     * MediaItem} to move to.
     */
    public static final int REPEAT_MODE_ONE = 1;

    /**
     * Repeats the entire timeline infinitely. "Previous" and "Next" actions behave as they do in
     * {@link #REPEAT_MODE_OFF}, but with looping at the ends so that "Previous" when playing the
     * first {@link MediaItem} will move to the last {@link MediaItem}, and "Next" when playing the
     * last {@link MediaItem} will move to the first {@link MediaItem}.
     */
    public static final int REPEAT_MODE_ALL = 2;
}
