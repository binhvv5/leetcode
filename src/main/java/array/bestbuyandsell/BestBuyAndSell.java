package main.java.array.bestbuyandsell;
// Best Time to Buy and Sell Stock II
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
public class BestBuyAndSell {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
