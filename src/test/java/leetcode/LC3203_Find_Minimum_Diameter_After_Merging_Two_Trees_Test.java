package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC3203_Find_Minimum_Diameter_After_Merging_Two_Trees_Test {
    @Test
    void test() {
        LC3203_Find_Minimum_Diameter_After_Merging_Two_Trees test = new LC3203_Find_Minimum_Diameter_After_Merging_Two_Trees();

        assertThat(test.minimumDiameterAfterMerge(
                new int[][]{{0, 1}, {0, 2}, {0, 3}},
                new int[][]{{0, 1}}
        )).isEqualTo(3);

        assertThat(test.minimumDiameterAfterMerge(
                new int[][]{{0, 1}, {0, 2}, {0, 3}, {2, 4}, {2, 5}, {3, 6}, {2, 7}},
                new int[][]{{0, 1}, {0, 2}, {0, 3}, {2, 4}, {2, 5}, {3, 6}, {2, 7}}
        )).isEqualTo(5);
    }
}
