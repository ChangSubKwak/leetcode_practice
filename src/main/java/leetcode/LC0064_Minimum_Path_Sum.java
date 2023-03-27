package leetcode;

public class LC0064_Minimum_Path_Sum {
    private int[][] min;

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        min = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                min[i][j] = Integer.MAX_VALUE;
            }
        }

        min[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            min[i][0] = min[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < col; i++) {
            min[0][i] = min[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                min[i][j] = Math.min(min[i - 1][j], min[i][j - 1]) + grid[i][j];
            }
        }

        return min[row - 1][col - 1];
    }
}
