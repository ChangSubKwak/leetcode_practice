package leetcode;

import java.util.*;

public class LC0983_Minimum_Cost_For_Tickets {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        int start = 0;
        for (int i = 0; i < days.length; i++) {
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + costs[0]);

            int j = 0;
            while (i + j < days.length && days[i + j] - days[i] + 1 <= 7) {
                dp[i + j + 1] = Math.min(dp[i + j + 1], dp[i] + costs[1]);
                j++;
            }

            j = 0;
            while (i + j < days.length && days[i + j] - days[i] + 1 <= 30) {
                dp[i + j + 1] = Math.min(dp[i + j + 1], dp[i] + costs[2]);
                j++;
            }
        }

        return dp[days.length];
    }
}
