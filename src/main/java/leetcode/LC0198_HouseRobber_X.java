package leetcode;

import java.util.Arrays;

public class LC0198_HouseRobber_X {
	private int[] dp;
	
    public int rob(int[] nums) {
    	dp = new int[nums.length + 1];
    	Arrays.fill(dp, -1);
        return rob(nums, nums.length - 1);
    }
    
	private int rob(int[] nums, int i) {
		if (i < 0) {
			return 0;
		}
		
		if (dp[i] >= 0) {
			return dp[i];
		}
		
		int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1)); 
		dp[i] = result;
		return result;
	}

	public static void main(String[] args) {
		LC0198_HouseRobber_X t = new LC0198_HouseRobber_X();
		System.out.println(t.rob(new int[] { 1, 2, 3, 1 }));
	}
}
