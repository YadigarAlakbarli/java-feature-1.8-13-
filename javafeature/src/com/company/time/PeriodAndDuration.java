package com.company.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {

    public static void main(String[] args) {
        //create difference 2 date
        LocalDate d1= LocalDate.of(2019,01,11);
        LocalDate d2= d1.plus(Period.of(2,3,24));

        Period p=Period.between(d1,d2);
        //get months difference
        System.out.println("Month-"+p.getMonths());
        //get days difference
        System.out.println("Days-"+p.getDays());
        //get years difference
        System.out.println("Years-"+p.getYears());

        //Duration Api using
        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));

        long l = Duration.between(initialTime, finalTime).getSeconds();
        System.out.println("Second-"+l);

    }

}
