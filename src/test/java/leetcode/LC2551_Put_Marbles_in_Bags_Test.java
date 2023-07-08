package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC2551_Put_Marbles_in_Bags_Test {
    @Test
    void test() {
        LC2551_Put_Marbles_in_Bags test = new LC2551_Put_Marbles_in_Bags();
        assertThat(test.putMarbles(new int[]{1, 3, 5, 1}, 2)).isEqualTo(4L);
        assertThat(test.putMarbles(new int[]{1, 3}, 2)).isEqualTo(0L);
    }
}
