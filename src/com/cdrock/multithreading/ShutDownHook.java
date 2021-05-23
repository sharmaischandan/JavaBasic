package com.cdrock.multithreading;

/**
 * @author Chandan Sharma
 */
public class ShutDownHook extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Shutdown hook completed");
    }

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new ShutDownHook());
        System.out.println("Calling system.exit() to shut down");
        System.exit(0);
        /* Note even after calling System.exit() shutDownhook will call run method*/

    }
}
