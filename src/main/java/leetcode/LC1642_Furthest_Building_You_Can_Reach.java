package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LC1642_Furthest_Building_You_Can_Reach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int length = heights.length;
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    
        for (int i = 1; i < length; i++) {
            int diff = heights[i - 1] - heights[i];
            if (diff < 0) {
                bricks -= Math.abs(diff);
                priorityQueue.add(Math.abs(diff));
            }
        
            if (bricks < 0) {
                if (ladders == 0) {
                    return i - 1;
                }
            
                ladders--;
                bricks += priorityQueue.poll();
            }
        }
        return length - 1;
    }
}
