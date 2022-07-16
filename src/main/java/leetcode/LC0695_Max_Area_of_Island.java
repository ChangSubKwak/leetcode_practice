package leetcode;

public class LC0695_Max_Area_of_Island {
    private boolean[][] isVisited;
    private int row;
    private int col;
    private int max;

    private int recursive(int[][] grid, int y, int x, int count) {
        if (y < 0 || y >= row || x < 0 || x >= col || grid[y][x] == 0 || isVisited[y][x]) {
            return 0;
        }

        isVisited[y][x] = true;
        return 1 + recursive(grid, y + 1, x, count + 1) + recursive(grid, y - 1, x, count + 1)
            + recursive(grid, y, x + 1, count + 1) + recursive(grid, y, x - 1, count + 1);
    }

    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;

        max = 0;
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                isVisited = new boolean[row][col];
                max = Math.max(max, recursive(grid, y, x, 0));
            }
        }
        return max;
    }
}
