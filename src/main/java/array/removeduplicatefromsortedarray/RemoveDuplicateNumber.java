package main.java.array.removeduplicatefromsortedarray;


public class RemoveDuplicateNumber {
    // Remove Duplicates from Sorted Array
    // https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
    public int removeDuplicates(int[] nums) {
        int j = 0;
        //will iterate only till second last element
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1])
                nums[j++] = nums[i];
        }
        // storing the last element in j whether it is repeated or not
        // because whatever is the case if the second last element is equal to the last element
        // then it will not enter the for loop , if in case it is not equal then also we are returning the last element separately
        nums[j++] = nums[nums.length - 1];
        return j;
    }
}
