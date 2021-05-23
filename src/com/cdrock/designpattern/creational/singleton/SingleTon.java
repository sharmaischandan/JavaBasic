package com.cdrock.designpattern.creational.singleton;

public class SingleTon {
    private static SingleTon singleTon=null;

    private SingleTon() {
    }

    private static SingleTon getSingleTon(){
        if (singleTon==null){
            synchronized (SingleTon.class){  //thread safe double locking
                if (singleTon==null) {
                    singleTon = new SingleTon();
                }
            }
        }
            return singleTon;
    }

    public static void main(String[] args) {
        //SingleTon.singleTon
        System.out.println(SingleTon.getSingleTon());
        System.out.println(SingleTon.getSingleTon());
        System.out.println(SingleTon.getSingleTon());
        System.out.println(SingleTon.getSingleTon());
    }
}
