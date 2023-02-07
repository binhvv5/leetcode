package main.java.array.PermutationCheck;

public class PermutationCheck {

    public int solution(int[] A) {
        long N = A.length;
        long sum = N * (N + 1) / 2;
        int sumArr = 0;
        for (int num: A){
            sumArr+=num;
        }
        if (sum==sumArr) return 1;
        else return 0;
    }

}
