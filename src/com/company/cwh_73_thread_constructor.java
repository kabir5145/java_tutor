package com.company;

class myThr extends Thread {
    public myThr(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("thank you");
//        while(true){
//            System.out.println("I AM A THREAD");
//        }
    }
}

public class cwh_73_thread_constructor {
    public static void main(String[] args) {
       myThr t = new myThr("kabir");
       myThr t2 = new myThr("ram");
        t.start();
        t2.start();
        // t.run();
        System.out.println("The id of the thread is :" + t.threadId());
        System.out.println("The name  of the thread is :" + t.getName());
        System.out.println("The id of the thread is :" + t2.threadId());
        System.out.println("The name  of the thread is :" + t2.getName());
    }
}
