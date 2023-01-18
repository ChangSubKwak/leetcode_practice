package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0914_Maximum_Sum_Circular_Subarray_Test {
    @Test
    void test() {
        LC0914_Maximum_Sum_Circular_Subarray_X test = new LC0914_Maximum_Sum_Circular_Subarray_X();
        assertThat(test.maxSubarraySumCircular(new int[]{1, -2, 3, -2})).isEqualTo(3);
        assertThat(test.maxSubarraySumCircular(new int[]{5, -3, 5})).isEqualTo(10);
        assertThat(test.maxSubarraySumCircular(new int[]{-3, -2, -3})).isEqualTo(-2);
    }
}
