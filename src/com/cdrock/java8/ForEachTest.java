package com.cdrock.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachTest {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        for (int i=0;i<10;i++){
            ls.add(i);
        }

        /* Iterator iterator = ls.iterator();
        while (iterator.hasNext()){
            System.out.println("=="+iterator.next());
        }*/
        //traversing through forEach method of Iterable with anonymous class
        ls.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach =="+integer);
            }
        });
        //traversing with Consumer interface implementation
        MyConsumer myConsumer = new MyConsumer();
        ls.forEach(myConsumer);
    }
}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer it) {
        System.out.println("for Each using custom class=="+it);
    }
}
