package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC2332_The_Latest_Time_to_Catch_a_Bus_Test {
    LC2332_The_Latest_Time_to_Catch_a_Bus test = new LC2332_The_Latest_Time_to_Catch_a_Bus();

    @Test
    void exampleTest() {
        assertThat(test.latestTimeCatchTheBus(new int[] {10, 20}, new int[] {2, 17, 18, 19}, 2)).isEqualTo(16);
        assertThat(test.latestTimeCatchTheBus(new int[] {20, 30, 10}, new int[] {19, 13, 26, 4, 25, 11, 21}, 2)).isEqualTo(20);
    }
}
