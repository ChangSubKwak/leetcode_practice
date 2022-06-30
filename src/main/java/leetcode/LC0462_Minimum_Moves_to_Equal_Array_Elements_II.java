package leetcode;

import java.util.Arrays;

public class LC0462_Minimum_Moves_to_Equal_Array_Elements_II {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
    
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(nums[i] - mid);
        }
        return sum;
    }
}
