package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC1260_Shift_2D_Grid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        
        if (k == 0) {
            return Arrays.stream(grid)
                .map(i -> Arrays.stream(i).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());
        }
        
        int[][] temp = new int[row][col];
        
        for (int i = 0; i < k; i++) {
            for (int y = 0; y < row; y++) {
                for (int x = 0; x < col - 1; x++) {
                    temp[y][x + 1] = grid[y][x];
                }
            }

            for (int y = 0; y < row - 1; y++) {
                temp[y + 1][0] = grid[y][col - 1];
            }

            temp[0][0] = grid[row - 1][col - 1];

            grid = Arrays.stream(temp)
                .map(int[]::clone)
                .toArray(int[][]::new);
        }
        
        return Arrays.stream(temp)
            .map(i -> Arrays.stream(i).boxed().collect(Collectors.toList()))
            .collect(Collectors.toList());
    }
}
