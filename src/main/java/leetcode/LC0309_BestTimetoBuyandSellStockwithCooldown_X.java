package leetcode;

public class LC0309_BestTimetoBuyandSellStockwithCooldown_X {
    public int maxProfit(int[] prices) {
    	if (prices.length <= 1) {
    		return 0;
    	}
    	
    	int[][] dp = new int [3][5000];
    	dp[0][0] = 0;
    	dp[1][0] = -prices[0];
    	dp[2][0] = Integer.MIN_VALUE;
    	
    	for (int i = 1; i < prices.length; i++) {
    		dp[0][i] = Math.max(dp[0][i - 1], dp[2][i - 1]);
    		dp[1][i] = Math.max(dp[1][i - 1], dp[0][i - 1] - prices[i]);
    		dp[2][i] = dp[1][i - 1] + prices[i];
    	}
    	
        return Math.max(dp[0][prices.length - 1], dp[2][prices.length - 1]);
    }
	
	public static void main(String[] args) {
		LC0309_BestTimetoBuyandSellStockwithCooldown_X t = new LC0309_BestTimetoBuyandSellStockwithCooldown_X();
		System.out.println(t.maxProfit(new int[] {1, 2, 3, 0, 2}));
	}
}
