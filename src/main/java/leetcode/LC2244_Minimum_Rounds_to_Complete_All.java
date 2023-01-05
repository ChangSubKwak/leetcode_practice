package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC2244_Minimum_Rounds_to_Complete_All {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> countInfo = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            countInfo.put(tasks[i], countInfo.getOrDefault(tasks[i], 0) + 1);
        }

        int count = 0;
        for (Integer value : countInfo.values()) {
            if (value <= 1) {
                return -1;
            }

            if (value <= 3) {
                count++;
                continue;
            }
            count += (value + 2) / 3;
        }

        return count;
    }
}
