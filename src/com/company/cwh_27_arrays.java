package com.company;

public class cwh_27_arrays {
    public static void main(String[] args) {

/*        String [] students = {"Kabir","Rehan"," Moulik","Nipun "};
          System.out.println(students.length);
          System.out.println(students[1]);
*/
        int [] marks = {98,89,49,85,45};
        System.out.println(marks.length);
        //displaying an array (naive method)
        System.out.println("printing using naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //displaying an array(for loop)
        System.out.println("printing using for loop");
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }

        //quick quiz
        System.out.println("printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("printing using for each loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}

