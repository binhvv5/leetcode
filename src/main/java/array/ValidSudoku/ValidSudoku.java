package main.java.array.ValidSudoku;


import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/769/
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                String c = String.valueOf(board[i][j]);
                if (!c.equals(".") && !set.add(c)) {
                    return false;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                String c = String.valueOf(board[j][i]);
                if (!c.equals(".") && !set.add(c)) {
                    return false;
                }
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkBox(i, j, board)) return false;
            }
        }
        return true;
    }

    public boolean checkBox(int i, int j, char[][] board) {
        Set<String> set = new HashSet<>();
        for (int m = i; m < 3 + i; m++) {
            for (int n = j; n < 3 + j; n++) {
                String c = String.valueOf(board[i][j]);
                if (!c.equals(".") && !set.add(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
