package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2411_Smallest_Subarrays_With_Maximum_Bitwise_OR_Test {
    @Test
    void exampleTest1() {
        LC2411_Smallest_Subarrays_With_Maximum_Bitwise_OR test = new LC2411_Smallest_Subarrays_With_Maximum_Bitwise_OR();

        assertThat(test.smallestSubarrays(new int[]{1, 0, 2, 1, 3})).isEqualTo(new int[]{3, 3, 2, 2, 1});
        assertThat(test.smallestSubarrays(new int[]{1, 2})).isEqualTo(new int[]{2, 1});
    }
}
