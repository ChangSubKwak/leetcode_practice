package leetcode;

public class LC0152_Maximum_Product_Subarray_X {
    public int maxProduct(int[] nums) {
        int result = nums[0];

        for (int i = 1, imax = result, imin = result; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }

            imax = Math.max(nums[i], imax * nums[i]);
            imin = Math.min(nums[i], imin * nums[i]);

            result = Math.max(result, imax);
        }
        return result;
    }
}
