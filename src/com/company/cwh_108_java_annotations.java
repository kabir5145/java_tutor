package com.company;

@FunctionalInterface
interface myFunctionalInterface {
    void thisMethod1();

    //void thisMethod2();
}
class newPhoneClass extends phone{
    public void showTime(){
        System.out.println("Time is 8 pm");
    }
    @Deprecated
    public int sum(int a , int b ){
        return a+b;
    }
}
public class cwh_108_java_annotations {
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        newPhoneClass phone = new newPhoneClass();
        phone.showTime();
        phone.sum(3,2);
    }
}
