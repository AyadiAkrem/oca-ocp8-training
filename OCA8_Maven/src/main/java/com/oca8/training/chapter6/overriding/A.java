package com.oca8.training.chapter6.overriding;

public class A {

    public int age = 1 ;
}

class B extends A {

    public int age = 3;
}

class Examplified{


    public static void main(String[] args) {
        A ab = new B();
        System.out.println(( (B)ab).age);
    }
}

