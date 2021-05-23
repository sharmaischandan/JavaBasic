package com.cdrock.multithreading;

public class ByImplRunnableIfs implements Runnable{
    public void run(){
        System.out.println("By implementing Runnable Interface");
    }

    public static void main(String[] args) {
        ByImplRunnableIfs byImplRunnableIfs = new ByImplRunnableIfs();
        Thread thread = new Thread(byImplRunnableIfs);
        thread.start();
    }
}
