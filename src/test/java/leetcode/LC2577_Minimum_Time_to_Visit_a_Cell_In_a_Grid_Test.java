package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2577_Minimum_Time_to_Visit_a_Cell_In_a_Grid_Test {
    @Test
    void test() {
        LC2577_Minimum_Time_to_Visit_a_Cell_In_a_Grid test = new LC2577_Minimum_Time_to_Visit_a_Cell_In_a_Grid();

        assertThat(test.minimumTime(new int[][]{
            {0, 1, 3, 2}, {5, 1, 2, 5}, {4, 3, 8, 6}
        })).isEqualTo(7);

        assertThat(test.minimumTime(new int[][]{
            {0, 2, 4}, {3, 2, 1}, {1, 0, 4}
        })).isEqualTo(-1);
    }
}
