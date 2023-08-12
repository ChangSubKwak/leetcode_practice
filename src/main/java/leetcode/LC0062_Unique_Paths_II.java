package leetcode;


public class LC0062_Unique_Paths_II {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];

        for (int x = 0; x < col; x++) {
            if (obstacleGrid[0][x] == 1) {
                break;
            }
            dp[0][x] = 1;
        }

        for (int y = 0; y < row; y++) {
            if (obstacleGrid[y][0] == 1) {
                break;
            }
            dp[y][0] = 1;
        }

        for (int y = 1; y < row; y++) {
            for (int x = 1; x < col; x++) {
                if (obstacleGrid[y][x] == 1) {
                    continue;
                }

                if (obstacleGrid[y - 1][x] != 1) {
                    dp[y][x] += dp[y - 1][x];
                }

                if (obstacleGrid[y][x - 1] != 1) {
                    dp[y][x] += dp[y][x - 1];
                }
            }
        }

        return dp[row - 1][col - 1];
    }
}
