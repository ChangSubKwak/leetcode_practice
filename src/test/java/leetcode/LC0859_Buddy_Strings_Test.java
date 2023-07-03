package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0859_Buddy_Strings_Test {
    @Test
    void test() {
        LC0859_Buddy_Strings test = new LC0859_Buddy_Strings();
        assertThat(test.buddyStrings("ab", "ba")).isTrue();
        assertThat(test.buddyStrings("ab", "ab")).isFalse();
        assertThat(test.buddyStrings("aa", "aa")).isTrue();
        assertThat(test.buddyStrings("abcd", "badc")).isFalse();
        assertThat(test.buddyStrings("abcaa", "abcbb")).isFalse();
    }
}
