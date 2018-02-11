/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.calendar.timezoned;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 *
 * @author EXG503
 */
public class TemporalAdjustersExemplified {

    public static void main(String[] str) {
        LocalTime adjustedTime = LocalTime.of(12, 0, 0).with(temporal -> temporal.plus(4, ChronoUnit.MINUTES)); 
        System.out.println(adjustedTime);//12:04
    }
}
