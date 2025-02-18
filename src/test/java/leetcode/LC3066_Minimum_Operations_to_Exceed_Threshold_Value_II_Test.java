package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3066_Minimum_Operations_to_Exceed_Threshold_Value_II_Test {
    @Test
    void test() {
        LC3066_Minimum_Operations_to_Exceed_Threshold_Value_II test = new LC3066_Minimum_Operations_to_Exceed_Threshold_Value_II();

        assertThat(test.minOperations(new int[]{2, 11, 10, 1, 3}, 10)).isEqualTo(2);
        assertThat(test.minOperations(new int[]{1, 1, 2, 4, 9}, 20)).isEqualTo(4);
        assertThat(test.minOperations(new int[]{999999999, 999999999, 999999999}, 1000000000)).isEqualTo(2);
    }
}
