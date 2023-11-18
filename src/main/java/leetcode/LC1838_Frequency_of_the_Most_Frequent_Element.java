package leetcode;

import java.util.Arrays;

public class LC1838_Frequency_of_the_Most_Frequent_Element {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        int left = 0;
        int rangeLength = 0;
        long current = 0;
        
        for (int right = 0; right < nums.length; right++) {
            int target = nums[right];
            current += target;
            
            long sum = (right - left + 1) * target;
            
            while (sum - current > k) {
                current -= nums[left];
                left++;
                sum = (right - left + 1) * target;
            }
            
            rangeLength = Math.max(rangeLength, right - left + 1);
        }
        
        return rangeLength;
    }
}
