package main.java.array.numbersubarray_lestthanproduct;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int m = 1;
            for (int j = i; j < n; j++) {
                m = m * nums[j];
                if (m < k)
                    c++;
                else
                    break;
            }
        }
        return c;
    }
}
