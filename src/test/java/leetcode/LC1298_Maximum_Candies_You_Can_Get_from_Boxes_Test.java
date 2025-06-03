package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1298_Maximum_Candies_You_Can_Get_from_Boxes_Test {

    @Test
    void test() {
        LC1298_Maximum_Candies_You_Can_Get_from_Boxes test = new LC1298_Maximum_Candies_You_Can_Get_from_Boxes();

        assertThat(test.maxCandies(
            new int[]{1, 0, 1, 0},
            new int[]{7, 5, 4, 100},
            new int[][]{{}, {}, {1}, {}},
            new int[][]{{1, 2}, {3}, {}, {}},
            new int[]{0}
        )).isEqualTo(16);

        assertThat(test.maxCandies(
            new int[]{1, 0, 0, 0, 0, 0},
            new int[]{1, 1, 1, 1, 1, 1},
            new int[][]{{1, 2, 3, 4, 5}, {}, {}, {}, {}, {}},
            new int[][]{{1, 2, 3, 4, 5}, {}, {}, {}, {}, {}},
            new int[]{0}
        )).isEqualTo(6);
    }
}
