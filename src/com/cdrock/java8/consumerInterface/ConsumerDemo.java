package com.cdrock.java8.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Chandan Sharma
 */

class ConsumerImpl implements Consumer<Integer>{
    @Override
    public void accept(Integer integer) {
        System.out.println("printing-"+integer);
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,6,9,5);

        Consumer consumer = new ConsumerImpl();
        list.forEach(consumer);

        Consumer consumer1 = new Consumer<Integer>() {

            public void accept(Integer integer) {
                System.out.println("Using anonymous inner class "+integer);
            }
        };
        list.forEach(consumer1);

        Consumer<Integer> consumer2 = integer-> System.out.println("Using lamda exp "+integer);
        list.forEach(consumer2);

        //using consumer class directly
        list.forEach(integer-> System.out.println("advance way "+integer));

    }
}
