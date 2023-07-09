package leetcode.biweekly.contest108;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem1_Test {
    @Test
    void test() {
        Problem1 test = new Problem1();
        assertThat(test.alternatingSubarray(new int[]{2, 3, 4, 3, 4})).isEqualTo(4);
        assertThat(test.alternatingSubarray(new int[]{4, 5, 6})).isEqualTo(2);
    }

}