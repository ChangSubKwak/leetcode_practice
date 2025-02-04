package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LC3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray_Test {
    @Test
    void test() {
        LC3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray test = new LC3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray();

        assertThat(test.longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2})).isEqualTo(2);
        assertThat(test.longestMonotonicSubarray(new int[]{3, 3, 3, 3})).isEqualTo(1);
        assertThat(test.longestMonotonicSubarray(new int[]{3, 2, 1})).isEqualTo(3);
    }
}