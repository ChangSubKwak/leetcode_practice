package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0516_Longest_Palindromic_Subsequence_Test {
	@Test
	void test() {
		LC0516_Longest_Palindromic_Subsequence test = new LC0516_Longest_Palindromic_Subsequence();
		assertThat(test.longestPalindromeSubseq("bbbab")).isEqualTo(4);
		assertThat(test.longestPalindromeSubseq("cbbd")).isEqualTo(2);
	}
}
