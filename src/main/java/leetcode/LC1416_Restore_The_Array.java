package leetcode;

import java.util.Arrays;

public class LC1416_Restore_The_Array {
    public int numberOfArrays(String s, int k) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return dfs(s, k, 0, dp);
    }

    private int dfs(String s, long k, int start, int[] dp) {
        if (start == s.length()) {
            return 1;
        }

        if (s.charAt(start) == '0') {
            return 0;
        }

        if (dp[start] != -1) {
            return dp[start];
        }

        int answer = 0;
        long num = 0;

        for (int i = start; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num > k) {
                break;
            }

            answer += dfs(s, k, i + 1, dp);
            answer %= 1000_000_007;
        }

        dp[start] = answer;

        return dp[start];
    }
}
