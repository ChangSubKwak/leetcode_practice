package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2352_Equal_Row_and_Column_Pairs_Test {

    @Test
    void exampleTest() {
        LC2352_Equal_Row_and_Column_Pairs test = new LC2352_Equal_Row_and_Column_Pairs();

        assertThat(test.equalPairs(new int[][]{
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        })).isEqualTo(1);

        assertThat(test.equalPairs(new int[][]{
            {3, 1, 2, 2},
            {1, 4, 5, 5},
            {2, 4, 2, 2},
            {2, 4, 2, 2}
        })).isEqualTo(3);

    }
}
