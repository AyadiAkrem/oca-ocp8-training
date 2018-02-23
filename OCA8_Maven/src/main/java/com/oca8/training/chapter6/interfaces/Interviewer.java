package com.oca8.training.chapter6.interfaces;

public interface Interviewer {

    public static void myStaticMethod() {


    }
}

interface I1 {

    default void method() {
    }
}

interface I2 {

    default void method() {
    }
}

interface I3 extends I1, I2 {

    default void method() {
    }
}

class C1 implements I1, I2 {

    public void method() {
    }

    ;
}

class C2 {

    public void method() {
        C2 c2 = new C2() ;
        C2.class.isInstance(c2);

    }
}

class C3 extends C2 implements I1 {

}