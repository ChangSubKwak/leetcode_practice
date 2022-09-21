package leetcode;

import java.util.Arrays;

public class LC0985_Sum_of_Even_Numbers_After_Queries {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum = Arrays.stream(nums)
            .filter(num -> num % 2 == 0)
            .sum();

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];

            int tempVal = nums[index];
            nums[index] += val;
            if (nums[index] % 2 == 0) {
                if (tempVal % 2 == 0) {
                    evenSum -= tempVal;
                }
                evenSum += nums[index];
            } else {
                if (tempVal % 2 == 0) {
                    evenSum -= tempVal;
                }
            }
            result[i] = evenSum;
        }
        return result;
    }
}
