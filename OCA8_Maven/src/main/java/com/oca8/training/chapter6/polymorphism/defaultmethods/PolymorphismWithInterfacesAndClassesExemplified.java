package com.oca8.training.chapter6.polymorphism.defaultmethods;

public interface PolymorphismWithInterfacesAndClassesExemplified {
    public static void main(String[] args) {
        new MyFinalClass().myMethod();
        MyInterface myInterface = new MyFinalClass();
        myInterface.myMethod();
    }

}

interface MyInterface {
    default Object myMethod() {
        System.out.println("Interviewer: Accept");
        return null;
    }
}

class MyClass {
    public String myMethod() {
        System.out.println("Manager: Accept");
        return null;
    }
}

class MyFinalClass extends MyClass implements MyInterface {
    enum DAY { Monday, THUSDAY};
    public static int main(String[] args) {

    return 1;
    }
}