package leetcode;

public class LC0059_Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int count = 0;
        int limit = n * n;
        int row = n;
        int col = n;
        boolean[][] visit = new boolean[row][col];
        
        int direction = 0;
        int y = 0;
        int x = 0;
        while (count < limit) {
            // rewind position and change direction
            if (y < 0 || x < 0 || y >= row || x >= col || visit[y][x]) {
                if (direction == 0) { x--; y++; }
                if (direction == 1) { y--; x--; }
                if (direction == 2) { x++; y--; }
                if (direction == 3) { y++; x++; }
                direction = (direction + 1) % 4;
                continue;
            }
            
            // check visit
            visit[y][x] = true;
            matrix[y][x] = count + 1;
            
            if (direction == 0) { x++; }
            if (direction == 1) { y++; }
            if (direction == 2) { x--; }
            if (direction == 3) { y--; }
            
            count++;
        }
        
        return matrix;
    }
}
