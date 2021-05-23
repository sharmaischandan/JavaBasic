package com.cdrock.Tes1;

import java.util.*;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        String str = Integer.toBinaryString(15);
        System.out.println(str);
        int count=0;
        int K =3;
        int A []= {3, 8, 9, 7, 6};
        if(K==A.length){

        }
        int temp=A[0];
        int temp2=0;
        int temp3=0;

        for (int i = 0; i < A.length - 1; i++)
            A[i] = A[i + 1];
        A[3-1] = temp;

        /*while(K!=0){
            temp=A[A.length-1];
            for(int i=1;i<A.length-1;i++){
                temp2=A[i];//8 9
                temp3=A[i-1]; //3 8
                A[i]=temp3; //3 8
                temp2=A[i+1]; //8 7
            }
            A[0]=temp;
            K--;
        }*/
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }



       /* List ls = new ArrayList();
        for (int i = 0; i < str.length()-1; i++) {
            char ch1= str.charAt(i);
            char ch2 = str.charAt(i+1);
            if (ch1==ch2){
                count++;
            }else{
                ls.add(count);
                count=0;
            }
        }
        Collections.sort(ls);
        int num = (int) ls.get(ls.size()-1);
        System.out.println("List =="+ls+"--"+num);*/
        /*String arr = str.substring(0,num+2);
        System.out.println("List =="+ arr);
        int foo = Integer.parseInt(arr, 2);
        System.out.println("Foo =="+ foo);*/
        //int [] arr = (int) Arrays.toString(new String[]{str});
        //str = str.split()

        /*Predicate<String> startWithA = x -> x.startsWith("a");

        // start with "a" or "m"
        boolean result = startWithA.or(x -> x.startsWith("C")).test("Chandan");
        System.out.println(result);     // true

        // !(start with "a" and length is 3)
        boolean result2 = startWithA.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(result2);    // false*/

//        List<String> ls=new ArrayList<>(); //2 33 44 5566
//        ls.add("2");
//        ls.add("3");
//        ls.add("3");
//        ls.add("3");
//        ls.add("4");
//        ls.add("5");
//        String str ="chandan";
//
//        int str1=Collections.frequency(ls,"3");
//        System.out.println(str1);
//        int i= ls.indexOf("3");
//
//        System.out.println(i+"==="+(i+str1));
    }
}
