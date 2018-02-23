package com.oca8.training.chapter5.labledstatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExemplified {


    public static void main(String[] str){


        StringBuilderPrototype hello = new StringBuilderPrototype(new StringBuilder("Hello"));
        List<StringBuilderPrototype> list = new LinkedList<>(Arrays.asList(hello));
        StringBuilderPrototype hello1 = new StringBuilderPrototype(new StringBuilder("Hello"));
        System.out.println(list.contains(hello1));
        System.out.println(hello.equals(hello1));

    }
    public static class StringBuilderPrototype {
       final StringBuilder str ;

        public StringBuilderPrototype(StringBuilder str) {
            this.str = str;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof StringBuilderPrototype)) return false;

            StringBuilderPrototype that = (StringBuilderPrototype) o;

            return str != null ? str.toString().equals(that.str.toString()) : that.str == null;
        }

        @Override
        public int hashCode() {
            return str != null ? str.hashCode() : 0;
        }
    }


}
