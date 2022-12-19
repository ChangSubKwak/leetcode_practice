package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1971_Find_if_Path_Exists_in_Graph_Test {
    @Test
    void exampleTest() {
        LC1971_Find_if_Path_Exists_in_Graph test = new LC1971_Find_if_Path_Exists_in_Graph();
        assertThat(test.validPath(
            3,  new int[][] { {0, 1}, {1, 2}, {2, 0} }, 0, 2)).isTrue();
        assertThat(test.validPath(
            6,  new int[][] { {0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3} }, 0, 5)).isFalse();
    }
}
