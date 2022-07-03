package leetcode;

import java.util.*;

public class LC0376_Wiggle_Subsequence {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 2) {
            if (nums.length == 2 && nums[0] == nums[1]) {
                return 1;
            }
            return nums.length;
        }

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
        }

        int deleteCount = 0;
        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i-1);

            if (i >= 2) {
                int prevDiff = list.get(i-1) - list.get(i-2);
                if (diff > 0 && prevDiff > 0) {
                    deleteCount++;
                    continue;
                }

                if (diff < 0 && prevDiff < 0) {
                    deleteCount++;
                    continue;
                }
            }
        }

        return list.size() - deleteCount;
    }
}
