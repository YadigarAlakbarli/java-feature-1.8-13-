package com.company.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {
    public static void main(String[] args) {


        ZoneId zoneId = ZoneId.of("Africa/Maseru");
        //create simple ZondDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(zonedDateTime);

        //LocalDateTime can be converted to a specific zone
        zonedDateTime = ZonedDateTime.parse("2018-05-03T10:15:30+01:00[Europe/Paris]");
        System.out.println(zonedDateTime);

        //All Available ZoneId List
        for (String z : ZoneId.getAvailableZoneIds()) {
            System.out.println(z);
        }
    }
}
