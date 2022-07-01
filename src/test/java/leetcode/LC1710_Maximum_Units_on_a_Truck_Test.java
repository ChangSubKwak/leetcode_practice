package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1710_Maximum_Units_on_a_Truck_Test {
    LC1710_Maximum_Units_on_a_Truck test = new LC1710_Maximum_Units_on_a_Truck();

    @Test
    void exampleTest() {
        assertThat(test.maximumUnits(new int[][] { {1, 3}, {2, 2}, {3, 1} }, 4)).isEqualTo(8);
        assertThat(test.maximumUnits(new int[][] { {5, 10}, {2, 5}, {4, 7}, {3, 9} }, 10)).isEqualTo(91);
    }
}
