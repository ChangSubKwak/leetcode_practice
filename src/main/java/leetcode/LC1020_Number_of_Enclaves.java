package leetcode;

public class LC1020_Number_of_Enclaves {
    private int total;
    private int count;

    private boolean recur(int[][] grid, int y, int x) {
        if (y < 0 || y >= grid.length || x < 0 || x >= grid[0].length) {
            return false;
        }

        if (grid[y][x] == 0) {
            return true;
        }

        grid[y][x] = 0;
        count++;

        boolean result = true;
        result &= recur(grid, y - 1, x    );
        result &= recur(grid, y + 1, x    );
        result &= recur(grid, y    , x - 1);
        result &= recur(grid, y    , x + 1);

        return result;
    }

    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        total = 0;
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                count = 0;
                if (grid[y][x] == 1 && recur(grid, y, x)) {
                    total += count;
                }
            }
        }
        return total;
    }
}
