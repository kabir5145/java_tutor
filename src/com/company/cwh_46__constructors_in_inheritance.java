package com.company;

class Base1{
    Base1(){
        System.out.println("i am a constructor!");
    }
    Base1(int x){
        System.out.println("i am an overloaded constructor with value of a as :"+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(4);
        System.out.println("i am a derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("i am an overloaded constructor of derived with value of b as: "+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("i am a child of derived constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("i am an overload constructor of derived with value of z as : "+z);
    }
}
public class cwh_46__constructors_in_inheritance {
    public static void main(String[] args) {
        //Base1 b =new Base1();
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(14,9);
        //ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12,13,15);

    }
}
