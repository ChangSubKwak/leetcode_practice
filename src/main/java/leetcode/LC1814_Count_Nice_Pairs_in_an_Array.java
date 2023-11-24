package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC1814_Count_Nice_Pairs_in_an_Array {
    public int countNicePairs(int[] nums) {
        int[] revNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            sb.reverse();
            revNums[i] = Integer.valueOf(sb.toString());
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff =nums[i] - revNums[i];
            count.put(diff, count.getOrDefault(diff, 0) + 1);
        }

        long result = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            long value = entry.getValue();
            if (value >= 2) {
                result += value * (value - 1) / 2;
                result %= 1000_000_007;
            }
        }

        return (int)result;
    }
}
