package main.java.array.singlenumber;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i]; // bitwise exclusive OR
        }

        return res;
    }
}
