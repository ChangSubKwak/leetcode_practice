package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1351_Count_Negative_Numbers_in_a_Sorted_Matrix_Test {
    @Test
    void test() {
        LC1351_Count_Negative_Numbers_in_a_Sorted_Matrix test = new LC1351_Count_Negative_Numbers_in_a_Sorted_Matrix();
        assertThat(test.countNegatives(new int[][]{
            { 4,  3,  2, -1},
            { 3,  2,  1, -1},
            { 1,  1, -1, -2},
            {-1, -1, -2, -3}
        })).isEqualTo(8);
    }
}
