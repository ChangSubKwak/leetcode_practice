package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2799_Count_Complete_Subarrays_in_an_Array_Test {
    @Test
    void test() {
        LC2799_Count_Complete_Subarrays_in_an_Array test = new LC2799_Count_Complete_Subarrays_in_an_Array();

        assertThat(test.countCompleteSubarrays(new int[]{1, 3, 1, 2, 2})).isEqualTo(4);
        assertThat(test.countCompleteSubarrays(new int[]{5, 5, 5, 5})).isEqualTo(10);
    }
}
