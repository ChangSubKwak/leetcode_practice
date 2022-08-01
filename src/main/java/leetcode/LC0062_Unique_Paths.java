package leetcode;

public class LC0062_Unique_Paths {
	
	public int uniquePaths(int m, int n) {
		int[][] dp = new int[m+1][n+1];
		for (int i = 1 ; i <= m ; i++) dp[i][1] = 1;
		for (int i = 1 ; i <= n ; i++) dp[1][i] = 1;
		
		for (int y = 2 ; y <= m ; y++) {
			for (int x = 2 ; x <= n ; x++) {
				dp[y][x] = dp[y-1][x] + dp[y][x-1];
			}
		}

		return dp[m][n];
	}
	
	public static void main(String[] args) {
		LC0062_Unique_Paths t = new LC0062_Unique_Paths();
		System.out.println(t.uniquePaths(3, 7));
		System.out.println(t.uniquePaths(3, 2));
		System.out.println(t.uniquePaths(51, 9));
	}
}
