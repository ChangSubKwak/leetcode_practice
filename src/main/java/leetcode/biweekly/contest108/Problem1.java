package leetcode.biweekly.contest108;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public int alternatingSubarray(int[] nums) {
        int length = nums.length;
        int max = -1;
        int count = 0;
        int[] matchNum = new int[2];

        for (int i = 0; i < length - 1; i++) {
            boolean firstCondition = (nums[i] + 1 == nums[i + 1]) && matchNum[0] != nums[i] && matchNum[1] != nums[i + 1];
            if (firstCondition) {
                count = 1;
                matchNum[0] = nums[i];
                matchNum[1] = nums[i + 1];
                max = Math.max(max, count);
                continue;
            }

            boolean condition1 = (nums[i] == matchNum[1] && nums[i + 1] == matchNum[0]) && count % 2 == 1;
            boolean condition2 = (nums[i] == matchNum[0] && nums[i + 1] == matchNum[1]) && count % 2 == 0;

            if (condition1 || condition2) {
                count++;
                max = Math.max(max, count);
                continue;
            }

            matchNum = new int[2];
            count = 0;
        }

        return max == -1 ? max : max + 1;
    }
}
