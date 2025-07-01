package com.company;

public class cwh_32_overloading {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a,int b){
        System.out.println("good morning " + a + " bro!");
        System.out.println("good morning " + b + " bro!");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("i invented a new world \n" +
                "plagiarism");
    }

    public static void main(String[] args) {
      //  telljoke();

        //case 1: changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("the value of x after running change is :" + x);
        //case 2: changing the array
//        int [] marks = {52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("the value of x after running change is :" + marks[0]);

        //method overloading
        foo();
        foo( 3000,300);
        // arguments are actual!
        }
    }

