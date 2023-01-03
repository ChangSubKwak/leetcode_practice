package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0980_Unique_Paths_III_Test {
    @Test
    void test() {
        LC0980_Unique_Paths_III test = new LC0980_Unique_Paths_III();
        assertThat(test.uniquePathsIII(new int[][] {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 2, -1}
        })).isEqualTo(2);
    }
}
