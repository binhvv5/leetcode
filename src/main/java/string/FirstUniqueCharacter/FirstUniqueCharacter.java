package main.java.string.FirstUniqueCharacter;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i < s.length(); i ++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0; i < s.length(); i ++){
            if (map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}
