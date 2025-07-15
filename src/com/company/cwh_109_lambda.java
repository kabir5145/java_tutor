package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1(int a,String b);
   // void meth2();
}
/*
class kabir implements DemoAno{
    @Override
    public void meth1() {
        System.out.println("I am method one !");
    }
}
 */
//class AnonyDemo implements DemoAno {
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth one");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth two");
//    }
//}
public class cwh_109_lambda {
    public static void main(String[] args) {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();
//        obj.meth2();

        //Anonymous class
        /*
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("Hello man ");
            }

            @Override
            public void meth2() {
                System.out.println("Thank you man");
            }
        };
        obj.meth1();
        obj.meth2();
         */

        //Lambda expressions
//        DemoAno k = new kabir();
//        k.meth1();

        DemoAno ka= (a,b)-> {
            System.out.println("I am method 1 from this lambda "+a+" "+b);
        };
        ka.meth1(3,"kabir");
    }
}
