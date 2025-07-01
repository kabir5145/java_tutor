package com.company;

public class cwh_33_varargs {
//    static int sum(int a , int b ){
//        return a+b;
//    }
//    static int sum(int a , int b ,int c){
//        return a+b+c;
//    }
   public static  int sum(int x ,int ...arr) {
        //available as int [] arr;
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        System.out.println("sum of nothing is :" +sum(1));
        System.out.println("the sum of 4 and 5 is :" + sum(4,5));
        System.out.println("the sum of 4 , 5 and 7 is :" + sum(4,5,7));
        System.out.println("the sum of 4 , 5  , 8 and 6 is :" + sum(4,5,8, 6));
    }
}
