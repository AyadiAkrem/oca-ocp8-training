/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.calendar.questions;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author EXG503
 */
public class Question2 {

    public static void main(String[] str) {
        Date date = new Date();
        System.out.println(DateFormat.getDateInstance().format(date));
        System.out.println(DateFormat.getDateInstance(DateFormat.DEFAULT).format(date));
        System.out.println(DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.getDefault()).format(date));
    }

}
