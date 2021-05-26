package com.cdrock.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Chandan Sharma
 */
public class TryWithMultipleResource {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("testRead.txt"))) {
            try (PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
                while (scanner.hasNext()) {
                    writer.print(scanner.nextLine());
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
