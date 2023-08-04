package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.Arrays;

class LC0139_Word_Break_Test {

    @Test
    void test() {
        LC0139_Word_Break test = new LC0139_Word_Break();
        assertThat(test.wordBreak("leetcode", Arrays.asList("leet", "code"))).isEqualTo(true);
        assertThat(test.wordBreak("applepenapple", Arrays.asList("apple", "pen"))).isEqualTo(true);
        assertThat(test.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"))).isEqualTo(false);
    }
}