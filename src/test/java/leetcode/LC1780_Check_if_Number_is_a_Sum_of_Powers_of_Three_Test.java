package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1780_Check_if_Number_is_a_Sum_of_Powers_of_Three_Test {
    LC1780_Check_if_Number_is_a_Sum_of_Powers_of_Three test = new LC1780_Check_if_Number_is_a_Sum_of_Powers_of_Three();

    @Test
    void exampleTest() {
        assertThat(test.checkPowersOfThree(12)).isEqualTo(true);
        assertThat(test.checkPowersOfThree(91)).isEqualTo(true);
        assertThat(test.checkPowersOfThree(21)).isEqualTo(false);
    }
}
