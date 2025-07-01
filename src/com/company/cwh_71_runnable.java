package com.company;

class myThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int o = 0;
        while (o<200) {
            System.out.println(" I am a thread 1 not threat 1");
            o++;
        }
    }
}
class myThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i =0;
        while (i <100) {
            System.out.println("I am a thread 2 not a threat");
            i++;
        }
    }
}
public class cwh_71_runnable {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
