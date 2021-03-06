package com.hkarabakla.multithread;

public class MultiThreadDemoMain2 {

    public static void main(String[] args) {
        System.out.println("Main thread is starting");

        MultiThreadDemo2 myThread = new MultiThreadDemo2("child1");
        MultiThreadDemo2 myThread2 = new MultiThreadDemo2("child2");
        MultiThreadDemo2 myThread3 = new MultiThreadDemo2("child3");

        myThread.start();
        myThread2.start();
        myThread3.start();

        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted");
            }
        }

        System.out.println("Main thread is terminating");
    }
}
