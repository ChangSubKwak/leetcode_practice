package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC1834_Single_Threaded_CPU {
    public int[] getOrder(int[][] tasks) {
        Map<int[], Integer> map = new HashMap<>();
        for (int j = 0; j < tasks.length; j++) {
            map.put(tasks[j], j);
        }

        Arrays.sort(tasks, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return a[1] != b[1] ? a[1] - b[1] : map.get(a) - map.get(b);
        });

        int i = 0;
        int addCount = 0;
        int time = tasks[i][0];
        for (int j = 0; j < tasks.length; j++) {
            if (time >= tasks[j][0]) {
                pq.add(tasks[j]);
                addCount++;
                continue;
            }
            break;
        }

        int[] result = new int[tasks.length];
        while (i < tasks.length && pq.size() > 0) {
            int[] task = pq.remove();
            time = Math.max(time + task[1], task[1] + task[0]);
            result[i] = map.get(task);
            i++;

            for (int j = addCount; j < tasks.length; j++) {
                if (pq.size() == 0 || time >= tasks[j][0]) {
                    pq.add(tasks[j]);
                    addCount++;
                    continue;
                }
                break;
            }
        }

        return result;
    }
}
