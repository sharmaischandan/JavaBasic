package com.cdrock.exceptionhandling;

/**
 * @author Chandan Sharma
 */
public class CustomException extends Exception{
    void employeeNotFound(){
        System.out.println("Employee not found");
    }
}
