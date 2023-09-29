package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0896_Monotonic_Array_Test {
    @Test
    void test() {
        LC0896_Monotonic_Array test = new LC0896_Monotonic_Array();
        assertThat(test.isMonotonic(new int[]{1, 2, 2, 3})).isTrue();
        assertThat(test.isMonotonic(new int[]{6, 5, 4, 4})).isTrue();
        assertThat(test.isMonotonic(new int[]{1, 3, 2})).isFalse();
    }
}
