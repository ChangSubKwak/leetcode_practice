package leetcode;

import java.util.Arrays;

public class LC1877_Minimize_Maximum_Pair_Sum_in_Array {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length / 2; i++) {
            max = Math.max(max, nums[i] + nums[nums.length - 1 - i]);
        }
        
        return max;
    }
}
