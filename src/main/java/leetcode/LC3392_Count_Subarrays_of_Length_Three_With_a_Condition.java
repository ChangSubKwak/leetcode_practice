package leetcode;

public class LC3392_Count_Subarrays_of_Length_Three_With_a_Condition {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == (nums[i] + nums[i + 2]) * 2) {
                count++;
            }
        }

        return count;
    }
}
