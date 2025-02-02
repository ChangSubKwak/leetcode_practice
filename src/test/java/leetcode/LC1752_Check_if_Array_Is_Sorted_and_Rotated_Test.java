package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1752_Check_if_Array_Is_Sorted_and_Rotated_Test {

    @Test
    void exampleTest() {
        LC1752_Check_if_Array_Is_Sorted_and_Rotated test = new LC1752_Check_if_Array_Is_Sorted_and_Rotated();

        assertThat(test.check(new int[]{3, 4, 5, 1, 2})).isEqualTo(true);
        assertThat(test.check(new int[]{2, 1, 3, 4})).isEqualTo(false);
        assertThat(test.check(new int[]{1, 2, 3})).isEqualTo(true);
    }
}
