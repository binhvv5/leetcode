package main.java.array.randompick_blacklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Solution {
    int n;
    int blacklist[];
    public Solution(int n, int[] blacklist) {
        this.n = n;
        this.blacklist = blacklist;
    }

    public int pick() {
        return getRandom(n);
    }

    public int getRandom(int n) {
        Random r = new Random();
        ArrayList<Integer> listInt =new ArrayList(Arrays.asList(blacklist));
        int ranNum = r.nextInt(n) + 1;
        do {

            if (!listInt.contains(ranNum)){
                break;
            }else{
                ranNum = r.nextInt(n) + 1;
                continue;
            }
        }while (true);
        return ranNum;
    }
}
