package leetcode;

public class LC0540_Single_Element_in_a_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        
        for (int i = 0; i < length; i+=2) {
            if (i + 1 < length && nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        
        return nums[length - 1];
    }
}
