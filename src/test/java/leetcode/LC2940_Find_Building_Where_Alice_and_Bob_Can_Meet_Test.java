package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2940_Find_Building_Where_Alice_and_Bob_Can_Meet_Test {

    @Test
    void test() {
        LC2940_Find_Building_Where_Alice_and_Bob_Can_Meet test = new LC2940_Find_Building_Where_Alice_and_Bob_Can_Meet();

        assertThat(test.leftmostBuildingQueries(
            new int[]{6, 4, 8, 5, 2, 7},
            new int[][]{{0, 1}, {0, 3}, {2, 4}, {3, 4}, {2, 2}}
        )).isEqualTo(new int[]{2, 5, -1, 5, 2});

        assertThat(test.leftmostBuildingQueries(
            new int[]{5, 3, 8, 2, 6, 1, 4, 6},
            new int[][]{{0, 7}, {3, 5}, {5, 2}, {3, 0}, {1, 6}}
        )).isEqualTo(new int[]{7, 6, -1, 4, 6});
    }
}
