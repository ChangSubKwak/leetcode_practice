package leetcode;

public class LC2460_Apply_Operations_to_an_Array {
    public int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int resultIndex = 0;

        int i = 0;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                continue;
            }

            if (nums[i] == nums[i + 1]) {
                result[resultIndex] = nums[i] * 2;
                i++;

            } else {
                result[resultIndex] = nums[i];
            }

            resultIndex++;
        }

        if (i != nums.length) {
            result[resultIndex] = nums[nums.length - 1];
        }

        return result;
    }
}
