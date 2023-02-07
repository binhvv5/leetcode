package main.java.array.MinimumRounds;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
public class MinimumRounds {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return -1;
            if (entry.getValue() % 3 == 0) {
                count += entry.getValue() / 3;
            } else count += entry.getValue() / 3 + 1;
        }
        return count;
    }
}
