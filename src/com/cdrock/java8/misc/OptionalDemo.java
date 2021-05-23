package com.cdrock.java8.misc;

import java.util.Optional;

/**
 * @author Chandan Sharma
 */
public class OptionalDemo {
    public static void main(String[] args)
    {

        // creating a string array
        String[] str1 = new String[5];

        // Setting value for 2nd index
        str1[2] = "Geeks Classes are coming soon";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns a non-empty Optional
        Optional<String> value1 = Optional.of(str1[2]);
        System.out.println(value1);

        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);

        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());

        // It returns hashCode of the value
        System.out.println(value.hashCode());

        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());

    }
}
