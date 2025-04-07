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

        for (int num : nums) {
            for (int currentSum = sum; currentSum >= num; currentSum--) {
                dp[currentSum] = dp[currentSum] || dp[currentSum - num];
                if (dp[currentSum]) {
                    return true;
                }
            }
        }

        return dp[sum];
    }
}
