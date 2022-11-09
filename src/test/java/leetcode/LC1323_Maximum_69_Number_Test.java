package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1323_Maximum_69_Number_Test {

    @Test
    void test() {
        LC1323_Maximum_69_Number test = new LC1323_Maximum_69_Number();
        assertThat(test.maximum69Number(9669)).isEqualTo(9969);
        assertThat(test.maximum69Number(9996)).isEqualTo(9999);
        assertThat(test.maximum69Number(9999)).isEqualTo(9999);

    }
}
