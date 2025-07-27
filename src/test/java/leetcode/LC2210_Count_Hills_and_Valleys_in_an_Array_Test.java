package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2210_Count_Hills_and_Valleys_in_an_Array_Test {

    @Test
    void test() {
        LC2210_Count_Hills_and_Valleys_in_an_Array test = new LC2210_Count_Hills_and_Valleys_in_an_Array();

        assertThat(test.countHillValley(new int[]{2, 4, 1, 1, 6, 5})).isEqualTo(3);
        assertThat(test.countHillValley(new int[]{6, 6, 5, 5, 4, 1})).isEqualTo(0);
    }
}
