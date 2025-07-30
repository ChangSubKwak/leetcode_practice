package leetcode;

public class LC2419_Longest_Subarray_With_Maximum_Bitwise_AND {
    public int longestSubarray(int[] nums) {
        int maxValue = 0;
        int answer = 0;
        int currentStreak = 0;

        for (int num : nums) {
            if (maxValue < num) {
                maxValue = num;
                answer = 0;
                currentStreak = 0;
            }
        }

        return 2;
    }
}
