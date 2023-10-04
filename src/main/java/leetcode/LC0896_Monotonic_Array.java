package leetcode;

public class LC0896_Monotonic_Array {
    public boolean isMonotonic(int[] nums) {
        boolean isMonotonic = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                isMonotonic = false;
                break;
            }
        }
        
        if (isMonotonic) {
            return true;
        }
        
        isMonotonic = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i+1]) {
                isMonotonic = false;
                break;
            }
        }
        
        return isMonotonic;
    }
}
