package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2918_Minimum_Equal_Sum_of_Two_Arrays_After_Replacing_Zeros_Test {

    LC2918_Minimum_Equal_Sum_of_Two_Arrays_After_Replacing_Zeros test;

    @BeforeEach
    void setUp() {
        test = new LC2918_Minimum_Equal_Sum_of_Two_Arrays_After_Replacing_Zeros();
    }

    @Test
    void test() {
        assertThat(test.minSum(new int[]{3, 2, 0, 1, 0}, new int[]{6, 5, 0})).isEqualTo(12);
        assertThat(test.minSum(new int[]{2, 0, 2, 0}, new int[]{1, 4})).isEqualTo(-1);
    }
}
