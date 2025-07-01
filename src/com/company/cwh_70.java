package com.company;

class myThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000) {
            System.out.println("My Cooking Thread Is Running ");
            System.out.println("I Am Happy");
            i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i <4000) {
            System.out.println("My Thread 2 For Chatting With Her ");
            System.out.println("I Am Sad");
            i++;
        }
    }
}
public class cwh_70 {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}

