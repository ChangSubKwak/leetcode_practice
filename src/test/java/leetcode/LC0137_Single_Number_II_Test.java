package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC0137_Single_Number_II_Test {

    @Test
    void test() {
        LC0137_Single_Number_II test = new LC0137_Single_Number_II();
        assertThat(test.singleNumber(new int[]{2, 2, 3, 2})).isEqualTo(3);
        assertThat(test.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99})).isEqualTo(99);
    }
}