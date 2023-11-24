package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1846_Maximum_Element_After_Decreasing_and_Rearranging_Test {

    @Test
    void test() {
        LC1846_Maximum_Element_After_Decreasing_and_Rearranging test = new LC1846_Maximum_Element_After_Decreasing_and_Rearranging();

        assertThat(test.maximumElementAfterDecrementingAndRearranging(new int[]{2, 2, 1, 2, 1})).isEqualTo(2);
        assertThat(test.maximumElementAfterDecrementingAndRearranging(new int[]{100, 1, 1000})).isEqualTo(3);
    }
}
