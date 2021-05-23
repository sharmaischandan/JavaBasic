package com.cdrock.multithreading;

/**
 * @author Chandan Sharma
 */
public class CreateThreadUsingLamda8 {
    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.println("Create Thread using Lamda Expression");
        };
        new Thread(r).start();
    }
}
