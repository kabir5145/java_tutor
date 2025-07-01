package com.company;


interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class mySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Good morning");
    }
    public void meth2(){
        System.out.println("Good evening ");
    }
    public void meth3(){
        System.out.println("kabir");
    }
    public void meth4(){
        System.out.println("raghav");
    }
}
public class cwh_58_inheritance_interfaces {
    public static void main(String[] args) {
        mySampleClass s = new mySampleClass();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}
