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
public class MethodsOverload {
     public static void main(String[] str){
         MethodsOverload mo = new MethodsOverload();
         Integer  x = 3 ;
            if(x == 3) return;
        }
    /**
     * Tacking an Integer as parameter
     *
     * @param parameter
     * @return
     */
    public int myOverloadedMethod(Integer parameter) {
        return 0;
    }

    public int myOverloadedMethod(Number... parameter) {
        return 1;
    }

    public int myOverloadedMethod(Integer... parameters) {
        return 2;
    }

    public int myOverloadedMethod(Object parameter, Integer... parameters) {
        return 3;
    }

    public int myOverloadedMethod(Integer parameter, Object... parameters) {
        return 4;
    }



    public int myOverloadedMethod(Object parameter, int... parameters) {
        return 6;
    }
    
    public int myOverloadedMethod(int parameter) {
        return 7;
    }

    public int myOverloadedMethod() {
        return 8;
    }


}
