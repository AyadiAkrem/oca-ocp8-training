package com.oca8.training.chapter6.interfaces.constructor;

import java.util.*;

class B extends A {



    public  int x =34 ;
    static {

        System.out.println("2");
    }
     {

        System.out.println("5");
    }
    public B(){
        super(3);
        System.out.println("6");



    }
    public B(int x){
        this();
        int y = 30 ;
        new AB();
        this.x = x ;
    }


    public static void add(int x){
        int y = x ;
        y = 3;
    }

    public static void add(final float x){

       // x= 45; // x.x = 45
    }

    public static void main(String[] str){
    List<String> strs = new ArrayList<>(Arrays.asList("Hello","Hello2"));

    for(String string : strs){
        System.out.println(string);
   }
    for (int i = 0 ; i< strs.size(); i++){
        System.out.println(strs.get(i));
    }
        Iterator<String> iterator = strs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = strs.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        strs.forEach(System.out::println);



    }

}
