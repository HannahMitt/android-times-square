// Copyright 2012 Square, Inc.
package com.squareup.timessquare;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

public class DayView extends LinearLayout {
	private CheckedTextView checkedTextView;

	public DayView(Context context) {
		super(context);
	}

	public DayView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize(context);
	}
	
	private void initialize(Context context){
		LayoutInflater inflater = LayoutInflater.from(context);
	    inflater.inflate(R.layout.day, this, true);
	    checkedTextView = (CheckedTextView) findViewById(R.id.day_text);
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
