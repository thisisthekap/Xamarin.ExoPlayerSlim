package com.tonestro.exoplayerslim;

public class RepeatModes {

    private RepeatModes() {
    }

    /**
     * Normal playback without repetition. "Previous" and "Next" actions move to the previous and next
     * windows respectively, and do nothing when there is no previous or next window to move to.
     */
    public static final int REPEAT_MODE_OFF = 0;
    /**
     * Repeats the currently playing window infinitely during ongoing playback. "Previous" and "Next"
     * actions behave as they do in {@link #REPEAT_MODE_OFF}, moving to the previous and next windows
     * respectively, and doing nothing when there is no previous or next window to move to.
     */
    public static final int REPEAT_MODE_ONE = 1;
    /**
     * Repeats the entire timeline infinitely. "Previous" and "Next" actions behave as they do in
     * {@link #REPEAT_MODE_OFF}, but with looping at the ends so that "Previous" when playing the
     * first window will move to the last window, and "Next" when playing the last window will move to
     * the first window.
     */
    public static final int REPEAT_MODE_ALL = 2;
}
