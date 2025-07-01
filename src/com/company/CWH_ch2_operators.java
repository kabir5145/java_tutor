package com.company;

public class CWH_ch2_operators {
    public static void main(String[] args) {

      // int x = 6*5-34/2;
        /*
        highest precedence goes to * and / . they are then evaluated on the basis of left to right
        associativity
         */
        /*
           =30-34/2
           =30-17
           =13

         */
      //  int b = 60/5-34*2;
        /*
          =12-34*2
          =12-68
          =-56
         */
       // System.out.println(x);
      //  System.out.println(b);

        //precedence and associativity

        //quick quiz

       // int x =6;
      //  int y = 1;
      //  int k = x*y/2;
        int b = 1;
        int c = 4;
        int a = 5;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);



    }
}