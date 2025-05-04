package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1128_Number_of_Equivalent_Domino_Pairs_Test {
    @Test
    void test() {
        LC1128_Number_of_Equivalent_Domino_Pairs test = new LC1128_Number_of_Equivalent_Domino_Pairs();

        assertThat(test.numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}})).isEqualTo(1);
        assertThat(test.numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {1, 1}, {1, 2}, {2, 2}})).isEqualTo(3);
    }
}
