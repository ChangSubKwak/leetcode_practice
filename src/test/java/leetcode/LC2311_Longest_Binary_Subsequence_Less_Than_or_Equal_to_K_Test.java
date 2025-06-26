package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2311_Longest_Binary_Subsequence_Less_Than_or_Equal_to_K_Test {
    @Test
    void test() {
        LC2311_Longest_Binary_Subsequence_Less_Than_or_Equal_to_K test = new LC2311_Longest_Binary_Subsequence_Less_Than_or_Equal_to_K();

        assertThat(test.longestSubsequence("1001010", 5)).isEqualTo(5);
        assertThat(test.longestSubsequence("00101001", 1)).isEqualTo(6);
    }
}
