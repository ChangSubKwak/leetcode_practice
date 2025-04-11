package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2843_Count_Symmetric_Integers_Test {
    @Test
    void test() {
        LC2843_Count_Symmetric_Integers test = new LC2843_Count_Symmetric_Integers();

        assertThat(test.countSymmetricIntegers(1, 100)).isEqualTo(9);
        assertThat(test.countSymmetricIntegers(1200, 1230)).isEqualTo(4);
    }
}
