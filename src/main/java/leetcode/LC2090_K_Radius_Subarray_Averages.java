package leetcode;

import java.util.Arrays;

public class LC2090_K_Radius_Subarray_Averages {
    public int[] getAverages(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length];
        Arrays.fill(result, -1);

        long sum = 0;
        for (int i = 0; i < length && i < 2 * k + 1; i++) {
            sum += nums[i];
        }

        for (int i = k; i < length - k; i++) {
            result[i] = (int)(sum / (2L * k + 1L));
            if (i + k + 1 > length - 1) {
                break;
            }
            sum = sum - nums[i - k] + nums[i + k + 1];
        }

        return result;
    }
}
