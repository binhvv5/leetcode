package main.java.array.elementPair;

import java.util.HashSet;

public class ElementPair {
    public int solution (int[] A){
        HashSet<Integer> dups = new HashSet<Integer>();
        int elem = -1;

        for (int i = 0; i < A.length; i++) {
            if (dups.add(A[i])) {
                elem = A[i];
            }
        }
        return elem;
    }
}
