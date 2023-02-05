package leetcode.biweekly.contest97;

import java.util.*;

public class Problem1 {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String num = String.valueOf(nums[i]);
            for (int j = 0; j < num.length(); j++) {
                result.add(Integer.valueOf(num.charAt(j) - '0'));
            }
        }

        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
