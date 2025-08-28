package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC3446_Sort_Matrix_by_Diagonals {
    public int[][] sortMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int startRow = row - 2; startRow >= 0; startRow--) {
            int y = startRow;
            int x = 0;

            List<Integer> diagonal = new ArrayList<>();
            while (y <= row - 1 && x <= col -1) {
                diagonal.add(grid[y][x]);
                y++;
                x++;
            }
            Collections.sort(diagonal, Collections.reverseOrder());

            y = startRow;
            x = 0;
            while (y <= row - 1 && x <= col -1) {
                grid[y][x] = diagonal.get(x);
                y++;
                x++;
            }
        }

        for (int startCol = 1; startCol <= col - 1; startCol++) {
            int y = 0;
            int x = startCol;

            List<Integer> diagonal = new ArrayList<>();
            while (y <= row - 1 && x <= col -1) {
                diagonal.add(grid[y][x]);
                y++;
                x++;
            }
            Collections.sort(diagonal);

            y = 0;
            x = startCol;
            while (y <= row - 1 && x <= col -1) {
                grid[y][x] = diagonal.get(y);
                y++;
                x++;
            }
        }

        return grid;
    }
}
