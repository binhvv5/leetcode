package main.java.string.ImplementStr;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/885/
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;

        return haystack.indexOf(needle);
    }
}
