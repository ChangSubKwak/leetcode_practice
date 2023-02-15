package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class LC0989_Add_to_Array_Form_of_Integer_Test {
    @Test
    void test() {
        LC0989_Add_to_Array_Form_of_Integer test = new LC0989_Add_to_Array_Form_of_Integer();
        assertThat(test.addToArrayForm(new int[]{1, 2, 0, 0}, 34)).isEqualTo(
            Arrays.asList(1, 2, 3, 4)
        );
        assertThat(test.addToArrayForm(new int[]{2, 7, 4}, 181)).isEqualTo(
            Arrays.asList(4, 5, 5)
        );
        assertThat(test.addToArrayForm(new int[]{2, 1, 5}, 806)).isEqualTo(
            Arrays.asList(1, 0, 2, 1)
        );
    }
}