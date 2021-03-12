package main.java.leetcode;

public class LC0062_UniquePaths {
	
//	public int move(int y, int x, int m, int n) {
//		if (y > m || x > n) return 0;
//		
//		if (y == m && x == n) {
//			return 1;
//		}
//		
//		int down  = move(y + 1, x, m, n);
//		int right = move(y, x + 1, m, n);
//		
//		return down + right;
//	}
//	
//    public int uniquePaths(int m, int n) {
//    	boolean[][] dp = new boolean[m+1][n+1];
//    	int sum = move(1, 1, m, n);
//    	
//        return sum;
//    }
	
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
		LC0062_UniquePaths t = new LC0062_UniquePaths();
		System.out.println(t.uniquePaths(3, 7));
		System.out.println(t.uniquePaths(3, 2));
		System.out.println(t.uniquePaths(51, 9));
	}
}
