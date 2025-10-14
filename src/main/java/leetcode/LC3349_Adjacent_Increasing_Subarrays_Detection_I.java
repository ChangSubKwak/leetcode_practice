package leetcode;

import java.util.List;

public class LC3349_Adjacent_Increasing_Subarrays_Detection_I {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1) {
            return true;
        }

        boolean isContinue = false;
        for (int i = 0; i < nums.size() - 2 * k + 1; i++) {
            isContinue = true;

            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    isContinue = false;
                    break;
                }
            }

            if (!isContinue) {
                continue;
            }

            isContinue = true;

            for (int j = i + k; j < i + 2 * k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    isContinue = false;
                    break;
                }
            }

            if (!isContinue) {
                continue;
            }

            break;
        }

        return isContinue;
    }
}
