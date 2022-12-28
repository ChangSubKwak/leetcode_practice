package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1962_Remove_Stones_to_Minimize_the_Total_Test {
    @Test
    void exampleTest() {
        LC1962_Remove_Stones_to_Minimize_the_Total test = new LC1962_Remove_Stones_to_Minimize_the_Total();
        assertThat(test.minStoneSum(new int[]{5, 4, 9}, 2)).isEqualTo(12);
        assertThat(test.minStoneSum(new int[]{4, 3, 6, 7}, 3)).isEqualTo(12);
    }
}
