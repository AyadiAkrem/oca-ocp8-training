/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.calendar.timezoned;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

/**
 *
 * @author EXG503
 */
public class ShiftingLocalTime {

    public static void main(String[] str) {

        LocalTime localTime = LocalTime.of(11, 20, 50);
        localTime.plus(3, ChronoUnit.HOURS); //14:20:50
        localTime.plus(Duration.ofDays(3)); //11:20:50
        try {
            localTime.plus(Period.ofDays(3));//UnsupportedTemporalTypeException
        } catch (UnsupportedTemporalTypeException e) {
            e.printStackTrace();
        }
    }
}
