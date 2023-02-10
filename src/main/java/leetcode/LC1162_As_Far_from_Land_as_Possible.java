package leetcode;

public class LC1162_As_Far_from_Land_as_Possible {

    public int maxDistance(int[][] grid) {
        int length = grid.length;
        for (int y = 0; y < length; y++) {
            for (int x = 0; x < length; x++) {
                if (grid[y][x] == 1) {
                    grid[y][x] = 0;
                    recur(grid, y, x, 1);
                }
            }
        }

        int max = 0;
        for (int y = 0; y < length; y++) {
            for (int x = 0; x < length; x++) {
                max = Math.max(max, grid[y][x]);
            }
        }
        return max == 1 ? -1 : max - 1;
    }

    private void recur(int[][] grid, int y, int x, int distance) {
        if (y < 0 || x < 0 || y >= grid.length || x >= grid.length) {
            return;
        }

        if (grid[y][x] != 0 && grid[y][x] <= distance) {
            return;
        }

        grid[y][x] = distance;

        recur(grid, y - 1, x, distance + 1);
        recur(grid, y + 1, x, distance + 1);
        recur(grid, y, x - 1, distance + 1);
        recur(grid, y, x + 1, distance + 1);

    }
}
