package com.company;
import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return  "I am toString()";
    }

    @Override
    public String getMessage() {
        return"I am getMessage()";
    }
}
class maxAgeException extends Exception{
    @Override
    public String toString() {
        return  "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return"Make sure that the value of age entered is correct";
    }
}
public class cwh_83_exception_class {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if(a<9){
            try{
                //throw new myException();
                throw new ArithmeticException("this is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
               e.printStackTrace();
            }
            System.out.println("yes finished");
        }
    }
}
