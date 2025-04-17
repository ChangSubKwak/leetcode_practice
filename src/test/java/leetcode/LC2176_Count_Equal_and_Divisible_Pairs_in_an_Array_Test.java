package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2176_Count_Equal_and_Divisible_Pairs_in_an_Array_Test {
    @Test
    void exampleTest() {
        LC2176_Count_Equal_and_Divisible_Pairs_in_an_Array test = new LC2176_Count_Equal_and_Divisible_Pairs_in_an_Array();

        assertThat(test.countPairs(new int[]{3, 1, 2, 2, 2, 1, 3}, 2)).isEqualTo(4);
        assertThat(test.countPairs(new int[]{1, 2, 3, 4}, 1)).isEqualTo(0);
    }
}
