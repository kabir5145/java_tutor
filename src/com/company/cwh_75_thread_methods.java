package com.company;


class myNewThr1 extends Thread {
    public myNewThr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        //System.out.println("thank you " + this.getName());
        int i= 0;
        while (true) {
//            //System.out.println("I AM A THREAD");
            System.out.println("thank you :");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class myNewThr2 extends Thread {
    @Override
    public void run() {
        int i =0;
        while (i<5) {
//            //System.out.println("I AM A THREAD");
            System.out.println("ok");
            i++;
        }
    }
}

public class cwh_75_thread_methods {
    public static void main(String[] args) {
        myNewThr1 t1 = new myNewThr1("kabir");
        myNewThr2 t2 = new myNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
