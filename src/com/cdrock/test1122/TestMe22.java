package com.cdrock.test1122;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chandan Sharma
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]
 *
 * Input: numRows = 1
 * Output: [[1]]
 * n=4
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 *
 * n=5
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */

public class TestMe22 {
    public static void main(String[] args) {


        List<Character> chars = new ArrayList<>();

        // For each character in the String
        // add it to the List
        String str ="Chandan";
        for (char ch : str.toCharArray()) {

            chars.add(ch);
        }

        for (char ch : chars) {

            chars.contains(ch);
        }
        int input=5;

        List<List> res = new ArrayList<>();
        List innerRes =new ArrayList<>();
        int count=1;
        int temp;
        for (int i=0;i<=input;i++){
            for (int j=1;j<=count;j++){
                innerRes.add(j);
                count++;
            }
            res.add(innerRes);
        }


        for (int i=0;i<res.size();i++){
            if(res.get(i).contains(3) && res.get(i).size()%2!=0){
                res.get(i).add(res.get(i).size()/2);
            }
        }
    }
    void grt(){

    }
}
