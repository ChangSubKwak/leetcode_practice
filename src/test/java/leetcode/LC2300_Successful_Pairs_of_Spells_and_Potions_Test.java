package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC2300_Successful_Pairs_of_Spells_and_Potions_Test {
    @Test
    void test() {
        LC2300_Successful_Pairs_of_Spells_and_Potions test = new LC2300_Successful_Pairs_of_Spells_and_Potions();

        assertThat(test.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7)).isEqualTo(new int[]{4, 0, 3});
        assertThat(test.successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16)).isEqualTo(new int[]{2, 0, 2});
    }
}
