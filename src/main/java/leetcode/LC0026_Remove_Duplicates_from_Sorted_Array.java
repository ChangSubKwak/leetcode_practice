package leetcode;

public class LC0026_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int k = 0;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k++] = nums[i];
                continue;
            }
        }

        if (nums.length > 1 && nums[length - 2] != nums[length - 1]) {
            nums[k++] = nums[length - 1];
        }

        return k == 0 ? 1 : k;
    }
}
