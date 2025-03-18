package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC2206_Divide_Array_Into_Equal_Pairs {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            // System.out.println(entry);
            if (entry.getValue() % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
