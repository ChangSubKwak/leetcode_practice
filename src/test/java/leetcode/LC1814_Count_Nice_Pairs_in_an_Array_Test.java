package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1814_Count_Nice_Pairs_in_an_Array_Test {
    @Test
    void test() {
        LC1814_Count_Nice_Pairs_in_an_Array test = new LC1814_Count_Nice_Pairs_in_an_Array();
        assertThat(test.countNicePairs(new int[]{42, 11, 1, 97})).isEqualTo(2);
        assertThat(test.countNicePairs(new int[]{13, 10, 35, 24, 76})).isEqualTo(4);
    }
}
