package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1930_Unique_Length_3_Palindromic_Subsequences_Test {
    @Test
    void exampleTest() {
        LC1930_Unique_Length_3_Palindromic_Subsequences test = new LC1930_Unique_Length_3_Palindromic_Subsequences();
        assertThat(test.countPalindromicSubsequence("aabca")).isEqualTo(3);
        assertThat(test.countPalindromicSubsequence("adc")).isEqualTo(0);
        assertThat(test.countPalindromicSubsequence("bbcbaba")).isEqualTo(4);
    }
}
