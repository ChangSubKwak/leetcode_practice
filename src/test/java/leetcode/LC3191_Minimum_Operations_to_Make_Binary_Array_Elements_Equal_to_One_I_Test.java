package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3191_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I_Test {
    @Test
    void test() {
        LC3191_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I test = new LC3191_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I();

        assertThat(test.minOperations(new int[]{0, 1, 1, 1, 0, 0})).isEqualTo(3);
        assertThat(test.minOperations(new int[]{0, 1, 1, 1})).isEqualTo(-1);
    }
}
