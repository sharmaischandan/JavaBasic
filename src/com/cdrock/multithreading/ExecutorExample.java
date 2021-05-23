package com.cdrock.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecTask task = new ExecTask("Hello Executer");

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> future = executorService.submit(task);
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error occured while executing the submitted task");
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
