package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC1942_The_Number_of_the_Smallest_Unoccupied_Chair {
    public int smallestChair(int[][] times, int targetFriend) {
        Map<Integer, Integer> chairToPerson = new HashMap<>();
        Map<Integer, Integer> personToChair = new HashMap<>();
        PriorityQueue<Integer> chairQueue = new PriorityQueue<>();
        PriorityQueue<int[]> arrivalQueueLowest = new PriorityQueue<>((x, y) -> x[0] - y[0]);
        PriorityQueue<int[]> leavingQueueLowest = new PriorityQueue<>((x, y) -> x[0] - y[0]);

        for (int i = 0; i < times.length; i++) {
            arrivalQueueLowest.add(new int[]{times[i][0], i});
            leavingQueueLowest.add(new int[]{times[i][1], i});
            chairQueue.add(i);
        }

        while (arrivalQueueLowest.size() > 0) {
            int[] arrival = arrivalQueueLowest.peek();
            int[] leaving = leavingQueueLowest.peek();

            if (arrival[0] < leaving[0]) {
                int chairNumber = chairQueue.poll();
                chairToPerson.put(chairNumber, arrival[1]);
                personToChair.put(arrival[1], chairNumber);
                arrivalQueueLowest.poll();
                continue;
            }
            else {
                int chairNumber = personToChair.get(leaving[1]);
                chairToPerson.remove(chairNumber);
                chairQueue.add(chairNumber);
                leavingQueueLowest.poll();
            }
        }

        return personToChair.get(targetFriend);
    }
}
