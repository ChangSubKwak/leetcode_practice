package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC1865_Finding_Pairs_With_a_Certain_Sum {
    static class FindSumPairs {

        private HashMap<Integer, Integer> map1;
        private HashMap<Integer, Integer> map2;
        private int[] nums2;

        public FindSumPairs(int[] nums1, int[] nums2) {
            this.map1 = new HashMap<>();
            this.map2 = new HashMap<>();
            this.nums2 = nums2;

            for (int i = 0; i < nums1.length; i++) {
                map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
            }

            for (int i = 0; i < nums2.length; i++) {
                map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
            }
        }

        public void add(int index, int val) {
            int previous = nums2[index];
            map2.put(previous, map2.get(previous) - 1);

            nums2[index] += val;
            int newValue = previous + val;
            map2.put(newValue, map2.getOrDefault(newValue, 0) + 1);
        }

        public int count(int tot) {
            int count = 0;
            for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
                int key1 = e.getKey();
                int key2 = tot - key1;

                count += map1.getOrDefault(key1, 0) * map2.getOrDefault(key2, 0);
            }

            return count;
        }
    }
}
