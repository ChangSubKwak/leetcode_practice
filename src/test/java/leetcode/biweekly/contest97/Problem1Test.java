package leetcode.biweekly.contest97;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

class Problem1Test {
    @Test
    void test() {
        Problem1 test = new Problem1();
        assertThat(test.separateDigits(new int[]{13, 25, 83, 77})).isEqualTo(new int[]{1, 3, 2, 5, 8, 3, 7, 7});
        assertThat(test.separateDigits(new int[]{7, 1, 3, 9})).isEqualTo(new int[]{7, 1, 3, 9});
    }

}