package main.java.leetcode;

public class LC0070_ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2 ; i <= n ; i++) {
        	dp[i] += dp[i-1];
        	dp[i] += dp[i-2];
        }
        
        return dp[n];
    }
    
	public static void main(String[] args) {
		LC0070_ClimbingStairs t = new LC0070_ClimbingStairs();
		System.out.println(t.climbStairs(2));
		System.out.println(t.climbStairs(3));
	}
}
