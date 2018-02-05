/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oca8.training.chapter3.methodsparameter;

/**
 *
 * @author EXG503
 */
public class MethodsOverload_Q3 {

    public static void main(String[] argv) {
        Short parameter = 3;
        System.out.print(new MethodsOverload_Q3().myOverloadedMethod(parameter));
    }

    public int myOverloadedMethod(int... parameter) {
        return 4;
    }
}
    