package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC2845_Count_of_Interesting_Subarrays_Test {
    @Test
    void test() {
        LC2845_Count_of_Interesting_Subarrays test = new LC2845_Count_of_Interesting_Subarrays();

        assertThat(test.countInterestingSubarrays(Arrays.asList(3, 2, 4), 2, 1)).isEqualTo(3);
        assertThat(test.countInterestingSubarrays(Arrays.asList(3, 1, 9, 6), 3, 0)).isEqualTo(0);
    }
}
