package main.java.array.containsduplicate;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/578/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        return set.size() != nums.length;
    }
}
