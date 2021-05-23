package com.cdrock.simplecode;

public class ReverseUsingRecursion {
    public static void main(String[] args) {
        String str = "Chandan";
        System.out.println("reverse="+reverse(str));
        System.out.println("str="+str);
    }

    static String reverse(String str){
        if (str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
