package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC2348_Number_of_Zero_Filled_Subarrays {
    public long zeroFilledSubarray(int[] nums) {
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
