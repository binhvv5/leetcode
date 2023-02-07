package main.java.string.ValidAnagram;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/882/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        else {
            //character z - character a = 25
            int[] aToZ = new int[26];
            for (char c : s.toCharArray()){
                aToZ[c -'a']++;
            }
            for (char c : t.toCharArray()){
                aToZ[c -'a']--;
            }
            for (int i: aToZ){
                if (i!=0) return false;
            }
            return true;
        }
    }
}
