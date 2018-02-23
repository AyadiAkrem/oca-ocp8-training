package com.oca8.training.chapterx.equalshashcode;

public class HashCodeAsExampler {


    public static void main(String[] str){
    double x = 1.4 ;
    float y = 1.4f;
    System.gc();



    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }


    public double add(int x , int y){

        return (long) x+y ;
    }
}
