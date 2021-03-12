package main.java.leetcode;

public class LC0045_JumpGameII {
    public int jump(int[] nums) {
    	int len = nums.length;
    	int dp[] = new int[len];
    	
    	for (int i = 1 ; i < len ; i++)
    		dp[i] = 100000;

    	dp[0] = 0;
    	for (int i = 1 ; i < len && i <= nums[0] ; i++)
    		dp[i] = 1;
    	
    	for (int i = 1 ; i < len ; i++) {
    		for (int j = i + 1 ; j < len && j <= i + nums[i] ; j++) {
    			dp[j] = Math.min(dp[j], dp[i] + 1);
    		}
    	}
    	
        return dp[len - 1];
    }
	
	public static void main(String[] args) {
		LC0045_JumpGameII t = new LC0045_JumpGameII();
		System.out.println(t.jump(new int[] { 2, 3, 1, 1, 4 }));
		System.out.println(t.jump(new int[] { 2, 3, 0, 1, 4 }));
		System.out.println(t.jump(new int[] { 3, 2, 1 }));
	}
}
