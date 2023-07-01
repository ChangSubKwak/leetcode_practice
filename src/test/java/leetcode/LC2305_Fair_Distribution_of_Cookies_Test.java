package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC2305_Fair_Distribution_of_Cookies_Test {
    @Test
    void test() {
        LC2305_Fair_Distribution_of_Cookies test = new LC2305_Fair_Distribution_of_Cookies();

        assertThat(test.distributeCookies(new int[]{8, 15, 10, 20, 8}, 2)).isEqualTo(31);
        assertThat(test.distributeCookies(new int[]{6, 1, 3, 2, 2, 4, 1, 2}, 3)).isEqualTo(7);
    }
}
