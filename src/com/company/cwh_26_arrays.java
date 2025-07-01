package com.company;

public class cwh_26_arrays {
    public static void main(String[] args) {
        /*class of 500 student-you have to store marks of these 500 students
        you should use arrays(recommended)
         */
        //there are three main ways create an array in java
        //1.declaration and memory allocation
        //int [] marks = new int[5];

        //2. declaration and then memory allocation
        //int []marks;
        //marks =new int[5];
        //initialisation
//        marks[0]=100;
//        marks[1]=59;
//        marks[2]=45;
//        marks[3]=67;
//        marks[4]=98;

        //3. declaration , memory allocation and initialisation together
        int [] marks = {98,89,49,85,45};

        //marks[5] = 98; -throws an error
        System.out.println(marks[3]);
    }
}
