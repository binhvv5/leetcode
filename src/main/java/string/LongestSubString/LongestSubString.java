package main.java.string.LongestSubString;

import java.util.*;
import java.util.stream.Collectors;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubString { //not done
    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }
        ArrayList<Character> list = new ArrayList<>();
        int max = 0;
        //abcab
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (!list.contains(tmp)) {
                list.add(tmp);
            } else {
                max = Math.max(max, list.size()); //check the max number
                int index = list.indexOf(tmp);
                list.subList(0, index + 1).clear();
                list.add(tmp);
            }
        }
        if (!list.isEmpty()) {
            max = Math.max(max, list.size());
        }
        return max;
    }
}
