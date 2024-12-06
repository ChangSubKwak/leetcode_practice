package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2554_Maximum_Number_of_Integers_to_Choose_From_a_Range_I_Test {
    @Test
    void test() {
        LC2554_Maximum_Number_of_Integers_to_Choose_From_a_Range_I test = new LC2554_Maximum_Number_of_Integers_to_Choose_From_a_Range_I();

        assertThat(test.maxCount(new int[]{1, 6, 5}, 5, 6)).isEqualTo(2);
        assertThat(test.maxCount(new int[]{1, 2, 3, 4, 5, 6, 7}, 8, 1)).isEqualTo(0);
        assertThat(test.maxCount(new int[]{11}, 7, 50)).isEqualTo(7);
    }
}
