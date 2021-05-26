package com.cdrock.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Chandan Sharma
 */
public class TryWithResources {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("test.txt"))){
            while (scanner.hasNext()){
                System.out.println(scanner);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        //Old Way
        /*Scanner scanner=null;
        try {
            scanner = new Scanner(new File("test.txt"));
            while (scanner.hasNext()){
                System.out.println(scanner);
            }
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }finally {
            if (scanner!=null){
                scanner.close();
            }
        }*/
    }
}
