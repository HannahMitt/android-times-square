// Copyright 2012 Square, Inc.
package com.squareup.timessquare;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

public class DayView extends LinearLayout {
	private LayoutInflater layoutInflater;
	private CheckedTextView checkedTextView;
	private LinearLayout dotLayout;

	public DayView(Context context) {
		super(context);
		layoutInflater = LayoutInflater.from(context);
	}

	public DayView(Context context, AttributeSet attrs) {
		super(context, attrs);
		layoutInflater = LayoutInflater.from(context);
		initialize(context);
	}
	
	private void initialize(Context context){
	    layoutInflater.inflate(R.layout.day, this, true);
	    checkedTextView = (CheckedTextView) findViewById(R.id.day_text);
	    dotLayout = (LinearLayout) findViewById(R.id.dot_layout);
	}
	
	public void addDot(int color){
		View dotView = layoutInflater.inflate(R.layout.dot, null);
		dotView.setLayoutParams(new LinearLayout.LayoutParams((int)getResources().getDimension(R.dimen.dot),(int)getResources().getDimension(R.dimen.dot),0));
		dotView.setBackgroundResource(color);
		dotLayout.addView(dotView);
	}
	
	public void setText(CharSequence text){
		checkedTextView.setText(text);
	}
	
	public void setChecked(boolean checked){
		checkedTextView.setChecked(checked);
	}
	
	public void setTextColor(ColorStateList colors){
		checkedTextView.setTextColor(colors);
	}
	
	public void setTextColor(int color){
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
