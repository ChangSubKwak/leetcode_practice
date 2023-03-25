package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class LC2316_Count_Unreachable_Pairs_of_Nodes_in_an_Undirected_Graph_Test {
    @Test
    void test() {
        LC2316_Count_Unreachable_Pairs_of_Nodes_in_an_Undirected_Graph test = new LC2316_Count_Unreachable_Pairs_of_Nodes_in_an_Undirected_Graph();

        assertThat(test.countPairs(3, new int[][]{{0, 1}, {0, 2}, {1, 2}})).isEqualTo(0);
        assertThat(test.countPairs(7, new int[][]{{0, 2}, {0, 5}, {2, 4}, {1, 6}, {5, 4}})).isEqualTo(14);
    }
}
