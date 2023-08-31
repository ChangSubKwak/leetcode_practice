package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1326_Minimum_Number_of_Taps_to_Open_to_Water_a_Garden_Test {

    @Test
    void test() {
        LC1326_Minimum_Number_of_Taps_to_Open_to_Water_a_Garden test = new LC1326_Minimum_Number_of_Taps_to_Open_to_Water_a_Garden();
        assertThat(test.minTaps(5, new int[]{3, 4, 1, 1, 0, 0})).isEqualTo(1);
        assertThat(test.minTaps(3, new int[]{0, 0, 0, 0})).isEqualTo(-1);
    }
}
