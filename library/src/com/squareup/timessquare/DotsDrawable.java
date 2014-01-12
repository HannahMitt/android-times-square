package com.squareup.timessquare;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by HannahMitt on 1/11/14.
 */
public class DotsDrawable extends Drawable {

    private static final int DOT_RADIUS = 14;
    private static final int DOT_SEPARATION = 5;
    private static final int DOT_DIAMETER = 2 * DOT_RADIUS;
    private static final int BOUNDS_HEIGHT = DOT_DIAMETER;

    private ArrayList<Paint> dotColors;

    public DotsDrawable(int width) {
        dotColors = new ArrayList<Paint>();
        setBounds(0, 0, width, BOUNDS_HEIGHT);
    }

    public void addDot(int color) {
        Paint paint = new Paint();
        paint.setColor(color);
        dotColors.add(paint);
    }

    @Override
    public void draw(Canvas canvas) {
        float cx = DOT_RADIUS + DOT_SEPARATION;

        for (Paint paint : dotColors) {
            canvas.drawCircle(cx, DOT_RADIUS, DOT_RADIUS, paint);
            cx += DOT_DIAMETER + DOT_SEPARATION;
        }
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public int getOpacity() {
        return PixelFormat.OPAQUE;
    }
}
