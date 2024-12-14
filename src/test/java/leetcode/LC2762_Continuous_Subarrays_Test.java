package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2762_Continuous_Subarrays_Test {
    @Test
    void test() {
        LC2762_Continuous_Subarrays test = new LC2762_Continuous_Subarrays();

        assertThat(test.continuousSubarrays(new int[]{5, 4, 2, 4})).isEqualTo(8);
        assertThat(test.continuousSubarrays(new int[]{1, 2, 3})).isEqualTo(6);
    }
}
