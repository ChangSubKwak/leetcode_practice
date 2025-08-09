package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0231_Power_of_Two_Test {
    @Test
    void test() {
        LC0231_Power_of_Two test = new LC0231_Power_of_Two();

        assertThat(test.isPowerOfTwo(1)).isEqualTo(true);
        assertThat(test.isPowerOfTwo(16)).isEqualTo(true);
        assertThat(test.isPowerOfTwo(3)).isEqualTo(false);
    }
}
