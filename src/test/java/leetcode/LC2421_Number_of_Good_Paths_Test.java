package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC2421_Number_of_Good_Paths_Test {
    LC2421_Number_of_Good_Paths_X test = new LC2421_Number_of_Good_Paths_X();

    @Test
    void exampleTest() {
        assertThat(test.numberOfGoodPaths(new int[]{1, 3, 2, 1, 3}, new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}})).isEqualTo(6);
        assertThat(test.numberOfGoodPaths(new int[]{1, 1, 2, 2, 3}, new int[][]{{0, 1}, {1, 2}, {2, 3}, {2, 4}})).isEqualTo(7);
    }
}
