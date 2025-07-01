package com.company;

class MyMainEmployee{
    private int id;
    private String name;


//    public MyMainEmployee(){
//        id = 45;
//        name = "kabir";
//    }
    public MyMainEmployee(String myName,int  myId) {
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n ){
        this.name = n;
    }
    public int getId(){
        return id;
    }
}
public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee kabir = new MyMainEmployee("kabir",34);
        //kabir.setName("k");
        System.out.println(kabir.getId());
        System.out.println(kabir.getName());

    }
}
