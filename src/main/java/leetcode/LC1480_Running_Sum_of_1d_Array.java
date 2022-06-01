package leetcode;

public class LC1480_Running_Sum_of_1d_Array {
	public int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				result[i] = nums[i];
				continue;
			}

			result[i] = result[i-1] + nums[i];
		}

		return result;
	}
}
