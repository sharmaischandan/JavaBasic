package com.cdrock.simplecode;

/**
 * @author Chandan Sharma
 */
public class RotationCheck {
    public static void main(String[] args) {
        String s1 = "java2blog";
        String rot ="blogjava2";

        System.out.println(isRotation(s1,rot));
    }
    static boolean isRotation(String s1,String rot){
        s1=s1+s1; // java2blog java2blog
        if (s1.contains(rot))
            return true;
        else
            return false;
    }
}
