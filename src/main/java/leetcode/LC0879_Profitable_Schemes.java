package leetcode;

import java.util.Arrays;

public class LC0879_Profitable_Schemes {
    private int mod = 1000_000_007;
    private int [][][] dp = new int[101][101][101];
    private int totalPersonCount;
    private int[] group;
    private int[] profit;
    private int minProfit;

    private int recur(int position, int personCount, int currentProfit) {
        if (position >= group.length) {
            return currentProfit >= minProfit ? 1 : 0;
        }

        if (dp[position][personCount][currentProfit] != -1) {
            return dp[position][personCount][currentProfit];
        }

        int total = recur(position + 1, personCount, currentProfit);
        if (personCount + group[position] <= totalPersonCount) {
            total += recur(position + 1, personCount + group[position], Math.min(minProfit, currentProfit + profit[position]));
        }

        dp[position][personCount][currentProfit] = total % mod;
        return dp[position][personCount][currentProfit];
    }

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        this.totalPersonCount = n;
        this.minProfit = minProfit;
        this.group = group;
        this.profit = profit;

        for (int i = 0; i <= group.length; i++) {
            for (int j = 0; j <= totalPersonCount; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return recur(0, 0, 0);
    }
}
