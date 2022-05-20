package leetcode;

public class LC0063_Unique_Paths_II {
    private int row;
    private int col;
    private int[][] dp;
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        row = obstacleGrid.length;
        col = obstacleGrid[0].length;
        dp = new int[row][col];
        
        if (obstacleGrid[row-1][col-1] == 1) {
            return 0;
        }
        
        for (int y = 0; y < row; y++) {
            if (obstacleGrid[y][0] == 1) {
                break;
            }
            dp[y][0] = 1;
        }
        
        for (int x = 0; x < col; x++) {
            if (obstacleGrid[0][x] == 1) {
                break;
            }
            dp[0][x] = 1;
        }
        
        for (int y = 1; y < row; y++) {
            for (int x = 1; x < col; x++) {
                int sum = 0;
                if (obstacleGrid[y-1][x] != 1) {
                    sum += dp[y-1][x];
                }
                
                if (obstacleGrid[y][x-1] != 1) {
                    sum += dp[y][x-1];
                }
                
                dp[y][x] =  sum;
            }
        }
        
        return dp[row - 1][col - 1];
    }
	
	// #1
    /*
	public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if (obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1) return 0;
		
		int[][] dp = new int[m+1][n+1];
		for (int i = 1 ; i <= m ; i++) {
			if (obstacleGrid[i-1][0] == 1) break;
			dp[i][1] = 1;
		}
		for (int i = 1 ; i <= n ; i++) {
			if (obstacleGrid[0][i-1] == 1) break;
			dp[1][i] = 1;
		}
		
		for (int y = 2 ; y <= m ; y++) {
			for (int x = 2 ; x <= n ; x++) {
				if (obstacleGrid[y-1][x-1] == 1) continue;
				
				int val1 = dp[y-1][x];
				if (obstacleGrid[y-2][x-1] == 1) val1 = 0;
				
				int val2 = dp[y][x-1];
				if (obstacleGrid[y-1][x-2] == 1) val2 = 0;
					
				dp[y][x] = val1 + val2;
			}
		}

		return dp[m][n];
	}
	//*/
}
