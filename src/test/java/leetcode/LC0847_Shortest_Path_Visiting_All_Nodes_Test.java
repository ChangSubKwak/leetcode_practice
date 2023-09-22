package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC0847_Shortest_Path_Visiting_All_Nodes_Test {
    
    @Test
    void test() {
        LC0847_Shortest_Path_Visiting_All_Nodes test = new LC0847_Shortest_Path_Visiting_All_Nodes();

        assertThat(test.shortestPathLength(new int[][]{
            {1, 2, 3},
            {0},
            {0},
            {0}
        })).isEqualTo(4);

        assertThat(test.shortestPathLength(new int[][]{
            {1},
            {0, 2, 4},
            {1, 3, 4},
            {2},
            {1, 2}
        })).isEqualTo(4);

    }
}
