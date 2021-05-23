package com.cdrock.multithreading;

/**
 * @author Chandan Sharma
 */
public class JoinDemo extends Thread{
    public void run(){
        System.out.println("This is thread="+Thread.currentThread().getName());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JoinDemo d1= new JoinDemo();
        JoinDemo d2= new JoinDemo();
        JoinDemo d3= new JoinDemo();
        d1.setName("First Thread");
        d1.start();

        try {
            d1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d2.start();
        d3.start();
    }
}
