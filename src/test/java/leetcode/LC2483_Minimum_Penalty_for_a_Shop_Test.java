package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC2483_Minimum_Penalty_for_a_Shop_Test {
    @Test
    void test() {
        LC2483_Minimum_Penalty_for_a_Shop test = new LC2483_Minimum_Penalty_for_a_Shop();
        assertThat(test.bestClosingTime("YYNY")).isEqualTo(2);
        assertThat(test.bestClosingTime("NNNNN")).isEqualTo(0);
        assertThat(test.bestClosingTime("YYYY")).isEqualTo(4);
    }
}
