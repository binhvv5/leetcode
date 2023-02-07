package main.java.string.FlipString;

//https://leetcode.com/problems/flip-string-to-monotone-increasing/
//926. Flip String to Monotone Increasing
public class FlipString {
    public int minFlipsMonoIncr(String s) {
        int oneCount = 0, zeroCount = 0;
        int i=0;

        while(i<s.length() && s.charAt(i) == '0'){
            i++;
        }
        for ( ;i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                zeroCount++; // flip 0 -> 1
            } else {
                oneCount++;
            }
            if(zeroCount>oneCount) {
                zeroCount = oneCount;
            }

        }
        return zeroCount;
    }
}
