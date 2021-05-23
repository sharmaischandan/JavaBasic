package com.cdrock.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Chandan Sharma
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> withDip = Arrays.asList(2,3,4,2,32,3,4);
        Set<Integer> withOutDup = withDip.stream().collect(Collectors.toSet());
        withOutDup.forEach(i->System.out.print(" "+i));

        String temp="";
        String str="maddam";
        System.out.println(str.substring(str.length()/2+1,str.length()));
        if(str.length()%2!=0){
            temp=str.substring(str.length()/2+1,str.length());
            System.out.println(temp+"==");
            str=str.substring(0,str.length()/2);
            System.out.println("=="+str);
        }else{
            temp=str.substring((str.length()/2)+1,str.length()-1);
            str=str.substring(0,str.length()/2-1);
        }
        System.out.println(temp+"=="+str);
        Collections.reverse(Collections.singletonList(temp));

        if(str.equals(temp))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
