package leetcode;

import java.util.*;

public class LC2328_Number_of_Increasing_Paths_in_a_Grid {
    static class Info {
        public int value;
        public int y;
        public int x;

        public Info(int value, int y, int x) {
            this.value = value;
            this.y = y;
            this.x = x;
        }

        public String toString() {
            return "[" + value + " = (" + y + ", " + x + ")]";
        }
    }

    public int countPaths(int[][] grid) {
        long mod = 1000_000_007L;
        int row = grid.length;
        int col = grid[0].length;

        long[][] dp = new long[row][col];
        for (int i = 0; i < row; i++) {
            Arrays.fill(dp[i], 1);
        }

        List<Info> list = new ArrayList<>();
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                list.add(new Info(grid[y][x], y, x));
            }
        }
        Collections.sort(list, (a, b) -> a.value - b.value);

        for (Info info : list) {
            // int value = info.value;
            int y = info.y;
            int x = info.x;

            if (x - 1 >= 0 && grid[y][x] < grid[y][x - 1]) {
                dp[y][x - 1] += dp[y][x];
                dp[y][x - 1] %= mod;
            }

            if (x + 1 < col && grid[y][x] < grid[y][x + 1]) {
                dp[y][x + 1] += dp[y][x];
                dp[y][x + 1] %= mod;
            }

            if (y - 1 >= 0 && grid[y][x] < grid[y - 1][x]) {
                dp[y - 1][x] += dp[y][x];
                dp[y - 1][x] %= mod;
            }

            if (y + 1 < row && grid[y][x] < grid[y + 1][x]) {
                dp[y + 1][x] += dp[y][x];
                dp[y + 1][x] %= mod;
            }
        }

        long sum = 0;
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                sum += dp[y][x];
                sum %= mod;
            }
        }

        return (int)sum;
    }
}
