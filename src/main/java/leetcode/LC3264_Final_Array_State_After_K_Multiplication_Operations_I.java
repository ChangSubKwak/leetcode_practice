package leetcode;

import java.util.PriorityQueue;

public class LC3264_Final_Array_State_After_K_Multiplication_Operations_I {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        int count = 0;
        while (count < k) {
            int[] top = pq.poll();
            top[0] *= multiplier;
            pq.offer(top);
            count++;
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int[] num = pq.poll();
            result[num[1]] = num[0];
        }

        return result;
    }
}
