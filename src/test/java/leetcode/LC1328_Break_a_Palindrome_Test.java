package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1328_Break_a_Palindrome_Test {

    @Test
    void test() {
        LC1328_Break_a_Palindrome test = new LC1328_Break_a_Palindrome();
        assertThat(test.breakPalindrome("abccba")).isEqualTo("aaccba");
        assertThat(test.breakPalindrome("a")).isEqualTo("");
        assertThat(test.breakPalindrome("aa")).isEqualTo("ab");
    }
}
