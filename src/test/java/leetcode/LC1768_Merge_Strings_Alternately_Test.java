package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1768_Merge_Strings_Alternately_Test {

    @Test
    void exampleTest() {
        LC1768_Merge_Strings_Alternately test = new LC1768_Merge_Strings_Alternately();
        assertThat(test.mergeAlternately("abc", "pqr")).isEqualTo("apbqcr");
        assertThat(test.mergeAlternately("ab", "pqrs")).isEqualTo("apbqrs");
        assertThat(test.mergeAlternately("abcd", "pq")).isEqualTo("apbqcd");
    }
}
