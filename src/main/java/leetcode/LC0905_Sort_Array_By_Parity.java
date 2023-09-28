package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0905_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        even.addAll(odd);

        return even.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
