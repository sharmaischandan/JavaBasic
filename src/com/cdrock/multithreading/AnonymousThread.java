package com.cdrock.multithreading;

/**
 * @author Chandan Sharma
 */
public class AnonymousThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                System.out.println("Thread");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        for (int i=0;i<5;i++)
            System.out.println("Main Thread");
    }
}
