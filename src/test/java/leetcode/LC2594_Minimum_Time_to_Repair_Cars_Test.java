package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2594_Minimum_Time_to_Repair_Cars_Test {
    @Test
    void test() {
        LC2594_Minimum_Time_to_Repair_Cars test = new LC2594_Minimum_Time_to_Repair_Cars();

        assertThat(test.repairCars(new int[]{4, 2, 3, 1}, 10)).isEqualTo(16);
        assertThat(test.repairCars(new int[]{5, 1, 8}, 6)).isEqualTo(16);
    }
}
