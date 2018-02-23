package com.oca8.training.chapter6.interfaces.constructor;

class A {
    static {

        System.out.println("1");
    }
    int y ;
    {

        y = 10 ;
        System.out.println("3");
    }
    public A(int x){

        System.out.println("4");
    }
}
