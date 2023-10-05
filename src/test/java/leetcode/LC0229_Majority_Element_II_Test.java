package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC0229_Majority_Element_II_Test {
    @Test
    void test() {
        LC0229_Majority_Element_II test = new LC0229_Majority_Element_II();

        assertThat(test.majorityElement(new int[]{3, 2, 3})).isEqualTo(Arrays.asList(3));
        assertThat(test.majorityElement(new int[]{1})).isEqualTo(Arrays.asList(1));
        assertThat(test.majorityElement(new int[]{1, 2})).isEqualTo(Arrays.asList(1, 2));
    }
}
