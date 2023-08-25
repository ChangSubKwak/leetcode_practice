package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0459_Repeatable_Substring_Pattern_Test {

    @Test
    void minimumTotal() {
        LC0459_Repeatable_Substring_Pattern test = new LC0459_Repeatable_Substring_Pattern();

        assertThat(test.repeatedSubstringPattern("abab")).isTrue();
        assertThat(test.repeatedSubstringPattern("aba")).isFalse();
        assertThat(test.repeatedSubstringPattern("abcabcabcabc")).isTrue();
    }
}
