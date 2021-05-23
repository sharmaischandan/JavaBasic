package com.cdrock.simplecode;

import java.util.*;

/**
 * @author Chandan Sharma
 * Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
 * Here is a quick tip to solve this programming question:
 * put the elements of the second array in the Hashtable and for every element of the
 * first array, check whether it’s present in the hash or not
 */
public class FindNoNotInArray {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5);
        HashSet hs = new HashSet();
        //hs.add(2);
        //hs.add(3);
        hs.add(1);
        hs.add(0);
        hs.add(5);
        for (Integer integer:ls){
            if(hs.contains(integer)){
                System.out.println(true);
                break;
            }
            System.out.println(false);
        }
    }
}
