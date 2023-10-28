package leetcode;

public class LC1220_Count_Vowels_Permutation_1 {
    public int countVowelPermutation(int n) {
        long[][] dp = new long[n + 1][5];
        int MOD = 1000_000_007;

        for(int i = 0; i < 5; i++) {
            dp[1][i] = 1;
        }

        for(int i = 1; i < n; i++) {
            dp[i+1][0] = (dp[i][1] + dp[i][2] + dp[i][4]) % MOD;
            dp[i+1][1] = (dp[i][0] + dp[i][2]) % MOD;
            dp[i+1][2] = (dp[i][1] + dp[i][3]) % MOD;
            dp[i+1][3] = dp[i][2];
            dp[i+1][4] = (dp[i][2] + dp[i][3]) % MOD;
        }

        int result = 0;
        for(int i = 0; i < 5; i++) {
            result = (result + (int)dp[n][i]) % MOD;
        }

        return result;
    }
}
