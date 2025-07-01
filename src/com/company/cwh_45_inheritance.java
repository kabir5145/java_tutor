package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now ");
        this.x = x;
    }

    public char printMe(){
        System.out.println("I am a constructor");
        return 0;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("i am in the derived and setting y now ");
        this.y = y;
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        // creating an object of base class
         Base b = new Base();
         b.setX(4);
         System.out.println(b.getX());

        // creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
        System.out.println(b.printMe());

    }
}
