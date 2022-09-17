package leetcode;

import java.util.Map;
import java.util.TreeMap;

public class LC2007_Find_Original_Array_From_Doubled_Array {
    public int[] findOriginalArray(int[] changed) {
        int length = changed.length;

        if (length % 2 == 1) {
            return new int[0];
        }

        int[] res = new int[length / 2];
        Map<Integer, Integer> count = new TreeMap<>();
        for (int num : changed) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int i = 0;
        for (int key : count.keySet()) {
            if (count.get(key) > count.getOrDefault(2 * key, 0)) {
                return new int[0];
            }

            for (int j = 0; j < count.get(key); j++) {
                res[i++] = key;
                count.put(2 * key, count.get(2 * key) - 1);
            }
        }
        return res;
    }
}
