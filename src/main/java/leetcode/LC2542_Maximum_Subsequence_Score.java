package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC2542_Maximum_Subsequence_Score {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int length = nums1.length;
        int[][] pairs = new int[length][2];
        for (int i = 0; i < length; i++) {
            pairs[i] = new int[]{nums1[i], nums2[i]};
        }

        Arrays.sort(pairs, (e1, e2) -> e2[1] - e1[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Comparator.comparingInt(e -> e));
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += pairs[i][0];
            pq.add(pairs[i][0]);
        }

        long result = sum * pairs[k - 1][1];
        for (int i = k; i < length; i++) {
            sum += pairs[i][0] - pq.poll();
            pq.add(pairs[i][0]);
            result = Math.max(result, sum * pairs[i][1]);
        }

        return result;
    }
}
