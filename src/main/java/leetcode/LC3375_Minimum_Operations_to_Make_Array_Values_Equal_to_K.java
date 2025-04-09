package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC3375_Minimum_Operations_to_Make_Array_Values_Equal_to_K {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (k > nums[i]) {
                return -1;
            }
            set.add(nums[i]);
        }

        int count = 0;
        for (Integer item : set) {
            if (k < item) {
                count++;
            }
        }
        return count;
    }
}
