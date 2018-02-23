package com.oca8.training.chapter6.interfaces;

public interface InheritInstanceConstantExamplified
{
    int CONSTANT = 56 ;
}

 interface B{

    int CONSTANT1 = 56 ;
}

 class A implements InheritInstanceConstantExamplified, B{
     public static void main(String[] args) {
         A a = new A();
         System.out.println(a.CONSTANT);
     }

}


class CA {

    public static int main(String[] args) {
        return 0 ;
    }
}

class CB extends CA {


}

interface IA {

    public static void main2(String[] args) {
        System.out.println("IA");
    }
}

interface IB extends IA {

    public static void main2(String[] args) {
        System.out.println("IB");
    }
}

interface IC extends IB{
    public static void main(String[] args) {
       IB.main2(args);
    }
}