package leetcode;

public class LC2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    public int maximumCount(int[] nums) {
        int negative = 0;
        int positive = 0;

        for (int num : nums) {
            if (num < 0) {
                negative++;
            }

            if (num > 0) {
                positive++;
            }
        }

        return Math.max(negative, positive);
    }
}
