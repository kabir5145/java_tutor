package com.company;

import java.util.Scanner;

public class cwh_79_errors_demo {
    public static void main(String[] args) {
        //SYNTAX ERROR DEMO
        //int a =0 // ERROR : no semicolon!
        // b = 8; //ERROR: b not declared!

        //LOGICAL ERROR DEMO
        //write a program to print all prime numbers between 1 and  10
        System.out.println(2);
        for (int i = 1;i<5;i++){
            System.out.println(2*i+1);
        }

        //RUN TIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is = "+1000/k);
    }
}
