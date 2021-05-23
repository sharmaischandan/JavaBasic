package com.cdrock.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Chandan Sharma
 */
public class ParallelSequentialStream {
    public static void main(String[] args) {
        List ls = Arrays.asList("Chandan","Sharma","Rocks","Good","Things","Will","Come","Anytime");

        //Sequential stream
        ls.forEach(System.out::println);
        System.out.println("Parallel ========================");
        //Parallel stream
        ls.parallelStream().forEach(System.out::println);
    }
}
