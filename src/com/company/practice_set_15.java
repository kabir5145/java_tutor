package com.company;

import java.util.ArrayList;

public class practice_set_15 {


    /*
     *       *
     *      * *
     *     * * *
     *
     * */
    public static void main(String[] args) {
//        int n = 5;
//
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

//        int n = 10;

        int a = 0;
        int b = 1;

        for (int i = 0; i < 15; i++) {
            System.out.print((a+b) +", ");
            int temp = a + b;
            a = b;
            b = temp;
        }

    }
}