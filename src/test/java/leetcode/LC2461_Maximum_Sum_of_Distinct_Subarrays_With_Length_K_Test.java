package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2461_Maximum_Sum_of_Distinct_Subarrays_With_Length_K_Test {

    @Test
    void test() {
        LC2461_Maximum_Sum_of_Distinct_Subarrays_With_Length_K test = new LC2461_Maximum_Sum_of_Distinct_Subarrays_With_Length_K();
        assertThat(test.maximumSubarraySum(new int[]{1, 5, 4, 2, 9, 9, 9}, 3)).isEqualTo(15);
        assertThat(test.maximumSubarraySum(new int[]{4, 4, 4}, 3)).isEqualTo(0);
    }
}
