package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0907_Sum_of_Subarray_Minimums_Test {
    @Test
    void test() {
        LC0907_Sum_of_Subarray_Minimums test = new LC0907_Sum_of_Subarray_Minimums();
        assertThat(test.sumSubarrayMins(new int[]{3, 1, 2, 4})).isEqualTo(17);
        assertThat(test.sumSubarrayMins(new int[]{11, 81, 94, 43, 3})).isEqualTo(444);
    }
}
