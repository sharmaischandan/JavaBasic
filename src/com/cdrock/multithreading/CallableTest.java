package com.cdrock.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTest implements Callable {
    public static void main(String[] args) throws Exception {
        Callable cl = new CallableTest();
        int res = (int) cl.call();
        System.out.println("res="+res);
    }

    @Override
    public Object call() throws Exception {
        // Create random number generator
        Random generator = new Random();

        Integer randomNumber = generator.nextInt(5);

        // To simulate a heavy computation,
        // we delay the thread for some random time
        Thread.sleep(randomNumber * 1000);

        return randomNumber;
    }
}
