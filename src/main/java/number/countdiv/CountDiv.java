package main.java.number.countdiv;

public class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int count = 0;
        if (B < A) return 0;
        else {
            int size = (B - A) + 1;
            count = (A % K == 0 ? 1 : 0) +  size/K;
        }
        return count;
    }
}
