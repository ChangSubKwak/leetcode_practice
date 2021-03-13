package leetcode;

public class LC0064_MinimumPathSum {
	
    public int minPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        int[][] dp = new int[r][c];
        for (int y = 0 ; y < r ; y++)
        	for (int x = 0 ; x < c ; x++)
        		dp[y][x] = 20000;
        
        dp[0][0] = grid[0][0];
        for (int y = 0 ; y < r ; y++) {
        	for (int x = 0 ; x < c ; x++) {
        		int val1 = 20000;
        		if (x > 0) val1 = dp[y][x-1] + grid[y][x];
        		dp[y][x] = Math.min(dp[y][x], val1);
        		
        		int val2 = 20000;
        		if (y > 0) val2 = dp[y-1][x] + grid[y][x];
        		dp[y][x] = Math.min(dp[y][x], val2);
        	}
        }
        
        return dp[r-1][c-1];
    }
	
	public static void main(String[] args) {
		LC0064_MinimumPathSum t = new LC0064_MinimumPathSum();
//		System.out.println(t.minPathSum(new int[][] {{1,3,1},{1,5,1},{4,2,1}}));
		System.out.println(t.minPathSum(new int[][] {{1,2,3},{4,5,6}}));
		System.out.println(t.minPathSum(new int[][] {{0}}));
		System.out.println(t.minPathSum(new int[][] {
			{3,8,6,0,5,9,9,6,3,4,0,5,7,3,9,3},
			{0,9,2,5,5,4,9,1,4,6,9,5,6,7,3,2},
			{8,2,2,3,3,3,1,6,9,1,1,6,6,2,1,9},
			{1,3,6,9,9,5,0,3,4,9,1,0,9,6,2,7},
			{8,6,2,2,1,3,0,0,7,2,7,5,4,8,4,8},
			{4,1,9,5,8,9,9,2,0,2,5,1,8,7,0,9},
			{6,2,1,7,8,1,8,5,5,7,0,2,5,7,2,1},
			{8,1,7,6,2,8,1,2,2,6,4,0,5,4,1,3},
			{9,2,1,7,6,1,4,3,8,6,5,5,3,9,7,3},
			{0,6,0,2,4,3,7,6,1,3,8,6,9,0,0,8},
			{4,3,7,2,4,3,6,4,0,3,9,5,3,6,9,3},
			{2,1,8,8,4,5,6,5,8,7,3,7,7,5,8,3},
			{0,7,6,6,1,2,0,3,5,0,8,0,8,7,4,3},
			{0,4,3,4,9,0,1,9,7,7,8,6,4,6,9,5},
			{6,5,1,9,9,2,2,7,4,2,7,2,2,3,7,2},
			{7,1,9,6,1,2,7,0,9,6,6,4,4,5,1,0},
			{3,4,9,2,8,3,1,2,6,9,7,0,2,4,2,0},
			{5,1,8,8,4,6,8,5,2,4,1,6,2,2,9,7}}));
	}
	
}
