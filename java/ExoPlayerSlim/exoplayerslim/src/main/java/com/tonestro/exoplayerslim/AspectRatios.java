package com.tonestro.exoplayerslim;

public class AspectRatios {

    private AspectRatios() {
    }

    /**
     * Either the width or height is decreased to obtain the desired aspect ratio.
     */
    public static final int Fit = 0;

    /**
     * The width is fixed and the height is increased or decreased to obtain the desired aspect ratio.
     */
    public static final int FixedWidth = 1;

    /**
     * The height is fixed and the width is increased or decreased to obtain the desired aspect ratio.
     */
    public static final int FixedHeight = 2;

    /**
     * The specified aspect ratio is ignored.
     */
    public static final int Fill = 3;

    /**
     * Either the width or height is increased to obtain the desired aspect ratio.
     */
    public static final int Zoom = 4;
}
