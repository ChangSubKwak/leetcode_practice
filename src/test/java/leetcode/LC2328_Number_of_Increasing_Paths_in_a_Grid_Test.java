package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC2328_Number_of_Increasing_Paths_in_a_Grid_Test {
    @Test
    void test() {
        LC2328_Number_of_Increasing_Paths_in_a_Grid test = new LC2328_Number_of_Increasing_Paths_in_a_Grid();

        assertThat(test.countPaths(new int[][]{{1, 1}, {3, 4}})).isEqualTo(8);
        assertThat(test.countPaths(new int[][]{{1}, {2}})).isEqualTo(3);
    }
}
