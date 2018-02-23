package com.oca8.training.chapter5.labledstatement;

public class ForExamplified {

    public static void main(String[] args) {
        int a = 1;
       loop: for (; a < 5; a++) {
            for (int b = 0; b < 3; b++) {
                if (b == 1) {
                    continue ;
                } else {
                    System.out.println(a);
                }
            }
        }
    }
}
