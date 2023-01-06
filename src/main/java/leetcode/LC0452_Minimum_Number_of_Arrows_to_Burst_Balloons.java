package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LC0452_Minimum_Number_of_Arrows_to_Burst_Balloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> {
           if (a[1] == b[1])  {
               return Integer.compare(a[0], b[0]);
           }
           return Integer.compare(a[1], b[1]);
        });

        Queue<int[]> list = new LinkedList<>();
        for (int[] point : points) {
            list.add(point);
        }

        int count = 0;
        while (list.size() > 0) {
            int[] currentPoint = list.peek();
            count++;
            while (list.size() > 0) {
                int nextStart = list.peek()[0];
                if (currentPoint[1] >= nextStart) {
                    list.poll();
                    continue;
                }
                break;
            }
        }

        return count;
    }
}
