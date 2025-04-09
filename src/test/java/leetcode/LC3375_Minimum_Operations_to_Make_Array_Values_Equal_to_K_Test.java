package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3375_Minimum_Operations_to_Make_Array_Values_Equal_to_K_Test {
    @Test
    void test() {
        LC3375_Minimum_Operations_to_Make_Array_Values_Equal_to_K test = new LC3375_Minimum_Operations_to_Make_Array_Values_Equal_to_K();

        assertThat(test.minOperations(new int[]{5, 2, 5, 4, 5}, 2)).isEqualTo(2);
        assertThat(test.minOperations(new int[]{2, 1, 2}, 2)).isEqualTo(-1);
        assertThat(test.minOperations(new int[]{9, 7, 5, 3}, 1)).isEqualTo(4);
    }
}
