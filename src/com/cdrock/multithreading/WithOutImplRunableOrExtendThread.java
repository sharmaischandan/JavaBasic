package com.cdrock.multithreading;

/**
 * @author Chandan Sharma
 */
public class WithOutImplRunableOrExtendThread {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This way we can create thread " +
                            " without impl Runnable or Extending Thread");
                }
            }).start();
        }
    }
}
