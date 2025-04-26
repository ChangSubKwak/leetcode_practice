package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC2444_Count_Subarrays_With_Fixed_Bounds_Test {

    @Test
    void test() {
        LC2444_Count_Subarrays_With_Fixed_Bounds test = new LC2444_Count_Subarrays_With_Fixed_Bounds();

        assertThat(test.countSubarrays(new int[]{1, 3, 5, 2, 7, 5}, 1, 5)).isEqualTo(2);
        assertThat(test.countSubarrays(new int[]{1, 1, 1, 1}, 1, 1)).isEqualTo(10);
    }
}
