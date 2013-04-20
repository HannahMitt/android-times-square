package com.squareup.timessquare;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

public class DotUtility {

	public static final String[] HEX_COLORS = { "#ffd800", "#009900", "#004c6d", "#ff0033", "#99cc00", "#ff9900", "#007c6b", "#890E86", "#1170AF", "#893222", "#13cccc", "#cc9900" };

	public static Drawable getDotWithColorIndex(Context context, int colorIndex) {
		ShapeDrawable dotShape = new ShapeDrawable(new OvalShape());

		int bound = (int) context.getResources().getDimension(R.dimen.dot);
		dotShape.setBounds(bound, bound, bound, bound);
		dotShape.setIntrinsicHeight(bound);
		dotShape.setIntrinsicWidth(bound);

		dotShape.getPaint().setColor(Color.parseColor(HEX_COLORS[colorIndex % HEX_COLORS.length]));

		return dotShape;
	}
}
