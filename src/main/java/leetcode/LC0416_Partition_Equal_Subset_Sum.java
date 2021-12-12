package leetcode;

import java.util.Arrays;

public class LC0416_Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        sum = Arrays.stream(nums).sum();
        
        if (sum%2 != 0) {
            return false;   
        }

        sum /= 2;
        
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;

        for (int j : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= j) {
                    dp[i] = dp[i] || dp[i-j];
                }
            }
        }

        return dp[sum];
    }
}
