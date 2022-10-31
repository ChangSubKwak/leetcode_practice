package leetcode;

public class LC0766_Toeplitz_Matrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        // from up to down
        for (int y = 0; y < rowCount; y++) {
            int x = 0;
            int value = matrix[y][x];
            while (x < matrix[0].length && y + x < matrix.length) {
                if (matrix[y + x][x] != value) {
                    return false;
                }
                x++;
            }
        }

        // left to right
        for (int x = 0; x < colCount; x++) {
            int y = 0;
            int value = matrix[y][x];
            while (x + y < matrix[0].length && y < matrix.length) {
                if (matrix[y][y + x] != value) {
                    return false;
                }
                y++;
            }
        }

        return true;
    }
}
