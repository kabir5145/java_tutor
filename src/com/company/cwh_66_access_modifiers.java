package com.company;

class c1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(z);
    }
}
public class cwh_66_access_modifiers {
    public static void main(String[] args) {
        c1 c= new c1();
        //c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a); this throw an error because of a private class
    }
}
