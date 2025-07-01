package com.company;
import java.util.Scanner;
//question2
public class CWH_CH1_PS {
    public static void main(String[] args) {
//        System.out.print("marks of cgpa=");
//        Scanner s = new Scanner(System.in);
//        float subject1=98;
//        float subject2=60;
//        float subject3=78;
//        float cgpa =(subject1+subject2+subject3)/30;
//        System.out.println(cgpa);

        //question3
//        System.out.println("what is your name?");
//        Scanner s = new Scanner(System.in);
//        String name = s.next();
//        System.out.println("hello " + name + " have a good day");

        //question5
//        System.out.println("enter your number");
//        Scanner s=new Scanner(System.in);
//        System.out.println(s.hasNext());


        //question4
        System.out.println("to convert kilometers to miles");
        Scanner s = new Scanner(System.in);
        float distance = s.nextFloat();
        float mile = 1.60934f;
        float conversion = distance*mile;
        System.out.println("conversion is = " + conversion);
    }
}
