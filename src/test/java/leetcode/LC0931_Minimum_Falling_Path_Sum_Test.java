package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC0931_Minimum_Falling_Path_Sum_Test {
    @Test
    void test() {
        LC0931_Minimum_Falling_Path_Sum test = new LC0931_Minimum_Falling_Path_Sum();
        assertThat(test.minFallingPathSum(new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}})).isEqualTo(13);
        assertThat(test.minFallingPathSum(new int[][]{{-19, 57}, {-40, -5}})).isEqualTo(-59);
    }
}
