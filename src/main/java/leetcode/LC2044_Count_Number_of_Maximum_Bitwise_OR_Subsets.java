package leetcode;

public class LC2044_Count_Number_of_Maximum_Bitwise_OR_Subsets {
    public int countMaxOrSubsets(int[] nums) {
        int maxOrValue = 0;
        for (int num : nums) {
            maxOrValue |= num;
        }

        return countSubsets(nums, 0, 0, maxOrValue);
    }

    private int countSubsets(int[] nums, int index, int currentOr, int targetOr) {
        if (index == nums.length && currentOr == targetOr) {
            return 1;
        }

        if (index == nums.length) {
            return 0;
        }

        int countIfExclude = countSubsets(nums, index + 1, currentOr, targetOr);
        int countIfInclude = countSubsets(nums, index + 1, currentOr | nums[index], targetOr);

        return countIfExclude + countIfInclude;
    }
}
