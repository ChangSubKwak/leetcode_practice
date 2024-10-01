package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC1497_Check_If_Array_Pairs_Are_Divisible_by_k {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num: arr) {
            int key = num % k;
            if (key < 0) {
                key += k;
            }
            int value = numMap.getOrDefault(key, 0) + 1;
            numMap.put(key, value);
        }

        if (numMap.containsKey(0) && numMap.get(0) % 2 != 0) {
            return false;
        } else {
            numMap.remove(0);
        }

        if (k % 2 == 0) {
            if (numMap.containsKey(k / 2) && numMap.get(k / 2) % 2 != 0) {
                return false;
            } else {
                numMap.remove(k / 2);
            }
        }

        while (true) {
            if (numMap.size() == 0) {
                return true;
            }

            Map.Entry<Integer, Integer> firstEntry = numMap.entrySet().iterator().next();
            int firstKey = firstEntry.getKey();
            int differenceKey = k - firstKey;

            if (numMap.containsKey(differenceKey)) {
                int decreaseSize = Math.min(numMap.get(differenceKey), numMap.get(firstKey));
                numMap.put(differenceKey, numMap.get(differenceKey) - decreaseSize);
                numMap.put(firstKey, numMap.get(firstKey) - decreaseSize);

                if (numMap.get(differenceKey) == 0) {
                    numMap.remove(differenceKey);
                }

                if (numMap.get(firstKey) == 0) {
                    numMap.remove(firstKey);
                }

                continue;
            }

            break;
        }

        return false;
    }
}
