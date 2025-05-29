package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3373_Maximize_the_Number_of_Target_Nodes_After_Connecting_Trees_II_Test {
    @Test
    void test() {
        LC3373_Maximize_the_Number_of_Target_Nodes_After_Connecting_Trees_II test = new LC3373_Maximize_the_Number_of_Target_Nodes_After_Connecting_Trees_II();

        assertThat(test.maxTargetNodes(
            new int[][]{{0 ,1}, {0, 2}, {2, 3}, {2, 4}},
            new int[][]{{0, 1}, {0, 2}, {0, 3}, {2, 7}, {1, 4}, {4, 5}, {4, 6}})
        ).isEqualTo(
            new int[]{8, 7, 7, 8, 8}
        );

        assertThat(test.maxTargetNodes(
            new int[][]{{0 ,1}, {0, 2}, {0, 3}, {0, 4}},
            new int[][]{{0, 1}, {1, 2}, {2, 3}})
        ).isEqualTo(
            new int[]{8, 7, 7, 8, 8}
        );
    }
}
