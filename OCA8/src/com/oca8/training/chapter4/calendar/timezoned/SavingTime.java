/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.calendar.timezoned;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author EXG503
 */
public class SavingTime {

    public static void main(String[] strs) {
        LocalDateTime date = LocalDateTime.of(2012, 11, 12, 13, 11, 12);
        ZonedDateTime zonedDate = date.atZone(ZoneId.of("America/Los_Angeles")); //2012-11-12T13:11:12-08:00[America/Los_Angeles]
        printDates(date, zonedDate);
        date = LocalDateTime.of(2014, 11, 2, 2, 0, 0, 0);
        zonedDate = date.atZone(ZoneId.of("America/Denver")); //2014-11-02T02:00-07:00[America/Denver]
        printDates(date, zonedDate);
        date = LocalDateTime.of(2014, 11, 2, 2, 30, 0, 0);
        zonedDate = date.atZone(ZoneId.of("America/New_York")); //2014-11-02T02:30-05:00[America/New_York]
        printDates(date, zonedDate);
        date = LocalDateTime.of(2014, 11, 2, 2, 0, 0, 0);
        zonedDate = date.atZone(ZoneId.of("America/Phoenix")); //2014-11-02T02:00-07:00[America/Phoenix]
        printDates(date, zonedDate);
        date = LocalDateTime.of(2014, 11, 2, 2, 59, 59, 999999999);
        zonedDate = date.atZone(ZoneId.of("America/Chicago")); //2014-11-02T02:59:59.999999999-06:00[America/Chicago]
        printDates(date, zonedDate);
    }

    private static void printDates(LocalDateTime date, ZonedDateTime zonedDate) {
        System.out.println("\n"+date);
        System.out.println(zonedDate);
    }

}
