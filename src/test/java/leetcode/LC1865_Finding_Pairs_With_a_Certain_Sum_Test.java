package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1865_Finding_Pairs_With_a_Certain_Sum_Test {
    @Test
    void exampleTest() {
        LC1865_Finding_Pairs_With_a_Certain_Sum.FindSumPairs test = new LC1865_Finding_Pairs_With_a_Certain_Sum.FindSumPairs(
                new int[]{1, 1, 2, 2, 2, 3}, new int[]{1, 4, 5, 2, 5, 4}
        );

        assertThat(test.count(7)).isEqualTo(8);

        test.add(3, 2);
        assertThat(test.count(8)).isEqualTo(2);
        assertThat(test.count(4)).isEqualTo(1);

        test.add(0, 1);
        test.add(1, 1);
        assertThat(test.count(7)).isEqualTo(11);
    }
}
