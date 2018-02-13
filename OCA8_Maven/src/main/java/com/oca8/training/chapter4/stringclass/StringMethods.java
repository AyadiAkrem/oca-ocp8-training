/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter4.stringclass;

/**
 *
 * @author EXG503
 */
public class StringMethods {

    public static void main(String[] args) {
        final String hello = "Hello";
        final String world = "World";
        final String helloWorld = "HelloWorld";
        final String helloWorldJ = String.join(hello, world);
        System.out.print(hello + world == helloWorld);
        System.out.print(helloWorld == helloWorldJ);
    }

    public static void testConcatMethod() {
        String hello = "Hello";
        String world = "World";
        hello.concat(world);
        System.out.println(hello);
    }
}
