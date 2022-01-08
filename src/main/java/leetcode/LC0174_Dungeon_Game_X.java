package leetcode;

public class LC0174_Dungeon_Game_X {
    public int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;
        int[][] dp = new int[row+1][col+1];
        
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        dp[row - 1][col] = 1;
        dp[row][col - 1] = 1;
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) - dungeon[i][j];
                dp[i][j] = dp[i][j] <= 0 ? 1 : dp[i][j];
            }
        }
        
        return dp[0][0];
    }
}
