package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0064_Minimum_Path_Sum_Test {
    @Test
    void test() {
        LC0064_Minimum_Path_Sum test = new LC0064_Minimum_Path_Sum();

        assertThat(test.minPathSum(new int [][]{
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        })).isEqualTo(7);

        assertThat(test.minPathSum(new int [][]{
            {1, 2, 3},
            {4, 5, 6}
        })).isEqualTo(12);
    }
}
