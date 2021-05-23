package com.cdrock.coreconcept.OverridingDemo;

/**
 * @author Chandan Sharma
 * Method Overriding demo
 */
class Hello{
    // this will be never called
    void m1(){
        System.out.println("m1() Hello");
    }
    void m2(){
        System.out.println("m2() Hello");
    }
}

public class OverRidingMain extends Hello{
    void m1(){
        System.out.println("m1() Main Class");
    }
    void m3(){
        System.out.println("m3() Main Class");
    }
    public static void main(String[] args) {
        OverRidingMain overRidingMain= new OverRidingMain();
        overRidingMain.m1();
        overRidingMain.m2();
        overRidingMain.m3();

    }
}
