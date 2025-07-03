package com.company;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_99_gregorian {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+": "+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        GregorianCalendar call = new GregorianCalendar();
        System.out.println(call.isLeapYear(2026));
//        TimeZone t = TimeZone.getTimeZone("GMT-5");

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
