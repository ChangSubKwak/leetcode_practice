package leetcode;

import java.util.*;

public class LC1129_Shortest_Path_with_Alternating_Colors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Set<Integer>[][] graph = new HashSet[2][n];
        for (int i = 0; i < n; i++) {
            graph[0][i] = new HashSet<>();
            graph[1][i] = new HashSet<>();
        }

        for (int [] redEdge : redEdges) {
            graph[0][redEdge[0]].add(redEdge[1]);
        }

        for (int [] blueEdge : blueEdges) {
            graph[1][blueEdge[0]].add(blueEdge[1]);
        }

        int[][] result = new int[2][n];
        for (int i = 1; i < n; i++) {
            result[0][i] = 2 * n;
            result[1][i] = 2 * n;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        queue.offer(new int[]{0, 1});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int vertex = current[0];
            int color  = current[1];

            for (int next : graph[1 - color][vertex]) {
                if (result[1 - color][next] == 2 * n) {
                    result[1 - color][next] = 1 + result[color][vertex];
                    queue.offer(new int[]{ next, 1 - color});
                }
            }
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int minimum = Math.min(result[0][i], result[1][i]);
            answer[i] = (minimum == 2 * n) ? -1 : minimum;
        }

        return answer;
    }
}
