package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

class LC2477_Minimum_Fuel_Cost_to_Report_to_the_Capital_Test {
    @Test
    void test() {
        LC2477_Minimum_Fuel_Cost_to_Report_to_the_Capital test = new LC2477_Minimum_Fuel_Cost_to_Report_to_the_Capital();
        assertThat(test.minimumFuelCost(new int[][]{{0, 1}, {0, 2}, {0, 3}}, 5)).isEqualTo(3);
        // assertThat(test.minimumFuelCost(new int[][]{{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}}, 2)).isEqualTo(7);
        // assertThat(test.minimumFuelCost(new int[][]{}, 1)).isEqualTo(0);
    }
}
