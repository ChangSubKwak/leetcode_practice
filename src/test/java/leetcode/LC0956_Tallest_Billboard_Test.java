package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0956_Tallest_Billboard_Test {

    @Test
    void test() {
        LC0956_Tallest_Billboard test = new LC0956_Tallest_Billboard();
        assertThat(test.tallestBillboard(new int[]{1, 2, 3, 6})).isEqualTo(6);
        assertThat(test.tallestBillboard(new int[]{1, 2, 3, 4, 5, 6})).isEqualTo(10);
        assertThat(test.tallestBillboard(new int[]{1, 2})).isEqualTo(0);
    }
}
