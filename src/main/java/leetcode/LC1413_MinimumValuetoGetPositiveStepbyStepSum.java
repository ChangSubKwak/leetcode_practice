package leetcode;

public class LC1413_MinimumValuetoGetPositiveStepbyStepSum {
    public int minStartValue(int[] nums) {
        int start = 1;
        while (true) {
            int sum = start;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum < 1) {
                    break;
                }
            }
            
            if (sum >= 1) {
                break;
            }
            start++;
        }
        return start;
    }
}
