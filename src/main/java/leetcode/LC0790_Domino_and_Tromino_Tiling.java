package leetcode;

public class LC0790_Domino_and_Tromino_Tiling {
    public int numTilings(int n) {
        long[] dp = new long[1001];
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        
        for (int i = 4; i <= n; i++) {
            dp[i] = 2*dp[i-1] + dp[i-3];
            dp[i] %= 1000_000_007;
        }
        
        return (int)dp[n];
    }
}
