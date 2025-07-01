package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner kabir = new Scanner(System.in);
//        System.out.println("enter number 1");
//        //int a = kabir.nextInt();
//        float a = kabir.nextInt();
//        System.out.println("enter number 2");
//       // int b = kabir.nextInt();
//        float b = kabir.nextInt();
//        //int sum = a + b;
//        float sum = a+b;
//        System.out.println("the sum of these numbers");
//        System.out.println(sum);
        String str = kabir.nextLine();
        System.out.println(str);
    }
}
