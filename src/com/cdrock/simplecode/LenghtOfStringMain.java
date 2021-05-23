package com.cdrock.simplecode;

/**
 * @author Chandan Sharma
 * Find length of string without using default methods
 */
public class LenghtOfStringMain {
    public static void main(String[] args) {
        String str="Chandan";
        int size=0;
        try {
            for (size = 0; ; size++) {
                str.charAt(size);
            }

        }catch (Exception e){

        }
        System.out.println(size);
    }
}
