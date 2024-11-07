package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC2275_Largest_Combination_With_Bitwise_AND_Greater_Than_Zero_Test {
    @Test
    void test() {
        LC2275_Largest_Combination_With_Bitwise_AND_Greater_Than_Zero test = new LC2275_Largest_Combination_With_Bitwise_AND_Greater_Than_Zero();

        assertThat(test.largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14})).isEqualTo(4);
        assertThat(test.largestCombination(new int[]{8, 8})).isEqualTo(2);
    }
}
