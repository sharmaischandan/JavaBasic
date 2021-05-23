package com.cdrock.simplecode;

import java.util.*;

/**
 * @author Chandan Sharma
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class GroupAnagram {

    public static void main(String[] args) {
            String[] strs = {"eat","tea","tan","ate","nat","bat"};
            //if (strs.length == 0) return new ArrayList();
            Map<String, List> ans = new HashMap<String, List>();
            for (String s : strs) {
                char[] ca = s.toCharArray();
                Arrays.sort(ca);
                String key = String.valueOf(ca);
                if (!ans.containsKey(key))
                    ans.put(key, new ArrayList());
                ans.get(key).add(s);
            }
            for (Map.Entry<String, List> test:ans.entrySet()){
                System.out.println(test.getKey()+" "+test.getValue());
        }

            //return new ArrayList(ans.values());
        }
}
