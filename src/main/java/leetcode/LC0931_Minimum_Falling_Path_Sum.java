package leetcode;

public class LC0931_Minimum_Falling_Path_Sum {
    private int[][] dp;

    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        dp = new int[row][col];
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                dp[y][x] = Integer.MAX_VALUE;
            }
        }

        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                if (y == 0) {
                    dp[y][x] = matrix[y][x];
                    continue;
                }

                int localMin = Integer.MAX_VALUE;
                if (x >= 1) {
                    localMin = Math.min(localMin, matrix[y][x] + dp[y - 1][x - 1]);
                }

                localMin = Math.min(localMin, matrix[y][x] + dp[y - 1][x]);

                if (x <= col - 2) {
                    localMin = Math.min(localMin, matrix[y][x] + dp[y - 1][x + 1]);
                }

                dp[y][x] = Math.min(dp[y][x], localMin);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int x = 0; x < col; x++) {
            min = Math.min(min, dp[row - 1][x]);
        }

        return min;
    }
}
