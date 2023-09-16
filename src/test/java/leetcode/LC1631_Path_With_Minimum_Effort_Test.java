package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1631_Path_With_Minimum_Effort_Test {
    @Test
    void test() {
        // minimumEffortPath
        LC1631_Path_With_Minimum_Effort test = new LC1631_Path_With_Minimum_Effort();
        assertThat(test.minimumEffortPath(new int[][]{
            {1, 2, 2},
            {3, 8, 2},
            {5, 3, 5}
        })).isEqualTo(2);

        assertThat(test.minimumEffortPath(new int[][]{
            {1, 2, 3},
            {3, 8, 4},
            {5, 3, 5}
        })).isEqualTo(1);

        assertThat(test.minimumEffortPath(new int[][]{
            {1, 2, 1, 1, 1},
            {1, 2, 1, 2, 1},
            {1, 2, 1, 2, 1},
            {1, 2, 1, 2, 1},
            {1, 1, 1, 2, 1},
        })).isEqualTo(0);
    }
}
