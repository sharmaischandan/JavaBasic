package com.cdrock.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * @author Chandan Sharma
 */
public class FindAverage {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(22,44,23,21,42);
        OptionalDouble optionalDouble= ls.stream().mapToInt(n->n*n)
                                        .filter(n->n>100)
                                        .average();
        optionalDouble.stream().forEach(System.out::println);
    }
}
