package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1187_Make_Array_Strictly_Increasing_Test {
    @Test
    void test() {
        LC1187_Make_Array_Strictly_Increasing test = new LC1187_Make_Array_Strictly_Increasing();
        assertThat(test.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 3, 2, 4})).isEqualTo(1);
        assertThat(test.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{4, 3, 1})).isEqualTo(2);
        assertThat(test.makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 6, 3, 3})).isEqualTo(-1);
    }
}
