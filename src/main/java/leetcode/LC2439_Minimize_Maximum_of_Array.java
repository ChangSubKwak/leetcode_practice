package leetcode;

public class LC2439_Minimize_Maximum_of_Array {
    public int minimizeArrayValue(int[] nums) {
        long sum = 0;
        long max = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = (long)Math.max(max, Math.ceil((double)sum / (i + 1)));
        }

        return (int)max;
    }
}
