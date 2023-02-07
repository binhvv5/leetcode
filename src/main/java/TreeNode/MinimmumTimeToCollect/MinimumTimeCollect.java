package main.java.TreeNode.MinimmumTimeToCollect;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/
public class MinimumTimeCollect {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        ArrayList<Integer>[] a = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<>();
        }
        for (int[] x : edges) {
            a[x[0]].add(x[1]);
            a[x[1]].add(x[0]);
        }

        return dfs(-1, 0, a, hasApple);
    }

    private int dfs(int prev, int curr, ArrayList<Integer>[] a, List<Boolean> hasApple) {
        int ans = 0;
        for (int x : a[curr]) {
            if (x != prev) {
                int res = dfs(curr, x, a, hasApple);
                if (res > 0 || Boolean.TRUE.equals(hasApple.get(x)))
                    ans += (res + 2);
            }
        }
        return ans;
    }
}
