package com.cdrock.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Chandan Sharma
 * Note : IntStream boxed() is a intermediate operation. These operations are always lazy.
 * Intermediate operations are invoked on a Stream instance and after they finish their processing,
 * they give a Stream instance as output.
 * Stream : A sequence of elements supporting sequential and parallel aggregate operations.
 * Integer : The Integer class wraps a value of the primitive type int in an object. An object of
 * type Integer contains a single field whose type is int.
 */
public class BoxedStream {
    public static void main(String[] args) {
        // Creating an IntStream
        IntStream stream = IntStream.range(3, 8);

        // Creating a Stream of Integers
        // Using IntStream boxed() to return
        // a Stream consisting of the elements
        // of this stream, each boxed to an Integer.
        Stream<Integer> stream1 = stream.boxed();

        Stream<Object> stream2 = Stream.concat(stream1,
                Stream.of("Geeks", "for", "Geeks"));

        // Displaying the elements
        stream2.forEach(System.out::println);
    }
}
