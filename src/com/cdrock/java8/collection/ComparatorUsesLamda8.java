package com.cdrock.java8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Chandan Sharma
 */
public class ComparatorUsesLamda8 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList();
        ls.add(202);
        ls.add(203);
        ls.add(207);
        ls.add(209);

        Comparator c = new Comparator() {
            /*@Override
            public int compare(Object o1, Object o2) {
                if (((Integer) o1)%10<(Integer) o2%10)
                    return 1;
                else
                return -1;
            }*/
            // Using ternary operator
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o1) % 10 < (Integer) o2 % 10 ? 1 : -1;
            }

        };
        Collections.sort(ls, c);
        System.out.println(ls);

        //using lamda exp
        Comparator<Integer> cLamda = (o1, o2) -> {
            return o1 % 10 < o2 % 10 ? 1 : -1;
        };
        Collections.sort(ls, cLamda);
        System.out.println(ls);

        // more shorter way in lamda
        Collections.sort(ls, (o1, o2) -> o1 % 10 < o2 % 10 ? 1 : -1);
        System.out.println(ls);

    }
}
