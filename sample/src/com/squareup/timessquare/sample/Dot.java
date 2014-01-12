package com.squareup.timessquare.sample;

import com.squareup.timessquare.IndicatorDate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by HannahMitt on 1/11/14.
 */
public class Dot implements IndicatorDate{

    private Calendar calendarDay;
    private ArrayList<Integer> indicators;

    public Dot(Calendar day) {
        calendarDay = Calendar.getInstance();
        calendarDay.set(Calendar.YEAR, day.get(Calendar.YEAR));
        calendarDay.set(Calendar.MONTH, day.get(Calendar.MONTH));
        calendarDay.set(Calendar.DAY_OF_YEAR, day.get(Calendar.DAY_OF_YEAR));
        indicators = new ArrayList<Integer>();
    }

    public void addIndicator(int color) {
        indicators.add(color);
    }

    public Calendar getDay() {
        return calendarDay;
    }

    public List<Integer> getIndicatorColors() {
        return indicators;
    }
}
