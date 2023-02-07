package main.java.array.MaximumIceCream;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-ice-cream-bars/
public class MaximumIceCream {


    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int count=0;
        for (int i: costs){
            if (coins<i) break;
            coins-=i;
            count++;
        }
        return count;
    }
}
