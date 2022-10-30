package leetcode;

import java.util.*;

public class LC1293_Shortest_Path_in_a_Grid_with_Obstacles_Elimination_X {
    public int shortestPath(int[][] grid, int k) {
        int[] dirs = {0, 1, 0, -1, 0};
        int rowLength = grid.length, colLength = grid[0].length;
        if (k >= rowLength + colLength - 2) {
            return rowLength + colLength - 2;
        }

        boolean[][][] visited = new boolean[rowLength][colLength][k + 1];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, k, 0});
        visited[0][0][k] = true;

        while (!q.isEmpty()) {
            int[] top = q.poll();
            int row = top[0], col = top[1], currentKValue = top[2], distance = top[3];

            if (row == rowLength - 1 && col == colLength - 1) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = row + dirs[i];
                int newCol = col + dirs[i + 1];
                if (newRow < 0 || newRow >= rowLength || newCol < 0 || newCol >= colLength) {
                    continue;
                }

                int newKValue = currentKValue - grid[newRow][newCol];
                if (newKValue >= 0 && !visited[newRow][newCol][newKValue]) {
                    visited[newRow][newCol][newKValue] = true;
                    q.offer(new int[]{newRow, newCol, newKValue, distance + 1});
                }
            }
        }

        return -1;
    }
}
