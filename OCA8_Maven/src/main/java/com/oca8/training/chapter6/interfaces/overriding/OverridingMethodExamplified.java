package com.oca8.training.chapter6.interfaces.overriding;

import java.awt.*;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

public class OverridingMethodExamplified {
}


class A {

    int main() throws NullPointerException {
        return 0;
    }

    public void method2() {
        try {
            main();
        } catch (StackOverflowError ex) {
            System.out.println("Hello ");
        }
    }

}

class B extends A {
    transient int a =45 ;

    int  main()  throws Error {
        throw new RuntimeException("");
    }


    public static void main(String[] args) {
        A instance = new B();
        instance.method2();
    }
}

interface IA {
    default List method(){return null;};
}
interface IB{
     int method(int a);
}
class C implements  IA {

}