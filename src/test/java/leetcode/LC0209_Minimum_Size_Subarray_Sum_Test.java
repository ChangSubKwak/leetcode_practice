package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LC0209_Minimum_Size_Subarray_Sum_Test {
    @Test
    void test() {
        LC0209_Minimum_Size_Subarray_Sum test = new LC0209_Minimum_Size_Subarray_Sum();
        Assertions.assertThat(test.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})).isEqualTo(2);
        Assertions.assertThat(test.minSubArrayLen(4, new int[]{1, 4, 4})).isEqualTo(1);
        Assertions.assertThat(test.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1})).isEqualTo(0);
    }
}