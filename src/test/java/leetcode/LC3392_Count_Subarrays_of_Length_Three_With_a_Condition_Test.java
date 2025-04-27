package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3392_Count_Subarrays_of_Length_Three_With_a_Condition_Test {
    @Test
    void test() {
        LC3392_Count_Subarrays_of_Length_Three_With_a_Condition test = new LC3392_Count_Subarrays_of_Length_Three_With_a_Condition();

        assertThat(test.countSubarrays(new int[]{1, 2, 1, 4, 1})).isEqualTo(1);
        assertThat(test.countSubarrays(new int[]{1, 1, 1})).isEqualTo(0);
    }
}
