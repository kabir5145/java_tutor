package com.company;

class ekClass{
    int a ;

    public int getA() {
        return a;
    }

    ekClass(int v){
        this.a =v;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends ekClass{
    DoClass(int c){
        super(c);
        System.out.println("main ek constructor hoon");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        ekClass e = new ekClass(5);
        DoClass d = new DoClass(0);
        System.out.println(e.getA());
    }
}
