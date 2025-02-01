package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3151_Special_Array_I_Test {
    @Test
    void test() {
        LC3151_Special_Array_I test = new LC3151_Special_Array_I();

        assertThat(test.isArraySpecial(new int[]{1})).isEqualTo(true);
        assertThat(test.isArraySpecial(new int[]{2, 1, 4})).isEqualTo(true);
        assertThat(test.isArraySpecial(new int[]{4, 3, 1, 6})).isEqualTo(false);
    }
}
