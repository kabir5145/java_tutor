package com.company;

 class Employee{
    int id;
    int salary;
    String name;
    public  void printDetails(){
         System.out.println("my id is : " + id);
        System.out.println("my name is : "+name);
        System.out.println("my salary is: " + salary);
     }

     public int getSalary(){
        return salary;
     }
        }
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee kabir = new Employee();// instantiating a new employee object
        Employee raghav = new Employee();


        // setting attributes
        kabir.id = 12;
        kabir.name = "codeWithHarry";
        kabir.salary=45000;
        raghav.id = 13;
        raghav.name = "code";
        raghav.salary =46000;

        // printing attributes
        kabir.printDetails();
        raghav.printDetails();
        raghav.getSalary();


//        System.out.println(kabir.id);
//        System.out.println(kabir.name);
    }
}
