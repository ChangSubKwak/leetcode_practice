package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1254_Number_of_Closed_Islands_Test {
    
    @Test
    void test() {
        LC1254_Number_of_Closed_Islands test = new LC1254_Number_of_Closed_Islands();
        assertThat(test.closedIsland(new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0, 1, 1, 0},
            {1, 0, 1, 0, 1, 1, 1, 0},
            {1, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 0}
        })).isEqualTo(2);

        assertThat(test.closedIsland(new int[][]{
            {0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 1, 1, 0}
        })).isEqualTo(1);

        assertThat(test.closedIsland(new int[][]{
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1}
        })).isEqualTo(2);
    }
}
