package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class LC1962_Remove_Stones_to_Minimize_the_Total {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += piles[i];
            pq.add(piles[i]);
        }

        for (int i = 0; i < k; i++) {
            int half = pq.peek() - pq.peek() / 2;
            sum -= (pq.peek() - half);
            pq.remove();
            pq.add(half);
        }

        return sum;
    }
}
