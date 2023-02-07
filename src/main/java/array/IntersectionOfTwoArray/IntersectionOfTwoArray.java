package main.java.array.IntersectionOfTwoArray;

import java.util.*;

// Intersection of Two Arrays II
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/674/
public class IntersectionOfTwoArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // Create an array list...
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
