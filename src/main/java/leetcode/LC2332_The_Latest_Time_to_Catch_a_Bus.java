package leetcode;

import java.util.*;
import java.util.stream.*;

public class LC2332_The_Latest_Time_to_Catch_a_Bus {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        List<Integer> pList = Arrays.stream(passengers)
            .boxed()
            .collect(Collectors.toList());

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            Arrays.stream(passengers)
                .boxed()
                .collect(Collectors.toList())
        );

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < buses.length; i++) {
            int limit = buses[i];
            List<Integer> temp = new ArrayList<>();
            map.put(limit, temp);
            for (int j = 0; pq.size() > 0 && j < capacity; j++) {
                int peekNum = pq.peek();
                if (peekNum <= limit) {
                    temp.add(peekNum);
                    pq.poll();
                    continue;
                }
                break;
            }
        }

        List<Integer> list = map.get(buses[buses.length - 1]);
        if (list.size() == capacity) {
            int temp = list.get(capacity - 1) - 1;
            while(pList.contains(temp)) {
                temp--;
            }

            return temp;
        }

        if (list.size() == 0) {
            return buses[buses.length - 1];
        }

        if (buses[buses.length - 1] == list.get(0)) {
            return buses[buses.length - 1] - 1;
        }

        return buses[buses.length - 1];
    }
}
