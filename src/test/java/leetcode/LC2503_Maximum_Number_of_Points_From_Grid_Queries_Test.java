package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2503_Maximum_Number_of_Points_From_Grid_Queries_Test {
    @Test
    void test() {
        LC2503_Maximum_Number_of_Points_From_Grid_Queries test = new LC2503_Maximum_Number_of_Points_From_Grid_Queries();

        assertThat(test.maxPoints(new int[][]{{1, 2, 3}, {2, 5, 7}, {3, 5, 1}}, new int[]{5, 6, 2})).isEqualTo(new int[]{5, 8, 1});
        assertThat(test.maxPoints(new int[][]{{5, 2, 1}, {1, 1, 2}}, new int[]{3})).isEqualTo(new int[]{0});
    }
}
