package com.oca8.training.chapter6.strategypattern;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatorAsExample {



    public <T> void print(Predicate<T> predicate, T value){

        if (predicate.negate().negate().test(value)){
            System.out.println("accepted");
        }else{
            System.out.println("Refused");
        }
    }

    public static void main(String[] args) throws Exception{
        PredicatorAsExample predicate = new PredicatorAsExample();
        predicate.print(t -> t.startsWith("T"), "Test");
        predicate.print(t -> t >1, 3);
        List<String> str = Arrays.asList("Hello", "Hi","Tunisia","Greece","Portugal","Italie","Poland");
        int sum = str.stream().filter(t -> t.startsWith("P"))
                .mapToInt(t -> t.length())
                .summaryStatistics().getMax();
        System.out.println(sum);
    }
}
