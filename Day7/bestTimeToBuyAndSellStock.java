// LeetCode -> 121. Best Time to Buy and Sell Stock

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        int n = prices.length;
        for(int i  = 0 ;i < n ;i++)
        {
            int cost = prices[i] - minprice;
            maxprofit = Math.max(maxprofit, cost);
            minprice = Math.min(minprice, prices[i]);
        }
        return maxprofit;
    }
}