package leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class LC2336_Smallest_Number_in_Infinite_Set {
    static class SmallestInfiniteSet {
        private final Set<Integer> set;
        private final PriorityQueue<Integer> pq;

        public SmallestInfiniteSet() {
            set = new HashSet<>();
            pq = new PriorityQueue<>();
            for (int i = 1; i <= 1000; i++) {
                set.add(i);
                pq.add(i);
            }
        }

        public int popSmallest() {
            int smallestNumber = pq.poll();
            set.remove(smallestNumber);
            return smallestNumber;
        }

        public void addBack(int num) {
            if (set.contains(num)) {
                return;
            }
            set.add(num);
            pq.add(num);
        }
    }
}
