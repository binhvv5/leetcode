package main.java.array.TimeComplexity;

public class TimeComplexity {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int total = 0;

        for (int i = 0; i < A.length; i++)
            total += A[i];
        System.out.println("Tong cac so: "+total);
        int diff = Integer.MAX_VALUE;
        int prev = 0;
        int next = total;
        for (int p = 1; p < A.length; p++) {
            prev += A[p - 1];
            System.out.println("prev: "+prev);
            next = total - prev;
            System.out.println("next: "+next);
            diff = Math.min(diff, Math.abs(prev - next));
            System.out.println(diff);
        }

        return diff;
    }
}
