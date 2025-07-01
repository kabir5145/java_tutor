package com.company;

public class cwh_80_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        //without try
//        int c = a/b;
//        System.out.println("the result is : "+c);
        //with try
        try {
            int c = a / b;
            System.out.println("the result is= " + c);
        }
        catch (Exception e ){
            System.out.println("we failed to divide . Reason is : ");
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
