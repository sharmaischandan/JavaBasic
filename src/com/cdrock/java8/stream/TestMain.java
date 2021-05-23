package com.cdrock.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        for (int i=0;i<100;i++)
            ls.add(i);

        //Sequential Stream
        Stream<Integer> seq = ls.stream().sequential();
        //seq.forEach(System.out::println);

        //Parallel Stream-- not ordered
        Stream<Integer> parr = ls.parallelStream();
        //parr.forEach(System.out::println);

        //using lambda with Stream API, filter example
        Stream<Integer> high = parr.filter(p -> p > 90);
        //Stream<Integer> high = seq.filter(p->p>90);
        high.forEach(System.out::println);

        Stream<Integer> seqHigh = seq.filter(p -> p > 90);
        seqHigh.forEach(System.out::print);

        List list = Arrays.asList("chandan","sharma","test");
        List result = (List) list.stream().filter(str->str.toString().startsWith("c")).collect(Collectors.toList());

        result.forEach(System.out::println);

        List sortedRes = (List)list.stream().sorted().collect(Collectors.toList());

        sortedRes.forEach(System.out::println);
        // demonstration of reduce method
        List<Integer> number = Arrays.asList(2,4,6,7,8);
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
