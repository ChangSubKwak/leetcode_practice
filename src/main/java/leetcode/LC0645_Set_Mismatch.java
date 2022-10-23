package leetcode;

import java.util.*;

public class LC0645_Set_Mismatch {
    public int[] findErrorNums(int[] nums) {
        int length = nums.length;

        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (set.contains(nums[i]) && !result.contains(nums[i])) {
                result.add(nums[i]);
                continue;
            }
            set.add(nums[i]);
        }

        for (int i = 1; i <= length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
