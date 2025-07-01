package com.company;

abstract class parent2 {
    public parent2(){
        System.out.println("my name is kabir");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class child2 extends parent2{
    @Override
    public void greet() {
        System.out.println("good morning");
    }
    @Override
    public void greet2() {
        System.out.println("good afternoon");
    }
}
abstract class child3 extends parent2{

    public void th() {
        System.out.println("i am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        child2 c = new child2();
        //parent2 p= new parent2();  =>it will throw an error as it made of an abstract class
        // child3 c= new child3(); =>it will throw an error as it made of an abstract class
        c.sayHello();
        c.greet2();
        

    }
}