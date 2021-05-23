package com.cdrock.simplecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chandan Sharma
 */
public class NumberOddTimesMain {
    int getOddTimesElement(int ar[])
    {
        int i;
        int result = 0;
        for (i = 0; i < ar.length; i++)
        {
            // XOR operation
            //Let's take 5^6 as example:
            //(decimal)    (binary)
            //        5     =  101
            //        6     =  110
            //        ------------------ xor
            //        3     =  011
            System.out.println("result = "+result);
            System.out.println("ar[i] = "+ar[i]);
            result = result ^ ar[i];
        }
        return result;
    }
    public static void main(String[] args) {
        NumberOddTimesMain occur = new NumberOddTimesMain();
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20, 22};
        System.out.println("Number which occurs odd number of times is : "+occur.getOddTimesElement(array));
        System.out.println("2nd Way : "+occur.getOddTimesElement2(array));
    }
    List getOddTimesElement2(int ar[]) {
        // Other Way
        int i;
        List res = new ArrayList<>();
        HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
        for (i = 0; i < ar.length; i++) {
            int element = ar[i];
            if (elements.get(element) == null) {
                elements.put(element, 1);

            } else
                elements.put(element, elements.get(element) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                res.add(entry.getKey());
                //return entry.getKey();
            }

        }
        return res;
    }
}
