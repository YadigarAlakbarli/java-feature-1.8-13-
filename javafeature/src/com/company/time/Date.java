package com.company.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {
        // a specific day, month and year can be obtained using the “of” method or by using the “parse” method
        LocalDate ld = LocalDate.of(2019, 01, 23);
        System.out.println("of->" + ld);
       //--------------------------------------------------//
        ld = LocalDate.parse("2019-01-24");
        System.out.println("parse->" + ld);

        //now method using
        ld = LocalDate.now();
        System.out.println("now->" + ld);

        //change date using with method
        ld = ld.withDayOfMonth(1);
        System.out.println("with->" + ld);

        //add month,year,day custom date using plus method
        ld = ld.plusMonths(1);
        System.out.println("plus->" + ld);

        //minus month,year,day custom date using minus method
        ld = ld.minus(1, ChronoUnit.DAYS);
        System.out.println("minus->" + ld);

        // get the day of the month
        int month = ld.getDayOfMonth();
        System.out.println("Day Of Month->" + month);

        // get day of week
        DayOfWeek dayOfWeek = ld.getDayOfWeek();
        System.out.println("Get Day Of Week->" + dayOfWeek);


        //The relationship of a date to another can be determined to occur before or after another date
        LocalDate now = LocalDate.now();
        LocalDate before = now.minus(1, ChronoUnit.MONTHS);

        String msg = before.isBefore(now) ? "Before" : "After";
        System.out.println(msg);

        msg=now.isAfter(before)?"After":"Before";
        System.out.println(msg);
    }
}
