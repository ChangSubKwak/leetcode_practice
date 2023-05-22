package leetcode;

import java.util.*;

public class LC0347_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> keyCount = new HashMap<>();
        Map<Integer, List<Integer>> countMap = new HashMap<>();

        for (int num : nums) {
            keyCount.put(num, keyCount.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : keyCount.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            List<Integer> list = new ArrayList<>();
            if (countMap.containsKey(count)) {
                list = countMap.get(count);
            }
            list.add(key);
            countMap.put(count, list);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Map.Entry<Integer, List<Integer>> entry : countMap.entrySet()) {
            int key = entry.getKey();
            pq.add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < k && result.size() < k; i++) {
            result.addAll(countMap.get(pq.poll()));
        }

        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
