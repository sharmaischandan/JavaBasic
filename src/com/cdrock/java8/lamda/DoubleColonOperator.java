package com.cdrock.java8.lamda;

import java.io.IOException;
import java.util.stream.Stream;


/**
 * @author Chandan Sharma
 */

 class tes11{
    void m1() throws IOException {
        try {
            throw new ClassCastException();
        }catch (Exception e){
            throw new NullPointerException();
        }

    }
}

enum Eyy{
    D,E,F;
    private Eyy(){
        System.out.println("eeemmmmm");
    }
}
public class DoubleColonOperator {

    public static void main(String[] args) throws Exception {
Eyy e= Eyy.E;

        tes11 yy =new tes11();
        float f[]= new float[5];
        Object ob=f;
        //int M2();
        yy.m1();
        //display1(null);
//        try {
//
//        } catch (Exception e) {
//            System.out.println("fffoooooooo");
//            e.printStackTrace();
//        }


        Stream<String> st = Stream.of("Chandan","Sharma","Rocks");
        // using lamda Exp
        st.forEach(s -> System.out.println(s));

        // using :: method reference operator
        st.forEach(System.out::println);
    }

    private static void display1(Object o) {
        System.out.println("fff111");
    }

    private static void display1(String o) {
        System.out.println("fff222");
    }

    private static void display1(StringBuffer o) {
        System.out.println("fff333");
    }
}
