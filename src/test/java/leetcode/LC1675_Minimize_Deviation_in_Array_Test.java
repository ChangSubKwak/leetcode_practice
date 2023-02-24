package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1675_Minimize_Deviation_in_Array_Test {

    @Test
    void test() {
        LC1675_Minimize_Deviation_in_Array test = new LC1675_Minimize_Deviation_in_Array();
        assertThat(test.minimumDeviation(new int[]{1, 2, 3, 4})).isEqualTo(1);
        assertThat(test.minimumDeviation(new int[]{4, 1, 5, 20, 3})).isEqualTo(3);
        assertThat(test.minimumDeviation(new int[]{2, 10, 8})).isEqualTo(3);
   }
}