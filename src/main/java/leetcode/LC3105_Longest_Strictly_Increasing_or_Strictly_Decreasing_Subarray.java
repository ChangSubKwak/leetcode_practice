package leetcode;

public class LC3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLength = 0;
        int partialLength = 1;

        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                partialLength++;
                i++;
                continue;
            }
            maxLength = Math.max(maxLength, partialLength);
            partialLength = 1;
            i++;
        }
        maxLength = Math.max(maxLength, partialLength);

        i = nums.length - 2;
        partialLength = 1;

        while (i >= 0) {
            if (nums[i] > nums[i + 1]) {
                partialLength++;
                i--;
                continue;
            }
            maxLength = Math.max(maxLength, partialLength);
            partialLength = 1;
            i--;
        }
        maxLength = Math.max(maxLength, partialLength);

        return maxLength;
    }
}
