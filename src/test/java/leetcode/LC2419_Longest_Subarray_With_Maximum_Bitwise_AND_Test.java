package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2419_Longest_Subarray_With_Maximum_Bitwise_AND_Test {
    @Test
    void exampleTest() {
        LC2419_Longest_Subarray_With_Maximum_Bitwise_AND test = new LC2419_Longest_Subarray_With_Maximum_Bitwise_AND();
        assertThat(test.longestSubarray(new int[]{1, 2, 3, 3, 2, 2})).isEqualTo(2);
        assertThat(test.longestSubarray(new int[]{1, 2, 3, 4})).isEqualTo(1);
    }
}
