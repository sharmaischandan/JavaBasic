package com.cdrock.coreconcept.dynamicdispatch;

/**
 * @author Chandan Sharma
 */

class Animal{
    void eating(){
        System.out.println("Animal Eating !!");
    }
    void sleeping(){
        System.out.println("Animal sleeping !!");
    }
    static void running(){
        System.out.println("Animal running !!");
    }
}

class Dog extends Animal {

    void sleeping() {
        System.out.println("Dog sleeping !!");
    }

    static void running() {
        System.out.println("Dog running !!");
    }
    void barking() {
        System.out.println("Dog barking !!");
    }
}
class Cat extends Animal{
    void sleeping() {
        System.out.println("Cat sleeping !!");
    }
    static void running() {
        System.out.println("Cat running !!");
    }
    void barking() {
        System.out.println("Cat barking !!");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal animal = null;
        animal = new Dog();
        animal.eating();
        animal.sleeping();

        animal = new Cat();
        animal.sleeping();
        animal.eating();

    }
}
