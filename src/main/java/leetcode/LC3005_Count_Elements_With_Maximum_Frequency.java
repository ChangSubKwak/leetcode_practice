package leetcode;

public class LC3005_Count_Elements_With_Maximum_Frequency {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            max = Math.max(max, count[nums[i]]);
        }

        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (count[i] == max) {
                result += max;
            }
        }

        return result;
    }
}
