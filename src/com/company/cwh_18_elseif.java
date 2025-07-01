package com.company;
import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        int age ;
        System.out.println("enter your age");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();

        switch (age) {
            case 18 -> System.out.println("you are going to become an adult !");
            case 23 -> System.out.println("you are going to join a job !");
            case 60 -> System.out.println("you are getting retired !");
            default -> System.out.println("enjoy your life!");
        }
        System.out.println("thank you");


        /*
        if (age>56){
            System.out.println("you are experienced");
        }
        else if (age>46){
            System.out.println("you are semi-experienced");
        }
        else if (age >36){
            System.out.println("you are semi-semi- experienced");
        }
        else {
            System.out.println("you are not experienced");
            */
        }
    }

