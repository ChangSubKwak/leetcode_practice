package leetcode;

public class LC1254_Number_of_Closed_Islands {
    private boolean recur(int[][] grid, int y, int x) {
        if (y < 0 || y >= grid.length || x < 0 || x >= grid[0].length) {
            return false;
        }

        if (grid[y][x] == 1) {
            return true;
        }

        grid[y][x] = 1;

        boolean result = true;

        result &= recur(grid, y - 1, x);
        result &= recur(grid, y + 1, x);
        result &= recur(grid, y, x - 1);
        result &= recur(grid, y, x + 1);

        return result;
    }

    public int closedIsland(int[][] grid) {
        int count = 0;

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 0 && recur(grid, y, x)) {
                    count++;
                }
            }
        }

        return count;
    }
}
