package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0062_Unique_Paths_II_Test {
    @Test
    void test() {
        LC0062_Unique_Paths_II test = new LC0062_Unique_Paths_II();
        assertThat(test.uniquePathsWithObstacles(new int[][]{
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        })).isEqualTo(2);

        assertThat(test.uniquePathsWithObstacles(new int[][]{
            {0, 1},
            {0, 0}
        })).isEqualTo(1);
    }
}
