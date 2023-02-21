package leetcode;

public class LC0540_Single_Element_in_a_Sorted_Array {
    // TODO : Next time, I'll solve it through binary search.
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i += 2;
        }

        return nums[nums.length - 1];
    }
}
