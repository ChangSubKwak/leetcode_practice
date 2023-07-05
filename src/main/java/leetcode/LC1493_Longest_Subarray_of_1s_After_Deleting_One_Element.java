package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC1493_Longest_Subarray_of_1s_After_Deleting_One_Element {
    public int longestSubarray(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (count < 0) {
                    list.add(0);
                    count = 0;
                }
                count++;
                continue;
            }

            if (count > 0) {
                list.add(count);
                count = 0;
                continue;
            }

            if (count <= 0) {
                count--;
            }
        }

        if (count > 0) {
            list.add(count);
            count = 0;
        }

        if (count < 0) {
            list.add(0);
        }

        System.out.println(list);
        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (max < list.get(i) + list.get(i + 1)) {
                max = list.get(i) + list.get(i + 1);
            }
        }

        if (list.get(0) == 0 && list.size() == 1) {
            return 0;
        }

        return list.size() == 1 ? list.get(0) -  1 : max;
    }
}
