package leetcode;

public class LC0162_Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            boolean firstIsGreater = false;
            boolean secondIsGreater = false;
            
            if (i == 0) {
                if (Integer.MIN_VALUE < nums[i]) {
                    firstIsGreater = true;
                }
                
                if (length == 1 && nums[i] > Integer.MIN_VALUE) {
                    secondIsGreater = true;
                }
                
                if (length > 1 && nums[i] > nums[i+1]) {
                    secondIsGreater = true;
                }
                
                if (firstIsGreater && secondIsGreater) {
                    return 0;
                }
                continue;
            }
            
            if (i == length - 1) {
                if (nums[i-1] < nums[i]) {
                    firstIsGreater = true;
                }
                
                if (nums[i] > Integer.MIN_VALUE) {
                    secondIsGreater = true;
                }
                
                if (firstIsGreater && secondIsGreater) {
                    return length - 1;
                }
                continue;
            }
            
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                return i;
            }
        }
        
        return length - 1;
    }
}
