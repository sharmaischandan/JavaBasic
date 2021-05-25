package com.cdrock.coreconcept;

/**
 * @author Chandan Sharma
 */

// Java program to illustrate
// delegation
class RealPrinter {
    // the "delegate"
    void print()
    {
        System.out.println("The Delegate");
    }
}

class Printer {
    // the "delegator"
    RealPrinter p = new RealPrinter();
    // create the delegate
    void print()
    {
        p.print(); // delegation
    }
}
public class DeligatorDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}
