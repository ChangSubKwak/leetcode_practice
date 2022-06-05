package leetcode;

public class LC0304_Range_Sum_Query_2D_Immutable {
    private int[][] rowSum;
    private int rowCount;
    private int colCount;
    
    //public NumMatrix(int[][] matrix) {
    public LC0304_Range_Sum_Query_2D_Immutable(int[][] matrix) {
        rowCount = matrix.length;
        colCount = matrix[0].length;
        rowSum = new int[rowCount][colCount];
        for (int y = 0; y < rowCount; y++) {
            for (int x = 0; x < colCount; x++) {
                if (x == 0) {
                    rowSum[y][x] = matrix[y][x];
                    continue;
                }
                rowSum[y][x] = rowSum[y][x-1] + matrix[y][x];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int y = row1; y <= row2; y++) {
            if (col1 != 0) {
                sum += rowSum[y][col2] - rowSum[y][col1 - 1];
                continue;
            }
            sum += rowSum[y][col2];
        }
        return sum;
    }
}
