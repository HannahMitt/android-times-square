package com.squareup.timessquare;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by HannahMitt on 1/11/14.
 */
public class IndicatorDate implements Comparable<IndicatorDate> {

    private Calendar calendarDay;
    private ArrayList<Integer> indicators;

    public IndicatorDate(Calendar day) {
        this.calendarDay = day;
        indicators = new ArrayList<Integer>();
    }

    public void addIndicator(int color) {
        indicators.add(color);
    }

    public Calendar getDay() {
        return calendarDay;
    }

    public List<Integer> getIndicators() {
        return indicators;
    }

    @Override
    public int compareTo(IndicatorDate indicatorDate) {
        return this.calendarDay.compareTo(indicatorDate.getDay());
    }
}
