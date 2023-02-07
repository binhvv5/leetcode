package main.java.number;

public class FibonacciSixLeastSignificant {
    public int solution(int N) {
        int first = 0, second = 1, third = 1;
        for (int j = 2; j <= N; j++) {
            third = first + second;
            first = second;
            second = third;
        }
        if (third > 999999) {
            return third % 1000000;
        }
        return third;
    }
}
