package leetcode;

import java.util.PriorityQueue;

public class LC3066_Minimum_Operations_to_Exceed_Threshold_Value_II {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add((long)num);
        }

        int count = 0;
        while (k > minHeap.peek()) {
            long x = minHeap.poll();
            long y = minHeap.poll();
            long newValue = Math.min(x, y) * 2 + Math.max(x, y);

            minHeap.add(newValue);

            count++;
        }

        return count;
    }
}
