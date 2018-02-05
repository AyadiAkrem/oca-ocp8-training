/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter1.classstructure;

/**
 *
 * @author EXG503
 */
public class MyClass {

    public interface MyInnerInterface {
    }
    
    public MyClass(){
    
    }

    public class MyInnerClass implements MyInnerInterface {

        public void tests() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] str) {
        
       new MyClass().new MyInnerClass().tests();

    }

    public void tests() {
        System.out.println("Hello");
    }

}

interface MyInterface {
}
