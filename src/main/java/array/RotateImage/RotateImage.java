package main.java.array.RotateImage;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/770/
public class RotateImage {
    public void rotate(int[][] matrix) {

        int size = matrix.length - 1;
        int[][] m = new int[size+1][size+1];
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j < size + 1; j++) {
                m[j][size - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < size + 1; j++) {
                matrix[i][j] = m[i][j];
            }
        }
    }
}
