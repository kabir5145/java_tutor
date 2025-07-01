package com.company;

class negativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
    public class cwh_84_throw_throws {
        public static double area(int r) throws negativeRadiusException{
            if(r<0){
                throw new negativeRadiusException();
            }
            double result = Math.PI * r * r;
            return result;
        }

        public static int divide(int a, int b) throws ArithmeticException {
            //made by kabir
            int result = a / b;
            return result;
        }

        public static void main(String[] args) {
            //raghav uses function created by kabir
            try {
//                int c = divide(6, 0);
//                System.out.println(c);
                double sr = area(1);
                System.out.println(sr);
            } catch (Exception e) {
                System.out.println(" It is an Exception");
            }
        }
    }
