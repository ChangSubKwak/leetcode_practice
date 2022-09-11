package leetcode;

import java.util.*;

public class LC1383_Maximum_Performance_of_a_Team_X {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int [][] efficiencyAndSpeed = new int[n][2];
        for (int i = 0; i < n; i++) {
            efficiencyAndSpeed[i] = new int[] {efficiency[i], speed[i]};
        }

        Arrays.sort(efficiencyAndSpeed, (a, b) -> b[0] - a[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long result = 0, speedSum = 0;
        for (int i = 0; i < efficiencyAndSpeed.length; i++) {
            pq.add(efficiencyAndSpeed[i][1]);
            speedSum += efficiencyAndSpeed[i][1];
            if (pq.size() > k) {
                speedSum -= pq.poll();
            }
            result = Math.max(result, (speedSum * efficiencyAndSpeed[i][0]));
        }
        return (int) (result % (long)(1e9 + 7));
    }
}
