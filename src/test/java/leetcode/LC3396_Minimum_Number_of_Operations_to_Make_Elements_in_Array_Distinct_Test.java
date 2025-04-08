package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct_Test {
    @Test
    void test() {
        LC3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct test = new LC3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct();

        assertThat(test.minimumOperations(new int[]{1, 2, 3, 4, 2, 3, 3, 5, 7})).isEqualTo(2);
        assertThat(test.minimumOperations(new int[]{4, 5, 6, 4, 4})).isEqualTo(2);
        assertThat(test.minimumOperations(new int[]{6, 7, 8, 9})).isEqualTo(0);
    }
}
