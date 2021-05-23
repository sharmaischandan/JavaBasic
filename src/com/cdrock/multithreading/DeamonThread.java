package com.cdrock.multithreading;

/**
 * @author Chandan Sharma
 */
public class DeamonThread extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println("This is deamon thread !!");
        }else {
            System.out.println("This is normal thread");
        }
    }

    public static void main(String[] args) {
        DeamonThread t1 = new DeamonThread();
        DeamonThread t2 = new DeamonThread();
        DeamonThread t3 = new DeamonThread();

        t1.setDaemon(true); /* Note: deamon should always set before starting thread */
        t1.start();
        t2.start();
        t3.start();
    }

}
