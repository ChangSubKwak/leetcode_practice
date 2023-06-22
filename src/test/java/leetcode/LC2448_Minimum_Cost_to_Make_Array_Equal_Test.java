package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC2448_Minimum_Cost_to_Make_Array_Equal_Test {

    @Test
    void test() {
        LC2448_Minimum_Cost_to_Make_Array_Equal test = new LC2448_Minimum_Cost_to_Make_Array_Equal();
        Assertions.assertThat(test.minCost(new int[]{1, 3, 5, 2}, new int[]{2, 3, 1, 14})).isEqualTo(8);
        Assertions.assertThat(test.minCost(new int[]{2, 2, 2, 2, 2}, new int[]{4, 2, 8, 1, 3})).isEqualTo(0);
    }
}
