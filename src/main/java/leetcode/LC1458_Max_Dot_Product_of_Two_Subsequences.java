package leetcode;

public class LC1458_Max_Dot_Product_of_Two_Subsequences {
    private int[][] dp;

    private int recur(int i, int j, int[] nums1, int[] nums2) {
        if (i == nums1.length || j == nums2.length) {
            return 0;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int use = nums1[i] * nums2[j] + recur(i + 1, j + 1, nums1, nums2);

        dp[i][j] = Math.max(dp[i][j], use);
        dp[i][j] = Math.max(dp[i][j], recur(i + 1, j, nums1, nums2));
        dp[i][j] = Math.max(dp[i][j], recur(i, j + 1, nums1, nums2));

        return dp[i][j];
    }

    public int maxDotProduct(int[] nums1, int[] nums2) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num: nums1) {
            firstMax = Math.max(firstMax, num);
            firstMin = Math.min(firstMin, num);
        }

        for (int num: nums2) {
            secondMax = Math.max(secondMax, num);
            secondMin = Math.min(secondMin, num);
        }

        if (firstMax < 0 && secondMin > 0) {
            return firstMax * secondMin;
        }

        if (firstMin > 0 && secondMax < 0) {
            return firstMin * secondMax;
        }

        dp = new int[nums1.length][nums2.length];
        return recur(0, 0, nums1, nums2);
    }
}
