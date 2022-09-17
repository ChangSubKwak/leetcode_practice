package leetcode;

public class LC1770_Maximum_Score_from_Performing_Multiplication_Operations {
    private int numsLength;
    private int multipliersLength;
    private int[] nums;
    private int[] multipliers;
    private Integer[][] memo;

    public int maximumScore(int[] nums, int[] multipliers) {
        numsLength = nums.length;
        multipliersLength = multipliers.length;
        this.nums= nums;
        this.multipliers = multipliers;
        this.memo = new Integer[multipliersLength][multipliersLength];
        return recur(0, 0);
    }

    private int recur(int left, int op) {
        if (op == multipliersLength) {
            return 0;
        }

        if (memo[left][op] != null) {
            return memo[left][op];
        }

        int leftValue  = recur(left + 1, op + 1) + nums[left] * multipliers[op];
        int right = numsLength - 1 - (op - left);
        int rightValue = recur(left, op + 1) + nums[right] * multipliers[op];

        return memo[left][op] = Math.max(leftValue, rightValue);
    }
}
