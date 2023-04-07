package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1020_Number_of_Enclaves_Test {
    @Test
    void test() {
        LC1020_Number_of_Enclaves test = new LC1020_Number_of_Enclaves();
        assertThat(test.numEnclaves(new int[][]{
            {0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 1, 0}
        })).isEqualTo(3);

        assertThat(test.numEnclaves(new int[][]{
            {0, 1, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0}
        })).isEqualTo(3);
    }

}
