package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0166_Fraction_to_Recurring_Decimal_Test {
    @Test
    void test() {
        LC0166_Fraction_to_Recurring_Decimal test = new LC0166_Fraction_to_Recurring_Decimal();
        
        assertThat(test.fractionToDecimal(1, 2)).isEqualTo("0.5");
        assertThat(test.fractionToDecimal(2, 1)).isEqualTo("2");
        assertThat(test.fractionToDecimal(4, 333)).isEqualTo("0.(012)");
    }
}
