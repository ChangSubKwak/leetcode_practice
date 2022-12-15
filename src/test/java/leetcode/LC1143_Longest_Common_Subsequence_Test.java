package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class LC1143_Longest_Common_Subsequence_Test {
    @Test
    void test() {
        LC1143_Longest_Common_Subsequence test = new LC1143_Longest_Common_Subsequence();
        assertThat(test.longestCommonSubsequence("abcde", "ace")).isEqualTo(3);
        assertThat(test.longestCommonSubsequence("abc", "abc")).isEqualTo(3);
        assertThat(test.longestCommonSubsequence("abc", "def")).isEqualTo(0);
    }
}
