package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0392_Is_Subsequence_Test {
    @Test
    void test() {
        LC0392_Is_Subsequence test = new LC0392_Is_Subsequence();
        assertThat(test.isSubsequence("abc", "ahbgdc")).isTrue();
        assertThat(test.isSubsequence("axc", "ahbgdc")).isFalse();
    }
}
