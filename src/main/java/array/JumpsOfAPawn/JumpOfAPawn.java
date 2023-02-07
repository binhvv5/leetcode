package main.java.array.JumpsOfAPawn;



public class JumpOfAPawn {
    public int solution(int[] A) {

        int size = A.length, step = 0, i = 0;
        while (i < size && i >= 0) {
            i += A[i];
            step++;
            if (step > size)
                return -1;
        }
        return step;
    }
}
