package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();//this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yy --E a");//this is the format
        //System.out.println(df);
       DateTimeFormatter df2= DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df);//created date string using date and format

        String o = dt.format(df2);
        System.out.println(o);
        System.out.println(myDate);
    }
}
