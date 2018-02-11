/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.calendar.timezoned;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

/**
 *
 * @author EXG503
 */
public class ShiftingLocalDate {

    public static void main(String[] str) {
        LocalDate localDate = LocalDate.of(2012, 11, 23);
        localDate.plus(3, ChronoUnit.DAYS); //2012-11-26
        localDate.plus(Period.ofDays(3)); //2012-11-26
        try {
            localDate.plus(Duration.ofDays(3));//UnsupportedTemporalTypeException: Unsupported unit: Seconds
        } catch (UnsupportedTemporalTypeException e) {
            e.printStackTrace();
        }
    }
}
