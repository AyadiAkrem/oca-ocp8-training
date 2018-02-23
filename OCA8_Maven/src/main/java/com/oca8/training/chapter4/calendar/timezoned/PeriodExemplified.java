/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.calendar.timezoned;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

/**
 *
 * @author EXG503
 */
public class PeriodExemplified {

    public static void main(String[] str) {
        Period[] durations = {Period.ofDays(35),
            Period.ofDays(-35),
            Period.ofMonths(14),
            Period.ofWeeks(11),
            Period.ofYears(50),
            Period.between(LocalDate.of(2012, 11, 11), LocalDate.of(2013, 1, 1))};
        System.out.println(Arrays.asList(durations));
        //[P35D, P-35D, P14M, P77D, P50Y, P1M21D]

    }
}
