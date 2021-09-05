package leetcode;

public class LC0198_HouseRobber_X {
    public int rob(int[] nums) {
        return rob(nums, nums.length - 1);
    }
    
	private int rob(int[] nums, int i) {
		if (i < 0) {
			return 0;
		}
		return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
	}

	public static void main(String[] args) {
		LC0198_HouseRobber_X t = new LC0198_HouseRobber_X();
		System.out.println(t.rob(new int[] { 1, 2, 3, 1 }));
	}
}
