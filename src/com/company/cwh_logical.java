package com.company;

public class cwh_logical {
    public static void main(String[] args) {
        System.out.println("for logical and ...");
        boolean a = false;
        boolean b = false;
        if (a && b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println("for logical or...");
        if (a || b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.println("for logical not");
        System.out.println("not(a) is ");
        System.out.println(!a);
        System.out.println("not (b) is ");
        System.out.println(!b);
    }
}
