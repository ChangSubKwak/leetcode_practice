package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0860_Minimum_Number_of_Refueling_Stops_Test {
    LC0860_Minimum_Number_of_Refueling_Stops test;
    
    @BeforeEach
    void setUp() {
        test = new LC0860_Minimum_Number_of_Refueling_Stops();
    }
    
    @Test
    void test() {
        assertThat(test.minRefuelStops(1, 1, new int[][]{})).isEqualTo(0);
        assertThat(test.minRefuelStops(100, 1, new int[][]{{10, 100}})).isEqualTo(-1);
        assertThat(test.minRefuelStops(100, 10, new int[][]{{10, 60}, {20, 30}, {30, 30}, {60, 40}})).isEqualTo(2);
    }
}
