package leetcode;

public class LC0300_Longest_Increasing_Sequence_X {
    private int[][] dp;
    
    private int recur(int[] nums, int i, int previousIndex) {
        if (i >= nums.length) {
            return 0;
        }
        
        if (dp[i][previousIndex + 1] != -1) {
            return dp[i][previousIndex + 1];
        }
        
        int take = 0;
        int noTake = recur(nums, i + 1, previousIndex);
        if (previousIndex == -1 || nums[i] > nums[previousIndex]) {
            take = 1 + recur(nums, i + 1, i);
        }
        
        dp[i][previousIndex + 1] = Math.max(take, noTake);
        return dp[i][previousIndex + 1];
    }
    
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length][nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length + 1; j++) {
                dp[i][j] = -1;
            }
        }
        
        return recur(nums, 0, -1);
    }
}
