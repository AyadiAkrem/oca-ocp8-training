/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter3.methodsparameter;

/**
 * This class cover the following point:
 * </br> [6.1] Create methods with arguments and return values; including
 * overloaded methods
 *
 *
 * @author AYADI Akrem
 */
public class MethodsOverload_Q1 {
    
    public static void main(String[] argv) {
        Integer parameter = 1;
        System.out.print(new MethodsOverload().myOverloadedMethod(parameter));
        System.out.print(new MethodsOverload().myOverloadedMethod(1));
    }

    public int myOverloadedMethod(Integer parameter) { return 0;}

    public int myOverloadedMethod(Object parameter) {return 1; }

    public int myOverloadedMethod(Integer... parameters) {return 2;}
   
    public int myOverloadedMethod(Object... parameters) {return 3;}
    
    public int myOverloadedMethod(int parameter) { return 4;}
}
