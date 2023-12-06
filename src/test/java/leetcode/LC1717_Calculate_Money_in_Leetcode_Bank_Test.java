package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1717_Calculate_Money_in_Leetcode_Bank_Test {
    LC1717_Calculate_Money_in_Leetcode_Bank test = new LC1717_Calculate_Money_in_Leetcode_Bank();

    @Test
    void exampleTest() {
        assertThat(test.totalMoney(4)).isEqualTo(10);
        assertThat(test.totalMoney(10)).isEqualTo(37);
        assertThat(test.totalMoney(20)).isEqualTo(96);
    }
}
