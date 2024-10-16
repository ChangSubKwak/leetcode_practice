package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1405_Longest_Happy_String_Test {
    @Test
    void test() {
        LC1405_Longest_Happy_String test = new LC1405_Longest_Happy_String();

        assertThat(test.longestDiverseString(1, 1, 7)).isEqualTo("ccaccbcc");
        assertThat(test.longestDiverseString(7, 1, 0)).isEqualTo("aabaa");
    }
}
