package main.java.array.MedianOfTwoArray;

import java.util.Arrays;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 ==null && nums2 == null) return 0;

        int [] list = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, list, 0, nums1.length);
        System.arraycopy(nums2, 0, list, nums1.length, nums2.length);
        Arrays.sort(list);

        int middle = list.length / 2;
        if (list.length % 2 == 0)
            return  (double)(list[middle] +list[middle-1])/2;
        else
            return list[middle];
    }
}
