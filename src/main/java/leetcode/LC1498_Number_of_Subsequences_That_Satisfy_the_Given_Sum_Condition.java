package leetcode;

import java.util.*;

public class LC1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition {
    public static int binarySearchRightmost(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public int numSubseq(int[] nums, int target) {
        int length = nums.length;
        int mod = 1_000_000_007;
        Arrays.sort(nums);

        int[] power = new int[length];
        power[0] = 1;
        for (int i = 1; i < length; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }

        int answer = 0;
        for (int left = 0; left < length; left++) {
            int right = binarySearchRightmost(nums, target - nums[left]) - 1;
            if (right >= left) {
                answer += power[right - left];
                answer %= mod;
            }
        }

        return answer;
    }
}
