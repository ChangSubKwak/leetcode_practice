package leetcode;

public class LC0329_Longest_Increasing_Path_in_a_Matrix_X {
    public static final int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length == 0) {
            return 0;
        }
        
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int[][] cache = new int[rowSize][colSize];
        
        int max = 1;
        for(int y = 0; y < rowSize; y++) {
            for(int x = 0; x < colSize; x++) {
                int len = dfs(matrix, y, x, rowSize, colSize, cache);
                max = Math.max(max, len);
            }
        }   
        return max;
    }

    public int dfs(int[][] matrix, int y, int x, int rowSize, int colSize, int[][] cache) {
        if (cache[y][x] != 0) {
            return cache[y][x];
        }
        
        int max = 1;
        for(int[] dir: dirs) {
            int nextY = y + dir[0];
            int nextX = x + dir[1];
            
            if (nextY < 0 || nextY >= rowSize || nextX < 0 || nextX >= colSize || matrix[nextY][nextX] <= matrix[y][x]) {
                continue;
            }
            
            int len = 1 + dfs(matrix, nextY, nextX, rowSize, colSize, cache);
            max = Math.max(max, len);
        }
        cache[y][x] = max;
        return max;
    }	
}
