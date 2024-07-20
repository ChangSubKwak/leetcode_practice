package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums_Test {
    @Test
    void test() {
        LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums test = new LC1605_Find_Valid_Matrix_Given_row_and_Column_Sums();
        assertThat(test.restoreMatrix(new int[]{3, 8}, new int[]{4, 7})).isEqualTo(new int[][]{
            {3, 0},
            {1, 7}
        });

        assertThat(test.restoreMatrix(new int[]{5, 7, 10}, new int[]{8, 6, 8})).isEqualTo(new int[][]{
            {0, 5, 0},
            {6, 1, 0},
            {2, 0, 8}
        });
    }
}
