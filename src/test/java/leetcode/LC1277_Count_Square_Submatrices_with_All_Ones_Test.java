package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1277_Count_Square_Submatrices_with_All_Ones_Test {
    
    @Test
    void test() {
        LC1277_Count_Square_Submatrices_with_All_Ones test = new LC1277_Count_Square_Submatrices_with_All_Ones();

        assertThat(test.countSquares(new int[][]{
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 1, 1, 1},
        })).isEqualTo(15);

        assertThat(test.countSquares(new int[][]{
            {1, 0, 1},
            {1, 1, 0},
            {1, 1, 0},
        })).isEqualTo(7);

    }
}
