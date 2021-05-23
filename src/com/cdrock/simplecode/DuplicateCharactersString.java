package com.cdrock.simplecode;

import java.util.HashMap;

/**
 * @author Chandan Sharma
 */
public class DuplicateCharactersString {
    public static void main(String[] args) {
        String s1 = "chandan";
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        System.out.println(isDuplicate(s1,hs));
    }
    static boolean isDuplicate(String s1,HashMap hs){

        for (int i = 0; i < s1.length(); i++) {
            if(hs.containsKey(s1.charAt(i))){
                int temp = (int) hs.get(s1.charAt(i))+1;
                hs.put(s1.charAt(i),temp);
            }else
                hs.put(s1.charAt(i),1);
            //System.out.println(hs.get(s1.charAt(i)));
        }
        hs.forEach((k, v) -> System.out.println("key="+k+" Value="+v));
            return false;
    }
}
