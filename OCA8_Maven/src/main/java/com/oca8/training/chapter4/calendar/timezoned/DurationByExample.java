/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.calendar.timezoned;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author EXG503
 */
public class DurationByExample {

    public static void main(String[] str) {
        Duration[] durations = {Duration.ofDays(33),
             Duration.ofHours(33),
             Duration.ofMillis(33),
             Duration.ofMinutes(33),
             Duration.ofSeconds(33),
             Duration.ofNanos(33)};
        System.out.println(Arrays.asList(durations));
        //[PT792H, PT33H, PT0.033S, PT33M, PT33S, PT0.000000033S]
        Duration.between(LocalDate.of(2012, 11, 11), LocalDate.of(2013, 1, 1));
        // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
    }

}
