package leetcode;

import java.util.*;

public class LC1466_Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> adjacent = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacent.add(new ArrayList<>());
        }

        for (int[] connection : connections) {
            adjacent.get(connection[0]).add(connection[1]);
            adjacent.get(connection[1]).add(-connection[0]);
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (int nextNode : adjacent.get(Math.abs(currentNode))) {
                if (!visited[Math.abs(nextNode)]) {
                    queue.add(nextNode);
                    visited[Math.abs(nextNode)] = true;
                    if (nextNode > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}