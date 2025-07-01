package com.company;

class phone {
    public void showTime(){
        System.out.println("the time is 8 am");
    }
    public void on(){
        System.out.println("turning on phone.... ");
    }
}
class smartPhone extends phone {
    public void music(){
        System.out.println("could you please turn on the music?");
    }
    public void on(){
        System.out.println("turning on smartphone....");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        phone obj = new phone();
//        smartPhone smoj = new smartPhone();
//        obj.name();
        phone obj = new smartPhone();//yes it is allowed
        //smartphone obj2 =new phone ();// not allowed

        obj.showTime();
        obj.on();
        //obj.music();not allowed
        smartPhone s = new smartPhone();
        s.music();
    }
}
