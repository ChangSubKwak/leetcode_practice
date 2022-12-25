package leetcode;

import java.util.*;

public class LC2389_Longest_Subsequence_With_Limited_Sum {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int pos = Arrays.binarySearch(nums, queries[i]);
            if (pos < 0) {
                result[i] = -pos - 1;
                continue;
            }
            result[i] = pos + 1;
        }

        return result;
    }
}
