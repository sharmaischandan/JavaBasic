package com.cdrock.java8.stream;

import java.util.*;

public class SecondMaxSal {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3,5,6,7,7,76,4,32,9);

        Emp emp= new Emp();
        HashMap<Integer,Emp> hs = new HashMap<Integer, Emp>();
        emp.setName("chandan");
        emp.setSal(25);
        hs.put(0,emp);
        //hs.put(0,emp.setSal(25));

        emp.setName("ch");
        emp.setSal(55);
        hs.put(1,emp);
        emp.setName("andan");
        emp.setSal(75);
        hs.put(2,emp);
        System.out.println(hs.get(0).getName());

        System.out.println(ls.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst());
        //ls.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
    }
}

class Emp{
    String name;
    int sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
        //return (Emp) sal;
    }
}
