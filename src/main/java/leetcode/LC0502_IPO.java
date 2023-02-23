package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LC0502_IPO {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> ascendingCapital = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        PriorityQueue<int[]> descendingProfit = new PriorityQueue<>((a, b) -> (b[1] - a[1]));

        for (int i = 0; i < profits.length; i++) {
            ascendingCapital.add(new int[] {capital[i], profits[i]});
        }

        for (int i = 0; i < k; i++) {
            while (!ascendingCapital.isEmpty() && ascendingCapital.peek()[0] <= w) {
                descendingProfit.add(ascendingCapital.poll());
            }

            if (descendingProfit.isEmpty()) {
                break;
            }

            w += descendingProfit.poll()[1];
        }

        return w;
    }
}
