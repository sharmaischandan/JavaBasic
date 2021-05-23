package com.cdrock.codeassing;

import java.io.LineNumberInputStream;
import java.util.*;

public class LRUImpl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = 4;
        int[] input = new int[]{2, 4, 6, 5};
        int[] temp = new int[cap];
        int entry = sc.nextInt();
        int pos = 0;
        for (int i = 0; i < cap; i++) {
            if (entry == input[i]) {
                pos = i;
                break;
            }
        }
        if (pos == 0) {
            temp[0] = entry;
            for (int i = 1; i < cap; i++) {
                temp[i] = input[i];
            }
            display(temp);
        } else if (input[0] != input[pos]) {
            temp[0] = entry;
            for (int i = 1; i < cap; i++) {
                if (i == pos) {
                    temp[i] = input[0];
                } else {
                    temp[i] = input[i];
                }
            }
            display(temp);
        } else {
            display(input);
        }
    }

    private static void display(int[] dis) {
        for (int i = 0; i < dis.length; i++) {
            System.out.print(dis[i] + " ");
        }
    }
}
