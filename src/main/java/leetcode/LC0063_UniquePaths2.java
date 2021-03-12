package main.java.leetcode;

public class LC0063_UniquePaths2 {
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
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
	
	public static void main(String[] args) {
		LC0063_UniquePaths2 t = new LC0063_UniquePaths2();
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,0,0},{0,1,0},{0,0,0}}));
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,1},{0,0}}));
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,0},{0,1}}));
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,0},{1,1},{0,0}}));
		System.out.println(t.uniquePathsWithObstacles(new int[][] {{0,1,0,0,0},{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}}));
		
	}
}
