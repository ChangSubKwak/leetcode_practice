package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC1027_Longest_Arithmetic_Subsequence {
    public int longestArithSeqLength(int[] nums) {
        int max = 0;
        Map<Integer, Map<Integer, Integer>> dp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            dp.put(i, new HashMap<>());
            for (int j = 0; j < i; j++) {
                int difference = nums[i] - nums[j];
                dp.get(i).put(difference, dp.get(j).getOrDefault(difference, 1) + 1);
                max = Math.max(max, dp.get(i).get(difference));
            }
        }
        return max;
    }
}
