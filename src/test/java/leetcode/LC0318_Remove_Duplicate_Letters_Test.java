package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0318_Remove_Duplicate_Letters_Test {
    @Test
    void minimumTotal() {
        LC0318_Remove_Duplicate_Letters test = new LC0318_Remove_Duplicate_Letters();
        assertThat(test.removeDuplicateLetters("bcabc")).isEqualTo("abc");
        assertThat(test.removeDuplicateLetters("cbacdcbc")).isEqualTo("acdb");
    }
}
