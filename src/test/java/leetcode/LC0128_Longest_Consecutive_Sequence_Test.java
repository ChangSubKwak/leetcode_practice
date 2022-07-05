package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0128_Longest_Consecutive_Sequence_Test {
    LC0128_Longest_Consecutive_Sequence test;
    
    @BeforeEach
    void setUp() {
        test = new LC0128_Longest_Consecutive_Sequence();
    }
    
    @Test
    void test() {
        assertThat(test.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2})).isEqualTo(4);
        assertThat(test.longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 })).isEqualTo(9);
    }
}