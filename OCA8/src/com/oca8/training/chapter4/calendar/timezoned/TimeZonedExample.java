/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.calendar.timezoned;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author EXG503
 */
public class TimeZonedExample {

    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();  //Current Date Time with Zone
        System.out.println(now); //2018-02-11T11:46:57.264+01:00[Europe/Paris]
        ZonedDateTime myZonedDateTime = ZonedDateTime
                                        .of(2014, 1, 31, 11, 20, 30, 93020122, ZoneId.systemDefault());
        System.out.println(myZonedDateTime); //2014-01-31T11:20:30.093020122+01:00[Europe/Paris]
        ZonedDateTime nowInAthens = ZonedDateTime.now(ZoneId.of("Europe/Athens"));
        System.out.println(nowInAthens); //2018-02-11T12:46:57.311+02:00[Europe/Athens]
        LocalDate localDate = LocalDate.of(2013, 11, 12);
        LocalTime localTime = LocalTime.of(23, 10, 44, 12882);
        ZoneId chicago = ZoneId.of("America/Chicago");
        ZonedDateTime chicagoTime = ZonedDateTime.of(localDate, localTime, chicago);
        System.out.println(chicagoTime); //2013-11-12T23:10:44.000012882-06:00[America/Chicago]
        LocalDateTime localDateTime = LocalDateTime.of(1982, Month.APRIL, 17, 14, 11);
        ZonedDateTime jakartaTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Jakarta"));
        System.out.println(jakartaTime);//1982-04-17T14:11+07:00[Asia/Jakarta]

    }

}
