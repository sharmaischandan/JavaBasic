package com.cdrock.java8.lamda;

import java.util.function.DoubleToLongFunction;

/**
 * @author Chandan Sharma
 */
public class DoubleToLongFunction8 {
    public static void main(String[] args) {
        double num = 21.99;
        DoubleToLongFunction d2 = (temp)->(long) temp;
        System.out.println(d2.applyAsLong(num));
        num = 33.9333;
        DoubleToLongFunction roundOff = Math::round;
        System.out.println(roundOff.applyAsLong(num));
    }
}
