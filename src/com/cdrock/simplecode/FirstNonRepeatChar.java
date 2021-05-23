package com.cdrock.simplecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chandan Sharma
 * Find the first non-repeating character in an array.
 * str= chandanch ans= d
 */
public class FirstNonRepeatChar {
    public static void main(String[] args) {
        char[] input = "chandaknch".toCharArray();
        HashMap<Character,Integer> hs = new HashMap<>();
        Character res=null;
        int index=0;
        for ( Character ch:input ){
            if(!hs.containsKey(ch)){
                hs.put(ch,0);
                //res=ch;
            }else {
                index=hs.get(ch);
                hs.put(ch,index+1);
            }
            //hs.put(ch,0);
        }

        for(Map.Entry<Character,Integer> entry:hs.entrySet()){
            if(entry.getValue() == 0){
                System.out.println("result=="+entry.getKey());
                break;
            }
        }
        System.out.println("result==");
    }
}
