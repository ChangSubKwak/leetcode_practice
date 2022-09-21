package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC0985_Sum_of_Even_Numbers_After_Queries_Test {
    LC0985_Sum_of_Even_Numbers_After_Queries test = new LC0985_Sum_of_Even_Numbers_After_Queries();
    @Test
    void test() {
        assertThat(test.sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1, 0},{-3, 1}, {-4, 0}, {2, 3}})).isEqualTo(new int[]{8, 6, 2, 4});
        assertThat(test.sumEvenAfterQueries(new int[]{1}, new int[][]{{4, 0}})).isEqualTo(new int[]{0});
    }
}