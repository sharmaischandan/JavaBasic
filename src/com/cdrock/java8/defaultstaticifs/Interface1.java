package com.cdrock.java8.defaultstaticifs;

@FunctionalInterface
public interface Interface1 {
    void method1(String str);

    default void log(String str){
        System.out.println("Interface1 log"+str);
    }

    static void print1(String str){
        System.out.println("Interface1 print1-->"+str);
    }
}
