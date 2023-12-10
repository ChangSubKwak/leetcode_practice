package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC2901_Longest_Unequal_Adjacent_Groups_Subsequence_II_Test {
    @Test
    void test() {
        LC2901_Longest_Unequal_Adjacent_Groups_Subsequence_II test = new LC2901_Longest_Unequal_Adjacent_Groups_Subsequence_II();
        assertThat(test.getWordsInLongestSubsequence(3, new String[]{"bab", "dab", "cab"}, new int[]{1, 2, 2})).isEqualTo(
            Arrays.asList("bab", "cab")
        );
        assertThat(test.getWordsInLongestSubsequence(4, new String[]{"a", "b", "c", "d"}, new int[]{1, 2, 3, 4})).isEqualTo(
            Arrays.asList("a", "b", "c", "d")
        );
    }
}
