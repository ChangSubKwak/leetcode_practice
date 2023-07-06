package leetcode;

public class LC0209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int min = 100001;

        while (start < nums.length && start <= end) {
            if (sum <= target && end < nums.length) {
                sum += nums[end];
                end++;
                if (sum >= target) {
                    min = Math.min(min, end - start);
                }
                continue;
            }

            sum -= nums[start];
            start++;
            if (sum >= target) {
                min = Math.min(min, end - start);
            }
        }

        return min == 100001 ? 0 : min;
    }
}
