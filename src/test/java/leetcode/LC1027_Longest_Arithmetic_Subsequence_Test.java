package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1027_Longest_Arithmetic_Subsequence_Test {
    @Test
    void test() {
        LC1027_Longest_Arithmetic_Subsequence test = new LC1027_Longest_Arithmetic_Subsequence();
        assertThat(test.longestArithSeqLength(new int[]{3, 6, 9, 12})).isEqualTo(4);
        assertThat(test.longestArithSeqLength(new int[]{9, 4, 7, 2, 10})).isEqualTo(3);
        assertThat(test.longestArithSeqLength(new int[]{20, 1, 15, 3, 10, 5, 8})).isEqualTo(4);
    }

}
