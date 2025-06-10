package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3442_Maximum_Difference_Between_Even_and_Odd_Frequency_I_Test {
    @Test
    void test() {
        LC3442_Maximum_Difference_Between_Even_and_Odd_Frequency_I test = new LC3442_Maximum_Difference_Between_Even_and_Odd_Frequency_I();

        assertThat(test.maxDifference("aaaaabbc")).isEqualTo(3);
        assertThat(test.maxDifference("abcabcab")).isEqualTo(1);
    }
}
