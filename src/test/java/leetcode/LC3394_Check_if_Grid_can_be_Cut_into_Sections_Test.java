package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3394_Check_if_Grid_can_be_Cut_into_Sections_Test {
    @Test
    void test() {
        LC3394_Check_if_Grid_can_be_Cut_into_Sections test = new LC3394_Check_if_Grid_can_be_Cut_into_Sections();

        assertThat(test.checkValidCuts(5, new int[][]{{1, 0, 5, 2}, {0, 2, 2, 4}, {3, 2, 5, 3}, {0, 4, 4, 5}})).isEqualTo(true);
        assertThat(test.checkValidCuts(4, new int[][]{{0, 0, 1, 1}, {2, 0, 3, 4}, {0, 2, 2, 3}, {3, 0, 4, 3}})).isEqualTo(true);
        assertThat(test.checkValidCuts(4, new int[][]{{0, 2, 2, 4}, {1, 0, 3, 2}, {2, 2, 3, 4}, {3, 0, 4, 2}, {3, 2, 4, 4}})).isEqualTo(false);
    }
}
