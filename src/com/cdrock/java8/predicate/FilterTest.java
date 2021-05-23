package com.cdrock.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

        System.out.println(collect);

        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        List<Integer> collect1 = list.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());

        System.out.println(collect1);

        // multiple filters
        List<Integer> collect2 = list.stream()
                .filter(x -> x > 5 && x < 8).collect(Collectors.toList());

        System.out.println(collect2);

        //negate
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list2 = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect4 = list2.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println(collect4);
    }
}
