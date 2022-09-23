package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1680_Concatenation_of_Consecutive_Binary_Numbers_Test {

    @Test
    void test() {
        LC1680_Concatenation_of_Consecutive_Binary_Numbers test = new LC1680_Concatenation_of_Consecutive_Binary_Numbers();
        assertThat(test.minOperations(1)).isEqualTo(1);
        assertThat(test.minOperations(3)).isEqualTo(27);
        assertThat(test.minOperations(12)).isEqualTo(505379714);
    }
}