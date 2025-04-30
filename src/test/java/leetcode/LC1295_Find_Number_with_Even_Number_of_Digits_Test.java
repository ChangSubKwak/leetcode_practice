package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1295_Find_Number_with_Even_Number_of_Digits_Test {

    @Test
    void test() {
        LC1295_Find_Numbers_with_Even_Number_of_Digits test = new LC1295_Find_Numbers_with_Even_Number_of_Digits();

        assertThat(test.findNumbers(new int[]{12, 345, 2, 6, 7896})).isEqualTo(2);
        assertThat(test.findNumbers(new int[]{555, 901, 482, 1771})).isEqualTo(1);
    }
}
