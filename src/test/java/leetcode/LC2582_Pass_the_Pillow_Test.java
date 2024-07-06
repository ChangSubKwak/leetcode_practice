package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2582_Pass_the_Pillow_Test {
    @Test
    void test() {
        LC2582_Pass_the_Pillow test = new LC2582_Pass_the_Pillow();

        assertThat(test.passThePillow(4, 5)).isEqualTo(5);
        assertThat(test.passThePillow(3, 2)).isEqualTo(3);
    }
}
