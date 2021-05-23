package com.cdrock.multithreading;

public class ByExtendingThread extends Thread{
    public void run(){
        System.out.println("By Extending Thread Class");
    }

    public static void main(String[] args) {
        ByExtendingThread byExtendingThread = new ByExtendingThread();
        byExtendingThread.start();
    }
}
