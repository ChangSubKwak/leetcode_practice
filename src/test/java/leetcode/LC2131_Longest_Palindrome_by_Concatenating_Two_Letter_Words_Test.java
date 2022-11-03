package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC2131_Longest_Palindrome_by_Concatenating_Two_Letter_Words_Test {
    @Test
    void exampleTest() {
        LC2131_Longest_Palindrome_by_Concatenating_Two_Letter_Words_X test = new LC2131_Longest_Palindrome_by_Concatenating_Two_Letter_Words_X();
        assertThat(test.longestPalindrome(new String[]{"lc", "cl", "gg"})).isEqualTo(6);
        assertThat(test.longestPalindrome(new String[]{"ab", "ty", "yt", "lc", "cl", "ab"})).isEqualTo(8);
        assertThat(test.longestPalindrome(new String[]{"cc", "ll", "xx"})).isEqualTo(2);
    }
}
