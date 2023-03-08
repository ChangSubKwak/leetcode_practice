package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC2187_Minimum_Time_to_Complete_Trips_Test {
    @Test
    void exampleTest() {
        LC2187_Minimum_Time_to_Complete_Trips test = new LC2187_Minimum_Time_to_Complete_Trips();
        assertThat(test.minimumTime(new int[]{1, 2, 3}, 5)).isEqualTo(3);
        assertThat(test.minimumTime(new int[]{2}, 1)).isEqualTo(2);
    }
}
