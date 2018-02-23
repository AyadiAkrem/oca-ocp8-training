package com.oca8.training.chapter6.polymorphism.defaultmethods;

public class Interviewer {
    public int age = 20;

    public Object myMethod() {
        System.out.println("Interviewer: Accept");
        return null;
    }

    public int getAge() {
        return age;
    }
    public Interviewer getSuper() {
        return this;
    }
}

class Manager extends Interviewer {
    public int age = 30;

    public String myMethod() {
        System.out.println("Manager: Accept");
        return null;
    }

    public int getAge() {
        return age;
    }


    public Interviewer getSuper() {
        return super.getSuper();
    }

    public void managerMEthod() {
    }
}

class Project {

    public static void main(String[] args) {
        Interviewer mn = new Manager();
        Interviewer interv = new Interviewer();
        interv.getSuper();
        mn.myMethod();
        System.out.println(mn.age);//20
        System.out.println(((Manager) mn).age);//30
        System.out.println(mn.getAge());
        System.out.println(((Manager) mn).getSuper().age);//20
        System.out.println(((Manager) mn).getSuper().getAge());//30
    }
}