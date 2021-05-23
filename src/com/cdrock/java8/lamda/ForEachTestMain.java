package com.cdrock.java8.lamda;

import java.util.ArrayList;
import java.util.List;

public class ForEachTestMain {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Kamini");
        list.add("Ram");
        list.add("Chandan");
        list.add("Bangalore");

        list.forEach(
                (n)->System.out.println(n)
        );
    }
}
