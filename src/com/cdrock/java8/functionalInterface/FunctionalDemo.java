package com.cdrock.java8.functionalInterface;

/**
 * @author Chandan Sharma
 */
@FunctionalInterface
interface FunctionalIfc {
    void show();

    default void testMe(){
        System.out.println("Default method inside interface");
    };
}

public class FunctionalDemo {
    public static void main(String[] args) {

        FunctionalIfc functionalIfc = new FunctionalIfc() {
            @Override
            public void show() {
                System.out.println("Old way of calling Show method !!");
            }
        };
        functionalIfc.show();

        FunctionalIfc functionalIfc1 = () ->System.out.println("New way of calling Show method of functional Ifc!!");

        functionalIfc1.show();

        functionalIfc1.testMe();

    }
}
