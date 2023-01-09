package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC0134_Gas_Station_Test {
    void test() {
        LC0134_Gas_Station test = new LC0134_Gas_Station();
        assertThat(test.canCompleteCircuit(
            new int[]{1, 2, 3, 4, 5},
            new int[]{3, 4, 5, 1, 2}
        )).isEqualTo(3);
    }
}