package com.oca8.training.chapter7.exceptionhandling;

import java.io.IOException;

public class HandlingExamplified {

    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method() throws IOException {

        method2();
    }

    private static void method2() throws IOException {
        throw new IOException();
    }
}
