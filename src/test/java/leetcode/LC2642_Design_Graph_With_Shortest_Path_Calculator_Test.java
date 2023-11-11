package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC2642_Design_Graph_With_Shortest_Path_Calculator_Test {
    @Test
    void test() {
        LC2642_Design_Graph_With_Shortest_Path_Calculator.Graph test = new LC2642_Design_Graph_With_Shortest_Path_Calculator.Graph(
            4, new int[][]{
                {0, 2, 5},
                {0, 1, 2},
                {1, 2, 1},
                {3, 0, 3}
            }
        );

        assertThat(test.shortestPath(3, 2)).isEqualTo(6);
        assertThat(test.shortestPath(0, 3)).isEqualTo(-1);

        test.addEdge(new int[]{1, 3, 4});
        assertThat(test.shortestPath(0, 3)).isEqualTo(6);
    }
}
