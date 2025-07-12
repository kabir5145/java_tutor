package com.company;


public class cwh_105_javadoc {
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
        foo();
        foo(13,4);
    }
}
