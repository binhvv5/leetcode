package main.java.array.MoveZeroes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/567/
// Move Zeroes
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int cnt =0;
        for (int i =0; i < nums.length ; i ++){
            if (nums[i]!=0){
                lst.add(nums[i]);
            } else cnt++;
        }
        if (cnt ==0) return;

        for (int i =0; i< cnt; i++) lst.add(0);

        for (int i =0; i< lst.size(); i++) {
            nums[i] = lst.get(i);
        }

    }
}
