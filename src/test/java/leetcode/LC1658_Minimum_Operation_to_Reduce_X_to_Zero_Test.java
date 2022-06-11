package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1658_Minimum_Operation_to_Reduce_X_to_Zero_Test {

    @Test
    void test() {
        LC1658_Minimum_Operation_to_Reduce_X_to_Zero_X lc = new LC1658_Minimum_Operation_to_Reduce_X_to_Zero_X();
        assertThat(lc.minOperations(new int[] { 1, 1, 4, 2, 3}, 5)).isEqualTo(2);
        assertThat(lc.minOperations(new int[] { 5, 6, 7, 8, 9}, 4)).isEqualTo(-1);
        assertThat(lc.minOperations(new int[] { 3, 2, 20, 1, 1, 3}, 10)).isEqualTo(5);
    }
}