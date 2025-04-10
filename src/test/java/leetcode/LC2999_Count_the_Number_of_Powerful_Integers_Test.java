package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2999_Count_the_Number_of_Powerful_Integers_Test {

    @Test
    void test() {
        LC2999_Count_the_Number_of_Powerful_Integers test = new LC2999_Count_the_Number_of_Powerful_Integers();

        assertThat(test.numberOfPowerfulInt(1, 6000, 4, "124")).isEqualTo(5);
        assertThat(test.numberOfPowerfulInt(15, 215, 6, "10")).isEqualTo(2);
        assertThat(test.numberOfPowerfulInt(1000, 2000, 4, "3000")).isEqualTo(0);
    }
}
