package main.java.array.elementmissing;


public class ElementMissing {
    public int solution(int[] A) {
        long N = A.length + 1;
        long sum = N * (N + 1) / 2;
        for (int i = 0; i < A.length; i++) sum -= A[i];
        return (int) sum;
    }
    // 1 2 3 5
    // 5
    // 10
    // 9 7 4
}
