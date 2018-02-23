package com.oca8.training.chapter4.calendar.questions;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class ChainedMethods {


    public static void main(String str[]){
        ZonedDateTime before = ZonedDateTime.of(LocalDateTime.of(2017,Month.MARCH,12,1,29), ZoneId.of("US/Pacific"));
        ZonedDateTime after = ZonedDateTime.of(LocalDateTime.of(2017,Month.MARCH,12,2,00), ZoneId.of("US/Pacific"));
        System.out.println(before);
        System.out.println(after);
        System.out.println(ChronoUnit.MINUTES.between(before,after)+" "+ChronoUnit.HOURS.between(before,after));
    }
}
