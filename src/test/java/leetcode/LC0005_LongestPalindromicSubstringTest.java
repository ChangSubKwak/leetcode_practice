package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LC0005_LongestPalindromicSubstringTest {
	LC0005_LongestPalindromicSubstring test;
	
	@Test
	void ������_�־�����_���̽���_����Ѵ�() {
		test = new LC0005_LongestPalindromicSubstring();
		assertThat(test.longestPalindrome("babad")).isEqualTo("bab");
		assertThat(test.longestPalindrome("cbbd")).isEqualTo("bb");
		assertThat(test.longestPalindrome("a")).isEqualTo("a");
		assertThat(test.longestPalindrome("ac")).isEqualTo("a");
	}
}
