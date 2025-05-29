package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3372_Maximize_the_Number_of_Target_Nodes_After_Connectomg_Trees_I_Test {
    @Test
    void test() {
        LC3372_Maximize_the_Number_of_Target_Nodes_After_Connectomg_Trees_I test = new LC3372_Maximize_the_Number_of_Target_Nodes_After_Connectomg_Trees_I();

        assertThat(test.maxTargetNodes(
                new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}},
                new int[][]{{0, 1}, {0, 2}, {0, 3}, {2, 7}, {1, 4}, {4, 5}, {4, 6}},
                2
        )).isEqualTo(new int[]{9, 7, 9, 8, 8});

        assertThat(test.maxTargetNodes(
                new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}},
                new int[][]{{0, 1}, {1, 2}, {2, 3}},
                1
        )).isEqualTo(new int[]{6, 3, 3, 3, 3});
    }
}
