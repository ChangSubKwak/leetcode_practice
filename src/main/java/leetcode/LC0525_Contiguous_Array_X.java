package leetcode;

import java.util.Arrays;

public class LC0525_Contiguous_Array_X {
    public int findMaxLength(int[] nums) {
        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = 0;
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? -1 : 1);
            if (arr[count + nums.length] >= 0) {
                maxlen = Math.max(maxlen, i - arr[count + nums.length] + 1);
            } else {
                arr[count + nums.length] = i + 1;
            }

        }
        return maxlen;
    }
}
