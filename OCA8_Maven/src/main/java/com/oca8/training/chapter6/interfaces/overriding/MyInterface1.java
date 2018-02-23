package com.oca8.training.chapter6.interfaces.overriding;

public interface MyInterface1 {

    public default int getInt(){
        return 1;
    }
}

interface MyInterface2 {

    public default int getInt(){
        return 2;
    }
}

class MyClass implements MyInterface1, MyInterface2 {

    @Override
    public int getInt() {

        long x = 3222222222222L ;
        return MyInterface1.super.getInt();
    }
}

