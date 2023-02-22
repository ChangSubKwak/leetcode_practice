package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1011_Capacity_To_Ship_Packages_Within_D_Days_Test {
    @Test
    void test() {
        LC1011_Capacity_To_Ship_Packages_Within_D_Days_X test = new LC1011_Capacity_To_Ship_Packages_Within_D_Days_X();
        assertThat(test.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5)).isEqualTo(15);
        assertThat(test.shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3)).isEqualTo(6);
    }

}
