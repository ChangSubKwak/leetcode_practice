package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC1942_The_Number_of_the_Smallest_Unoccupied_Chair {
    public int smallestChair(int[][] times, int targetFriend) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> chairQueue = new PriorityQueue<>();
        PriorityQueue<int[]> arrivalQueueLowest = new PriorityQueue<>((x, y) -> x[0] - y[0]);
        PriorityQueue<int[]> leavingQueueLowest = new PriorityQueue<>((x, y) -> x[0] - y[0]);

        for (int i = 0; i < times.length; i++) {
            arrivalQueueLowest.add(new int[]{times[i][0], i});
            leavingQueueLowest.add(new int[]{times[i][1], i});
        }

        while (true) {
            if (arrivalQueueLowest.size() > 0 && leavingQueueLowest.size() > 0) {
                int[] arrival = arrivalQueueLowest.peek();
                int[] leaving = leavingQueueLowest.peek();

                if (arrival[0] < leaving[0]) {
                    if (chairQueue.size() == 0) {
                        chairQueue.add(0);
                    }
                }
            }
            break;
        }
        
        return 0;
    }
}
