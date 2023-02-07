package main.java.number.frogJump;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        if (distance == 0)
            return 0;
        if (distance <= D)
            return 1;
        int noOfJumps = distance / D;
        int modVal = distance % D;
        if (modVal > 0)
            noOfJumps += 1;
        return noOfJumps;
    }
}
