package com.cdrock.test1122;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chandan Sharma
 *
 * Example 1:
 *
 * Input: [[1],[2],[3],[]]
 * Output: true
 * Explanation:
 * We start in room 0, and pick up key 1.
 * We then go to room 1, and pick up key 2.
 * We then go to room 2, and pick up key 3.
 * We then go to room 3.  Since we were able to go to every room, we return true.
 * Example 2:
 *
 * Input: [[1],[2],[5],[6]] return false
 *
 * Input: [[1,3],[3,0,1],[2],[0]]
 * Output: false
 * Explanation: We can't enter the room with number 2.
 *
 * class Solution {
 *     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
 * }
 */
public class TestME {
    public static void main(String[] args) {
        List<List> roomNo= new ArrayList<>();
        List<Integer> roomKey= new ArrayList<>();

        roomKey.add(1);
        roomKey.add(3);
        roomNo.add(roomKey);
        roomKey.clear();
        roomKey.add(2);
        roomKey.add(0);
        roomKey.add(1);
        roomNo.add(roomKey);

        roomKey.add(3);
        roomNo.add(roomKey);

        int count=1;

        boolean flag=false;
        for (int i=0; i < roomNo.size(); i++){
            System.out.println(roomNo.get(i));
            if(roomNo.get(i).contains(count)){
                //System.out.println("true");
                flag=true;
            }else
                //System.out.println("false");
                flag=false;
            count++;
        }
        System.out.println(flag);

    }
}
