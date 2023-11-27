package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0935_Knight_Dialer_Test {
    @Test
    void test() {
        LC0935_Knight_Dialer test = new LC0935_Knight_Dialer();
        assertThat(test.knightDialer(1)).isEqualTo(10);
        assertThat(test.knightDialer(2)).isEqualTo(20);
        assertThat(test.knightDialer(3131)).isEqualTo(136006598);
    }
}
