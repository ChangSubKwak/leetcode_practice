package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3362_Zero_Array_Transformation_III_Test {
    @Test
    void test() {
        LC3362_Zero_Array_Transformation_III test = new LC3362_Zero_Array_Transformation_III();

        assertThat(test.maxRemoval(new int[]{2, 0, 2}, new int[][]{{0, 2}, {0, 2}, {1, 1}})).isEqualTo(1);
        assertThat(test.maxRemoval(new int[]{1, 1, 1, 1}, new int[][]{{1, 3}, {0, 2}, {1, 3}, {1, 2}})).isEqualTo(2);
        assertThat(test.maxRemoval(new int[]{1, 2, 3, 4}, new int[][]{{0, 3}})).isEqualTo(-1);
    }
}
