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

    private static final int DOT_RADIUS = 15;
    private static final int DOT_SEPARATION = 5;
    private static final int DOT_DIAMETER = 2 * DOT_RADIUS;
    private static final int BOUNDS_HEIGHT = DOT_DIAMETER;

    private ArrayList<Paint> mDotColors;

    public DotsDrawable() {
        mDotColors = new ArrayList<Paint>();
    }

    public void addDot(int color) {
        Paint paint = new Paint();
        paint.setColor(color);
        mDotColors.add(paint);
        setBounds(0, 0, mDotColors.size() * DOT_DIAMETER, BOUNDS_HEIGHT);
    }

    @Override
    public void draw(Canvas canvas) {

        setBounds(0, 0, 30, 30);

        float cx = 0;

        for (Paint paint : mDotColors) {
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
