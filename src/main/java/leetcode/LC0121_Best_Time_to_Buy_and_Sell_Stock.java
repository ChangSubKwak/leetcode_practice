package leetcode;

public class LC0121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int length = prices.length;

        int max = 0;
        int benefit = 0;
        for (int i = 1 ; i < length; i++) {
            benefit += prices[i] - prices[i - 1];
            benefit = Math.max(benefit, 0);
            max = Math.max(max, benefit);
        }

        return max;
    }

    public int maxProfit1(int[] prices) {
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
