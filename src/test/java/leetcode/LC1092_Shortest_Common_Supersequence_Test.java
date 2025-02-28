package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1092_Shortest_Common_Supersequence_Test {
    @Test
    void test() {
        LC1092_Shortest_Common_Supersequence test = new LC1092_Shortest_Common_Supersequence();

        assertThat(test.shortestCommonSupersequence("abac", "cab")).isEqualTo("cabac");
        assertThat(test.shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa")).isEqualTo("aaaaaaaa");
    }
}
