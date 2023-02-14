package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1129_Shortest_Path_with_Alternating_Colors_Test {
    @Test
    void test() {
        LC1129_Shortest_Path_with_Alternating_Colors test = new LC1129_Shortest_Path_with_Alternating_Colors();
        assertThat(test.shortestAlternatingPaths(3, new int[][]{{0, 1}, {1, 2}}, new int[][]{})).isEqualTo(new int[]{0, 1, -1});
        assertThat(test.shortestAlternatingPaths(3, new int[][]{{0, 1}}, new int[][]{{2, 1}})).isEqualTo(new int[]{0, 1, -1});
    }
}
