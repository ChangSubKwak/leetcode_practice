package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC1671_Minimum_Number_of_Removals_to_Make_Mountain_Array_Test {
    LC1671_Minimum_Number_of_Removals_to_Make_Mountain_Array test = new LC1671_Minimum_Number_of_Removals_to_Make_Mountain_Array();

    @Test
    void test() {
        assertThat(test.minimumMountainRemovals(new int[]{1, 3, 1})).isEqualTo(0);
        assertThat(test.minimumMountainRemovals(new int[]{2, 1, 1, 5, 6, 2, 3, 1})).isEqualTo(6);
    }
}
