package com.cdrock.java8.defaultstaticifs;

public class TestMe implements Interface1,Interface2 {
//    public static void main(String[] args) {
//
//    }
    @Override
    public void method1(String str) {

    }

    @Override
    public void log(String str) {
        System.out.println("MyClass logging::"+str);
        Interface1.print1("  TestMe--->abc");
    }

    @Override
    public void method2(String str) {
        System.out.println("TestMe::"+str);
    }
}

//Note
/* As you can see that Interface1 has static method implementation that is used in MyClass.log()
method implementation. Java 8 uses default and static methods heavily in Collection API and
default methods are added so that our code remains backward compatible.*/


