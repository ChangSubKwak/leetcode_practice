package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LC0542_01_Matrix {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Queue<Integer> queue = new LinkedList<>();
        int[][] result = new int[row][col];

        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                result[y][x] = -1;
                if (mat[y][x] == 0) {
                    result[y][x] = 0;
                    queue.add(y);
                    queue.add(x);
                }
            }
        }

        int distance = 1;
        while (!queue.isEmpty()) {
            int queueSize = queue.size() / 2;
            for (int i = 0; i < queueSize; i++) {
                int y = queue.poll();
                int x = queue.poll();

                if (y > 0 && result[y - 1][x] == -1) {
                    result[y - 1][x] = distance;
                    queue.add(y - 1);
                    queue.add(x);
                }

                if (y + 1 < mat.length && result[y + 1][x] == -1) {
                    result[y + 1][x] = distance;
                    queue.add(y + 1);
                    queue.add(x);
                }

                if (x > 0 && result[y][x - 1] == -1) {
                    result[y][x - 1] = distance;
                    queue.add(y);
                    queue.add(x - 1);
                }

                if (x + 1 < mat[0].length && result[y][x + 1] == -1) {
                    result[y][x + 1] = distance;
                    queue.add(y);
                    queue.add(x + 1);
                }
            }
            distance++;
        }

        return result;
    }
}
