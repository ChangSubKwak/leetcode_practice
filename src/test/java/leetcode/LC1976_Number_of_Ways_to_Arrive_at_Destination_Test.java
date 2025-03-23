package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1976_Number_of_Ways_to_Arrive_at_Destination_Test {
    @Test
    void exampleTest() {
        LC1976_Number_of_Ways_to_Arrive_at_Destination test = new LC1976_Number_of_Ways_to_Arrive_at_Destination();

        assertThat(test.countPaths(7, new int[][]{
                {0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3},
                {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}
        })).isEqualTo(4);
        assertThat(test.countPaths(2, new int[][]{{1, 0, 10}})).isEqualTo(1);
    }
}
