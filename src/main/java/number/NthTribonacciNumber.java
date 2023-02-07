package main.java.number;

//https://leetcode.com/problems/n-th-tribonacci-number/description/
//1137. N-th Tribonacci Number
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int t3 = 0;
        if (n < 2) return n;
        for (int i = 3; i <= n; i++) {
            t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }
        return t3;
    }
}
