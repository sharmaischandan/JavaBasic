package com.cdrock.lombok;

/**
 * @author Chandan Sharma
 */
public class LombokDemo {
    public static void main(String[] args) {
        StudentLD student = new StudentLD();
        //student.getName("cd");
        student.setName("cd");
        System.out.println("demo "+student.getName());
    }
}
