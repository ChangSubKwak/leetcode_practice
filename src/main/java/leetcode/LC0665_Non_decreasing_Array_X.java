package leetcode;

public class LC0665_Non_decreasing_Array_X {
	public boolean checkPossibility(int[] nums) {
		int length = nums.length;
		int count = 0;
		for (int i = 1; i < length; i++) {
			if (nums[i - 1] > nums[i]) {
				count++;
				if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
					nums[i - 1] = nums[i];
				} else {
					nums[i] = nums[i - 1];
				}
			}
		}
		return count <= 1;
	}
}
