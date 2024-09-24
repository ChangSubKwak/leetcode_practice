package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3043_Find_the_Length_of_the_Longest_Common_Prefix_Test {
    @Test
    void test() {
        LC3043_Find_the_Length_of_the_Longest_Common_Prefix test = new LC3043_Find_the_Length_of_the_Longest_Common_Prefix();
        assertThat(test.longestCommonPrefix(new int[]{1, 10, 100}, new int[]{1000})).isEqualTo(3);
        assertThat(test.longestCommonPrefix(new int[]{1, 2, 3}, new int[]{4, 4, 4})).isEqualTo(0);
    }
}
