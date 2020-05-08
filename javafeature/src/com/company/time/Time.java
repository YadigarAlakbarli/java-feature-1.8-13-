package com.company.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time {

    public static void main(String[] args) {
        // LocalTime can be created from system clock or by using “parse” and “of” method
        LocalTime lt=LocalTime.of(13,07,22,232424242);
        System.out.println("of-"+lt);

        lt=LocalTime.parse("13:07");
        System.out.println("Parse-"+lt);

        lt=LocalTime.now();
        System.out.println("now-"+lt);

        //adds an hour to it by using the “plus”
        lt=lt.plus(1, ChronoUnit.HOURS);
        System.out.println("plus-"+lt);

        //get specific valuses using get
        int hour=lt.getHour();
        System.out.println("Hour-"+hour);

        //check a specific time is before or after another specific time
        LocalTime now=LocalTime.now();
        LocalTime before=now.minus(1,ChronoUnit.HOURS);

        String msg=before.isBefore(now)?"Before":"After";
        System.out.println(msg);

        //The max, min and noon time of a day can be obtained by constants in LocalTime class
        LocalTime MAX=LocalTime.MAX;
        System.out.println("Max-"+MAX);
    }
}
