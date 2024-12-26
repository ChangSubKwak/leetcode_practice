package leetcode;

public class LC0494_Target_Sum {
    private int recur(int[] nums, int target, int sum, int depth) {
        if (depth == nums.length) {
            return sum == target ? 1 : 0;
        }

        int plus  = recur(nums, target, sum + nums[depth], depth + 1);
        int minus = recur(nums, target, sum - nums[depth], depth + 1);

        return plus + minus;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return recur(nums, target, 0, 0);
    }
}
