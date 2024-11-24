package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1975_Maximum_Matrix_Sum_Test {
    @Test
    void exampleTest() {
        LC1975_Maximum_Matrix_Sum test = new LC1975_Maximum_Matrix_Sum();
        assertThat(test.maxMatrixSum(new int[][] {{1, -1}, {1, -1}})).isEqualTo(4);
        assertThat(test.maxMatrixSum(new int[][] {{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}})).isEqualTo(16);
    }
}
