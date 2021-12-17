package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class LC0135_Candy_X {
    private int getCell(int y, int x) {
        if (x < 0 || y < 0) {
            return 0;
        }
        
        return dp[y][x];
    }
    
    private int row;
    private int col;
    private int[][] dp;
    private int maxEdge;
    
    public int maximalSquare(char[][] matrix) {
        row = matrix.length;
        col = matrix[0].length;
        dp = new int[row][col];
        maxEdge = 0;
        
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                if (matrix[y][x] == '1') {
                    dp[y][x] = Collections.min(Arrays.asList(getCell(y - 1, x), getCell(y, x - 1), getCell(y - 1, x - 1))) + 1;
                    maxEdge = Math.max(maxEdge, dp[y][x]);
                }
            }
        }
        
        return maxEdge * maxEdge;
    }
}
