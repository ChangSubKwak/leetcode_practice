package leetcode;

public class LC0334_Increasing_Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) {
                small = n;
                continue;
            }

            if (n <= big) {
                big = n;
                continue;
            }

            return true;
        }
        return false;
    }
}
