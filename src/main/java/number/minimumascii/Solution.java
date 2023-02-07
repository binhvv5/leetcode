package main.java.number.minimumascii;

public class Solution {
    public static int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int preSum1 = 0, preSum2 = 0, dupSum = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (char c : s1.toCharArray()) {
            preSum1 += (int) c;
        }

        for (char c : s2.toCharArray()) {
            preSum2 += (int) c;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i + 1][j + 1] = ((int) s1.charAt(i)) + dp[i][j];
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
            dupSum = Math.max(dupSum, dp[m][n]);
        }

        return preSum1 + preSum2 - dupSum * 2;
    }
}
