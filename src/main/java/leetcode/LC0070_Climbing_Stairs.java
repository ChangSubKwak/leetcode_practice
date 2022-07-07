package leetcode;

public class LC0070_Climbing_Stairs {
    private int[] dp = new int[46];

    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return dp[n];
    }

    public int climbStairs1(int n) {
        int[] dp = new int[n + 1];
        
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2 ; i <= n ; i++) {
        	dp[i] += dp[i-1];
        	dp[i] += dp[i-2];
        }
        
        return dp[n];
    }
}
