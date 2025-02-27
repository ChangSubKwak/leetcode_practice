package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0873_Length_of_Longest_Fibonacci_Subsequence_Test {
    @Test
    void test() {
        LC0873_Length_of_Longest_Fibonacci_Subsequence test = new LC0873_Length_of_Longest_Fibonacci_Subsequence();

        assertThat(test.lenLongestFibSubseq(new int[]{1, 2, 3, 4, 5, 6, 7, 8})).isEqualTo(5);
        assertThat(test.lenLongestFibSubseq(new int[]{1, 3, 7, 11, 12, 14, 18})).isEqualTo(3);
    }
}
