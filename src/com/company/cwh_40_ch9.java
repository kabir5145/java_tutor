package com.company;

class myEmployee{
   private int id;
   private String name ;


   public String getName(){
       return name;
   }
   public void setName(String n){
       name = n;
   }
   public void setId(int i){
       id = i;
   }
   public int getId(){
       return id;
    }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        myEmployee kabir = new myEmployee();
       // kabir.id = 45;
        //kabir.name = "code ";->throws an error due to private access modifier
        kabir.setName("code");
        System.out.println(kabir.getName());

    }
}
