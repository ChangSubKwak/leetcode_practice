package leetcode;

public class LC0121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int curMax = 0;
        int soFarMax = 0;
        
        for (int i = 1; i < prices.length; i++) {
            curMax += prices[i] - prices[i-1];
            curMax = Math.max(curMax, 0);
            soFarMax = Math.max(curMax, soFarMax);
        }
        
        return soFarMax;
    }
}
