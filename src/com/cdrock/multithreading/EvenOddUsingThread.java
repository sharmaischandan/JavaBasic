package com.cdrock.multithreading;

/**
 * @author Chandan Sharma
 */
public class EvenOddUsingThread {
    static int n=10;
    static int counter=1;
    public static void main(String[] args) {

        EvenOddUsingThread evenOddUsingThread = new EvenOddUsingThread();

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                evenOddUsingThread.printEvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                evenOddUsingThread.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }

    // Function to print odd numbers
    public void printOddNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < n) {

                // If count is even then print
                while (counter % 2 == 0) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(counter + " ");

                // Increment counter
                counter++;

                // Notify to second thread
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < n) {

                // If count is odd then print
                while (counter % 2 == 1) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(
                        counter + " ");

                // Increment counter
                counter++;

                // Notify to 2nd thread
                notify();
            }
        }
    }
}
