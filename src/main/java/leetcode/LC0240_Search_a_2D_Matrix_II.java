package leetcode;

public class LC0240_Search_a_2D_Matrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int y = 0; y < row; y++) {
            if (!(matrix[y][0] <= target && target <= matrix[y][col - 1])) {
                continue;
            }

            for (int x = 0; x < col; x++) {
                if (matrix[y][x] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
