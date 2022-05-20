package leetcode;

public class LC0063_Unique_Paths_II {
    private int total;
    private int row;
    private int col;
    
    private void recursive(int[][] obstacleGrid, int y, int x) {
        if (y < 0 || x < 0 || y >= row || x >= col || obstacleGrid[y][x] == 1) {
            return;
        }
        
        if (y == row - 1 && x == col - 1) {
            total++;
            return;
        }
        
        recursive(obstacleGrid, y + 1, x);
        recursive(obstacleGrid, y, x + 1);
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        total = 0;
        row = obstacleGrid.length;
        col = obstacleGrid[0].length;
        recursive(obstacleGrid, 0, 0);
        
        return total;
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
	
	public static void main(String[] args) {
		LC0063_Unique_Paths_II t = new LC0063_Unique_Paths_II();
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,0,0},{0,1,0},{0,0,0}}));
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,1},{0,0}}));
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,0},{0,1}}));
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,0},{1,1},{0,0}}));
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,1,0,0,0},{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}}));
		
	}
}
