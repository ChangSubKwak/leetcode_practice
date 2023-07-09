package leetcode.biweekly.contest108;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import leetcode.biweekly.contest108.Problem3;

class Problem3_Test {
    @Test
    void test() {
        Problem3 test = new Problem3();
        assertThat(test.minimumBeautifulSubstrings("1011")).isEqualTo(2);
        // assertThat(test.minimumBeautifulSubstrings("111")).isEqualTo(3);
        // assertThat(test.minimumBeautifulSubstrings("0")).isEqualTo(-1);
    }

}