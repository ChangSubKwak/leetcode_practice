package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1466_Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero_Test {
    @Test
    void test() {
        LC1466_Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero test = new LC1466_Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero();
        assertThat(test.minReorder(6, new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}})).isEqualTo(3);
        assertThat(test.minReorder(5, new int[][]{{1, 0}, {1, 2}, {3, 2}, {3, 4}})).isEqualTo(2);
        assertThat(test.minReorder(3, new int[][]{{1, 0}, {2, 0}})).isEqualTo(0);
    }
}
