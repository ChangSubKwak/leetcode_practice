package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0054_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int limit = matrix.length * matrix[0].length;
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] visit = new boolean[row][col];

        int direction = 0;
        int y = 0;
        int x = 0;
        while (count < limit) {

            // rewind position and change direction
            if (y < 0 || x < 0 || y >= row || x >= col || visit[y][x]) {
                if (direction == 0) { x--; y++; }
                if (direction == 1) { y--; x--; }
                if (direction == 2) { x++; y--; }
                if (direction == 3) { y++; x++; }
                direction = (direction + 1) % 4;
                continue;
            }

            // check visit
            visit[y][x] = true;
            result.add(matrix[y][x]);

            if (direction == 0) { x++; }
            if (direction == 1) { y++; }
            if (direction == 2) { x--; }
            if (direction == 3) { y--; }

            count++;
        }

        return result;
    }
}
