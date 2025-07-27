package leetcode;

public class LC2210_Count_Hills_and_Valleys_in_an_Array {
    public int countHillValley(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            int next = 1;
            while(i + next < nums.length - 1 && nums[i] == nums[i + next]) {
                next++;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + next]) {
                count++;
                continue;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + next]) {
                count++;
            }
        }

        return count;
    }
}
