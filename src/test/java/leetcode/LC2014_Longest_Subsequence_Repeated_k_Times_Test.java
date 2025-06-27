package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2014_Longest_Subsequence_Repeated_k_Times_Test {
    LC2014_Longest_Subsequence_Repeated_k_Times test = new LC2014_Longest_Subsequence_Repeated_k_Times();

    @Test
    void exampleTest() {
        assertThat(test.longestSubsequenceRepeatedK("letsleetcode", 2)).isEqualTo("let");
        assertThat(test.longestSubsequenceRepeatedK("bb", 2)).isEqualTo("b");
        assertThat(test.longestSubsequenceRepeatedK("ab", 2)).isEqualTo("");
    }
}
