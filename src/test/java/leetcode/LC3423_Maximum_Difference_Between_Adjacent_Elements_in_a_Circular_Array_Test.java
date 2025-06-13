package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array_Test {
    @Test
    void test() {
        LC3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array test = new LC3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array();

        assertThat(test.maxAdjacentDistance(new int[]{1, 2, 4})).isEqualTo(3);
        assertThat(test.maxAdjacentDistance(new int[]{-5, -10, -5})).isEqualTo(5);

    }
}
