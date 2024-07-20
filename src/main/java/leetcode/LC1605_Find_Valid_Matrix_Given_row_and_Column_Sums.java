package leetcode;

public class LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row = rowSum.length;
        int col = colSum.length;

        int[] currentRowSum = new int[row];
        int[] currentColSum = new int[col];

        int[][] originalMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                originalMatrix[i][j] = Math.min(rowSum[i] - currentRowSum[i], colSum[j] - currentColSum[j]);
                currentRowSum[i] += originalMatrix[i][j];
                currentColSum[j] += originalMatrix[i][j];
            }
        }

        return originalMatrix;
    }
}
