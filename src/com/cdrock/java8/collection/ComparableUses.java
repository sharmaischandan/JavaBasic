package com.cdrock.java8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Chandan Sharma
 */

class Student implements Comparable<Student> {
    public String name;
    public int roll;
    public int marks;

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        //return marks> student.marks?1:-1; //sort by marks
        return name.length() > student.name.length() ? 1 : -1;  // sort by Name
    }
}

public class ComparableUses {
    public static void main(String[] args) {
        List<Student> lsSt = new ArrayList<>();
        lsSt.add(new Student("Chandan", 111, 23));
        lsSt.add(new Student("Sharma", 222, 53));
        lsSt.add(new Student("Kamini", 333, 88));
        lsSt.add(new Student("Sharma", 444, 65));

        Collections.sort(lsSt);
        Collections.sort(lsSt, (i, j) -> i.marks > j.marks ? 1 : -1);  // it will sort list by marks explicitly

        for (Student student : lsSt) {
            System.out.println(student);
        }
    }
}
