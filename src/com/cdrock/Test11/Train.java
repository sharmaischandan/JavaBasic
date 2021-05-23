package com.cdrock.Test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Chandan Sharma
 */
public class Train {
    public static void main(String[] args) {

        String str= "chandan";
        System.out.println(str.substring(1)+"=="+str.charAt(0));
        List<Integer> input1 = Arrays.asList(0, 1, 10, 12);
        List<Integer> input2 = Arrays.asList(2, 4, 11, 15); //8 -1
        //first[] = { 1, 8, 10, 12 }
        //second[] = { 2, 4, 9, 15 }
        //sum = 11
        int sum=11;
        int temp=0;
        List tempAr= new ArrayList();

        int temp2=0;

        for (int i = 0; i < input1.size()-1; i++) {
            temp=sum- input1.get(i); //11
            if(input2.get(i)<=sum){ //
                if(input2.get(i)<=temp && temp2<temp) //
                temp2=input2.get(i);  //
                else if(input2.get(i)==temp){
                    //temp2=input2.get(i);
                    System.out.println("no is==="+input1.get(i)+input2.indexOf(temp));
                }


                 if(input2.contains(temp) )
                System.out.println("no is"+input1.get(i)+input2.indexOf(temp));
                break;
            }
        }
        Collections.sort(tempAr);
        System.out.println(tempAr.get(0));

    }
}
