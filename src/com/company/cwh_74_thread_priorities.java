package com.company;

class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("thank you "+this.getName());

//        while(true){
//            //System.out.println("I AM A THREAD");
//            System.out.println("thank you :"+this.getName());
//        }
        }
    }
public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        //ready queue:T1 T2 T3 T4 T5
        myThr1 t1 = new myThr1("sukh");
        myThr1 t2 = new myThr1("mani");
        myThr1 t3 = new myThr1("aaditya");
        myThr1 t4 = new myThr1("raghav");
        myThr1 t5= new myThr1("kabir");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
