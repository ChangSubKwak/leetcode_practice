package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0191_Number_of_1_Bits_Test {
    
    @Test
    void test() {
        LC0191_Number_of_1_Bits test = new LC0191_Number_of_1_Bits();
        assertThat(test.hammingWeight(11)).isEqualTo(3);
        assertThat(test.hammingWeight(128)).isEqualTo(1);
        assertThat(test.hammingWeight(-3)).isEqualTo(31);
    }
}