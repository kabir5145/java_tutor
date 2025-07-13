package com.company;

public class cwh_107_method_tags {
    /**
     *
     * @param args these are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *
     * @param a this is the first number to add
     * @param b this is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if I will be 0
     * @deprecated this method is deprecated you should use + operator
     */
    public int add(int a,int b) throws Exception{
        if(1==0){
            throw  new Exception();
        }
        int c;

        c = a+b;
        return c;
    }
}
