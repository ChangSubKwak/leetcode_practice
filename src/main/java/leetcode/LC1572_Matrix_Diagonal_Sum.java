package leetcode;

public class LC1572_Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int rowSize = mat.length;
        int colSize = mat[0].length;

        int sum = 0;
        for (int y = 0, x = 0; y < rowSize; y++, x++) {
            sum +=mat[y][x];
        }

        for (int y = 0, x = colSize - 1; y < rowSize; y++, x--) {
            sum +=mat[y][x];
        }

        if (rowSize % 2 == 1) {
            sum -= mat[rowSize / 2][rowSize / 2];
        }

        return sum;
    }
}
