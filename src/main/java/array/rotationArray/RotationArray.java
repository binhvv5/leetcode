package main.java.array.rotationArray;
// Rotate Array
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
public class RotationArray {
    public int[] solution(int[] a, int k) {

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(i + k) % a.length] = a[i];
        }
        return b;
    }
}
