package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2033_Minimum_Operations_to_Make_a_Uni_Value_Grid_Test {
    @Test
    void exampleTest() {
        LC2033_Minimum_Operations_to_Make_a_Uni_Value_Grid test = new LC2033_Minimum_Operations_to_Make_a_Uni_Value_Grid();

        assertThat(test.minOperations(new int[][]{{2, 4}, {6, 8}}, 2)).isEqualTo(4);
        assertThat(test.minOperations(new int[][]{{1, 5}, {2, 3}}, 1)).isEqualTo(5);
        assertThat(test.minOperations(new int[][]{{1, 2}, {3, 4}}, -1)).isEqualTo(-1);
    }
}
