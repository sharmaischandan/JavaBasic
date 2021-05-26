package com.cdrock.exceptionhandling;

import java.io.IOException;

/**
 * @author Chandan Sharma
 */

class Parent{
    static void  method() throws CustomException {
        System.out.println("Parent method === !!");
    }
    void method2() throws IOException {
        System.out.println("Parent method !!");
    }
}

class Child extends Parent {
    CustomException customException;
    static void method() throws CustomException {
        System.out.println("Child class === !!");
    }

    void method2() throws IOException {
        System.out.println("child method !!");
    }
}

public class ChildParentException {
    public static void main(String[] args) throws CustomException, IOException {
    Parent parent = new Child();
    parent.method();
    parent.method2();
    }
}
