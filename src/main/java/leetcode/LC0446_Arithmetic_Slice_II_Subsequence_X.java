package leetcode;

import java.util.*;

public class LC0446_Arithmetic_Slice_II_Subsequence_X {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        Map<Integer, Integer>[] map = new HashMap[nums.length];

        for (int i = 0; i < nums.length; i++) {
            map[i] = new HashMap<>(i);

            for (int j = 0; j < i; j++) {
                long diff = (long)nums[i] - nums[j];
                if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) {
                    continue;
                }

                int integerDiff = (int)diff;
                int count1 = map[i].getOrDefault(integerDiff, 0);
                int count2 = map[j].getOrDefault(integerDiff, 0);

                result += count2;
                map[i].put(integerDiff, count1 + count2 + 1);
                // System.out.println("i = " + i + ", j = " + j + ", integerDiff = " + integerDiff + ", result = " + result);
                // System.out.println("map[i] = " + map[i]);
                // System.out.println("map[j] = " + map[j]);
            }
        }

        return result;
    }
}
