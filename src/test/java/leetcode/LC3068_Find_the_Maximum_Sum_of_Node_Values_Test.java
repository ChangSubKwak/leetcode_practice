package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3068_Find_the_Maximum_Sum_of_Node_Values_Test {
    @Test
    void test() {
        LC3068_Find_the_Maximum_Sum_of_Node_Values test = new LC3068_Find_the_Maximum_Sum_of_Node_Values();

        assertThat(test.maximumValueSum(new int[]{1, 2, 1}, 3, new int[][]{{0, 1}, {0, 2}})).isEqualTo(6);
        assertThat(test.maximumValueSum(new int[]{2, 3}, 7, new int[][]{{0, 1}})).isEqualTo(6);
        assertThat(test.maximumValueSum(new int[]{7, 7, 7, 7, 7, 7}, 3, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}})).isEqualTo(42);
    }
}
