package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC1630_Arithmetic_Subarrays_Test {
    @Test
    void test() {

        LC1630_Arithmetic_Subarrays test = new LC1630_Arithmetic_Subarrays();
        assertThat(test.checkArithmeticSubarrays(
            new int[]{4, 6, 5, 9, 3, 7},
            new int[]{0, 0, 2},
            new int[]{2, 3, 5}
        )).isEqualTo(Arrays.asList(true, false, true));

        assertThat(test.checkArithmeticSubarrays(
            new int[]{-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10},
            new int[]{0, 1, 6, 4, 8, 7},
            new int[]{4, 4, 9, 7, 9, 10}
        )).isEqualTo(Arrays.asList(false, true, false, false, true, true));
    }
}
