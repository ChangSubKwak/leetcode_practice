package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0446_Arithmetic_Slice_II_Subsequence_Test {

    @Test
    void minimumTotal() {
        LC0446_Arithmetic_Slice_II_Subsequence_X test = new LC0446_Arithmetic_Slice_II_Subsequence_X();

        assertThat(test.numberOfArithmeticSlices(new int[]{2, 4, 6, 8, 10})).isEqualTo(7);
        // assertThat(test.numberOfArithmeticSlices(new int[]{7, 7, 7, 7, 7})).isEqualTo(16);
    }
}
