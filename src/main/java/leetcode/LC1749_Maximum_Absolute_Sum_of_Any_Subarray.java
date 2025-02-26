package leetcode;

public class LC1749_Maximum_Absolute_Sum_of_Any_Subarray {
    public int maxAbsoluteSum(int[] nums) {
        int minPrefixSum = Integer.MAX_VALUE;
        int maxPrefixSum = Integer.MIN_VALUE;
        int prefixSum = 0;
        int maxAbsSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            minPrefixSum = Math.min(minPrefixSum, prefixSum);
            maxPrefixSum = Math.max(maxPrefixSum, prefixSum);

            if (prefixSum >= 0) {
                maxAbsSum = Math.max(maxAbsSum, prefixSum);
                maxAbsSum = Math.max(maxAbsSum, prefixSum - minPrefixSum);
                continue;
            }

            if (prefixSum < 0) {
                maxAbsSum = Math.max(maxAbsSum, Math.abs(prefixSum));
                maxAbsSum = Math.max(maxAbsSum, Math.abs(prefixSum - maxPrefixSum));
                continue;
            }
        }

        return maxAbsSum;
    }
}
