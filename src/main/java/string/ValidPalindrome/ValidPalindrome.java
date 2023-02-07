package main.java.string.ValidPalindrome;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/883/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.length()==0) return true;
        for (int i =0 ; i < s.length(); i ++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
