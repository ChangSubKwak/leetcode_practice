package leetcode;

import java.util.Arrays;

public class LC1464_Maximum_Product_of_Two_Elements_in_an_Array {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return (nums[length - 2] - 1) * (nums[length - 1] - 1);
    }
}
