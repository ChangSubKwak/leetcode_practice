package leetcode;

public class LC2466_Count_Ways_To_Build_Good_Strings {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        dp[0] = 1;
        int mod = 1_000_000_007;

        for (int i = 1; i <= high; i++) {
            if (i >= zero) {
                dp[i] += dp[i - zero];
            }

            if (i >= one) {
                dp[i] += dp[i - one];
            }
            dp[i] %= mod;
        }

        int answer = 0;
        for (int i = low; i <= high; i++) {
            answer += dp[i];
            answer %= mod;
        }

        return answer;
    }
}
