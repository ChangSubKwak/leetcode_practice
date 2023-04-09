package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1857_Largest_Color_Value_in_a_Directed_Graph_Test {
    @Test
    void exampleTest() {
        LC1857_Largest_Color_Value_in_a_Directed_Graph test = new LC1857_Largest_Color_Value_in_a_Directed_Graph();
        assertThat(test.largestPathValue("abaca", new int[][]{{0, 1}, {0, 2}, {2, 3}, {3, 4}})).isEqualTo(3);
        assertThat(test.largestPathValue("a", new int[][]{{0, 0}})).isEqualTo(-1);
    }
}
