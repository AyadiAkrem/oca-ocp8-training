package com.oca8.training.chapter6.interfaces;

public interface FinalStaticFieldsExamplified {


    int getAge();

    public static void staticMethdo() {
        InnerStaticInterface.instanceInnerMethod();
        //  x = 7 ;
    }

    public default void instanceMethod() {
        System.out.println("MyAge 2 =" + getAge());

    }


     interface InnerStaticInterface {
        public static void instanceInnerMethod() {
        }
    }

    interface InnerInterface {
    }
}

 interface FinalStaticFieldsExamplified2 {

      int getAge();

    public  default  void instanceMethod() {
        System.out.println("My Age =" + getAge());
    }

    public static void staticMethdo() {
        System.out.println("Hi, I am in a static method of an interface");
    }
}

class MyClass implements FinalStaticFieldsExamplified, FinalStaticFieldsExamplified2 {

    public synchronized void instanceMethod() {
        FinalStaticFieldsExamplified2.super.instanceMethod();
        MyClass instance = new MyClass(23);
        instance.myClassStaticMethdo();
    }

    final int age;

    public int getAge() {
        return age;
    }

    public MyClass(int age) {
        this.age = age;
    }

    public static void myClassStaticMethdo() {
        System.out.println("Hi, I am in  a static method");
    }
}

abstract class Child extends MyClass {
    private int name;

    public Child() {
        super(0);
    }

    public static void main(String[] args) {

        Child.myClassStaticMethdo();
        FinalStaticFieldsExamplified.staticMethdo();
    }
}
