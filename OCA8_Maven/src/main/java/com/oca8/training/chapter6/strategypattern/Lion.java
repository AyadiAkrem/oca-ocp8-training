package com.oca8.training.chapter6.strategypattern;

import java.util.Comparator;
import java.util.concurrent.Callable;

public class Lion {

    public void makeASound(Behaviour bv) {
        bv.action("Hello", "4");
        Thread th = new Thread(() -> System.out.println("7"));
        th.start();

    }
}


interface Behaviour {
    public int action(String... str);
}


class Main {

    public static void main(String[] srt) {


        Lion lion = new Lion();
        Behaviour behaviour = str1 -> {
            return 12;
        };
        lion.makeASound(behaviour);
        lion.makeASound((String... str2) -> 15);
    }
}
