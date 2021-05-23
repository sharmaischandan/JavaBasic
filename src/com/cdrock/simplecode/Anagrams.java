package com.cdrock.simplecode;


public class Anagrams {
    public static void main(String[] args) {
        String s1 ="apple";
        String s2 ="eplpa";
        char[] ch = s2.toCharArray();
        if (s1.length()!=s2.length()){
            System.out.println("Not anagrams");
        }
        for (int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            int index = s2.indexOf(c);
            if(index<0){
                System.out.println("Not anagrams");
            }

            s2 = s2.substring(0,index)+s2.substring(index+1);

        }
        System.out.println("Anagrams");
    }
}
