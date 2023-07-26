package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1870_Minimum_Speed_to_Arrive_on_Time_Test {
    @Test
    void exampleTest() {
        LC1870_Minimum_Speed_to_Arrive_on_Time test = new LC1870_Minimum_Speed_to_Arrive_on_Time();
        assertThat(test.minSpeedOnTime(new int[]{1, 3, 2}, 6)).isEqualTo(1);
        assertThat(test.minSpeedOnTime(new int[]{1, 3, 2}, 2.7)).isEqualTo(3);
        assertThat(test.minSpeedOnTime(new int[]{1, 3, 2}, 1.9)).isEqualTo(-1);
    }
}
