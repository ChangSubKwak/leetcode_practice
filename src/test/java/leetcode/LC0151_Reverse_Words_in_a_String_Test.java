package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC0151_Reverse_Words_in_a_String_Test {
    @Test
    void test() {
        LC0151_Reverse_Words_in_a_String test = new LC0151_Reverse_Words_in_a_String();
        assertThat(test.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
        assertThat(test.reverseWords("  hello world  ")).isEqualTo("world hello");
        assertThat(test.reverseWords("a good   example")).isEqualTo("example good a");
    }
}