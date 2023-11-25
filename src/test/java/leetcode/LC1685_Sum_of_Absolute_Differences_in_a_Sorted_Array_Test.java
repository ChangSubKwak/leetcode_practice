package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1685_Sum_of_Absolute_Differences_in_a_Sorted_Array_Test {

    @Test
    void test() {
        LC1685_Sum_of_Absolute_Differences_in_a_Sorted_Array test = new LC1685_Sum_of_Absolute_Differences_in_a_Sorted_Array();
        assertThat(test.getSumAbsoluteDifferences(new int[]{2, 3, 5})).isEqualTo(new int[]{4, 3, 5});
        assertThat(test.getSumAbsoluteDifferences(new int[]{1, 4, 6, 8, 10})).isEqualTo(new int[]{24, 15, 13, 15, 21});
    }
}