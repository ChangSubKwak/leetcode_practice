package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2601_Prime_Subtraction_Operation_Test {

    @Test
    void test() {
        LC2601_Prime_Subtraction_Operation test = new LC2601_Prime_Subtraction_Operation();

        assertThat(test.primeSubOperation(new int[]{4, 6, 9, 10})).isEqualTo(true);
        assertThat(test.primeSubOperation(new int[]{6, 8, 11, 12})).isEqualTo(true);
        assertThat(test.primeSubOperation(new int[]{5, 8, 3})).isEqualTo(false);
    }
}
