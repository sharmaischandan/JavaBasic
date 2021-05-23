package com.cdrock.codeassing;

import java.util.Scanner;

public class TestMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        String [] op = input.split(" ");
        switch (op[0]){
            case "ADD":
                System.out.println(callAdd(Integer.parseInt(op[1]),Integer.parseInt(op[2])));
                break;
            case "SUB":
                System.out.println(callSub(Integer.parseInt(op[1]),Integer.parseInt(op[2])));
                break;
            default:
                System.out.println("Operation not allowed");
        }
    }

    private static int callAdd(int a, int b) {
        return a+b;
    }

    private static int callSub(int a, int b) {
        return a-b;
    }
}
