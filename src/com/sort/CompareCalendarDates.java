package com.sort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompareCalendarDates {
    public static void main(String args[]) {
        Date date1 = null;
        try {
            date1=  new SimpleDateFormat("yyyy-MM-dd").parse("2019-12-25");
        } catch (ParseException e) {
            date1 = null;
        }

        Calendar calendar1 = Calendar.getInstance();
        calendar1.clear();
        calendar1.setTime(date1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.setLenient(false); // Don't automatically convert invalid date.
        calendar2.set(2019, 11, 25, 0, 0, 0);
        calendar2.getTimeInMillis();

        boolean isEqual = calendar1.equals(calendar2);
        System.out.println ("Are to dates equal: " + isEqual);
    }
}
