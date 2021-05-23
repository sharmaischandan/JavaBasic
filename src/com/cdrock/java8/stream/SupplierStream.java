package com.cdrock.java8.stream;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Chandan Sharma
 * @desc : for error "stream has already been operated upon or closed"
 */
public class SupplierStream {
    public static void main(String[] args) {
        Supplier<Stream<String>> st = () -> Stream.of("Chandan","Sharma","Rocks");
        Optional res1 = st.get().findFirst();
        Optional res2 = st.get().findAny();
        System.out.println("res1="+res1.get()+" res2="+res2.get());
    }
}
