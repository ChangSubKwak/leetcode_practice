package leetcode.biweekly.contest97;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Problem2Test {
    @Test
    void test() {
        Problem2 test = new Problem2();
        assertThat(test.maxCount(new int[]{1, 6, 5}, 5, 6)).isEqualTo(2);
        assertThat(test.maxCount(new int[]{1, 2, 3, 4, 5, 6, 7}, 8, 1)).isEqualTo(0);
        assertThat(test.maxCount(new int[]{11}, 7, 50)).isEqualTo(7);
    }

}