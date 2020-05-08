package com.company.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
        //create an instance using the factory “of” ,“parse” and "now" methods
        LocalDateTime dt = LocalDateTime.of(2019, 05, 8, 13, 43, 33);
        System.out.println("of-" + dt);

        dt = LocalDateTime.parse("2019-01-11T13:45:13");
        System.out.println("parse-" + dt);

        dt=LocalDateTime.now();
        System.out.println("now-"+dt);

        //addition and subtraction of specific units of time like days, months, year and minutes
        dt=dt.minus(1, ChronoUnit.YEARS);
        System.out.println("minus-"+dt);

        //get methods utility
        Month m=dt.getMonth();
        System.out.println("Month-"+m);

        //extract LocalDate and LocalTime using to method
        LocalDate ld=dt.toLocalDate();
        LocalTime lt=dt.toLocalTime();

        System.out.println("LocalDate-"+ld);
        System.out.println("LocalTime-"+lt);
    }
}
