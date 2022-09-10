package leetcode;

public class LC0188_Best_Time_to_Buy_and_Sell_Stock_IV_X {
    public int maxProfit(int k, int[] prices) {
        int length = prices.length;
        if (k >= length / 2) {
            return quickSolve(prices);
        }

        int[][] t = new int[k + 1][length];
        for (int i = 1; i <= k; i++) {
            int max = -prices[0];
            for (int j = 1; j < length; j++) {
                t[i][j] = Math.max(t[i][j - 1], prices[j] + max);
                max =  Math.max(max, t[i - 1][j - 1] - prices[j]);
            }
        }
        return t[k][length - 1];
    }

    private int quickSolve(int[] prices) {
        int len = prices.length, profit = 0;

        for (int i = 1; i < len; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
