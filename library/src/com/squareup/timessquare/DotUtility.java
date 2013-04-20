package com.squareup.timessquare;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

public class DotUtility {
	
	public static final int[] COLORS = {Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.GRAY};

	public static Drawable getDotWithColorIndex(Context context, int colorIndex){
		ShapeDrawable dotShape = new ShapeDrawable(new OvalShape());

		int bound = (int) context.getResources().getDimension(R.dimen.dot);
		dotShape.setBounds(bound, bound, bound, bound);
		dotShape.setIntrinsicHeight(bound);
		dotShape.setIntrinsicWidth(bound);

		dotShape.getPaint().setColor(COLORS[colorIndex % COLORS.length]);
		
		return dotShape;
	}
}
