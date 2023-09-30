package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0456_132_Pattern_Test {

    @Test
    void test() {
        LC0456_132_Pattern test = new LC0456_132_Pattern();

        assertThat(test.find132pattern(new int[]{1, 2, 3, 4})).isFalse();
        assertThat(test.find132pattern(new int[]{3, 1, 4, 2})).isTrue();
        assertThat(test.find132pattern(new int[]{-1, 3, 2, 0})).isTrue();
    }
}
