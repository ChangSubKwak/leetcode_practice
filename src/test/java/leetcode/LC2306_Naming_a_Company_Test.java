package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC2306_Naming_a_Company_Test {
    @Test
    void test() {
        LC2306_Naming_a_Company_X test = new LC2306_Naming_a_Company_X();
        assertThat(test.distinctNames(new String[]{"coffee", "donuts", "time", "toffee"})).isEqualTo(6);
        assertThat(test.distinctNames(new String[]{"lack", "back"})).isEqualTo(0);
    }
}
