package com.cdrock.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // FutureTask is a concrete class that
        // implements both Runnable and Future
        FutureTask[] futureTasks= new FutureTask[5];

        for (int i=0;i<5;i++){
            CallableExample callableExample = new CallableExample();
            // Create the FutureTask with Callable
            futureTasks[i]= new FutureTask(callableExample);
            // As it implements Runnable, create Thread
            // with FutureTask
            Thread thread = new Thread(futureTasks[i]);
            thread.start();
        }

        for (int i=0;i<5;i++){
            // As it implements Future, we can call get()
            System.out.println(futureTasks[i].get());

            // This method blocks till the result is obtained
            // The get method can throw checked exceptions
            // like when it is interrupted. This is the reason
            // for adding the throws clause to main
        }
    }
}

class CallableExample implements Callable{

    @Override
    public Object call() throws Exception {
        Random random = new Random();
        Integer integer = random.nextInt(5);
        Thread.sleep(5000);
        return integer;
    }
}
