package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC2900_Longest_Unequal_Adjacent_Groups_Subsequence_I_Test {
    @Test
    void test() {
        LC2900_Longest_Unequal_Adjacent_Groups_Subsequence_I test = new LC2900_Longest_Unequal_Adjacent_Groups_Subsequence_I();

        assertThat(test.getLongestSubsequence(new String[]{"e", "a", "b"}, new int[]{0, 0, 1})).isEqualTo(Arrays.asList("e", "b"));
        assertThat(test.getLongestSubsequence(new String[]{"a", "b", "c", "d"}, new int[]{1, 0, 1, 1})).isEqualTo(Arrays.asList("a", "b", "c"));
    }
}
