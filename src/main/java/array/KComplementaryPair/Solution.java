package main.java.array.KComplementaryPair;

import java.util.*;

public class Solution {
    public int solution(int K, int[] A) {
        // Implement your solution here
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : A) {
            map.merge(K - j, 1, Integer::sum);
        }
        return Arrays.stream(A).map(element -> map.getOrDefault(element, 0)).sum();

    }
}
