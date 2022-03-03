package leetcode;

public class LC0413_Arithmetic_Slices_X {
    public int numberOfArithmeticSlices(int[] nums) {
        int sum = 0;
        int consecutiveMatchCount = 0;
        
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                consecutiveMatchCount++;
                sum += consecutiveMatchCount;
                continue;
            }
            consecutiveMatchCount = 0;
        }
        
        return sum;
    }
}
