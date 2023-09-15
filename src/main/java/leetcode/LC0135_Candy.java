package leetcode;

import java.util.Arrays;

public class LC0135_Candy {
    public int candy(int[] ratings) {
        int length = ratings.length;
        int[] dp = new int[length];

        Arrays.fill(dp, 1);

        // toward right scan
        for (int i = 1; i < length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                dp[i] = dp[i - 1] + 1;
            }
        }

        // toward left scan
        for (int i = length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                dp[i] = Math.max(dp[i], dp[i + 1] + 1);
            }
        }

        return Arrays.stream(dp).sum();
    }
}
