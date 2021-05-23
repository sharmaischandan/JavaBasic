package com.cdrock.Tes1;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chandan Sharma
 */
public class A {
    public int getLength(){
        System.out.println("llll");
        return 1;
    }
}

class B extends A{
    synchronized public int getLength(){
        System.out.println("llll");
        return 2;
    }
    public static void main(String[] args) {
        A a=new B();
        B b = new B();

        int [] arr = {2,4,6,-1,5};
        //List<Integer> ls = (Integer) Arrays.asList( arr);
        Integer a1[] = new Integer[] { 10, 20, 30, 40 };

        // getting the list view of Array
        List<Integer> list = Arrays.asList(a1);

        // printing the list
        System.out.println("The list is: " + list);
        //System.out.println("===="+ls.size());
        //System.out.println("llll"+a.getLength()+b.getLength());
    }
}
