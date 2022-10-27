package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0523_Continuous_Subarray_Sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> leftIndex = new HashMap<>();
        leftIndex.put(0, 0);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (!leftIndex.containsKey(sum % k)) {
                leftIndex.put(sum % k, i + 1);
                continue;
            }

            if (leftIndex.get(sum % k) < i) {
                return true;
            }
        }
        return false;
    }
}
