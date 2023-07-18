package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1218_Longest_Arithmetic_Subsequence_of_Given_Difference_Test {
    
    @Test
    void test() {
        LC1218_Longest_Arithmetic_Subsequence_of_Given_Difference test = new LC1218_Longest_Arithmetic_Subsequence_of_Given_Difference();
        assertThat(test.longestSubsequence(new int[]{1, 2, 3, 4}, 1)).isEqualTo(4);
        assertThat(test.longestSubsequence(new int[]{1, 3, 5, 7}, 1)).isEqualTo(1);
        assertThat(test.longestSubsequence(new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1}, -2)).isEqualTo(4);
    }
}
