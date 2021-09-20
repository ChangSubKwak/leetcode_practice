package leetcode;

public class LC0200_NumberOfIslands {
	private int count = 0;
	private boolean landVisited;
	private int[][] visited;
	
	public void helper(char[][] grid, int y, int x) {
		if (y < 0 || y >= grid.length || x < 0 || x >= grid[0].length) { 
			return;
		}
		
		if (visited[y][x] > 0) {
			return;
		}
		
		if (grid[y][x] == '0') {
			return;
		}
		
		landVisited = true;
		visited[y][x] = 1;
		
		helper(grid, y - 1, x);
		helper(grid, y + 1, x);
		helper(grid, y, x - 1);
		helper(grid, y, x + 1);
	}
	
    public int numIslands(char[][] grid) {
    	int row = grid.length;
    	int col = grid[0].length;
    	visited = new int[row][col];
    	
    	for (int y = 0; y < row; y++) {
    		for (int x = 0; x < col; x++) {
    	    	landVisited = false;
    	        helper(grid, y, x);
    	        if (landVisited) {
    	        	count++;
    	        }
    		}
    	}

        
        return count;
    }

	public static void main(String[] args) {
		LC0200_NumberOfIslands t = new LC0200_NumberOfIslands();
		
//		char[][] grid = {
//				{ '1', '1', '1', '1', '0' },
//				{ '1', '1', '0', '1', '0' },
//				{ '1', '1', '0', '0', '0' },
//				{ '0', '0', '0', '0', '0' }
//		};
		
		char[][] grid = {
				{ '1', '1', '0', '0', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' }
		};
		
		System.out.println(t.numIslands(grid));
	}
}
