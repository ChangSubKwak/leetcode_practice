package leetcode;

public class LC2044_Count_Number_of_Maximum_Bitwise_OR_Subsets {
    public int countMaxOrSubsets(int[] nums) {
        int maxValue = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int cumulatedValue = nums[i];
            for (int j = i; j < length; j++) {
                cumulatedValue = cumulatedValue | nums[j];
                maxValue = Math.max(maxValue, cumulatedValue);
            }
        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            int cumulatedValue = nums[i];
            for (int j = i; j < length; j++) {
                cumulatedValue = cumulatedValue | nums[j];
//                System.out.println("i = " + i + " j = " + j + " cumulatedValue = " + cumulatedValue);
                if (maxValue == cumulatedValue) {
                    count++;
                }
            }
        }

        return count;
    }
}
