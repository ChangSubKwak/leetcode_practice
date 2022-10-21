package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0219_Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < length && i <= k; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) >= 2) {
                return true;
            }
        }

        for (int i = k + 1; i < nums.length; i++) {
            count.put(nums[i - k - 1], count.get(nums[i - k - 1]) - 1);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) >= 2) {
                return true;
            }
        }
        return false;
    }
}
