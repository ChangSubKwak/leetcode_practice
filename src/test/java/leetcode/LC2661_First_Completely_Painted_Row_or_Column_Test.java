package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2661_First_Completely_Painted_Row_or_Column_Test {
    @Test
    void test() {
        LC2661_First_Completely_Painted_Row_or_Column test = new LC2661_First_Completely_Painted_Row_or_Column();

        assertThat(test.firstCompleteIndex(
                new int[]{1, 3, 4, 2},
                new int[][]{{1, 4}, {2, 3}}
        )).isEqualTo(2);

        assertThat(test.firstCompleteIndex(
                new int[]{2, 8, 7, 4, 1, 3, 5, 6, 9},
                new int[][]{{3, 2, 5}, {1, 4, 6}, {8, 7, 9}}
        )).isEqualTo(3);
    }
}
