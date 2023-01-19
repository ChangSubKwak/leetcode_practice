package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0974_Subarray_Sums_Divisible_by_K_Test {

    @Test
    void test() {
        LC0974_Subarray_Sums_Divisible_by_K test = new LC0974_Subarray_Sums_Divisible_by_K();
        assertThat(test.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5)).isEqualTo(7);
        assertThat(test.subarraysDivByK(new int[]{5}, 9)).isEqualTo(0);
    }
}
