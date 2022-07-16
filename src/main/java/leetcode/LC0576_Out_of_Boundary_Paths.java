package leetcode;

import java.util.*;

public class LC0576_Out_of_Boundary_Paths {
    private int row;
    private int col;
    private int [][][] dp;

    private int recursive(int y, int x, int moveCount) {
        if (y < 0 || y >= row || x < 0 || x >= col) {
            return 1;
        }

        if (moveCount == 0) {
            return 0;
        }

        if (dp[y][x][moveCount] >= 0) {
            return dp[y][x][moveCount];
        }

        dp[y][x][moveCount] = recursive(y + 1, x, moveCount - 1) % 1000_000_007;
        dp[y][x][moveCount] = (dp[y][x][moveCount] + recursive(y - 1, x, moveCount - 1)) % 1000_000_007;
        dp[y][x][moveCount] = (dp[y][x][moveCount] + recursive(y, x + 1, moveCount - 1)) % 1000_000_007;
        dp[y][x][moveCount] = (dp[y][x][moveCount] + recursive(y, x - 1, moveCount - 1)) % 1000_000_007;

        return dp[y][x][moveCount];
    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        row = m;
        col = n;
        dp = new int[m][n][maxMove + 1];

        for (int[][] i : dp) {
            for (int[] j : i) {
                Arrays.fill(j, -1);
            }
        }

        return recursive(startRow, startColumn, maxMove);
    }
}
