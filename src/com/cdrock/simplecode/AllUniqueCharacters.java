package com.cdrock.simplecode;

/**
 * @author Chandan Sharma
 */
public class AllUniqueCharacters {
    public static void main(String[] args) {
        String s1 = "Chatuyg";
        String res ="Unique";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.lastIndexOf(s1.charAt(i)) != i) {
                res="Non Unique";
                //System.out.println("not Unique");  javajava
                break;
            }
        }
        System.out.println(res);
    }
}
