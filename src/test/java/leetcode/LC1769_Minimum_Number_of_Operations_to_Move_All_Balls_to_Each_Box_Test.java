package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box_Test {

    @Test
    void exampleTest() {
        LC1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box test = new LC1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box();

        assertThat(test.minOperations("110")).isEqualTo(new int[]{1, 1, 3});
        assertThat(test.minOperations("001011")).isEqualTo(new int[]{11, 8, 5, 4, 3, 4});
    }
}
