package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC2348_Number_of_Zero_Filled_Subarrays {

    public long zeroFilledSubarray(int[] nums) {
        int length = nums.length;
        List<Long> zeros = new ArrayList<>();

        if (length == 1 && nums[0] == 0) {
            zeros.add(1L);
        }

        for (int i = 1; i < length; i++) {
            int count = 0;
            int first = i - 1;

            while(i < length && nums[i - 1] == 0 && nums[i] == 0) {
                count++;
                i++;
            }

            if (count != 0) {
                zeros.add(count + 1L);
            } else if (nums[first] == 0) {
                zeros.add(1L);
            }
        }

        if (length - 2 >= 0 && nums[length - 2] != 0 && nums[length - 1] == 0) {
            zeros.add(1L);
        }

        // System.out.println(zeros);

        long result = 0;
        for (long zero : zeros) {
            result += zero * (zero + 1) / 2;
        }

        return result;
    }

    public long zeroFilledSubarrayVer1(int[] nums) {
        Map<Long, Long> zeros = new HashMap<>();

        int i = 0;
        while (i < nums.length) {
            int start = i;
            while(i < nums.length && nums[i] == 0) {
                i++;
            }

            if (start == i) {
                i++;
                continue;
            }

            zeros.put(Long.valueOf(i - start), zeros.getOrDefault(Long.valueOf(i - start), 0L) + 1L);
        }

        long result = 0;
        for (Map.Entry<Long, Long> entry : zeros.entrySet()) {
            long zeroLength = entry.getKey();
            long num = entry.getValue();

            result += (zeroLength * (zeroLength + 1) / 2) * num;
        }
        return result;
    }
}
