// Copyright 2012 Square, Inc.
package com.squareup.timessquare;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

public class DayView extends LinearLayout {
	private Context context;
	private LayoutInflater layoutInflater;
	private CheckedTextView checkedTextView;
	// private LinearLayout dotLayout;
	private View[] dots;

	public DayView(Context context) {
		super(context);
		this.context = context;
		layoutInflater = LayoutInflater.from(context);
	}

	public DayView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		layoutInflater = LayoutInflater.from(context);
		initialize(context);
	}

	private void initialize(Context context) {
		layoutInflater.inflate(R.layout.day, this, true);
		checkedTextView = (CheckedTextView) findViewById(R.id.day_text);
		// dotLayout = (LinearLayout) findViewById(R.id.dot_layout);
		dots = new View[5];
		dots[0] = findViewById(R.id.dot1);
		dots[1] = findViewById(R.id.dot2);
		dots[2] = findViewById(R.id.dot3);
		dots[3] = findViewById(R.id.dot4);
		dots[4] = findViewById(R.id.dot5);
	}

	public void addDots(Integer[] colorIndices) {
		for (int i = 0; i < dots.length; i++) {
			if (colorIndices.length > i) {
				dots[i].setVisibility(View.VISIBLE);
				dots[i].setBackgroundDrawable(DotUtility.getDotWithColorIndex(context, colorIndices[i]));
			} else {
				dots[i].setVisibility(View.INVISIBLE);
			}
		}
	}

	public void setText(CharSequence text) {
		checkedTextView.setText(text);
	}

	public void setChecked(boolean checked) {
		checkedTextView.setChecked(checked);
	}

	public void setTextColor(ColorStateList colors) {
		checkedTextView.setTextColor(colors);
	}

	public void setTextColor(int color) {
		checkedTextView.setTextColor(color);
	}

	@Override
	public void setEnabled(boolean enabled) {
		checkedTextView.setEnabled(enabled);
	}

	@Override
	public void setSelected(boolean selected) {
		checkedTextView.setSelected(selected);
	}

}
