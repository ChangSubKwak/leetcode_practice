package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums_Test {

    @Test
    void test1() {
        LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums test = new LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums();

        int[][] result = test.restoreMatrix(new int[]{3, 8}, new int[]{4, 7});
        int[] rowSum = rowSum(result);
        int[] columnSum = columnSum(result);

        assertThat(rowSum).isEqualTo(new int[]{3, 8});
        assertThat(columnSum).isEqualTo(new int[]{4, 7});
    }

    @Test
    void test2() {
        LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums test = new LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums();

        int[][] result = test.restoreMatrix(new int[]{5, 7, 10}, new int[]{8, 6, 8});
        int[] rowSum = rowSum(result);
        int[] columnSum = columnSum(result);

        assertThat(rowSum).isEqualTo(new int[]{5, 7, 10});
        assertThat(columnSum).isEqualTo(new int[]{8, 6, 8});
    }

    private int[] rowSum(int[][] matrix) {
        int[] sum = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int partSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                partSum += matrix[i][j];
            }
            sum[i] = partSum;
        }

        return sum;
    }

    private int[] columnSum(int[][] matrix) {
        int[] sum = new int[matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            int partSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                partSum += matrix[j][i];
            }
            sum[i] = partSum;
        }

        return sum;
    }

}
