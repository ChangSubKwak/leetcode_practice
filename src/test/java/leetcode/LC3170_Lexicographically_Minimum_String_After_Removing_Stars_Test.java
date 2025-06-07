package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3170_Lexicographically_Minimum_String_After_Removing_Stars_Test {
    @Test
    void test() {
        LC3170_Lexicographically_Minimum_String_After_Removing_Stars test = new LC3170_Lexicographically_Minimum_String_After_Removing_Stars();

        assertThat(test.clearStars("aaba*")).isEqualTo("aab");
        assertThat(test.clearStars("abc")).isEqualTo("abc");
    }
}
