package main.java.array.buysellstock;

public class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n =  prices.length;
        int buy = 0, sell = 0;
        buy = -prices[0];
        for (int i =1; i < n; i++){
            //giá mua mới
            int newBuy = Math.max(buy, sell - prices[i]);
            //Giá bán mưới
            int newSell = Math.max(sell, buy+prices[i]-fee);
            buy= newBuy;
            sell = newSell;
        }
        return sell;

    }
}
