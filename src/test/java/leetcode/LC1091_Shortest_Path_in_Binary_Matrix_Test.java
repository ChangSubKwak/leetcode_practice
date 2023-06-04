package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1091_Shortest_Path_in_Binary_Matrix_Test {
    @Test
    void test() {
        LC1091_Shortest_Path_in_Binary_Matrix test = new LC1091_Shortest_Path_in_Binary_Matrix();
        assertThat(test.shortestPathBinaryMatrix(new int[][]{
            {0, 1},
            {1, 0},
        })).isEqualTo(2);

        assertThat(test.shortestPathBinaryMatrix(new int[][]{
            {0, 0, 0},
            {1, 1, 0},
            {1, 1, 0}
        })).isEqualTo(4);

        assertThat(test.shortestPathBinaryMatrix(new int[][]{
            {1, 0, 0},
            {1, 1, 0},
            {1, 1, 0}
        })).isEqualTo(-1);
    }
}
