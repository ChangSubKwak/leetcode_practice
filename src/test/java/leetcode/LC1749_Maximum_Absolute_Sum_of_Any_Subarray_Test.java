package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1749_Maximum_Absolute_Sum_of_Any_Subarray_Test {

    @Test
    void exampleTest() {
        LC1749_Maximum_Absolute_Sum_of_Any_Subarray test = new LC1749_Maximum_Absolute_Sum_of_Any_Subarray();

        assertThat(test.maxAbsoluteSum(new int[]{1, -3, 2, 3, -4})).isEqualTo(5);
        assertThat(test.maxAbsoluteSum(new int[]{2, -5, 1, -4, 3, -2})).isEqualTo(8);
    }
}
